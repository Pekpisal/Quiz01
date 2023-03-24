package Quiz01;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option; 
        System.out.println("Welcome to my Menu");
        System.out.println("Please choose option below");
        System.out.println("1.Regiseration\n2.Login\n3.Reset Password\n4.Typing\n5.Result list");
        option = sc.next();
        switch (option){
            case 1:
                Register.main(args);
                break;
        }
    }
}
