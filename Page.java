/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrew
 */

public class Page {
    private String id;
    private String name;
    private List<Post> posts;
    private User owner;
    public Page(String id,String name,User owner){
        this.id=id;
        this.name=name;
        this.owner=owner;
        posts=new ArrayList<>();
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void addPost(Post p){
        posts.add(p);
    }
    public void removePost(Post p){
        posts.remove(p);
    }
    public List<Post> getPosts(){
        return posts;
    }
    public boolean containsPost(Post p){
        return posts.contains(p);
    }
    public User getOwner(){
        return owner;
    }
}
