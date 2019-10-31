package hibernate.dao.serv;

import hibernate.model.Account;

import java.util.List;

public interface AccountDao {
    Account findAccountById(int id);
    List<Account> findAllAccounts();
}
