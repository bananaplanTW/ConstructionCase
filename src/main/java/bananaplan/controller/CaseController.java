package bananaplan.controller;

import bananaplan.domain.request.CaseRequest;
import bananaplan.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by paulou on 10/5/15.
 * All rights are reserved by BananaPlanTw
 */
@RestController
public class CaseController {

    @Autowired
    CaseService caseService;

    @RequestMapping(value = "/cases", method = RequestMethod.PUT)
    public void createCase(@RequestBody CaseRequest caseRequest){
        caseService.createCase(caseRequest);
    }
}
