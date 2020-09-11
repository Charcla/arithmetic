package leetcodeEasy;

import java.util.List;

/**
 * Created by skyou on 2019/6/6.
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
