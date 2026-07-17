public class Main {
    public static void main(String[] args) {
        samim student = new samim("Shoaib",23);
        
        // Display initial values
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        
        // Update values using setters
        student.setName("Jane Doe");
        student.setAge(22);
        
        // Display updated values
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());

        Shimul person = new Shimul("Shimul",22);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Shimul Sarker");
        person.setAge(22);
        
        // Display updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
