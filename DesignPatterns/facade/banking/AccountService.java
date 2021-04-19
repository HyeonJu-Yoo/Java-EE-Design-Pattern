import javax.ejb.Stateless;

@Stateless
public class AccountService {
    public boolean getLoan(double amount) {
        // 계좌 잔액이 충분한지 확인.
        return true;
    }

    public boolean setCustomerBalance(long id, double amount) {
        // 계좌 잔액 업데이트
        return true;
    }
}
