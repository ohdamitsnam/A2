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
public class Group implements Composite{
    private String groupId = "";
    ArrayList <User> group;
    private final long creationTime;
    private final long creationTimeMinutes;
    private final long creationTimeHours;
    public Group() {
        this.group = new ArrayList<>();
        this.creationTime = System.currentTimeMillis();
        this.creationTimeMinutes = (this.creationTime/60000)%60;
        this.creationTimeHours = this.creationTime/3600000;
    }
    public long getCreationTimeMinute(){
        return creationTimeMinutes;
    }
    public long getCreationTimeHour(){
        return creationTimeHours;
    }
    @Override
    public long getCreationTime(){
        return creationTime;
    }
    @Override
    public void setID(String id){
        groupId = id;
    }
    
    @Override
    public String toString(){
        return this.groupId;
    }

    @Override
    public String getId() {
        return groupId; 
    }
}
