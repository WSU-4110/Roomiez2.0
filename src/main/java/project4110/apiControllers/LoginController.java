package project4110.apiControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

//    @GetMapping("/LogIn")
//    public String addLoginSubmit(Model model){
//        model.addAttribute("login", new Login());
//        return "LogIn";
//    }
//
//    @PostMapping("/LogIn")
//    public String addLoginForm(@ModelAttribute Login login, Model model){
//        model.addAttribute("login", login);
//        return "PotentialMatches";
//    }


    @GetMapping("/")
    public String root() {
        return "UserHomePage";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "LogIn";
    }

    @GetMapping("/newUser")
    public String userIndex() {
        return "newUser/UserHomePage";
    }
}
