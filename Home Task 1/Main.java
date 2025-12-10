public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Account");
        BankAccount b1 = new BankAccount("A101", "Advitiya Sharma", 5000);
        b1.deposit(2000);
        b1.withdraw(1500);
        b1.printDetails();

        System.out.println();

        System.out.println("Savings Account");
        SavingsAccount s1 = new SavingsAccount("S201", "Advitiya Sharma", 8000, 5.0);
        s1.deposit(1000);
        s1.withdraw(3000);
        s1.applyInterest();
        s1.printDetails();
    }
}
