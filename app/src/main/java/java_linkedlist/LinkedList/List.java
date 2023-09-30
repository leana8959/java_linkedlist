package java_linkedlist.LinkedList;

/**
 * List
 */
public class List<T> {

    Node<T> head;

    /**
     * ajouter un élément à la tête de la liste
     */
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(head);
        this.head = newNode;
    }

    // /**
    // * effacer un nœud à l’index donné
    // */
    // public void remove(int index) {
    //
    // }

    /**
     * liste vide
     */
    public List() {
        head = null;
    }

    @Override
    public String toString() {
        String res = "";

        res += "La liste est:\n";

        Node<T> node = head;
        if (node != null) {
            res += node.getValue().toString() + " ";
            while (node.getNext() != null) {
                node = node.getNext();
                res += node.getValue().toString() + " ";
            }
        }

        res += "\n";

        return res;
    }

}
