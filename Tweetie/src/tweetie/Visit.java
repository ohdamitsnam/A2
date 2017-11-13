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
public class Visit implements Visitor{
    @Override
    public String visit(User user) {
        return "User"+ user.getId();
    }

    @Override
    public String visit(Group group) {
        return "Group" +group.getId();
    }
}
