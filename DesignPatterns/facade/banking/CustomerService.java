@Stateless
public class CustomerService {
    public long getCustomer(int sessionID) {
        // 로그인한 고객 ID 조회
        return 10005L;
    }

    public boolean checkId(long x) {
        // 고객 ID가 올바른지 체크
        return true;
    }
}
