public class BinaryTree {

    private Vertex root;

    public Vertex getRoot() {
        return root;
    }

    public void setRoot(Vertex root) {
        this.root = root;
    }

    boolean contains(int value) {

        Vertex tempVertex = getRoot();
        while (tempVertex != null) {
            if (value > tempVertex.getValue()) {
                tempVertex = tempVertex.getRightVertex();
            } else if (value == tempVertex.getValue()) {
                return true;
            } else {
                tempVertex = tempVertex.getLeftVertex();
            }

        }

        return false;

    }

    void add(int value) {

       if(getRoot()==null){
           setRoot(new Vertex(value));
       }
       else {
           Vertex tempVertex = getRoot();
           while (true) {
               if (tempVertex.getValue() > value) {
                   if (tempVertex.getLeftVertex() == null) {
                       tempVertex.setLeftVertex(new Vertex(value));
                       tempVertex.getLeftVertex().setParrent(tempVertex);
                       return;
                   } else {
                       tempVertex = tempVertex.getLeftVertex();
                   }

               } else if (tempVertex.getValue()<value){
                   if(tempVertex.getRightVertex()==null){
                       tempVertex.setRightVertex(new Vertex(value));
                       tempVertex.getRightVertex().setParrent(tempVertex);
                       return;
                   }
                   else {
                       tempVertex = tempVertex.getRightVertex();
                   }
               }
           }
       }


    }

    class Vertex {

        private int value;
        private Vertex parrent;
        private Vertex leftVertex;
        private Vertex rightVertex;

        public Vertex getParrent() {
            return parrent;
        }

        public void setParrent(Vertex parrent) {
            this.parrent = parrent;
        }

        public Vertex(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Vertex getLeftVertex() {
            return leftVertex;
        }

        public void setLeftVertex(Vertex leftVertex) {
            this.leftVertex = leftVertex;
        }

        public Vertex getRightVertex() {
            return rightVertex;
        }

        public void setRightVertex(Vertex rightVertex) {
            this.rightVertex = rightVertex;
        }
    }


}
