package binaryTree;

public class binaryTreeControl {
    public boolean search(binaryTree BT, int k) {

            nodeTree temp = BT.getRoot();
            while (temp != null) {
            if (temp.getData() == k) {
                return true;
            }else if (temp.getData() < k) {
                temp = temp.getRight();
            }
            else {
                temp = temp.getLeft();
            }
        }
            return false;
    }// độ phức tạp là O(logN) vì mỗi lần tìm kiếm không đúng phạm vi tìm kiếm sẽ giảm một nữa

    public void insert(binaryTree BT, nodeTree skibidi) {
        if (BT.getRoot() == null) {
            BT.setRoot(skibidi);
            return;
        }
        nodeTree temp = BT.getRoot();
        while (true) {

            if (skibidi.getData() < temp.getData()) {
                if (temp.getLeft() == null) {
                    temp.setLeft(skibidi);
                    return;
                } else {
                    temp = temp.getLeft();
                }
            }

            else if (skibidi.getData() > temp.getData()) {
                if (temp.getRight() == null) {
                    temp.setRight(skibidi);
                    return;
                } else {
                    temp = temp.getRight();
                }
            }

            else {
                return;
            }
        }
    }// độ phức tạp là O(logN) vì bản chất của binary tree là node bên trái sẽ nhỏ hơn root và node bên phải lớn hơn root
    //cho nên có thể suy ra mỗi lần ta so sánh giữa node muốn chèn vào với root hoặc sub tree thì ta chỉ cần đi sang một nhánh (trái hoặc phải)
    //tức là bỏ qua nửa còn lai (vì nó lớn hơn hoặc bé hơn node cần chèn) nhờ thế nên thuật toán tìm tkieems này có độ phức tạp O(logN)
}