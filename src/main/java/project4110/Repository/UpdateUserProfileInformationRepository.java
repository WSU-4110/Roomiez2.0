package project4110.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project4110.model.UpdateUserProfileInformation;

@Repository
public interface UpdateUserProfileInformationRepository extends CrudRepository<UpdateUserProfileInformation, Long> {

    UpdateUserProfileInformation getByUserId(Long userId);

}
