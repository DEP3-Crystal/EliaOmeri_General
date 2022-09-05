import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean done = false;
        int userChoise = 0;
        User user1 = new User();
        while (done != true) {
            try {

                System.out.println("welcome" + "\n" + "1 to play" + "\n" + "0 to exit");
                userChoise = sc.nextInt();
                if (userChoise == 0) break;
                user1.setUserName();
                Game.hangman(user1);



            } catch (Exception message) {
                System.out.println("Wrong choice,try again.");
                sc.nextLine();
            }
            System.out.println("Press yes to play again , no if you don't want.");
            sc.nextLine();
            char playAgain = sc.nextLine().charAt(0);

            System.out.println(playAgain);

            while (playAgain=='y'|| playAgain=='Y'){
                Game.hangman(user1);
                System.out.println("Do you want to play again");
                playAgain=sc.nextLine().charAt(0);

            }if(playAgain=='n'||playAgain=='N'){
                resetUser(user1);
            }

        }
    }
    public static void resetUser(User user){
        user.userName=null;
        user.score=0;
    }
}
