package com.sreeni.json.transform;

import java.util.List;

public class PrivacyPreferences {
    
    private String cif;
    private List<PrivacyPreference> privacyPreferenceList;
    
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }
    public List<PrivacyPreference> getPrivacyPreferenceList() {
        return privacyPreferenceList;
    }
    public void setPrivacyPreferenceList(List<PrivacyPreference> privacyPreferenceList) {
        this.privacyPreferenceList = privacyPreferenceList;
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
