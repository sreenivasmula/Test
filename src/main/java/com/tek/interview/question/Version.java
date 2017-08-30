package com.tek.interview.question;

public class Version {
    
    int id;
    String category1;
    String category2;
    
    public Version (int id, String category1, String category2) {
        this.id=id;
        this.category1=category1;
        this.category2=category2;
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategory1() {
        return category1;
    }
    public void setCategory1(String category1) {
        this.category1 = category1;
    }
    public String getCategory2() {
        return category2;
    }
    public void setCategory2(String category2) {
        this.category2 = category2;
    }
    
    public String toString() {
        return getId() + " " + getCategory1() + " " + getCategory2();
    }

}


/*
 * Copyright 2017 Capital One Financial Corporation All Rights Reserved.
 * 
 * This software contains valuable trade secrets and proprietary information of
 * Capital One and is protected by law. It may not be copied or distributed in
 * any form or medium, disclosed to third parties, reverse engineered or used in
 * any manner without prior written authorization from Capital One.
 */
