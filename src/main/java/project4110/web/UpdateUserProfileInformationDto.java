package project4110.web;

public class UpdateUserProfileInformationDto {

    private String headLine;
    private String profession;
    private String socialMedia;
    private String age;
    private String currentCity;
    private String language;
    private String importantThing;

    public UpdateUserProfileInformationDto() {
    }

    public UpdateUserProfileInformationDto(String headLine, String profession, String socialMedia,
                                        String age, String currentCity, String language, String importantThing) {
        this.headLine = headLine;
        this.profession = profession;
        this.socialMedia = socialMedia;
        this.age = age;
        this.currentCity = currentCity;
        this.language = language;
        this.importantThing = importantThing;
    }


    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImportantThing() {
        return importantThing;
    }

    public void setImportantThing(String importantThing) {
        this.importantThing = importantThing;
    }
}
