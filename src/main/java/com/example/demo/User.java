package com.example.demo;

import java.io.File;

public class User {
	public String name = null;
	public int ID = -1;
	public File avatar = null;
    public boolean[] musicPreferences = null;
    public String city = null;
    public Integer[] friendsIDs = null;
    public String[] friendsNames = null;   
    public Integer[] notifications = null;
    
    public User(int ID, String name, boolean[] musicPreferences, String city, Integer[] friendsIDs, String[] friendsNames, Integer[] notifications) {
    	this.ID = ID;
    	this.name = name;
    	this.musicPreferences = musicPreferences;
    	this.city = city;
    	this.friendsIDs = friendsIDs;
    	this.friendsNames = friendsNames;
    	this.notifications = notifications;
    }
}
