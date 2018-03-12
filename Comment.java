/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author andrew
 */
public class Comment {
    String id;
    String commentText;
    User owner;
    Date date;
    public Comment(String id,String commentText,User owner,Date date){
        this.id=id;
        this.commentText=commentText;
        this.owner=owner;
        this.date=date;
    }
    public String getId(){
        return id;
    }
    public Date getDate(){
        return date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", commentText='" + commentText + '\'' +
                ", owner=" + owner +
                ", date=" + date +
                '}';
    }
}
