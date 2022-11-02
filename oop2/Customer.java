public class Customer {

    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }
    
    public Customer() {
        this("", "");
        acct = new Account[5];
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    
    public Account getAccount(int index){
        return acct[index];
    }
    
    public int getNumOfAccount(){
        return numOfAccount;
    }

    public String toString() {
        if (acct == null) {
            return (firstName + " " + lastName + " doesn’t have account.");
        } 
        else {
            return (firstName + " " + lastName + " has " + getNumOfAccount() + " accounts.");
        }
    }
}
