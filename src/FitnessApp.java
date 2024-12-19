// FitnessApp.java
public class FitnessApp {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("Alikhan", 18, 80.0);
        User user2 = new User("Alizhan", 19, 65.0);

        // Create workout routines
        WorkoutRoutine routine1 = new WorkoutRoutine("Full Body Workout", 60, "Intermediate");
        WorkoutRoutine routine2 = new WorkoutRoutine("Cardio Blast", 45, "Beginner");

        // Assign routines to users
        user1.setWorkoutRoutine(routine1);
        user2.setWorkoutRoutine(routine2);

        // Display user details and workout routines
        System.out.println(user1);
        System.out.println(user2);

        // Compare users
        if (user1.getAge() > user2.getAge()) {
            System.out.println(user1.getName() + " is older than " + user2.getName());
        } else {
            System.out.println(user2.getName() + " is older than " + user1.getName());
        }
    }
}

// User.java
class User {
    private String name;
    private int age;
    private double weight;
    private WorkoutRoutine workoutRoutine;

    // Constructor
    public User(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public WorkoutRoutine getWorkoutRoutine() {
        return workoutRoutine;
    }

    public void setWorkoutRoutine(WorkoutRoutine workoutRoutine) {
        this.workoutRoutine = workoutRoutine;
    }

    // toString method
    @Override
    public String toString() {
        return "User{name='" + name + '\'' + ", age=" + age + ", weight=" + weight + ", workoutRoutine=" + workoutRoutine + '}';
    }
}

// WorkoutRoutine.java
class WorkoutRoutine {
    private String name;
    private int durationInMinutes;
    private String difficultyLevel;

    // Constructor
    public WorkoutRoutine(String name, int durationInMinutes, String difficultyLevel) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.difficultyLevel = difficultyLevel;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    // toString method
    @Override
    public String toString() {
        return "WorkoutRoutine{name='" + name + '\'' + ", durationInMinutes=" + durationInMinutes + ", difficultyLevel='" + difficultyLevel + '\'' + '}';
    }
}
