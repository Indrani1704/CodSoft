import java.util.Scanner;
public class ATM{
    public static void main(String[]args){
        int balance = 5000;
        int withdraw,deposite;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposite");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation you want to perform:");

            int option = scanner.nextInt();
            switch(option){
                case 1:
                System.out.print("Enter the amount to be withdrawn:");
                withdraw= scanner.nextInt();
                if(balance>=withdraw){
                    balance-=withdraw;
                    System.out.print("Please collect your money");
                }else{
                    System.out.print("Insufficient Balance");
                }
                break;
                case 2:
                System.out.print("Enter the amount to be deposited:");
                deposite= scanner.nextInt();
                balance+=deposite;
                System.out.print("Your money has been successfully deposited");
                break;
                case 3:
                System.out.println("Your Balance:"+balance);
                break;
                case 4:
                System.exit(0);
                }
            

                }
            }
    }
