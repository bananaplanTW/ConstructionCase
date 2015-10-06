package bananaplan.service;

import bananaplan.domain.dao.CaseDAO;
import bananaplan.domain.dao.CompanyDAO;
import bananaplan.domain.request.CaseRequest;
import bananaplan.repository.CaseRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by paulou on 10/5/15.
 * All rights are reserved by BananaPlanTw
 */
@Service
public class CaseService {

    @Autowired
    CompanyService companyService;

    @Autowired
    CaseRepository caseRepository;

    public void createCase(CaseRequest caseRequest){
        CompanyDAO companyDAO = companyService.getCompany(caseRequest.getCompanyName());
        CaseDAO caseDAO = new CaseDAO();
        caseDAO.setName(caseRequest.getName());
        caseDAO.setPlanFile(caseRequest.getPlanFile());
        caseDAO.setElevationFile(caseRequest.getElevationFile());
        caseDAO.setSafetyFile(caseRequest.getSafetyFile());
        caseDAO.setCompanyDAO(companyDAO);

        caseRepository.save(caseDAO);
    }

    public void updateCase(Long caseId, CaseRequest caseRequest){
        CaseDAO caseDAO = caseRepository.findById(caseId);

        if(StringUtils.isNotBlank(caseRequest.getName())){
            caseDAO.setName(caseRequest.getName());
        }
        if(StringUtils.isNotBlank(caseRequest.getPlanFile())){
            caseDAO.setPlanFile(caseRequest.getPlanFile());
        }
        if(StringUtils.isNotBlank(caseRequest.getElevationFile())){
            caseDAO.setElevationFile(caseRequest.getElevationFile());
        }
        if(StringUtils.isNotBlank(caseRequest.getSafetyFile())){
            caseDAO.setSafetyFile(caseRequest.getSafetyFile());
        }
        if(StringUtils.isNotBlank(caseRequest.getCompanyName())){
            CompanyDAO companyDAO = companyService.getCompany(caseRequest.getCompanyName());
            caseDAO.setCompanyDAO(companyDAO);
        }

        caseRepository.save(caseDAO);
    }

    public void deleteCase(Long caseId){
        CaseDAO caseDAO = caseRepository.findById(caseId);
        caseRepository.delete(caseDAO);
    }
}
