public class Main {
    public static void main(String[] args) {
        // Exercise 1
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));

        // Exercice 2
        Person person = new Person("John", "Wick", "john@wick.com", 55);
        String infoPerson = person.toString();
        System.out.println(infoPerson);

        // Exercise 3
        Car car = new Car("Tesla",100,"Rooster");
        String detailsCar = car.getDetails("Rooster");
        System.out.println(detailsCar);
    }
}