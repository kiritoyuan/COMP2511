package lab03.test;


import lab03.domain.Course;
import lab03.domain.CourseOffering;
import lab03.domain.Enrolment;
import lab03.domain.EntrolmentSystem;
import lab03.domain.Status;
import lab03.domain.Student;

public class EnrolSystemMain {

	    public static void main(String[] args) {
	        EntrolmentSystem enrolSys = new EntrolmentSystem();

	        // Create a course
	        Course comp1511 = new Course("COMP1511");
	        Course comp1531 = new Course("COMP1531");
	        comp1531.addPrereq(comp1511);
	        Course comp2521 = new Course("COMP2521");
	        comp2521.addPrereq(comp1531);
	        comp2521.addPrereq(comp1511); 
	        
	        // Add your code to create additional test data
	        // You will need to:
	        // (i)  create course-offerings for each course and sessions to the course-offering
    		CourseOffering co1 = new CourseOffering(comp1511, "2018", "s1");
    		CourseOffering co2 = new CourseOffering(comp1511, "2018", "s2");
    		CourseOffering co3 = new CourseOffering(comp1531, "2018", "s1");
    		CourseOffering co4 = new CourseOffering(comp1531, "2018", "s2");
    		CourseOffering co5 = new CourseOffering(comp2521, "2018", "s1");
    		CourseOffering co6 = new CourseOffering(comp2521, "2018", "s2");
    		comp1511.addCourseOffering(co1);
    		comp1511.addCourseOffering(co2);
    		comp1531.addCourseOffering(co3);
    		comp1531.addCourseOffering(co4);
    		comp2521.addCourseOffering(co5);
    		comp2521.addCourseOffering(co6);
	        // (ii) add a student
    		Student s1 = new Student("z555555");
    		Enrolment e1 = enrolSys.enrolStudent(s1, co1);
    		e1.setStatus(Status.Completed);
	        // (iv) create an enrolment for the student in COMP1531. This enrolment should succeed as COMP1531 has one pre-requisite COMP1511
	        //      which the student has completed
    		Enrolment e2 = enrolSys.enrolStudent(s1, co4);
    		e2.setStatus(Status.Current);
	        // (v)  create an enrolment for COMP2521. This should fail as pre-requisites are not met.
    		enrolSys.enrolStudent(s1, co5);
    		
	        // Add courses to the enolment system		
	        enrolSys.addCourse(comp1531);
	        enrolSys.addCourse(comp2521);
	        enrolSys.addCourse(comp1511);
	        
	        s1.displayEnrolments();
	        // Display courses in system
	        enrolSys.displayCourses();

	        // Display course offerings for a particular semester
	        enrolSys.displayCourseOfferings("2018", "s2");
	    }
}
