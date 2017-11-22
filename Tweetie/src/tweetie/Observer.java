/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetie;

/**
 *
 * @author Nam
 */
public interface Observer {
    public void update(User user);

    /**
     *
     * @param tweet
     */
    public void update(String tweet);
}
