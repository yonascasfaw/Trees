public class TextTree {
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
                // Create the new Node
                // Add new node as child to the node

                WordNode newnode = new WordNode(words[i]);

                this.size++;
                currentNode.insert(newnode);
                currentNode = newnode;
                addedNode = true;

            }
        }

        return addedNode;
    }

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

    public int height() {
        int treeHeight = 0;
        // code for calculating tree height

        return treeHeight;
    }

    public int size() {
        return this.size;
    }

//    public iterator<String> iterator() {
//
//    }
}
