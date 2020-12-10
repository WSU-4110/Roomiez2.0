package project4110.service;


import project4110.model.UserSurveyResults;
import project4110.web.UserSurveyResultsDto;

public interface UserSurveyResultsService {

    UserSurveyResults save(UserSurveyResultsDto userSurveyResultsDto);

    UserSurveyResults get(Long id);

}


