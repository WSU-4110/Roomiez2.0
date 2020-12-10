package project4110.apiControllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project4110.service.UpdateUserProfileInformationService;
import project4110.web.UpdateUserProfileInformationDto;
import project4110.web.UserSurveyResultsDto;

@Controller
@RequestMapping("/aboutmeForm")
public class UpdateUserInformationFormController {

    private UpdateUserProfileInformationService updateUserProfileInformationService;

    public UpdateUserInformationFormController(UpdateUserProfileInformationService updateUserProfileInformationService) {
        this.updateUserProfileInformationService = updateUserProfileInformationService;
    }

    @ModelAttribute
    public UpdateUserProfileInformationDto updateUserProfileInformationDto(){
        return new UpdateUserProfileInformationDto();
    }

    @GetMapping
    public String showUpdatedInformation(Model model){
        model.addAttribute("updateinfo", new UpdateUserProfileInformationDto());
        model.addAttribute("update", new UserSurveyResultsDto());
        return "updateUserProfile";
    }

    @PostMapping
    public String postUpdateInformationResults(@ModelAttribute("updateinfo") UpdateUserProfileInformationDto updateUserProfileInformationDto){
        updateUserProfileInformationService.save(updateUserProfileInformationDto);
        return "redirect:/aboutmeForm?success";
    }
}
