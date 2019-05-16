package org.launchcode;
import java.util.Scanner;

public class Post {
    /*creating a microblogging app, where the user can post updates to a private social media site
     * creating object variables */
    private static int postId = 0;

    private User user;
    private int id;
    private String userContent;
    private String webAddress;

    //Constructor to create new Post object with just user and content
    public Post(User user, String userContent) {
        //Increases the counter by 1
        postId++;
        this.user = user;
        this.id = postId;
        this.userContent = userContent;
        //this.webAddress = webAddress;
        //creating Methods to initialize the object
    }


    public Post() {
        postId++;
        this.id = postId;
    }

    //Constructor to create new Post object with user, content, and web address

    public Post(User user, String userContent, String webAddress) {
        postId++;

        this.user = user;
        this.id = postId;
        this.userContent = userContent;
        this.webAddress = webAddress;
    }
    //Getter to return the post id
    public int getId() {return this.id;}

    public void setPostId(int postId){this.id = id;}

    //created getters and setters


    public String getUser(){return user.getUserName();
    }
    public void setUser(User user){this.user = user;}

    public String getUserContent() {return this.userContent;
    }

    public void setUserContent(String userContent) {this.userContent = userContent;
    }

    public String getWebAddress() {return this.webAddress;
    }

    public void setWebAddress(String webAddress) {this.webAddress = webAddress;
    }

    //Overides the built in toString Method
    public String toStringPost() {
        return "Post ID: " + this.id + "\n" +
                "User: " + user.getUserName() + "\n" +
                "Post: " + this.userContent + "\n" +
                "Web Address" + this.webAddress ;

    }
}



