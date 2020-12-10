package project4110.apiControllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project4110.service.UserSurveyResultsService;
import project4110.web.UserSurveyResultsDto;


@Controller
@RequestMapping("/surveyForm")
public class UserSurveyFormController {

    private UserSurveyResultsService userSurveyResultsService;

    public UserSurveyFormController(UserSurveyResultsService userSurveyResultsService) {
        this.userSurveyResultsService = userSurveyResultsService;
    }

    @ModelAttribute
    public UserSurveyResultsDto userSurveyResultsDto() {
        return new UserSurveyResultsDto();
    }


    @PostMapping
    public String postUpdateSurveyResults(@ModelAttribute("update") UserSurveyResultsDto userSurveyResultsDto){
        userSurveyResultsService.save(userSurveyResultsDto);
        return "redirect:/surveyForm?success";
    }



}





