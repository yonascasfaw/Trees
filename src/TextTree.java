public class TextTree {
    private WordNode root;

    public TextTree(){

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

                currentNode.insert(newnode);
                currentNode = newnode;
                addedNode = true;

            }
        }

        return addedNode;
    }

    public boolean contains(String sentence) {
        boolean exists = false;
        //code for checking if value exists

        return exists;
    }

    public int height() {
        int treeHeight = 0;
        // code for calculating tree height

        return treeHeight;
    }

    public int size() {
        int numberOfNodes = 0;

        //code for calculating the number of nodes;

        return numberOfNodes;
    }

//    public iterator<String> iterator() {
//
//    }
}
