import java.util.Scanner;

class Account {
    String cust_name;
    int Accno;
    double balance = 0;

    public void get_details() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer name: ");
        cust_name = scanner.next();
        System.out.println("Enter the account number: ");
        Accno = scanner.nextInt();
    }

    public void display_details(String Acc_type) {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Account Number: " + Accno);
        System.out.println("Account Type: " + Acc_type);
        System.out.println("Balance: " + balance);
    }
}

class Sav_acc extends Account {
    double interestRate = 0.05; // Compound interest rate for savings account

    public Sav_acc(double balance) {
        this.balance = balance;
    }

    public void deposit_s() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the deposit amount: ");
        double amount = s.nextDouble();
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " computed and added to the account.");
    }

    public void withdraw_s() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount: ");
        double amt = s.nextDouble();
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawal of " + amt + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal not permitted.");
        }
    }
}

class Cur_acc extends Account {
    public Cur_acc(double balance) {
        this.balance = balance;
    }

    public void deposit_c() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the deposit amount: ");
        double amount = s.nextDouble();
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void Cheque_book() {
        String phone_no;
        String address;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your phone number: ");
        phone_no = s.next();
        System.out.println("Enter your address: ");
        address = s.next();
        System.out.println("Cheque book request processed successfully.");

    }

    public void check_min_bal() {
        double min_bal = 1000;
        double service_charge = 50;

        if (balance < min_bal) {
            balance -= service_charge;
            System.out.println("Service charge of $" + service_charge + " imposed due to balance falling below minimum.");
        } else {
            System.out.println("Current balance is valid");
        }
    }

    public void withdraw_c() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount: ");
        double amt = s.nextDouble();
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawal of " + amt + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal not permitted.");
        }
    }
}

class BankRK {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the type of account (Savings or Current): ");
        String Acc_type = p.next();

        if (Acc_type.equals("Savings")) {
            Sav_acc sa = new Sav_acc(0); // Initialize with zero balance
            sa.get_details();

            int choice;
            do {
                System.out.println("\t\tMENU\t\t");
                System.out.println("1. Deposit\t 2. Withdraw\t 3. Compute interest\t 4. Display Account details\t 5. Exit");
                System.out.println("Enter choice: ");
                choice = p.nextInt();
                switch (choice) {
                    case 1:
                        sa.deposit_s();
                        break;
                    case 2:
                        sa.withdraw_s();
                        break;
                    case 3:
                        sa.computeInterest();
                        break;
                    case 4:
                        sa.display_details(Acc_type);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 5);
        } else if (Acc_type.equals("Current")) {
            Cur_acc ca = new Cur_acc(0); // Initialize with zero balance
            ca.get_details();

            int choice;
            do {
                System.out.println("\t\tMENU\t\t");
                System.out.println("1. Deposit\t 2. Withdraw\t 3. Avail Cheque book \t 4. Check min balance\t 5. Display details\t 6. Exit");
                System.out.println("Enter choice: ");
                choice = p.nextInt();
                switch (choice) {
                    case 1:
                        ca.deposit_c();
                        break;
                    case 2:
                        ca.withdraw_c();
                        break;
                    case 3:
                        ca.Cheque_book();
                        break;
                    case 4:
                        ca.check_min_bal();
                        break;
                    case 5:
                        ca.display_details(Acc_type);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 6);
        } else {
            System.out.println("Invalid account type.");
        }
    }
}
