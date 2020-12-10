package project4110.apiControllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project4110.model.Radius;

@Controller
public class RadiusController {

    @GetMapping("/SearchByLocation")
    public String addRadiusSubmit(Model model){
        model.addAttribute("radius", new Radius());
        return "SearchLocation";
    }

    @PostMapping("/SearchByLocation")
    public String addRadiusForm(@ModelAttribute Radius radius, Model model){
        model.addAttribute("radius", radius);
        return "SearchLocation";
    }


}
