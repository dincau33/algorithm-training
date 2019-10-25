package graph.medium;

import java.util.ArrayList;

/*
 * You're given three inputs, all of which are instances of a class that have an "ancestor" property pointing to their youngest ancestor.
 * The first input is the top ancestor in an ancestral tree (i.e., the only instance that has no ancestor), and the other two inputs are descendants in the ancestral tree.
 * Write a function that returns the youngest common ancestor to the two descendants.
 */
public class YoungestCommonAncestor {
    // O(d) time | O(1) space - d is the depth of the tree
    public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
        if (topAncestor == null || descendantOne == null || descendantTwo == null) throw new NullPointerException();

        ArrayList<AncestralTree> pathToRootOne = getPathToRoot(descendantOne, new ArrayList<>());
        ArrayList<AncestralTree> pathToRootTwo = getPathToRoot(descendantTwo, new ArrayList<>());

        int depthOne = pathToRootOne.size();
        int depthTwo = pathToRootTwo.size();
        while (depthOne >= 0 || depthTwo >= 0) {
            if (pathToRootOne.get(pathToRootOne.size() - depthOne) == pathToRootTwo.get(pathToRootTwo.size() - depthTwo))
                break;
            if (depthTwo > depthOne) depthTwo--;
            else depthOne--;
        }
        return pathToRootOne.get(pathToRootOne.size() - depthOne);
    }

    public static ArrayList<AncestralTree> getPathToRoot(AncestralTree descendantOne, ArrayList<AncestralTree> pathToRoot) {
        pathToRoot.add(descendantOne);
        if (descendantOne.ancestor != null) {
            pathToRoot = getPathToRoot(descendantOne.ancestor, pathToRoot);
        }
        return pathToRoot;
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }
}
