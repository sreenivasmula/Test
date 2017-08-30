package com.tek.interview.question;

import java.util.List;

public class OrCriteria implements Criteria {
    
    private Criteria criteria;

    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Version> meetCriteria(List<Version> versions) {

        List<Version> firstCriteriaVersions = criteria.meetCriteria(versions);
        List<Version> otherCriteriaVersons = otherCriteria.meetCriteria(versions);
        for (Version version : otherCriteriaVersons) {
            if(!firstCriteriaVersions.contains(version)){
                firstCriteriaVersions.add(version);
            }
         } 
         return firstCriteriaVersions;
    }
}



