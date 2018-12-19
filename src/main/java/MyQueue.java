public class MyQueue implements MyAbstractQueue {

    private MyQueueBox head;
    private MyQueueBox tail;

    public MyQueueBox getHead() {
        return head;
    }

    public void setHead(MyQueueBox head) {
        this.head = head;
    }

    public MyQueueBox getTail() {
        return tail;
    }

    public void setTail(MyQueueBox tail) {
        this.tail = tail;
    }

    @Override
    public void addToBack(Person person) {
        if(getHead()==null){
            MyQueueBox myQueueBox = new MyQueueBox(person);
            setHead(myQueueBox);
            setTail(myQueueBox);
        }
        else {
            MyQueueBox myQueueBox = new MyQueueBox(person);
            getTail().setPrevious(myQueueBox);
            myQueueBox.setNext(getTail());
            setTail(myQueueBox);
        }
    }

    @Override
    public Person removeFromFront() {
        if(getHead()!=null){
            Person person = getHead().getPerson();
            setHead(getHead().getPrevious());
            return person;
        }


        return null;

    }

    @Override
    public int size() {
        int counter = 0;
        MyQueueBox myQueueBox = getHead();
        while (myQueueBox!=null){
            myQueueBox=myQueueBox.getPrevious();
            counter++;
        }
        return counter;

    }

    class MyQueueBox
    {
        MyQueueBox next;

        MyQueueBox previous;

        Person person;

        public MyQueueBox(Person person) {
            this.person = person;
        }

        public MyQueueBox getNext() {
            return next;
        }

        public void setNext(MyQueueBox next) {
            this.next = next;
        }

        public MyQueueBox getPrevious() {
            return previous;
        }

        public void setPrevious(MyQueueBox previous) {
            this.previous = previous;
        }

        public Person getPerson() {
            return person;
        }
    }
}
