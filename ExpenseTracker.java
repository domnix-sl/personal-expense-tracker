import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ExpenseTracker {
    private final List<Expense> expenses;
    private final Scanner scanner;
    
    public ExpenseTracker() {
        this.expenses = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    public void addExpense() {
        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();
        
        System.out.print("Enter amount: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter category (Food/Transport/Entertainment/Shopping/Bills/Other): ");
        String category = scanner.nextLine();
        
        Expense expense = new Expense(description, amount, category);
        expenses.add(expense);
        System.out.println("✓ Expense added successfully!\n");
    }
    
    public void viewAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.\n");
            return;
        }
        
        System.out.println("\n=== ALL EXPENSES ===");
        System.out.println("Description     | Amount   | Category     | Date");
        System.out.println("-".repeat(60));
        
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
        
        double total = expenses.stream().mapToDouble(Expense::getAmount).sum();
        System.out.println("-".repeat(60));
        System.out.printf("TOTAL: $%.2f\n\n", total);
    }
    
    public void viewExpensesByCategory() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.\n");
            return;
        }
        
        Map<String, Double> categoryTotals = expenses.stream()
            .collect(Collectors.groupingBy(
                Expense::getCategory,
                Collectors.summingDouble(Expense::getAmount)
            ));
        
        System.out.println("\n=== EXPENSES BY CATEGORY ===");
        categoryTotals.entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .forEach(entry -> 
                System.out.printf("%-15s: $%.2f\n", entry.getKey(), entry.getValue())
            );
        System.out.println();
    }
    
    public void viewMonthlyReport() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.\n");
            return;
        }
        
        LocalDate now = LocalDate.now();
        List<Expense> thisMonth = expenses.stream()
            .filter(e -> e.getDate().getMonth() == now.getMonth() && 
                        e.getDate().getYear() == now.getYear())
            .collect(Collectors.toList());
        
        if (thisMonth.isEmpty()) {
            System.out.println("No expenses recorded this month.\n");
            return;
        }
        
        System.out.printf("\n=== %s %d REPORT ===\n", 
                         now.getMonth(), now.getYear());
        
        double monthlyTotal = thisMonth.stream().mapToDouble(Expense::getAmount).sum();
        System.out.printf("Total expenses this month: $%.2f\n", monthlyTotal);
        System.out.printf("Average daily spending: $%.2f\n", monthlyTotal / now.getDayOfMonth());
        
        // Top category this month
        Map<String, Double> monthlyCategories = thisMonth.stream()
            .collect(Collectors.groupingBy(
                Expense::getCategory,
                Collectors.summingDouble(Expense::getAmount)
            ));
        
        String topCategory = monthlyCategories.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("None");
        
        System.out.printf("Top spending category: %s\n\n", topCategory);
    }
    
    public void deleteExpense() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to delete.\n");
            return;
        }
        
        System.out.println("\n=== SELECT EXPENSE TO DELETE ===");
        for (int i = 0; i < expenses.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, expenses.get(i));
        }
        
        System.out.print("Enter expense number to delete (0 to cancel): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        if (choice > 0 && choice <= expenses.size()) {
            Expense removed = expenses.remove(choice - 1);
            System.out.printf("✓ Deleted: %s\n\n", removed.getDescription());
        } else if (choice != 0) {
            System.out.println("Invalid selection.\n");
        }
    }
    
    public void showMenu() {
        System.out.println("=== PERSONAL EXPENSE TRACKER ===");
        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. View Expenses by Category");
        System.out.println("4. Monthly Report");
        System.out.println("5. Delete Expense");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }
    
    public void run() {
        System.out.println("Welcome to Personal Expense Tracker!");
        
        // Add some sample data
        expenses.add(new Expense("Coffee", 4.50, "Food"));
        expenses.add(new Expense("Bus ticket", 2.25, "Transport"));
        expenses.add(new Expense("Lunch", 12.99, "Food"));
        expenses.add(new Expense("Movie ticket", 15.00, "Entertainment"));
        
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1 -> addExpense();
                case 2 -> viewAllExpenses();
                case 3 -> viewExpensesByCategory();
                case 4 -> viewMonthlyReport();
                case 5 -> deleteExpense();
                case 6 -> {
                    System.out.println("Thank you for using Expense Tracker!");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.\n");
            }
        }
    }
}
