package linkedList;
import node.node;
public class linkedListController {

    public void setHead(linkedlist ll, node Nhead) {
        ll.setHead(Nhead);
    }//độ phức ta là 0(1) vì chỉ chỉ thực hiện một phép gán không phụ thuộc vào kích thước danh sách
    public void setTail(linkedlist ll, node Ntail) {
        ll.setTail(Ntail);
    }//độ phức tap là O(1) vì chỉ chỉ thực hiện một phép gán không phụ thuộc vào kích thước danh sách

    public node getHead(linkedlist ll){
        return ll.getHead();

    }// độ phức tạp O(1) vì phương thức này chỉ cần truy cập vào node đầu(head) để trả về node đó
    public node getTail(linkedlist ll){

        return   ll.getTail();
    }//độ phức tạp O(1) vì phương thức này chỉ cần truy cập vào node cuối(tail) để trả về node đó


    public void search(linkedlist ll, int k){
        node cur = ll.getHead();
           /* for (int i = 0 ; i < ll.getsize(); i ++){
                if(cur!=null&&cur.getData()!=k){
                cur = cur.getNext();
                }
            }*/
        while(cur!=null){
            if(cur.getData()==k){
                System.out.println(cur.getData());
            }
            cur = cur.getNext();
        }

    }// độ phức tạp là O(n) vì trường hợp tệ nhất phải duyệt qua toàn bộ N node
    public node getNode(linkedlist ll, int k){
        node current = ll.getHead();
        int i = 0;
        while (current != null && i < k){
            current = current.getNext();
            i++;
        }
        return current;
    }
    // độ phức tạp là O(n) vì trường hợp tệ nhất phần thử cần lấy sẽ ở sát phần head (tail) của linked list
    // làm ta pahir duyệt từ đầu đến cuối mảng cho đến khi đạt được đên vị trí của node cần lấy giá trị
    public void insertHead(linkedlist ll, node N) {
        if (ll.getHead() == null) {
            ll.setHead(N);
            ll.setTail(N);
            return;
        }
        N.setNext(ll.getHead());
        N.setPrev(null);
        ll.getHead().setPrev(N);
        ll.setHead(N);
    }
    // tốn O(1) operation vì chỉ cần thay prev của head từ null thành N và thay next của N thành Head sau
    // đó dùng phương thức set head để biến N thành Head của linked list là xong
    public void insertTail(linkedlist ll, node N) {
        if (ll.getTail() == null) {
            ll.setHead(N);
            ll.setTail(N);
            return;
        }
        N.setPrev(ll.getTail());
        N.setNext(null);
        ll.getTail().setNext(N);
        ll.setTail(N);
    }
// tương tự ở trên phương thức này có độ phức tạp O(1) vì ta chỉ cần thao tác xử lý lên một vài phần tử chứ không phải là toàn bộ danh sách của linked list

    public void Print(linkedlist ll){
        node cur = ll.getHead();
        while(cur!=null){
            System.out.println(cur.getData());
            cur = cur.getNext();
        }
    } // độ phức tạp là o(n) vì phải duyệt qua N node để in ra
    public void deleteHead (linkedlist ll){
       if (ll.getHead()==null){ System.out.println(" linked list rỗng"); return;}

        if(ll.getHead().getNext()!=null){
            node Nhead = ll.getHead().getNext();
            Nhead.setPrev(null);
            ll.setHead(Nhead);
        }
        else { //này là xét trường hợp linked list chỉ có một node duy nhất
            // (xét điều kiện của hàm if ở trên thấy next node ở đây == null)
            ll.setHead(null);
            ll.setTail(null);
        }

    }// phương thức này có độ phức tạp o(1) vì trường hợp tệ nhất ta chỉ phải xử lý một vài node như là head, tail không phụ thuôc vào kích thước linkedlist
    public void deleteTail (linkedlist ll){
        if (ll.getHead()==null){ System.out.println("linked list rỗng"); return;}
        if (ll.getHead() == ll.getTail()) {
            ll.setHead(null);
            ll.setTail(null);
            return;
        }
        node newTail = ll.getTail().getPrev();
        newTail.setNext(null);
        ll.setTail(newTail);
    }// phương thức này có độ phức tạp o(1) vì trường hợp tệ nhất ta chỉ phải thao tác têb một vài node như là head, tail không phụ thuôc vào kích thước linkedlist
}
