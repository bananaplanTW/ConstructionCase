package bananaplan.controller;

import bananaplan.domain.request.CaseRequest;
import bananaplan.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by paulou on 10/5/15.
 * All rights are reserved by BPT
 */

@RestController
public class CaseController {

    @Autowired
    CaseService caseService;

    @RequestMapping(value = "/cases", method = RequestMethod.PUT)
    public void createCase(@RequestBody CaseRequest caseRequest){
        caseService.createCase(caseRequest);
    }

    @RequestMapping(value = "/cases/{caseId}", method = RequestMethod.PUT)
    public void updateCase(@PathVariable Long caseId, @RequestBody CaseRequest caseRequest){
        caseService.updateCase(caseId, caseRequest);
    }

    @RequestMapping(value = "/cases/{caseId}", method = RequestMethod.DELETE)
    public void deleteCase(@PathVariable Long caseId){
        caseService.deleteCase(caseId);
    }
}
