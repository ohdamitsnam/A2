/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetie;

import java.math.BigDecimal;

/**
 *
 * @author Nam
 */
public class Data {
    private int totMessages = 0;
    private int totGroups = 0;
    private int totUsers = 0;
    private int posMessages = 0;
    private double posPercent = 0.0;
    public void addTotMessages(){
        totMessages++;
    }
    public int getTotMessages(){
        return totMessages;
    }
    public void addTotGroups(){
        totGroups++;
    }
    public int getTotGroups(){
        return totGroups;
    }
    public void addTotUsers(){
        totUsers++;
    }
    public int getTotUsers(){
        return totUsers;
    }
    public void addPosMessage(){
        posMessages++;
    }
    public int getPosMessage(){
        return posMessages;
    }
    public double calcPosPercent(){
        if(totMessages == 0){
            return 0;
        }else{
            double ans = Math.floor((posMessages*100.0)/totMessages);
            posPercent = ans;
            return posPercent;  
        }    
    }
    public void setPosPercent(double num){
        posPercent = num;
    }
    public double getPosPercent(){
        return posPercent;
    }
}
