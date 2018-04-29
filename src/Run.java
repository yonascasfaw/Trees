/**
 * Authors : Yonas Asfaw & Daniel Cervantes
 *
 * Santa Monica College
 * CS 20B–Data Structures with Java
 * Programming Project #3
 */

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

        //Prints out all the sentences

        getAllSent(tree.root,list,"");

        for (String s: list){
            System.out.println(s);
        }

        //test contains

        System.out.println("Contains 'Good Evening': " + tree.contains("Good Evening"));

        //calculate the height

        System.out.println("Tree Height: " + tree.height());


        //iterate over the leafs
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
