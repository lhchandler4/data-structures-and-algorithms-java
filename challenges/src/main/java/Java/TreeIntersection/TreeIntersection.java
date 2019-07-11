package Java.TreeIntersection;

import Java.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {
    public static ArrayList<Integer> tree_intersection(BinaryTree<Integer> treeOne, BinaryTree<Integer> treeTwo){
        if(treeOne.getRootNode() == null || treeTwo.getRootNode() == null){ throw new IllegalArgumentException("Empty Tree"); }
        HashSet<Integer> hashTreeOne = new HashSet<>();
        HashSet<Integer> hashTreeTwo = new HashSet<>();

        hashTreeOne.addAll(treeOne.preOrderTraverse());
        hashTreeTwo.addAll(treeTwo.preOrderTraverse());

        hashTreeOne.retainAll(hashTreeTwo);
        return new ArrayList<>(hashTreeOne);
    }

}
