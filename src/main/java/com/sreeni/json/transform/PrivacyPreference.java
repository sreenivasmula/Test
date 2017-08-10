package com.sreeni.json.transform;

public class PrivacyPreference {
    
    private int preference_id;
    private int status_id;
    private String modified_by;
    private String modified_date;
    
    public int getPreference_id() {
        return preference_id;
    }
    public void setPreference_id(int preference_id) {
        this.preference_id = preference_id;
    }
    public int getStatus_id() {
        return status_id;
    }
    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
    public String getModified_by() {
        return modified_by;
    }
    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }
    public String getModified_date() {
        return modified_date;
    }
    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

}


