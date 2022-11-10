//program to add interest to balance
public class Main {

    static class BankAccount{
        private double r;
        private double balance;
        private double rate;
        public BankAccount(double r1 ){   //this method to receive the balance
             r = r1 + 1;
             balance = r1;
        }

        public void AddInterest(double r2) {   //this for add the interest
            rate = r2;
        }

        public double ShowInterest(){    //this for print the interest
            return  rate;
        }

        public void AddInteresttoBalance(double a){  //this to add interest to balance
            balance = a + r;
        }

        public double ShowBalance(){       //this to print the balance after adding the interest
           double ra =  rate / 100 ;
            double rt = ra * balance;
            return balance + rt;

        }

    }

    public static void main(String[] args) {
        BankAccount momsSaving = new BankAccount(1000); //passing the balance value

        momsSaving.AddInterest(10); //passing the interest value
        System.out.println("the interest is : " + momsSaving.ShowInterest() + "% " + " =>" + " 100$");
        System.out.println("the current balance is : " + momsSaving.ShowBalance() + "$");
    }
}