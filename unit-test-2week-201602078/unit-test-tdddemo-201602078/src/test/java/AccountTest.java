import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    //계정 생성 확인 테스트
    @Test
    public void account_verification(){
        Account account = new Account();
        int balance = account.getBalance();
        System.out.println("balance : " + balance);
        assertThat(balance, is(0));
    }

    //계정에 예금후 잔액 확인 테스트
    @Test
    public void deposit_test(){
        Account account = new Account();
        account.deposit(1000);
        assertThat(account.getBalance(), is(1000));

    }

    //계정에 출금후 잔액 확인 테스트
    @Test
    public void withdraw_test(){
        Account account = new Account();
        account.withdraw(200);
        assertThat(account.getBalance(), is(-200));
    }

    //계정에 잔액보다 출금액이 크면 출금되지 않고 잔액이 그대로인지 확인 테스트
    @Test
    public void tooBigToWithdraw_test(){
        Account account = new Account();
        account.deposit(1000);
        account.withdraw2(1200);
        assertThat(account.getBalance(), is(1000));
    }
}
