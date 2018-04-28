import java.util.ArrayList;

public class Driver {
    public static void main (String args[]){

        TextTree tree = new TextTree();


        tree.add("Good Morning");
        tree.add("Good Night");
        tree.add("Today is Wednsday");
        tree.add("Today is Thursday");
        tree.add("Today, its raining");

//        for (int i=0; i < tree.root.children.size();i++){
//
//            System.out.println(tree.root.children.get(i));
//        }

        ArrayList<String> list= new ArrayList<>();

        getAllSent(tree.root,list,"");

        for (String s: list){
            System.out.println(s);
        }


    }

    public static void getAllSent(WordNode node, ArrayList<String> list, String cur){
        if (node.isLeaf()){

            cur += " " + node.word;
            list.add(cur);
            return;
        }


        if (!node.word.equals("")){
            cur += " " + node.word;
        }
        for (int i =0; i < node.children.size(); i++){
//            if (node.word.equals("")){
                getAllSent(node.children.get(i),list,cur);

//            }
        }
    }
}
