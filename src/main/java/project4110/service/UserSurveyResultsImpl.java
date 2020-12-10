package project4110.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project4110.Repository.UserSurveyResultsRepository;
import project4110.model.UserSurveyResults;
import project4110.web.UserSurveyResultsDto;

@Service
public class UserSurveyResultsImpl implements UserSurveyResultsService {

    @Autowired
    private UserSurveyResultsRepository userSurveyResultsRepository;

    private UserSurveyResultsImpl(UserSurveyResultsRepository userSurveyResultsRepository){
        super();
        this.userSurveyResultsRepository = userSurveyResultsRepository;
    }

    @Override
    public UserSurveyResults save(UserSurveyResultsDto userSurveyResultsDto){
        UserSurveyResults userSurveyResults = new UserSurveyResults(userSurveyResultsDto.getWhatDescribesYou(),
                userSurveyResultsDto.getExtrovertedOrIntroverted(), userSurveyResultsDto.getInviteFriendsOver(),
                userSurveyResultsDto.getCleaningHabits(), userSurveyResultsDto.getDoYouSmoke(),
                userSurveyResultsDto.getDoesRoommateSmoke(), userSurveyResultsDto.getDoYouDrink(),
                userSurveyResultsDto.getDoesRoommateDrink(), userSurveyResultsDto.getSleepSchedule(),
                userSurveyResultsDto.getCookingHabit(), userSurveyResultsDto.getMusicTaste(),
                userSurveyResultsDto.getHavePets(), userSurveyResultsDto.getWorkFromHome(),
                userSurveyResultsDto.getPetPeeves(), userSurveyResultsDto.getWhatAreYouLookingFor());
                return userSurveyResultsRepository.save(userSurveyResults);
    }

    @Override
    public UserSurveyResults get(Long id){
//        UserSurveyResults userSurveyResults = new UserSurveyResults();
//        userSurveyResults.setHavePets("yes");
        return userSurveyResultsRepository.findById(id).get();
    }
}




