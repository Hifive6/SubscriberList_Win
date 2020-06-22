package com.win.subscriberlist.subscriber;

import java.util.Date;

//This is our Model for database.
public class Subscriber {
    
    private Long id;
    private String firstName, lastName, userName;
    private Date signedUp;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignedUp() {
        return signedUp;
    }

    public void setSignedUp(Date signedUp) {
        this.signedUp = signedUp;
    }

    @Override
    public String toString() {
        return "Subscriber [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + ", signedUp=" + signedUp
                + ", userName=" + userName + "]";
    }

    
}