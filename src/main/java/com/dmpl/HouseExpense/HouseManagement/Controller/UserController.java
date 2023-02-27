package com.dmpl.HouseExpense.HouseManagement.Controller;

import com.dmpl.HouseExpense.HouseManagement.Entity.User;
import com.dmpl.HouseExpense.HouseManagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@Controller
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("user", new User());
        return "Home";
    }
    @PostMapping("/createUser")
    public String createUserPage(Model model){
        model.addAttribute("user", new User());
        return "CreateNewUser";
    }

    @PostMapping("/loginPage")
    public String loginPage(Model model){
        model.addAttribute("user", new User());
        return "Login";
    }

    @PostMapping("/login")
    public String loginUser(User user){
        return "SummaryPage";
    }

    @PostMapping("/save")
    public String saveUser(User user){
        user.setCreateDate(new Date());
        repo.save(user);
        return "NewUserCreated";
    }
}
