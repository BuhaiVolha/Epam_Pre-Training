package by.epam_pre_training.task7.logic;

import by.epam_pre_training.task7.exceptions.EmptyTreeException;
import java.util.Comparator;

public class BinaryTree<E extends Comparable<? super E>> implements Tree<E> {

    private Node root;
    private Comparator<? super E> comparator;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Comparator<? super E> comparator) {
        root = null;
        this.comparator = comparator;
    }


    private class Node implements Comparable<E> {
        private Node leftChild;
        private Node rightChild;
        private E data;

        private Node(E data) {
            leftChild = null;
            rightChild = null;
            this.data = data;
        }

        @Override
        public int compareTo(E data) {
            return this.data.compareTo(data);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if ((o == null)
                    || (o.getClass() != this.getClass())) {
                return false;
            }

            Node node = (Node) o;

            if (leftChild != null ? !leftChild.equals(node.leftChild) : node.leftChild != null) return false;
            if (rightChild != null ? !rightChild.equals(node.rightChild) : node.rightChild != null) return false;
            return data != null ? data.equals(node.data) : node.data == null;
        }

        @Override
        public int hashCode() {
            int result = leftChild != null ? leftChild.hashCode() : 0;
            result = 31 * result + (rightChild != null ? rightChild.hashCode() : 0);
            result = 31 * result + (data != null ? data.hashCode() : 0);
            return result;
        }
    }


    public boolean contains(E data) throws EmptyTreeException {
        if (isEmpty()) {
            throw new EmptyTreeException("The tree is empty!");
        }
       return contains(root, data) != null;
    }


    private Node contains(Node current, E data) {

        if (current == null) {
            return null;
        }

        if (comparator.compare(data, current.data) == 0) {
            return current;
        }

        if (comparator.compare(data, current.data) < 0) {
            return contains(current.leftChild, data);
        }

        return (data.compareTo(current.data) < 0) ? contains(current.leftChild, data)
                : contains(current.rightChild, data);
    }


    public void add(E data) {
        root = add(root, data);
    }


    private Node add(Node current, E data) {

        if (current == null) {
            return new Node(data);
        }

        if (getComparator().compare(data, current.data) < 0) {
            current.leftChild = add(current.leftChild, data);

        } else if (getComparator().compare(data, current.data) > 0) {
            current.rightChild = add(current.rightChild, data);
        }
        return current;
    }


    public void remove(E data) throws EmptyTreeException {
        if (isEmpty()) {
            throw new EmptyTreeException("The tree is empty!");
        }
        remove(root, data);
    }

    private Node remove(Node current, E data) {
        if (current == null) {
            return null;
        }

        if (getComparator().compare(data, current.data) == 0) {

            // if a node is a leaf, no children
            
            if ((current.leftChild == null)
                    && (current.rightChild == null)) {
                return null;
            }

            // if a node doesn't have a left child
            
            if (current.leftChild == null) {
                return current.rightChild;
            }

            // if a node doesn't have a right child
            
            if (current.rightChild == null) {
                return current.leftChild;
            }

            // if a node has both children
            
            current.data = findSuccessor(current.rightChild);
            current.rightChild = remove(current.rightChild, current.data);
            return current;
        }
        if (getComparator().compare(data, current.data) < 0) {
            current.leftChild = remove(current.leftChild, data);
            return current;
        }

        current.rightChild = remove(current.rightChild, data);
        return current;
    }


    private E findSuccessor(Node current) {
        if (current.leftChild == null) {
            return current.data;
        }
        return findSuccessor(current.leftChild);
    }


    @Override
    public int size() {
        return(size(root));
    }


    private int size(Node node) {
        if (node == null) {
            return(0);
        }
        return(size(node.leftChild)
                + 1
                + size(node.rightChild));
    }


    public void clear() {
        root = null;
    }


    public boolean isEmpty() {
        return root == null;
    }
    

    public String traverseInOrder() {
        return new String(traverseInOrder(root));
    }


    public String traversePreOrder() {
        return new String(traversePreOrder(root));
    }


    public String traversePostOrder() {
        return new String(traversePostOrder(root));
    }


    private StringBuilder traverseInOrder(Node node) {
        StringBuilder s = new StringBuilder();

        if (node != null) {
            s.append(traverseInOrder(node.leftChild));
            s.append(node.data).append("\n");
            s.append(traverseInOrder(node.rightChild));
        }
        return s;
    }


    private StringBuilder traversePreOrder(Node node) {
        StringBuilder s = new StringBuilder();

        if (node != null) {
            s.append(node.data).append("\n");
            s.append(traversePreOrder(node.leftChild));
            s.append(traversePreOrder(node.rightChild));
        }
        return s;
    }


    private StringBuilder traversePostOrder(Node node) {
        StringBuilder s = new StringBuilder();

        if (node != null) {
            s.append(traversePostOrder(node.leftChild));
            s.append(traversePostOrder(node.rightChild));
            s.append(node.data).append("\n");
        }
        return s;
    }


    private Comparator<? super E> getComparator() {
        if (comparator != null) {
            return comparator;
        }
        else {
            return new Comparator<E>() {
                public int compare(E el, E e12) {
                    return el.compareTo(e12);
                }
            };
        }
    }
}
