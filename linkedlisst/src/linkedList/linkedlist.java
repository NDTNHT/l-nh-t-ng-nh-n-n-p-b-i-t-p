package linkedList;
import node.*;
public class linkedlist {
         private node head;
        private node tail;

        public linkedlist() {
            this.head = null;
            this.tail = null;

        }

        public linkedlist(node head, node tail) {
            this.head = head;
            this.tail = tail;

        }
        public node getHead() {
            return this.head;
        }
        public void setHead(node head) {
            this.head = head;
        }
        public node getTail() {
            return this.tail;
        }
        public void setTail(node tail) {
            this.tail = tail;
        }


     public int getsize(){
        int size = 0;
        node current = this.head;
            while (current != null){
                size++;
               current = current.getNext();
            }

        return size;
     }
}
