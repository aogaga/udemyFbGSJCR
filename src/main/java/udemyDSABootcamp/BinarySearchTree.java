package udemyDSABootcamp;

public class BinarySearchTree {

    class Node{
        int key;
        String value;
        Node left, right;

        public Node(int key, String value){
            this.key = key;
            this.value = value;
        }

        public Node min(){
            if(left == null){
                return this;
            }else {
                return left.min();
            }
        }
    }

    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public String find(int key){
        Node node = find(root, key);
        return node == null ? null : node.value;
    }

    public Node find(Node node, int key){

        if(node == null || node.key == key){
            return node;
        }else if(key < node.key){
            return find(node.left, key);
        }else if( key > node.key){
            return find(node.right, key);
        }
        return null;
    }
}
