package bananaplan.controller;

import bananaplan.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import bananaplan.service.AccountService;

import javax.websocket.server.PathParam;

@RestController
public class UserController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/")
    public String hello(){
        return "Greeting Account Manager";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public void createAccount(@RequestBody Account account){
        accountService.createAccount(account);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String accountLogin(@PathParam("username") String username, @PathParam("password") String password){
        return accountService.getAccount(username, password) != null ? "find account!" : "account not exists or username/password not match";
    }

}
