package project4110.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import project4110.model.NewUser;
import project4110.web.NewUserRegistrationDto;

public interface NewUserService extends UserDetailsService {

    NewUser findByEmail(String email);

    NewUser save(NewUserRegistrationDto newUserRegistrationDto);
}
