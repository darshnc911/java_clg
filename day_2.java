public class day_2 {
    // Data attributes
    String name;
    int age;
    int rollNo;
    public day_2(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    public void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.rollNo);
    }

    public static void main(String[] args) {
        day_2 student1 = new day_2("darshan", 17, 20);
        student1.display();
    }
}