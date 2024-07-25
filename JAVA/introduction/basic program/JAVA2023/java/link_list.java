class link_list{
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add ---> first, last
      public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
        head = newNode;
        return;
        }
        newNode.next = head;
        head = newNode;
      }
    public static void main(String[] arge){
          link_list L =new link_list();
    }
}