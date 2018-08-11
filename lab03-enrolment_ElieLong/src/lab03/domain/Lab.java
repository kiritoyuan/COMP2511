package lab03.domain;
import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 *  Created 3/8/18
 */
public class Lab extends Session {

    private String tutor;
    private String labAssistant;

    public Lab(String location, DayOfWeek day,LocalTime start, LocalTime end, String tutor, String labAssistant) {
        super(location, day,start, end);
        this.tutor = tutor;
        this.labAssistant = labAssistant;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(String labAssistant) {
        this.labAssistant = labAssistant;
    }
}
