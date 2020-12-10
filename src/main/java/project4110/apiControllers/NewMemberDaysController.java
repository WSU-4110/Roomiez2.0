package project4110.apiControllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project4110.model.NewMemberDays;

@Controller
public class NewMemberDaysController {

    @GetMapping("/SearchNewMembers")
    public String addTimeSubmit(Model model){
        model.addAttribute("newMemberDays", new NewMemberDays());
        return "SearchNewMember";
    }

    @PostMapping("/SearchNewMembers")
    public String addTimeForm(@ModelAttribute NewMemberDays newMemberDays, Model model){
        model.addAttribute("newMemberDays", newMemberDays);
        return "SearchNewMember";
    }


}
