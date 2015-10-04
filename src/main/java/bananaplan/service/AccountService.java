package bananaplan.service;

import bananaplan.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bananaplan.repository.AccountRepository;

/**
 * Created by paulou on 9/30/15.
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public void createAccount(Account account){
        accountRepository.save(account);
    }

    public Account getAccount(String username, String password){
        return accountRepository.findByUsernameAndPassword(username, password);
    }
}
