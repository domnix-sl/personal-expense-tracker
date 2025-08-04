# Contributing to Personal Expense Tracker 🤝

First off, thank you for considering contributing to Personal Expense Tracker! It's people like you that make this project a great learning resource and useful tool for the community.

## 📖 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
- [Getting Started](#getting-started)
- [Development Guidelines](#development-guidelines)
- [Pull Request Process](#pull-request-process)
- [Issue Guidelines](#issue-guidelines)
- [Style Guides](#style-guides)
- [Community](#community)

## 📜 Code of Conduct

This project and everyone participating in it is governed by our Code of Conduct. By participating, you are expected to uphold this code. Please report unacceptable behavior to the project maintainers.

### Our Pledge
- Be welcoming and inclusive
- Be respectful of differing viewpoints
- Accept constructive criticism gracefully
- Focus on what is best for the community
- Show empathy towards other community members

## 🛠️ How Can I Contribute?

### 🐛 Reporting Bugs

Before creating bug reports, please check the existing issues as you might find that the problem has already been reported. When you create a bug report, please include as many details as possible:

**Use this template for bug reports:**

```markdown
**Bug Description**
A clear and concise description of what the bug is.

**To Reproduce**
Steps to reproduce the behavior:
1. Go to '...'
2. Click on '....'
3. Scroll down to '....'
4. See error

**Expected Behavior**
A clear description of what you expected to happen.

**Screenshots/Output**
If applicable, add screenshots or console output to help explain your problem.

**Environment:**
- Java Version: [e.g. OpenJDK 11]
- Operating System: [e.g. Windows 10, macOS 12.0, Ubuntu 20.04]
- Terminal/IDE: [e.g. IntelliJ IDEA, VS Code, Command Prompt]

**Additional Context**
Add any other context about the problem here.
```

### 💡 Suggesting Enhancements

Enhancement suggestions are tracked as GitHub issues. When creating an enhancement suggestion, please include:

**Use this template for feature requests:**

```markdown
**Feature Description**
A clear and concise description of what you want to happen.

**Problem Statement**
Describe the problem this feature would solve.

**Proposed Solution**
Detailed description of how you envision this feature working.

**Alternative Solutions**
Describe any alternative solutions you've considered.

**Use Cases**
Provide specific examples of how this feature would be used.

**Implementation Notes**
Any technical considerations or suggestions for implementation.
```

### 🎯 Good First Issues

Looking for a way to contribute? Check out issues labeled with:
- `good first issue` - Great for newcomers
- `help wanted` - Extra attention needed
- `documentation` - Improve docs
- `enhancement` - New features to implement

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have:
- Java 11 or higher installed
- Git for version control
- A text editor or IDE (IntelliJ IDEA, Eclipse, VS Code recommended)
- Basic understanding of Java programming

### Setting Up Development Environment

1. **Fork the Repository**
   ```bash
   # Click the "Fork" button on GitHub, then clone your fork
   git clone https://github.com/YOUR_USERNAME/personal-expense-tracker.git
   cd personal-expense-tracker
   ```

2. **Add Upstream Remote**
   ```bash
   git remote add upstream https://github.com/ORIGINAL_OWNER/personal-expense-tracker.git
   ```

3. **Create a Branch**
   ```bash
   git checkout -b feature/your-feature-name
   # or
   git checkout -b fix/bug-description
   ```

4. **Build and Test**
   ```bash
   ./scripts/build.sh
   ./scripts/run.sh
   ```

### Development Workflow

1. **Stay Updated**
   ```bash
   git fetch upstream
   git checkout main
   git merge upstream/main
   ```

2. **Make Changes**
   - Write clean, readable code
   - Follow existing code style
   - Add tests for new functionality
   - Update documentation as needed

3. **Test Your Changes**
   ```bash
   ./scripts/build.sh
   # Run manual tests
   ./scripts/run.sh
   ```

4. **Commit Your Changes**
   ```bash
   git add .
   git commit -m "feat: add expense search functionality"
   ```

## 📋 Development Guidelines

### 🏗️ Code Architecture

The project follows a simple layered architecture:

```
src/main/java/com/expensetracker/
├── Main.java                 # Entry point
├── ExpenseTracker.java       # Main application logic
└── model/
    └── Expense.java          # Data model
```

### 🔧 Adding New Features

When adding new features:

1. **Update the Model** (if needed)
   - Add new fields or methods to `Expense.java`
   - Ensure proper encapsulation

2. **Extend the Service Layer**
   - Add new methods to `ExpenseTracker.java`
   - Follow existing patterns for user interaction

3. **Update the Menu System**
   - Add new menu options in the `showMenu()` method
   - Handle new cases in the main switch statement

4. **Add Tests**
   - Create test cases for new functionality
   - Ensure edge cases are covered

### 🧪 Testing Guidelines

- Write unit tests for all new functionality
- Test both positive and negative scenarios
- Include edge cases and boundary conditions
- Mock external dependencies where appropriate

Example test structure:
```java
@Test
public void testAddExpense() {
    // Arrange
    ExpenseTracker tracker = new ExpenseTracker();
    
    // Act
    tracker.addExpense("Coffee", 4.50, "Food");
    
    // Assert
    assertEquals(1, tracker.getExpenseCount());
}
```

## 📝 Pull Request Process

### Before Submitting

- [ ] Code compiles without errors or warnings
- [ ] All tests pass
- [ ] Documentation updated (if applicable)
- [ ] CHANGELOG.md updated (for significant changes)
- [ ] Code follows project style guidelines
- [ ] Self-review completed

### Pull Request Template

```markdown
## Description
Brief description of changes made.

## Type of Change
- [ ] Bug fix (non-breaking change which fixes an issue)
- [ ] New feature (non-breaking change which adds functionality)
- [ ] Breaking change (fix or feature that would cause existing functionality to not work as expected)
- [ ] Documentation update

## Testing
- [ ] Added unit tests for new functionality
- [ ] Existing tests pass
- [ ] Manual testing completed

## Checklist
- [ ] My code follows the project's style guidelines
- [ ] I have performed a self-review of my own code
- [ ] I have commented my code, particularly in hard-to-understand areas
- [ ] I have made corresponding changes to the documentation
- [ ] My changes generate no new warnings

## Screenshots (if applicable)
Add screenshots to help explain your changes.

## Related Issues
Closes #(issue_number)
```

### Review Process

1. **Automated Checks** - All CI checks must pass
2. **Code Review** - At least one maintainer review required
3. **Testing** - Feature must be tested manually
4. **Documentation** - Any user-facing changes documented
5. **Merge** - Squash and merge preferred for clean history

## 📋 Issue Guidelines

### Issue Labels

We use the following labels to categorize issues:

| Label | Description |
|-------|-------------|
| `bug` | Something isn't working |
| `enhancement` | New feature or request |
| `documentation` | Improvements needed |
| `good first issue` | Good for newcomers |
| `help wanted` | Extra attention needed |
| `question` | Further information requested |
| `wontfix` | This will not be worked on |
| `duplicate` | This issue already exists |
| `priority: high` | High priority issues |
| `priority: low` | Low priority issues |

### Issue Lifecycle

1. **New** - Issue created and awaiting triage
2. **Triaged** - Issue reviewed and labeled
3. **Assigned** - Someone is working on it
4. **In Progress** - Work has begun
5. **Review** - Pull request submitted
6. **Closed** - Issue resolved or rejected

## 🎨 Style Guides

### Java Code Style

**Naming Conventions:**
```java
// Classes: PascalCase
public class ExpenseTracker { }

// Methods and variables: camelCase
public void addExpense() { }
private double totalAmount;

// Constants: UPPER_SNAKE_CASE
public static final String DEFAULT_CATEGORY = "Other";
```

**Code Formatting:**
```java
// Indentation: 4 spaces (no tabs)
public class Example {
    private String name;
    
    public void method() {
        if (condition) {
            // do something
        }
    }
}

// Line length: 100 characters maximum
// Braces: K&R style (opening brace on same line)
```

**Documentation:**
```java
/**
 * Adds a new expense to the tracker.
 * 
 * @param description the expense description
 * @param amount the expense amount (must be positive)
 * @param category the expense category
 * @throws IllegalArgumentException if amount is negative
 */
public void addExpense(String description, double amount, String category) {
    // implementation
}
```

### Commit Message Style

Follow the [Conventional Commits](https://www.conventionalcommits.org/) specification:

```
<type>[optional scope]: <description>

[optional body]

[optional footer(s)]
```

**Types:**
- `feat` - New feature
- `fix` - Bug fix
- `docs` - Documentation changes
- `style` - Code style changes (formatting, etc.)
- `refactor` - Code refactoring
- `test` - Adding or updating tests
- `chore` - Maintenance tasks

**Examples:**
```
feat: add expense search functionality
fix: resolve category filtering bug
docs: update installation instructions
test: add unit tests for expense deletion
```

### Documentation Style

- Use clear, concise language
- Include code examples where helpful
- Keep line length reasonable (80-100 characters)
- Use proper markdown formatting
- Include screenshots for UI changes

## 🌟 Recognition

### Contributors

All contributors will be recognized in:
- README.md contributors section
- Release notes for significant contributions
- Special mentions for first-time contributors

### Contribution Types

We recognize various types of contributions:
- 💻 Code contributions
- 📖 Documentation improvements
- 🐛 Bug reports and testing
- 💡 Feature suggestions and design
- 🎨 UI/UX improvements
- 🌍 Translations (future)
- 📢 Community building

## 🤔 Questions?

### Getting Help

- **GitHub Discussions** - For general questions and discussions
- **Issues** - For bug reports and feature requests
- **Wiki** - For detailed documentation (coming soon)

### Contact

- Create an issue for project-related questions
- Check existing issues and discussions first
- Be patient and respectful in all interactions

### Resources

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Git Handbook](https://guides.github.com/introduction/git-handbook/)
- [Markdown Guide](https://www.markdownguide.org/)
- [GitHub Flow](https://guides.github.com/introduction/flow/)

## 🎉 Thank You!

Thank you for taking the time to contribute to Personal Expense Tracker! Every contribution, no matter how small, helps make this project better for everyone.

Remember:
- Every expert was once a beginner
- Questions are welcome and encouraged
- The community is here to help you succeed
- Your unique perspective adds value

Happy coding! 💻✨

---

*This CONTRIBUTING.md is a living document and will be updated as the project evolves. Last updated: August 2025*
