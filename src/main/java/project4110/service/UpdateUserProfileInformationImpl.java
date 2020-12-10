package project4110.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project4110.Repository.UpdateUserProfileInformationRepository;
import project4110.model.UpdateUserProfileInformation;
import project4110.web.UpdateUserProfileInformationDto;

@Service
public class UpdateUserProfileInformationImpl implements UpdateUserProfileInformationService{

    @Autowired
    private UpdateUserProfileInformationRepository updateUserProfileInformationRepository;

    private UpdateUserProfileInformationImpl(UpdateUserProfileInformationRepository updateUserProfileInformationRepository){
        super();
        this.updateUserProfileInformationRepository = updateUserProfileInformationRepository;
    }

    @Override
    public UpdateUserProfileInformation save(UpdateUserProfileInformationDto updateUserProfileInformationDto){
        UpdateUserProfileInformation updateUserProfileInformation = new UpdateUserProfileInformation(
        updateUserProfileInformationDto.getHeadLine(), updateUserProfileInformationDto.getProfession(),
        updateUserProfileInformationDto.getSocialMedia(), updateUserProfileInformationDto.getAge(),
        updateUserProfileInformationDto.getCurrentCity(), updateUserProfileInformationDto.getLanguage(),
        updateUserProfileInformationDto.getImportantThing());
        return updateUserProfileInformationRepository.save(updateUserProfileInformation);
    }

    @Override
    public UpdateUserProfileInformation get(Long id){
        return updateUserProfileInformationRepository.findById(id).get();
    }

    @Override
    public UpdateUserProfileInformation getByUserId(Long userId){
        return updateUserProfileInformationRepository.getByUserId(userId);
    }

}
