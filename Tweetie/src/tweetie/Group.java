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
    public Group() {
        this.group = new ArrayList<>();
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
