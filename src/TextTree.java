/**
 * Authors : Yonas Asfaw & Daniel Cervantes
 *
 * Santa Monica College
 * CS 20B–Data Structures with Java
 * Programming Project #3
 */

public class TextTree implements Iterable{
    public WordNode root;
    private int size = 1;

    public TextTree(){
        this.root = new WordNode("");
    }

    public boolean add(String sentence) {
        WordNode currentNode = root;
        boolean addedNode = false;

        String[] words = sentence.split(" ");

        for(int i=0; i<words.length; i++) {
            boolean found = false;

            for(int j=0; j<currentNode.children.size();j++) {
                if(words[i].equals(currentNode.children.get(j).word)){
                    currentNode = currentNode.children.get(j);
                    found = true;
                    break;
                }
            }

            if (found == false) {

                WordNode newnode = new WordNode(words[i]);

                this.size++;
                currentNode.insert(newnode);
                currentNode = newnode;
                addedNode = true;

            }
        }

        return addedNode;
    }

    //checks of sentence is in tree
    public boolean contains(String sentence) {
        boolean contains = true;
        String[] word = sentence.split(" ");

        WordNode currentNode = root;

        for(int i=0; i< word.length;i++){
            boolean foundWord = false;
            for(int j=0; j<currentNode.children.size();j++) {
                if (word[i].equals(currentNode.children.get(j).word)) {
                    foundWord = true;
                    currentNode = currentNode.children.get(j);
                    break;
                }
            }
            if (!foundWord){
                return false;
            }

        }
        return contains;
    }

    //calculates height of tree
    public int height() {
        return getMaxHeight(this.root);
    }

    //helper method for height()
    private int getMaxHeight(WordNode node){
        if (node.isLeaf()){
            return 0;
        }

        int maxHeight = 0;

        for (int i =0 ; i < node.children.size(); i++){
            int h = 1 + getMaxHeight(node.children.get(i));
            if (h > maxHeight) {
                maxHeight = h;
            }
        }
        return maxHeight;
    }

    public int size() {
        return this.size;
    }

    public LeafIterator iterator() {

        return new LeafIterator(root);
    }
}
