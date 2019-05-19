package org.launchcode;


import java.util.ArrayList;
import java.util.Scanner;

        public class UserMenu {
            private ArrayList<User> userLog;
            private ArrayList<Post> postLog;
            private Scanner keyboard;

            public UserMenu() {
                this.userLog = new ArrayList();
                this.postLog = new ArrayList();
                this.keyboard = new Scanner(System.in);

            }

            boolean exit = false;

            private static void printMenu() {
                System.out.println("Main Menu");
                System.out.println("1. Create a new user");
                System.out.println("2. Create a post as the current users");
                System.out.println("3. Print all posts");
                System.out.println("4. Print all users");
                System.out.println("0. Quit");
                System.out.println();

            }
            public void generateMenu(){
                printMenu();

            }

            public void runMenu() {

                Scanner keyboard = new Scanner(System.in);

                int selection;

                do {
                    System.out.println("What would you like to do today? ");
                    printMenu();
                    selection = keyboard.nextInt();
                    //keyboard.skip("\n");
                    if (selection != 0) {
                        processSelection(selection);
                    }
                } while (selection != 0);
                System.out.println("Thank you! We appreciate your input. ");
            }

            private void processSelection(int selection) {
                //Scanner keyboard = new Scanner(System.in);
                BlogGenerator blogGenerator = new BlogGenerator();
                switch (selection) {
                    case 1:
                        //create a new user
                        User newUser = blogGenerator.generateUser();
                        this.userLog.add(newUser);
                        break;
                    case 2:
                        //create a list of users with an ArrayList
                        int selectUser;
                        System.out.println("Please select a user.");
                        for (int i = 0; i < userLog.size(); i++) {
                          System.out.println(i + " " + userLog.get(i).getUserName());
                    }
                        selectUser = keyboard.nextInt();
                        //select a post
                        Post newPost;
                        newPost = blogGenerator.createPost(userLog.get(selectUser));
                        this.postLog.add(newPost);

                        break;
                    //prints all posts
                    case 3:
                        viewPosts();
                        break;
                    //prints all users
                    case 4:
                        viewUsers();
                        break;
                    case 0:
                        exit = true;
                        break;
                }
            }

            private void viewPosts() {
                for (Post post : postLog) {
                    System.out.println("-------------------------");
                    System.out.println(post.toStringPost());
                }
                System.out.println("--------------------");
                System.out.println(" ");

            }


            private void viewUsers() {
                for (User user : userLog) {
                    System.out.println("-------------------------");
                    System.out.println(user.toStringUser());
                }
                System.out.println("-------------------------");
                System.out.println(" ");

            }

        }





