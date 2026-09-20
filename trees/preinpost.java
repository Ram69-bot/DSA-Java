package trees;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution {
    public List<List<Integer>> Traversal(Node root){
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();

        if(root == null){
            return new ArrayList<>();
        }

        Stack<pair<

    }
}

public class preinpost {

}
