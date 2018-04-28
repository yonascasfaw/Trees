import java.util.ArrayList;
import java.util.List;

public class WordNode {
    String word;
    List<WordNode> children;

    public WordNode(String word) {
        this.word = word;
        children = new ArrayList<WordNode>();
    }

    public boolean isLeaf() {
        if (children.isEmpty()){
            return true;
        } else  {
            return false;
        }
    }

    public void insert(WordNode wordNode) {

        this.children.add(wordNode);

    }

    @Override
    public String toString(){
        return word;

    }

}
