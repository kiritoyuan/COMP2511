package lab03.domain;
import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Created 3/8/18.
 */
public class Lecture extends Session {

    private String lecturer;

    public Lecture(String location, DayOfWeek day, LocalTime start, LocalTime end, String lecturer) {
        super(location, day, start, end);
        this.lecturer = lecturer;
    }

    public String getLecturer() {
        return lecturer;
    }
}
