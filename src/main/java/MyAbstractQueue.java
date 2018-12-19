public interface MyAbstractQueue {
    default void addToFront(Person person) {
    }

    void addToBack(Person person);

    Person removeFromFront();

    default void removeFromBack() {
    }

    int size();

    @Override
    String toString();
}

