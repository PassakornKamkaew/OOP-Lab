public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    
    public void setCredit(double credit){
        if(credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    public void withdraw(double amount) throws WithdrawException {
        if (amount >= 0) {
            if ((balance - amount) >= 0) {
                balance -= amount;
                System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else if (((balance - amount) < 0) & (((balance - amount) + credit) > 0)) {
                double a = amount - balance;
                balance = 0;
                credit -= a;
                System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else {
                throw new WithdrawException("Account " + name + " has not enough money!");
            }
        }
    }
    public void withdraw(String a) {
        double d = Double.parseDouble(a);
        if (d > 0) {
            if ((balance - d) > 0) {
                balance -= d;
                System.out.println(d + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else if (((balance - d) < 0) && (((balance - d) + credit) > 0)) {
                balance = 0;
                credit -= d;
                System.out.println(d + " bath is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else {
                System.out.println("Not enough money!");
            }
        }
    }

    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
