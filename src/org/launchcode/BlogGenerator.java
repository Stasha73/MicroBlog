package org.launchcode;

import java.util.Scanner;

public class BlogGenerator {
    //list keyboard as private so that you don't have create a keyboard for each instance
    private Scanner keyboard;

    public BlogGenerator() {
        this.keyboard = new Scanner(System.in);

    }

    public User generateUser() {
        String validate;
        User newUser = createUser();
        do {

            System.out.println("\n" + newUser.toStringUser() + "\n");
            System.out.println("Is this correct? (Enter \"y\" for yes or \"n\" for no)");
            validate = keyboard.nextLine();
        } while (!validate.toLowerCase().equals("y"));
        return newUser;
    }

    public Post generatePost () {
        User user = createUser();
        String validate;
        Post newPost;
        do {
            newPost = createPost(user);
            System.out.println("\n" + newPost.toStringPost() + "\n");
            System.out.println("Enter another post?");
            validate = keyboard.nextLine();
        }while (!validate.toLowerCase().equals("y")) ;
            return newPost;
        }
        //get user info from the user class

    private User createUser() {
        User user = new User();
        System.out.println("Enter your user name ");
        user.setUserName(keyboard.nextLine());
        System.out.print("Enter your first and last name ");
        user.setFirstName(keyboard.nextLine());
        user.setLastName(keyboard.nextLine());
        System.out.println("Enter your avatar Url ");
        user.setAvatarUrl(keyboard.nextLine());
        System.out.println("Enter your email ");
            user.setUserEmail(keyboard.nextLine());
        return user;
    }
            // get post info from the post class
            public Post createPost(User user){
        Post newPost = new Post();
        newPost.setUser(user);
        System.out.println("Please enter your post ");
        newPost.setUserContent(keyboard.nextLine());
        System.out.println("(Optional) Please list the web address to your linked site ");
        newPost.setWebAddress(keyboard.nextLine());
               return newPost;
            }


        }

