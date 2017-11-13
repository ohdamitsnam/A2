/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetie;

import java.util.ArrayList;

/**
 *
 * @author Nam
 */
public class User implements Composite,Observer,Element{
    private String userId = "";
    ArrayList<User> followers;
    ArrayList<User> following;
    ArrayList<String> newsFeed;
    ArrayList<User> feedUser;
    //private static  User instance;
    public User() {
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.newsFeed = new ArrayList<>();
    }

    @Override
    public void setID(String id){
        userId = id;
    }

    @Override
    public String toString(){
        return userId;
    }

    @Override
    public String getId() {
        return userId;
    }

    @Override
    public void update(User user) {
        this.following.add(user);
    }
    @Override
    public void update(String tweet){
        for(int i =0; i< followers.size(); i++){
            User follow;
            follow = followers.get(i);
            follow.newsFeed.add(tweet);
            
        }
    }

    /**
     *
     * @param v
     * @return
     */
    @Override
    public String accept(Visit v){
        return v.visit(this);
        
    }
}
