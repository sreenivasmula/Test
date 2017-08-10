package com.sreeni.json.transform;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        
        List<PrivacyPreference> privacyPreferenceList = new ArrayList<PrivacyPreference>();       
        
        for(int i=1; i<8; i++) {
            
            PrivacyPreference privacy = new PrivacyPreference();
            
            if(i !=7 ) {
                privacy.setPreference_id(i);
                privacy.setStatus_id(3);
                privacy.setModified_by("CSTInitialLoad");
                privacy.setModified_date(getDate());
                privacyPreferenceList.add(privacy);
            }
        }
        
        try {
        
        ObjectMapper mapper = new ObjectMapper();
        
        PrivacyPreferences privacyPref = new PrivacyPreferences();
        privacyPref.setCif("46523303");
        privacyPref.setPrivacyPreferenceList(privacyPreferenceList);
        
        //Object to JSON in file
        mapper.writeValue(new File("c:\\tmp\\privacyPreferences.json"), privacyPref);

        //Object to JSON in String
        String jsonInString = mapper.writeValueAsString(privacyPref);
        System.out.println(jsonInString);
        
        
        String var = "82320490";
        String var1 = "6009300647";
        String cif="195498938";
        String fixedLenString = fixedLengthString(var, 15);        
        System.out.println("Rmcis ID : " + fixedLenString + " | CIF :" + cif );
        fixedLenString = fixedLengthString(var1, 15);        
        System.out.println("Rmcis ID : " + fixedLenString + " | CIF :" + cif );                
        } catch(Exception ex) {
            
        }
    }
    
    public static String fixedLengthString(String string, int length) {
        return String.format("%1$-"+length+ "s", string);
    }
    
    public static String getDate() {
        Date today = Calendar.getInstance().getTime();
        final SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        return dateFormat.format(today);
    }
}
