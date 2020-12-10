package project4110.apiControllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project4110.service.NewUserService;
import project4110.web.NewUserRegistrationDto;

//This will submit user registration info
    //Post to show registration
    @Controller
    @RequestMapping("/Registration")
    public class UserRegistrationController {

        private NewUserService newUserService;

    public UserRegistrationController(NewUserService newUserService) {
        super();
        this.newUserService = newUserService;
    }

    @ModelAttribute
    public NewUserRegistrationDto newUserRegistrationDto(){
        return new NewUserRegistrationDto();
    }


    @GetMapping
    public String showRegistrationForm(Model model){
        model.addAttribute("newUser", new NewUserRegistrationDto());
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("newUser") NewUserRegistrationDto newUserRegistrationDto){
        newUserService.save(newUserRegistrationDto);
        return "redirect:/registration?success";
    }

}


