import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("BankAccountTest")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw 300 from 500")
    public void testWithdraw() {
        BankAccount account = new BankAccount(500, -1000);
        account.withdraw(300);
        assertEquals(200, account.getBalance());
    }

    @Test
    @DisplayName("Deposit 300 to 500")
    public void testDeposit() {
        BankAccount account = new BankAccount(500, -1000);
        account.deposit(300);
        assertEquals(800, account.getBalance());
    }
}
