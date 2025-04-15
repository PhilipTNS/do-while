import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password ;
        int tries = 0 ;
        do{
            tries++;
            System.out.println("What's the password?");
            password = input.nextLine();
        }while(!password.equals("equals") && tries <  3 );
        if(password.equals("equals")){
            System.out.println("correct password yippie");
        }else{
            System.out.println("wrong password device has been disabled for 3 days");
        }
        
    }
    }

