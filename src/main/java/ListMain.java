public class ListMain {
    public static void main(String[] args) {
        Person person1 = new Person("Ada", "Nowak");

        Person person2 = new Person("Kacper", "Staszek");


        Person person3 = new Person("Arek", "Antkowski");

        Person person4 = new Person("Ala","Burbuś");

        Person person5 = new Person("Kamil","Mazur");



        MyList list = new MyList();

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        System.out.println(list.size());

        list.remove(1);
        list.showAll(list.getLastMyListElement());


        System.out.println(list.size());
        System.out.println(list.toString());



    }

}

