import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(500, -1000);
        account.withdraw(300);
        assertEquals(200, account.getBalance());
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(500, -1000);
        account.deposit(300);
        assertEquals(800, account.getBalance());
    }
}
