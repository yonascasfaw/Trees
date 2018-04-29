import java.util.ArrayList;

public class Run {
    public static void main (String args[]){

        TextTree tree = new TextTree();


        tree.add("Good Morning");
        tree.add("Good Night");
        tree.add("Today is Wednsday");
        tree.add("Today is Thursday");
        tree.add("Today, its raining");


        ArrayList<String> list= new ArrayList<>();

        getAllSent(tree.root,list,"");

        for (String s: list){
            System.out.println(s);
        }

        System.out.println("Contains 'Good Evening': " + tree.contains("Good Evening"));


        System.out.println("Tree Height: " + tree.height());


        System.out.println("For each loop. Printing leaf of trees");
        for(Object word: tree) {
            System.out.println(word);
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
