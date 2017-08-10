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


