/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.Date;

/**
 *
 * @author Jeffrey
 */
public class MedicalInfo {
    private Date dateAdmitted;
    private String initialDiagnosis;
    private Date dateDischarge;
    private String disposition;
    private String room;
    
    
    public Date getDateAdmitted() {
        return dateAdmitted;
    }
    
    public void setDateAdmitted(Date dateAdmitted) {
        this.dateAdmitted = dateAdmitted;
    }


    public String getInitialDiagnosis() {
        return initialDiagnosis;
    }


    public void setInitialDiagnosis(String initialDiagnosis) {
        this.initialDiagnosis = initialDiagnosis;
    }


    public Date getDateDischarge() {
        return dateDischarge;
    }


    public void setDateDischarge(Date dateDischarge) {
        this.dateDischarge = dateDischarge;
    }

    public String getDisposition() {
        return disposition;
    }


    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }


    public String getRoom() {
        return room;
    }


    public void setRoom(String room) {
        this.room = room;
    }
}
