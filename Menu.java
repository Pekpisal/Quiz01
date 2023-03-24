import java.util.Scanner;
public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option; 
        System.out.println("Welcome to my Menu");
        System.out.println("Please choose option below");
        System.out.println("1.Regiseration\n2.Login\n3.Reset Password\n4.Typing\n5.Result list");
        option = sc.nextInt();
        switch (option){
            case 1:
                Register.main(args);
                break;
       }


    }
}