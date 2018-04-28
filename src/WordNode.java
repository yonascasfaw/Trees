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

//    public void insert(String sentence) {
//        String[] words = sentence.split(" ");
//
//        for(int i=0; i < words.length ; i++) {
//
//            if(isLeaf()){
//                children.add(new WordNode(words[i]));
//            }else{
//
//                if(children.contains(new WordNode(words[i]))) {
//                    while (children.contains(new WordNode(words[i]))) {
////                        for (int j = 0; j < children.size(); j++) {
////                            if (children.contains(new WordNode(words[i]))) {
////                                children.get(j).insert(words[i]);
////                            }
////                        }
//                        continue;
//                    }
//                }else{
//                    //insert as a child of the previously inserted node
//                }
//
//
//            }
//        }

    public void insert(WordNode wordNode) {
        //String[] words = sentence.split(" ");
//
//        if(isLeaf()) {
//            children.add(new WordNode(word));
//        }
//        if(children.contains(new WordNode((word)))) {
//
//        }

        this.children.add(wordNode);

    }

//        if (word.equals(this.word)) {
//            return;
//        }
//
//
//
//        for(int i=0; i<children.size(); i++) {
//            if(children.get(i).word.equals(word));
//            return;
//        }

}
