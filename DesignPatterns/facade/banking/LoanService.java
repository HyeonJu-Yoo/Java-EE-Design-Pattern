import javax.ejb.Stateless;

@Stateless
public class LoanService {
    public booelan checkCreditRating(long id, double amount) {
        // 고객 신용 등급이 해당 금액을 대출할 수 있는지 확인.
        return true;
    }
}
