import javax.inject.Inject;
import javax.ejb.Stateless;

@Stateless
public class BankingServiceFacade {
    @Inject
    CustomerService customerService;

    @Inject
    LoanService loanService;

    @Inject
    AccountService accountService;

    public boolean getLoan(int sessionId, double amount) {
        boolean result = false;
        long id = customerService.getCustomer(sessionId);

        if (customerService.checkId(id)) {
            if (loanService.checkCreditRating(amount)) {
                if (accountService.getLoan(amount)) {
                    result = accountService.setCustomerBalance(id, amount);
                }
            }
        }

        return result;
    }

}
