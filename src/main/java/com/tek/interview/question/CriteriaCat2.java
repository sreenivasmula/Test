package com.tek.interview.question;

import java.util.ArrayList;
import java.util.List;

public class CriteriaCat2 implements Criteria {
    
    public List<Version> meetCriteria(List<Version> versions) {
        List<Version> cat2Versions = new ArrayList<Version>();
        for(Version version : versions) {
            if(version.category2 != null && version.category2.equalsIgnoreCase("cat2")) {
                cat2Versions.add(version);
            }
        }
        return cat2Versions;
    }
}


