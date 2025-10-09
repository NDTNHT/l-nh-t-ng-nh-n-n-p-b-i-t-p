package binaryTree;
public class nodeTree
{
    private int data;
   private nodeTree left;
   private nodeTree right;
    public nodeTree(int data)
    {   this.left= null;
        this.right= null;
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public nodeTree getLeft() {
        return left;
    }
    public void setLeft(nodeTree left) {
        this.left = left;
    }
    public nodeTree getRight() {
        return right;
    }
    public void setRight(nodeTree right) {

        this.right = right;
    }
}
