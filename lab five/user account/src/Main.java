//program to show balance from account and add deposit to the account and withdraw entire balance

public class Main {
    static class TimeDepositAccount{
        private double balance;
        private double interest;

        public TimeDepositAccount(){   //construct
             interest =0.2;
             balance =20000;
        }

        public double CurrentBalance(){   //this method for show the balance
            return balance;
        }

        public double AddEarnedBalance(){  //this method to add the interest to the balance
            balance = balance * interest;
            System.out.println(" ");
             return balance;
        }

        public double withdrawBalance(){
            return balance - balance;
        }
    }

    public static void main(String[] args) {

        TimeDepositAccount account = new TimeDepositAccount();


        System.out.println("your current balance is : " + account.CurrentBalance() + '$');

        System.out.println(account.AddEarnedBalance()+ "$ " + " added to your account \n");

        System.out.println("you withdrew your balance your balance is :" + account.withdrawBalance() + '$');



    }
}