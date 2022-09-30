import java.util.Scanner;

public class User {
public String userName;
public int score=0;
 Scanner sc = new Scanner(System.in);
    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        System.out.println("Enter your name: ");
        this.userName = sc.nextLine();
    }

}
