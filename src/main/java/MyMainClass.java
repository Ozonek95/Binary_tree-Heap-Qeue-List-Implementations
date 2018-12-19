import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MyMainClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000000; i++) {
            int number = random.nextInt(100000);
            if (!list.contains(number)) {
                list.add(number);
            }
        }

        long time1 = System.nanoTime();


       // linearSearch(list,1241021);

        long time2 = System.nanoTime();

        System.out.println(time2-time1);
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("start adding");

        for (int i=0;i<list.size();i++){
            binaryTree.add(list.get(i));
        }

        System.out.println("start finding");

        time1=System.nanoTime();


        treeSearch(binaryTree,12415126);

        time2=System.nanoTime();

        System.out.println(time2-time1);



    }

    public static boolean linearSearch(List<Integer> list, int target) {
        for (int i : list) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }


    public static boolean treeSearch(BinaryTree tree, int target) {


       return tree.contains(target);
    }
}


