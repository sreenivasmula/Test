package com.tek.interview.question;

import java.util.ArrayList;
import java.util.List;

public class CriteriaCat1 implements Criteria {
    
    public List<Version> meetCriteria(List<Version> versions) {
        List<Version> cat1Versions = new ArrayList<Version>();
        for(Version version : versions) {
            if(version.category1 != null && version.category1.equalsIgnoreCase("cat1")) {
                cat1Versions.add(version);
            }
        }
        return cat1Versions;
    }
}


