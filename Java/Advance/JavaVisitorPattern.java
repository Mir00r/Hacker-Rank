/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_code;

import java.util.*;

/**
 *
 * @author Created by Mir00r
 */
enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {

    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {

    int result = 0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {

    int result = 1;
    int maxn = 1000000007;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            result = (int) ((long) result * node.getValue() % maxn);
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            result = (int) ((long) result * leaf.getValue() % maxn);
        }
    }
}

class FancyVisitor extends TreeVis {

    int even = 0;
    int green = 0;

    public int getResult() {
        //implement this
        return Math.abs(even - green);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            even += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            green += leaf.getValue();
        }
    }
}

public class JavaVisitorPattern {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arrayNode = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arrayNode[i] = scan.nextInt();
        }

        Color[] arrayColor = new Color[n + 1];
        for (int i = 1; i <= n; i++) {
            if (scan.nextInt() == 0) {
                arrayColor[i] = Color.RED;
            } else {
                arrayColor[i] = Color.GREEN;
            }
        }

        List<Integer>[] adjacentsList = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            adjacentsList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n - 1; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            adjacentsList[x].add(y);
            adjacentsList[y].add(x);
        }

        scan.close();

        List<Integer>[] childrenList = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            childrenList[i] = new ArrayList<Integer>();
        }

        int[] depths = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        Queue<Integer> queue = new LinkedList<Integer>();
        depths[1] = 0;
        queue.offer(1);
        while (!queue.isEmpty()) {
            int head = queue.poll();

            if (visited[head]) {
                continue;
            }
            visited[head] = true;

            for (int adjacent : adjacentsList[head]) {
                if (!visited[adjacent]) {
                    childrenList[head].add(adjacent);
                    depths[adjacent] = depths[head] + 1;
                    queue.offer(adjacent);
                }
            }
        }

        Tree[] nodes = new Tree[n + 1];
        for (int i = 1; i <= n; i++) {
            if (childrenList[i].isEmpty()) {
                nodes[i] = new TreeLeaf(arrayNode[i], arrayColor[i], depths[i]);
            } else {
                nodes[i] = new TreeNode(arrayNode[i], arrayColor[i], depths[i]);
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int child : childrenList[i]) {
                ((TreeNode) nodes[i]).addChild(nodes[child]);
            }
        }
        return nodes[1];
    }
}
