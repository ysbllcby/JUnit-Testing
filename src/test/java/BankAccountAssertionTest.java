import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountAssertionTest {

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

    @Test
    @DisplayName("Withdraw 800 from 500")
    public void testWithdrawNotStuckAtZero() {
        BankAccount account = new BankAccount(500, -1000);
        account.withdraw(800);
        assertNotEquals(0, account.getBalance());
    }

    @Test
    public void testActive() {
        BankAccount account = new BankAccount(500, -1000);
        assertTrue(account.isActive());
    }

    @Test
    public void testNull() {
        BankAccount account = new BankAccount(500, -1000);
        account.setBankAccountHolder("Ysa");
        assertNotNull(account.getBankAccountHolder());
    }

    @Test
    public void testThrows() {
        BankAccount account = new BankAccount(500, -1000);
        assertThrows(RuntimeException.class, () -> account.withdraw(2000));
    }

    @Test
    public void withdrawAndDepositWithoutExceptions() {
        BankAccount account = new BankAccount(500, -1000);
        assertAll(
                () -> account.withdraw(200),
                () -> account.deposit(100),
                () -> assertEquals(400, account.getBalance())
        );
    }

    @Test
    public void testDepositTimeout() {
        BankAccount account = new BankAccount(500, -1000);
        assertTimeout(Duration.ofNanos(100), () -> account.deposit(100));
        assertEquals(0.33, 1/3, 0.01);
    }
}
