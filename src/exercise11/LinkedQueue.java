package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
       return frontNode == null;
    }

    public void offer(String data) {
      Node newNode = new Node(data);
       if(isEmpty()){
         frontNode = newNode;
         backNode = frontNode; //reference to object
       }
       else{
         backNode.setNextNode(newNode);
         backNode = newNode;
       }
    }

    public String poll() {
        if(isEmpty()){
          return null;
        }
        else{
          String data = frontNode.getData();
          frontNode = frontNode.getNextNode();
          return data;
        }
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(frontNode);
    }
}
