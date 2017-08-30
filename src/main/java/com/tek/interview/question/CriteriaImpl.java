package com.tek.interview.question;

import java.util.ArrayList;
import java.util.List;

public class CriteriaImpl implements Criteria {

    private String criteria;

    private static final String CAT1 = "cat1";

    private static final String CAT2 = "cat2";

    public CriteriaImpl(String criteria) {
        this.criteria = criteria;
    }

    public List<Version> meetCriteria(List<Version> versions) {
        List<Version> cat1Versions = new ArrayList<Version>();
        for (Version version : versions) {
            if (CAT1.equalsIgnoreCase(criteria)) {
                if (version.category1 != null && version.category1.equalsIgnoreCase(CAT1)) {
                    cat1Versions.add(version);
                }
            } else if (CAT2.equalsIgnoreCase(criteria)) {
                if (version.category2 != null && version.category2.equalsIgnoreCase(CAT2)) {
                    cat1Versions.add(version);
                }
            }
        }
        return cat1Versions;
    }
}
