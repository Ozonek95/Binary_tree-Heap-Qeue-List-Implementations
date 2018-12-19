public class MyQueueMain {
    public static void main(String[] args) {
        Person person1 = new Person("Ada", "Nowak");

        Person person2 = new Person("Kacper", "Staszek");


        Person person3 = new Person("Arek", "Antkowski");

        Person person4 = new Person("Ala","Burbuś");

        Person person5 = new Person("Kamil","Mazur");
        MyQueue queue = new MyQueue();
        queue.addToBack(person1);
        queue.addToBack(person2);
        queue.addToBack(person3);
        queue.addToBack(person4);
        queue.addToBack(person5);
        System.out.println(queue.size());
        System.out.println(queue.removeFromFront());
    }
}
