package node;
public class node {
   private int data;
   private node next;
   private node prev;
    public node (int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public int getData(){
        return this.data;
    }
    public node getNext(){
        return this.next;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setNext(node next){
        this.next = next;
    }
    public void setPrev(node prev){
        this.prev = prev;
    }
    public node getPrev(){
        return this.prev;
    }

}
