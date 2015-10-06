package bananaplan.repository;

import bananaplan.domain.dao.CaseDAO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by paulou on 10/5/15.
 * All rights are reserved by BananaPlanTw
 */
public interface CaseRepository extends JpaRepository<CaseDAO, Long> {
    CaseDAO findById(Long id);
}
