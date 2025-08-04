# Personal Expense Tracker 💰

[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)]()

![Screenshot](screenshots/Screenshot01.png)

A simple, intuitive Java console application for tracking personal expenses. Perfect for students learning Java or anyone who wants a lightweight expense tracking solution.

## ✨ Features

- 📝 **Add Expenses** - Record expenses with description, amount, and category
- 📊 **View All Expenses** - Display comprehensive expense list with totals
- 🏷️ **Category Analysis** - Group and analyze spending by categories
- 📅 **Monthly Reports** - Get insights into your monthly spending patterns
- 🗑️ **Delete Expenses** - Remove unwanted expense entries
- 💾 **Sample Data** - Pre-loaded examples to explore features immediately

## 🚀 Quick Start

### Prerequisites
- Java 11 or higher
- Git (for cloning)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/personal-expense-tracker.git
   cd personal-expense-tracker
   ```

2. **Compile the project**
   ```bash
   javac -d out src/main/java/com/expensetracker/*.java src/main/java/com/expensetracker/model/*.java
   ```

3. **Run the application**
   ```bash
   java -cp out com.expensetracker.Main
   ```

   Or use the provided scripts:
   ```bash
   chmod +x scripts/build.sh scripts/run.sh
   ./scripts/build.sh
   ./scripts/run.sh
   ```

## 📖 Usage

### Main Menu Options

```
=== PERSONAL EXPENSE TRACKER ===
1. Add Expense
2. View All Expenses
3. View Expenses by Category
4. Monthly Report
5. Delete Expense
6. Exit
```

### Example Usage

**Adding an Expense:**
```
Enter expense description: Coffee at Starbucks
Enter amount: $4.50
Enter category: Food
✓ Expense added successfully!
```

**Viewing Expenses:**
```
=== ALL EXPENSES ===
Description     | Amount   | Category     | Date
------------------------------------------------------------
Coffee          | $4.50    | Food         | 2025-08-04
Bus ticket      | $2.25    | Transport    | 2025-08-04
Lunch           | $12.99   | Food         | 2025-08-04
Movie ticket    | $15.00   | Entertainment| 2025-08-04
------------------------------------------------------------
TOTAL: $34.74
```

## 🏗️ Project Structure

```
src/
├── main/java/com/expensetracker/
│   ├── Main.java                 # Application entry point
│   ├── ExpenseTracker.java       # Main application logic
│   └── model/
│       └── Expense.java          # Expense data model
└── test/java/com/expensetracker/
    └── ExpenseTrackerTest.java   # Unit tests
```

## 🛠️ Technical Details

### Core Technologies
- **Java 11+** - Core programming language
- **Collections Framework** - ArrayList, HashMap for data management
- **Java 8 Streams** - Functional programming for data processing
- **LocalDate API** - Modern date/time handling
- **Scanner** - Console input handling

### Key Java Concepts Demonstrated
- Object-Oriented Programming (OOP)
- Encapsulation with getter/setter methods
- Collections and data structures
- Lambda expressions and method references
- Stream API for data processing
- Exception handling
- String formatting and I/O operations

## 🧪 Testing

Run the unit tests:
```bash
javac -cp .:junit-5.jar src/test/java/com/expensetracker/ExpenseTrackerTest.java
java -cp .:junit-5.jar:hamcrest.jar org.junit.runner.JUnitCore ExpenseTrackerTest
```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

See [CONTRIBUTING.md](CONTRIBUTING.md) for detailed guidelines.

### Development Setup
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 Roadmap

- [ ] **Data Persistence** - Save expenses to file/database
- [ ] **GUI Version** - JavaFX or Swing interface
- [ ] **Expense Categories** - Custom category management
- [ ] **Budget Limits** - Set and track budget goals
- [ ] **Export Features** - CSV/PDF report generation
- [ ] **Multi-currency Support** - Handle different currencies
- [ ] **Recurring Expenses** - Automatic expense entries

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Inspired by the need for simple personal finance management
- Built as a learning project for Java programming concepts
- Thanks to the Java community for excellent documentation and resources

## 📞 Support

If you have any questions or run into issues, please:
- Check the [Issues](https://github.com/domnix-sl/personal-expense-tracker/issues) page
- Create a new issue if your problem isn't already reported
- Include detailed information about your environment and the issue

---

**Happy expense tracking! 💰**

---
