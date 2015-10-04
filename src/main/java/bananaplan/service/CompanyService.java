package bananaplan.service;

import bananaplan.domain.dao.CompanyDAO;
import bananaplan.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by paulou on 10/3/15.
 * All Rights Reserved By BananaPlanTw
 */
@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public void createCompany(CompanyDAO companyDAO){
        companyRepository.save(companyDAO);
    }

    public CompanyDAO getCompany(String companyName){
        return companyRepository.findByName(companyName);
    }
}
