import java.util.Scanner;

public class ResetPass{
    public static void main(String[] args) {
        System.out.println("Reset password\n");
        Scanner sc = new Scanner(System.in);
        String pass1, pass2; 
        System.out.print("Insert old password:");
        pass1 = sc.nextLine();
        System.out.print("Insert new password:");
        pass2 = sc.nextLine();
        System.out.println("The password is resetted");
        sc.close();
    }
}