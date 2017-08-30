package com.tek.interview.question;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Version> meetCriteria(List<Version> versions) {

        List<Version> firstCriteriaPersons = criteria.meetCriteria(versions);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }

}
