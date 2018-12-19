public class Heap {

    HeapElement[] values = new HeapElement[100];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void add(int value) {

        HeapElement heapElement = new HeapElement(value);
        if (values[0] == null) {
            values[0] = heapElement;
            setSize(getSize() + 1);
            return;
        } else {


            values[getSize()] = heapElement;
            setSize(getSize() + 1);

        }
        int current = getSize()-1;

        int parrent = (current - 1) / 2;

        do {
            if (values[parrent].getValue() > values[current].getValue()) {
                HeapElement tempHeapElement = values[parrent];
                values[parrent] = values[current];
                values[current] = tempHeapElement;

                current = parrent;
                parrent = (parrent - 1) / 2;
            } else break;
        } while (current != 0);


    }

    class HeapElement {
        int value;

        public HeapElement(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
