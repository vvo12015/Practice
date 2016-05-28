package workshop5;

public class BSTSearch {

    public boolean exist(TreeNode root, int target) {

        boolean result = false;

        if (root != null){
            if (root.value > target){
                result = exist(root.left, target);
            }else if (root.value < target){
                result = exist(root.right, target);
            }else return true;
        }

        return result;
    }
}

