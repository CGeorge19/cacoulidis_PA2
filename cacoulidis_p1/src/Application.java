import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        // declare vars
        int[] encrypted = new int[4];
        int[] decrypted = new int[4];
        char choice;
        String num;

        // setup scanner
        Scanner stdIn = new Scanner(System.in);

        // get user input & validation to ensure 4 digits
        do{
            System.out.print("Please enter an integer in 4 digit format: ");
            num = stdIn.next();
        }while(num.length() != 4);

        // control structure
        System.out.println("\nPlease choose A or B...\n\tA) Encrypt\n\tB) Decrypt\n\n");
        choice = stdIn.next().charAt(0);
        
        //close scanner
        stdIn.close(); 
        
        switch(choice)
        {
            case 'A':
                encrypted = Encrypter.encrypt(num);
                System.out.print("\nData Encrypted: ");
                for(int i : encrypted)
                	System.out.print(i);
                break;

            case 'B':
                decrypted = Decrypter.decrypt(num);
                System.out.print("\nData Decrypted: ");
                for(int i : decrypted)
                	System.out.print(i);
                break;
        }
    }
}
