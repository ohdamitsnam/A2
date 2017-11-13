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
public interface Visitor {
    public String visit(User user);
    public String visit(Group group);
}
