package lab03.domain;
import java.util.ArrayList;

/**
 * Created 3/8/18.
 */
public class EntrolmentSystem {

    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Enrolment> enrolments;

    	public EntrolmentSystem() {
        courses = new ArrayList<Course>();
        students = new ArrayList<Student>();
        enrolments = new ArrayList<Enrolment>();
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public String displayCourses() {
        StringBuilder sb = new StringBuilder();
        sb.append("Courses are:\n");
        for (Course course : courses) {
            sb.append(course.toString()).append("\n");
        }
        String result = new String(sb);
        System.out.println(result);
        return result;
    }

    public void displayCourseOfferings(String year, String term) {
        // to be completed
    	StringBuilder sb = new StringBuilder();
    	sb.append("CourseOfferings are:\n");
    	ArrayList<CourseOffering> courseOfferings = listCourseOfferings(year, term);
    	for (CourseOffering offering : courseOfferings) {
    		sb.append(offering.toString()).append("\n");
    	}
        String result = new String(sb);
        System.out.println(result);
    }

    public ArrayList<CourseOffering> listCourseOfferings(String year, String term) {
        ArrayList<CourseOffering> offerings = new ArrayList<>();
        // to be completed
        for (Course course : courses) {
    		ArrayList<CourseOffering> courseOfferings = course.getCourseOfferings();
    		for (CourseOffering offering : courseOfferings) {
    			if (offering.hasOffering(year, term)) {
    				offerings.add(offering);
    			}
    		}
        }
        return offerings;
    }

    public Enrolment enrolStudent(Student student, CourseOffering co) {
    	// to be completed
    	Course course = co.getCourse();
    	ArrayList<Course> prereqs = course.getPrereqs();
    	enrolments = student.getEnrolments();
    	int allCompleted = 0;
    	for (Enrolment enrolment : enrolments) {
    		Course precourse = enrolment.getCourse();
    		Status status = enrolment.getStatus();
    		for (Course prereq : prereqs) {
    			if (prereq.equals(precourse) && status == Status.Completed) {
    				allCompleted++;
    				break;
    			}
    		}
    	}
    	if (allCompleted == prereqs.size()) {
    		Enrolment newEnrolment = new Enrolment(co);
    		student.addEnrolment(newEnrolment);	
    		return newEnrolment;
    	}
    	return null;
    }
    
}
