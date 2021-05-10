package br.com.gusto.fatec.arvore;

import br.com.gusto.fatec.arvore.model.Node;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(Node path, int value) {
        if (path == null) {
            this.root = new Node(value, null, null);
        } else if (value <= path.getElement()) {
            if (path.getLeft() != null) {
                insert(path.getLeft(), value);
            } else {
                path.setLeft(new Node(value, null, null));
            }
        } else if (path.getRight() != null) {
            insert(path.getRight(), value);
        } else {
            path.setRight(new Node(value, null, null));
        }
    }

    public String printTree(Node path) {
        String msg;
        msg = "(";
        // Percurso pré-ordem
        if (path != null) {
            msg += " " + path.getElement() + " ";
            msg += printTree(path.getLeft());
            msg += printTree(path.getRight());
        }

        // Percurso in-ordem
        if (path != null) {
            msg += printTree(path.getLeft());
            msg += " " + path.getElement() + " ";
            msg += printTree(path.getRight());
        }

        // Percurso pós-ordem
        if (path != null) {
            msg += printTree(path.getLeft());
            msg += printTree(path.getRight());
            msg += " " + path.getElement() + " ";
        }

        msg += ") ";
        return msg;
    }
}
