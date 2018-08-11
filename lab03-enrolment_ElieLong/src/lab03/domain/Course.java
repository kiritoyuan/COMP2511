package lab03.domain;
import java.util.ArrayList;

/**
 * Maintains all the courses offered in the university
 * Created 4/8/2018
 */
public class Course {

    private String courseCode;
    private ArrayList<Course> prereqs;

    // Complete the implementation of this class - to add the missing fields and methods
    // The implementation of this class must conform to your class diagram
    private ArrayList<CourseOffering> courseOfferings;
	private int creditPoints;

    public Course(String courseCode) {
        this.courseCode = courseCode;
        this.prereqs = new ArrayList<Course>();
        this.courseOfferings = new ArrayList<CourseOffering>();
    }
  
    public void addPrereq(Course course) {
        prereqs.add(course);
    }
    
    public ArrayList<Course> getPrereqs() {
		return prereqs;
	}

	public void addCourseOffering(CourseOffering courseOffering) {
    	courseOfferings.add(courseOffering);
    }
    
    public ArrayList<CourseOffering> getCourseOfferings() {
		return courseOfferings;
	}

    @Override
    public String toString() {
        return courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

	public int getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}

}
