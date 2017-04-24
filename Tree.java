package com.company.AlgotithmsBootcamp;

import org.junit.Assert;
import org.junit.Test;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Created by borisgurtovyy on 4/23/17.
 */
public class Tree {

    int maxDepth(TreeNode root){
        if( root == null){
            return 0;
        }
        return max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    int maxRightDepth(TreeNode root){
        if( root == null){
            return 0;
        }
        return maxDepth(root.right) + 1;
    }


    boolean isSameTree(TreeNode root1, TreeNode root2){

        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 == null || root2 == null) {
            return false;
        }

        if(root1.val == root2.val){
            return isSameTree(root1.left, root2.left)
                    && isSameTree(root1.right, root2.right);
        }
        return false;
    }

    @Test
    public void test001(){
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(10);
        treeNode.right = new TreeNode(10);
        treeNode.left.right = new TreeNode(10);
        int expectedAnswer = 3;
        Assert.assertTrue(maxDepth(treeNode)==expectedAnswer);
    }

    @Test
    public void test002(){
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(10);
        treeNode.right = new TreeNode(10);
        treeNode.left.right = new TreeNode(10);


        TreeNode treeNode2 = new TreeNode(10);
        treeNode2.left = new TreeNode(10);
        treeNode2.right = new TreeNode(10);
        treeNode2.left.right = new TreeNode(11);

        Assert.assertTrue(isSameTree(treeNode, treeNode2));
    }
}
