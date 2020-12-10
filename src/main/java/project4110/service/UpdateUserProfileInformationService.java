package project4110.service;


import project4110.model.UpdateUserProfileInformation;
import project4110.web.UpdateUserProfileInformationDto;

public interface UpdateUserProfileInformationService {

    UpdateUserProfileInformation save(UpdateUserProfileInformationDto updateUserProfileInformationDto);

    UpdateUserProfileInformation get(Long id);

    UpdateUserProfileInformation getByUserId(Long userId);
}
