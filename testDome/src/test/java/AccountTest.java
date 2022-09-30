import org.junit.Assert;
import org.junit.Test;

//        The deposit and withdraw methods will not accept negative numbers.
//        Account cannot overstep its overdraft limit.
//        The deposit and withdraw methods will deposit or withdraw the correct amount, respectively.
//        The withdraw and deposit methods return the correct results.
public class AccountTest {
    private final double epsilon = 1e-6;

        @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-100);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
    @Test
    public void depositCannotAcceptNegativeValues() {
        Account account = new Account(0);
        Assert.assertFalse(account.deposit(-100));
    }

    @Test
    public void withdrawCannotAcceptNegativeValues() {
        Account account = new Account(0);
        Assert.assertFalse(account.withdraw(-100));
    }

    @Test
    public void accountCannotOverstepOverdraftLimit() {
        Account account = new Account(1000);
        Assert.assertFalse(account.withdraw(2000));
    }

    @Test
    public void testWithdrawMethod() {
        Account account = new Account(100);
        account.withdraw(50);
        Assert.assertEquals(-50, account.getBalance(), epsilon);
    }

    @Test
    public void testDepositMethod() {
        Account account = new Account(100);
        account.deposit(50);
        Assert.assertEquals(50, account.getBalance(), epsilon);
    }


    @Test
    public void deposit() {
        Account account = new Account(1000);
        Assert.assertTrue(account.deposit(1000));
        System.out.println(account.getBalance());
    }

    @Test
    public void withdraw() {
        Account account = new Account(500);
        Assert.assertTrue(account.withdraw(100));
        System.out.println(account.getBalance());
    }
}
