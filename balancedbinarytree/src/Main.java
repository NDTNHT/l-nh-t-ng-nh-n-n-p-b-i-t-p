import  binaryTree.*;
public class Main {
    public static void main(String[] args) {
        binaryTree BT = new binaryTree(null);
        binaryTreeControl control = new binaryTreeControl();


        control.insert(BT, new nodeTree(50));
        control.insert(BT, new nodeTree(30));
        control.insert(BT, new nodeTree(70));
        control.insert(BT, new nodeTree(20));
        control.insert(BT, new nodeTree(40));
        control.insert(BT, new nodeTree(60));
        control.insert(BT, new nodeTree(80));
        System.out.println("Tìm 40: " + control.search(BT, 40)); // true
        System.out.println("Tìm 90: " + control.search(BT, 90)); // false
        System.out.print("Duyệt cây (Inorder): ");
        inorderPrint(BT.getRoot());
    }

    public static void inorderPrint(nodeTree node) {
        if (node != null) {
            inorderPrint(node.getLeft());
            System.out.print(node.getData() + " ");
            inorderPrint(node.getRight());
        }
    }
    }
