import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.qiwi.accounts.BankAccount;
import ru.qiwi.accounts.PremiumAccount;
import ru.qiwi.accounts.SimpleAccount;

public class BankAccountTest {

    @Test
    void simpleAccountTest() {
        BankAccount simpleAccount = new SimpleAccount(10_000);
        Assertions.assertEquals(10_000, simpleAccount.getAmount());
        simpleAccount.getMoney(100);
        Assertions.assertEquals(9_895, simpleAccount.getAmount());
    }

    @Test
    void premiumAccountTest() {
        BankAccount premiumAccount = new PremiumAccount(10_000);
        Assertions.assertEquals(10_000, premiumAccount.getAmount());
        premiumAccount.getMoney(100);
        Assertions.assertEquals(9_899, premiumAccount.getAmount());
    }
}
