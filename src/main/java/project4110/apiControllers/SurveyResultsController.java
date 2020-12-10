package project4110.apiControllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project4110.model.UpdateUserProfileInformation;
import project4110.model.UserSurveyResults;
import project4110.model.WallPost;
import project4110.service.UpdateUserProfileInformationService;
import project4110.service.UserSurveyResultsService;
import project4110.service.WallPostService;
import project4110.web.WallPostDto;

import java.security.Principal;

@Controller
@RequestMapping("/surveyResults")
public class SurveyResultsController {

    private UserSurveyResultsService userSurveyResultsService;
    private UpdateUserProfileInformationService updateUserProfileInformationService;
    private WallPostService wallPostService;


    public SurveyResultsController(UserSurveyResultsService userSurveyResultsService,
                                   UpdateUserProfileInformationService updateUserProfileInformationService,
                                   WallPostService wallPostService) {
        this.userSurveyResultsService = userSurveyResultsService;
        this.updateUserProfileInformationService = updateUserProfileInformationService;
        this.wallPostService = wallPostService;
    }



    @PostMapping
    public String postWallPost(@ModelAttribute("wallpost") WallPostDto wallPostDto){
        wallPostService.save(wallPostDto);
        return "redirect:/surveyResults?success?";
    }


    @GetMapping
    public String getSurveyStuff(Model model, Principal principal){
        UserSurveyResults surveyResults = userSurveyResultsService.get((long) 7);
        model.addAttribute("results", surveyResults);

//        NewUser user = (NewUser)principal;
        UpdateUserProfileInformation basicInfoResults = updateUserProfileInformationService.getByUserId((long) 8);
        model.addAttribute("basicinforesults", basicInfoResults);

        model.addAttribute("wallpost",new WallPostDto());

        Iterable<WallPost> posts = wallPostService.findAll();
        model.addAttribute("posts", posts);


        return "UserHomePage";
    }


}






