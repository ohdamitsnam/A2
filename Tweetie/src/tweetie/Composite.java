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
public interface Composite {
    public void setID(String id);
    public String getId();

    /**
     *
     * @return
     */
    @Override
    public String toString();
    public long getCreationTime();

}
