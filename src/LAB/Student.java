package LAB;

public class Student {
    private String name;
    private float percentage;

    public Student() {
        this.name = "null";
        this.percentage = 0.0f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                " Name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

}
