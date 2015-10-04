package bananaplan.repository;

import bananaplan.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by paulou on 9/30/15.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsernameAndPassword(String username, String password);

    Account findByUsername(String username);
}
