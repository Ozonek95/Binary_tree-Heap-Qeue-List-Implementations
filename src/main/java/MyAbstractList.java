public interface MyAbstractList {

    void add(Person person);

//    /**
//     * Optional
//     */
//    void remove(Person person);

    void remove(int index);

    int size();

    Person get(int index);

    @Override
    String toString();
}
