/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nam
 */
public class User extends AdminPage implements Composite,Observer,Element{
    private String userId = "";
    ArrayList<User> followers;
    ArrayList<User> following;
    ArrayList<String> newsFeed;
    ArrayList<User> feedUser;
    private final long creationTime;
    private long lastUpdateTime = 0;
    //private final long creationTimeMinutes;
    //private final long creationTimeHours;
    SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm"); 
    Date creationDate;
    Date updateDate;
    private final String date;
    //private static  User instance;
    private String date2;
    
    public User() {
        this.date2 = "";
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.newsFeed = new ArrayList<>();
        this.creationTime = System.currentTimeMillis();
        creationDate = new Date(this.creationTime);
        //this.creationTimeHours = this.creationTime/3600000;
        //this.creationTimeMinutes = (this.creationTime/60000)%60;
        date = sdf.format(creationDate);
    }

    /**
     *
     * @return
     */
    @Override
    public long getCreationTime(){
        return creationTime;
    }
    public String getDate(){
        return this.date;
    }
    public String getUpdateDate(){
        return date2;
    }
    public long getUpdateTime(){
        return lastUpdateTime;
    }
    @Override
    public void setID(String id){
        userId = id;
    }
    public long calculateMins(){
        long seconds = System.currentTimeMillis()/1000;
        long minutes = seconds/60;
        long minutesRemain = minutes%60;
        long hours = minutes/60;
        return minutesRemain;
    }
    @Override
    public String toString(){
        return userId;
    }

    @Override
    public String getId() {
        return userId;
    }

    /**
     *
     * @param user
     */
    @Override
    public void update(User user) {
        this.following.add(user);
    }
    @Override
    public void update(String tweet){
        /*for(int i =0; i< followers.size(); i++){
            User follow;
            follow = followers.get(i);
            follow.newsFeed.add(tweet);
        }*/
        lastUpdateTime = System.currentTimeMillis();
        updateDate = new Date(this.lastUpdateTime);
        date2 = sdf.format(updateDate);
        System.out.println(date2);
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
