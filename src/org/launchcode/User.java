package org.launchcode;

public class User {
    private String avatarUrl;
    private String userName;
    private String firstName;
    private String lastName;
    private String userEmail;

    public User (String avatarUrl, String userName, String firstName, String lastName, String userEmail) {
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userEmail = userEmail;
    }
    // empty constructor without parameters so it can take in what it wants
    public User() {}

    //create getters and setters for each field
    public String getAvatarUrl(){return this.avatarUrl;}
    public void setAvatarUrl(String avatarUrl){this.avatarUrl = avatarUrl;}
    public String getUserName (){return this.userName;}
    public void setUserName(String userName){this.userName = userName;}
    public String getFirstName(){return this.firstName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public String getLastName(){return this.lastName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public String getUserEmail(){return this.userEmail;}
    public void setUserEmail(String userEmail){this.userEmail = userEmail;}


    //Overides the built in toString Method
    public String toStringUser() {
        return   "User: " + this.getUserName() + "\n" +
                "AvatarUrl: " + this.avatarUrl + "\n" +
                "First and Last Name: " + this.firstName + this.lastName + "\n" +
                "Email: " + this.userEmail;

    }
}



