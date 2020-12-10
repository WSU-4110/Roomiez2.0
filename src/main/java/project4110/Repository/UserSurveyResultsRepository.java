package project4110.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project4110.model.UserSurveyResults;

@Repository
public interface UserSurveyResultsRepository extends CrudRepository<UserSurveyResults, Long> {

}
