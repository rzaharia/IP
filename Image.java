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
public class Image {
    Date date;
    String imageRepresentation;
    String postId;
    public Image(String id,Date date,String imageReperesentation ){
        this.postId=postId;
    }
    public Date getDate(){
        return date;
    }
    public String getId(){
        return postId;
    }

    @Override
    public String toString() {
        return "Image{" +
                "date=" + date +
                ", imageRepresentation='" + imageRepresentation + '\'' +
                ", postId='" + postId + '\'' +
                '}';
    }
}
