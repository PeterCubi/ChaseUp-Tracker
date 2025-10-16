public class Stat {


    private String name;
    private String description;

    private double grade;
    private boolean objective;

    public Stat(String name, String description, double grade, boolean objective) {
        this.name = name;
        this.description = description;
        this.grade = grade;
        this.objective = objective;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isObjective() {
        return objective;
    }

    public void setObjective(boolean objective) {
        this.objective = objective;
    }
}
