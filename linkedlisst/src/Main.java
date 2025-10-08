import linkedList.*;
import node.node;

public class Main {
    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        linkedListController controller = new linkedListController();


        for (int i = 1; i <= 15; i++) {
            controller.insertTail(ll, new node(i * 10)); // thêm các giá trị 10, 20, 30, ..., 150
        }

        System.out.println("Danh sách hiện tại:");
        controller.Print(ll);

        // Thêm vào đầu và cuối
        System.out.println("\n=== THÊM PHẦN TỬ 5 Ở ĐẦU VÀ 200 Ở CUỐI ===");
        controller.insertHead(ll, new node(5));
        controller.insertTail(ll, new node(200));
        controller.Print(ll);

        // Tìm kiếm một phần tử
        System.out.println("\n=== TÌM KIẾM PHẦN TỬ ===");
        controller.search(ll, 100); // có tồn tại
        controller.search(ll, 999); // không tồn tại

        // Lấy node theo vị trí
        System.out.println("\n=== LẤY NODE THEO VỊ TRÍ ===");
        node nodeAt5 = controller.getNode(ll, 5);
        if (nodeAt5 != null)
            System.out.println("Node thứ 5 có giá trị: " + nodeAt5.getData());
        else
            System.out.println("Không tìm thấy node thứ 5");

        // Xóa đầu
        System.out.println("\n=== XOÁ PHẦN TỬ ĐẦU ===");
        controller.deleteHead(ll);
        controller.Print(ll);

        // Xóa cuối
        System.out.println("\n=== XOÁ PHẦN TỬ CUỐI ===");
        controller.deleteTail(ll);
        controller.Print(ll);

    }
}
