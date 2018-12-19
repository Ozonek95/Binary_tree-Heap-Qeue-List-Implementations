public class MyList implements MyAbstractList {

    private MyListElement lastMyListElement;

    public MyListElement getLastMyListElement() {
        return lastMyListElement;
    }

    @Override
    public void add(Person person) {


        if (lastMyListElement != null) {

            MyListElement temp = lastMyListElement;
            int compare = lastMyListElement.getPerson().getSurname().compareTo(person.getSurname());


            if (compare < 0) {
                MyListElement myListElement = new MyListElement();
                myListElement.setPerson(person);
                lastMyListElement.setPreviousMyListElement(myListElement);
                myListElement.setNextMyListElement(lastMyListElement);
                lastMyListElement = myListElement;

            } else {

                while (temp.getNextMyListElement() != null) {
                    MyListElement element = temp;
                    temp = temp.getNextMyListElement();
                    int compare2 = temp.getPerson().getSurname().compareTo(person.getSurname());
                    if (compare2 < 0) {
                        MyListElement myListElement = new MyListElement();
                        myListElement.setPerson(person);

                        element.setNextMyListElement(myListElement);
                        myListElement.setPreviousMyListElement(element);

                        myListElement.setNextMyListElement(temp);
                        temp.setPreviousMyListElement(myListElement);
                        return;
                    }

                }
                    MyListElement myListElement = new MyListElement();
                    myListElement.setPerson(person);
                    temp.setNextMyListElement(myListElement);
                    myListElement.setPreviousMyListElement(temp);


            }

        } else {
            MyListElement myListElement = new MyListElement();
            myListElement.setPerson(person);
            lastMyListElement = myListElement;
        }

    }

    public void showAll(MyListElement lastMyListElement){
        MyListElement temp = lastMyListElement;
        while (temp!=null){
            System.out.println("Obecna osoba :"+temp);
            System.out.println();
            System.out.println("Jej poprzednia osoba "+temp.getPreviousMyListElement());
            System.out.println();
            System.out.println("Następna osoba "+temp.getNextMyListElement());
            System.out.println();
            temp=temp.getNextMyListElement();
        }
    }
    @Override
    public void remove(int index) {
        int indexToRemove = this.size() - index;

        MyListElement myListElementTemp = lastMyListElement;

        if(indexToRemove==0){
            myListElementTemp.getNextMyListElement().setPreviousMyListElement(null);
            lastMyListElement = myListElementTemp.getNextMyListElement();
        }
        else {


            for (int i = 0; i < indexToRemove; i++) {
                myListElementTemp = myListElementTemp.getNextMyListElement();
            }

            if(indexToRemove==size()-1){
                myListElementTemp.getPreviousMyListElement().setNextMyListElement(null);

            }
            else {

                myListElementTemp.getPreviousMyListElement().setNextMyListElement(myListElementTemp.getNextMyListElement());
                myListElementTemp.getNextMyListElement().setPreviousMyListElement(myListElementTemp.getPreviousMyListElement());

            }
        }

    }

    @Override
    public int size() {
        int number = 1;
        MyListElement myListElement = lastMyListElement;
        while (myListElement.getNextMyListElement() != null) {
            number++;
            myListElement = myListElement.getNextMyListElement();
        }

        return number;
    }

    @Override
    public Person get(int index) {
        int number = this.size() - index;
        MyListElement myListElement = lastMyListElement;
        for (int i = 0; i < number; i++) {
            myListElement = myListElement.getNextMyListElement();

        }
        return myListElement.getPerson();

    }

    @Override
    public String toString() {

        MyListElement myListElement = lastMyListElement;
        StringBuilder sb = new StringBuilder(myListElement.toString() + " ");

        while (myListElement != null) {
            myListElement = myListElement.getNextMyListElement();
            if (myListElement != null) {
                sb.append(myListElement.toString() + " ");
            }
        }
        return sb.toString();
    }

    class MyListElement {

        Person person;
        private MyListElement nextMyListElement;
        private MyListElement previousMyListElement;

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        public MyListElement getNextMyListElement() {
            return nextMyListElement;
        }

        public void setNextMyListElement(MyListElement nextMyListElement) {
            this.nextMyListElement = nextMyListElement;
        }

        public MyListElement getPreviousMyListElement() {
            return previousMyListElement;
        }

        public void setPreviousMyListElement(MyListElement previousMyListElement) {
            this.previousMyListElement = previousMyListElement;
        }

        @Override
        public String toString() {
            return
                    "person=" + person
                    ;
        }
    }
}


