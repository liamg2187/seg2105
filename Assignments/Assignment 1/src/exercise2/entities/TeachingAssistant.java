package exercise2.entities;

/**
 * The TeachingAssistant class represents a teaching assistant, extending the Instructor class and implementing the
 * Teacher interface. It includes methods specific to the role of a teaching assistant.
 *
 * @author Liam Geraghty
 */
public class TeachingAssistant extends Instructor {

    private final int max_courses = 3;

    /**
     * Constructs a new TeachingAssistant with the specified details.
     *
     * @param firstName the first name of the professor
     * @param lastName the last name of the professor
     * @param id the unique identifier of the professor
     * @param salary the salary of the professor
     */
    public TeachingAssistant(String firstName, String lastName, String id, double salary) {
        super(firstName, lastName, id, salary);
    }

    /**
     * Assigns a course to the teaching assistant if the maximum number of courses is not exceeded.
     *
     * @param course the course to be assigned
     * @return true if the course was successfully assigned, false otherwise
     */
    @Override
    public boolean assignCourse(Course course) {
        if (courses.size() < max_courses) {
            courses.add(course);
            return true;
        } else {
            return false;
        }
    }
}
