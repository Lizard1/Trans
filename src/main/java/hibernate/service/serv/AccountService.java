package hibernate.service.serv;

import hibernate.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(int id);
}
