public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    
    public Customer(){
        this("", "");
        acct = new Account[5];
    }
    
    public Account getAccount(int index){
        
    }
}
