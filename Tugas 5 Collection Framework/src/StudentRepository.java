import java.util.*;

public class StudentRepository {

    private Map<String, Student> students = new HashMap<>();
    private List<String> logs = new ArrayList<>();

    public void add(Student s) {
        students.put(s.getId(), s);
        logs.add("ADD: " + s);
    }

    public void update(String id, String newName, double newGpa) {
        Student s = students.get(id);
        if (s != null) {
            logs.add("UPDATE BEFORE: " + s);
            s.setName(newName);
            s.setGpa(newGpa);
            logs.add("UPDATE AFTER: " + s);
        }
    }

    public void remove(String id) {
        Student s = students.remove(id);
        if (s != null) {
            logs.add("REMOVE: " + s);
        }
    }

    // 🔒 Encapsulation aman (defensive copy)
    public List<String> getLogs() {
        return Collections.unmodifiableList(new ArrayList<>(logs));
    }
}
