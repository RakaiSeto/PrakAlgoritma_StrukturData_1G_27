package P11;

public class ArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("\nInOrder Traversal:");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
