package lab03.domain;
import java.util.ArrayList;

/**
 * Created 3/8/18.
 */
public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments;

	public Student(String zid) {
        this.zid = zid;
        enrolments = new ArrayList<>();
    }

	/**
	 * Add an enrolment.
	 * @param e
	 */
	public void addEnrolment(Enrolment e) {
		this.enrolments.add(e);
	}

	public ArrayList<Enrolment> getEnrolments() {
		return enrolments;
	}

	/**
	 * @return the zid
	 */
	public String getZid() {
		return zid;
	}
	
	/**
	 * Print out all the students enrolments.
	 */
	public void displayEnrolments() {
        // to be completed
        StringBuilder sb = new StringBuilder();
        sb.append("Enrolments are:\n");
        for (Enrolment enrolment : enrolments) {
            sb.append(enrolment.toString()).append("\n");
        }
        String result = new String(sb);
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Student{" +
                "zid='" + zid + '\'' +
                '}';
    }
}
