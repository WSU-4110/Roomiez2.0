package project4110.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project4110.model.NewUser;

@Repository
public interface NewUserRepository extends CrudRepository <NewUser, Long> {

    NewUser findByEmail(String email);

}


