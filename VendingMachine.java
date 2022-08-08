import java.util.Arrays;

public class VendingMachine {
    public static void main(String[] args) {

        int[] change = getChange(0.26, 3.6);
        Arrays.stream(change).forEach(v-> System.out.print(v + ", "));
    }

    public static int[] getChange(double moneyInserted, double itemPrice) {

        int change = (int)(moneyInserted*100 - itemPrice*100);

        int[] numberOfCoins = new int[6];

        if (change == 0) {
            return numberOfCoins;
        } else {
            if(change <0){
                change = (int)(moneyInserted*100);
                System.out.println("You don't have enough money to buy the product!");
            }
            int oneDollar = change / 100;
            change %= 100;
            int fiftyCent = change / 50;
            change %= 50;
            int twentyFiveCent = change / 25;
            change %= 25;
            int tenCent =  change / 10;
            change %= 10;
            int fiveCent =  change / 5;
            change %= 5;
            int oneCent =  change;

            numberOfCoins[0] = oneCent;
            numberOfCoins[1] = fiveCent;
            numberOfCoins[2] = tenCent;
            numberOfCoins[3] = twentyFiveCent;
            numberOfCoins[4] = fiftyCent;
            numberOfCoins[5] = oneDollar;
            return numberOfCoins;
        }
    }
}

