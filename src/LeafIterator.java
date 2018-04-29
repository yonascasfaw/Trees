import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LeafIterator implements Iterator<String>{

    private WordNode root = null;
    private LinkedList<WordNode> queue;
    ListIterator<WordNode> iter;
    public LeafIterator(WordNode root) {
        this.queue = new LinkedList<>();
        this.root = root;
        iter = queue.listIterator();

        // Init the queue with the root

        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        for (WordNode w : queue){
            if (w.isLeaf()){
                return true;
            }
        }

        while (!queue.isEmpty()) {

            WordNode n = queue.removeFirst();

            if (!n.isLeaf()) {

                for (int i = 0; i < n.children.size(); i++) {
                    queue.add(n.children.get(i));
                }
            } else {
                queue.addFirst(n);
                return true;
            }

        }



        return false;
        
    }

    @Override
    public String next() {


        while (!queue.isEmpty()) {

            WordNode n = queue.removeFirst();

            if (!n.isLeaf()) {

                for (int i = 0; i < n.children.size(); i++) {
                    queue.add(n.children.get(i));
                }
            } else {
                return n.word;
            }

        }

        return null;

    }


}
