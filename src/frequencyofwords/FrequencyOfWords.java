package frequencyofwords;
import java.util.LinkedList;

public class FrequencyOfWords {
    private LinkedList<MyMapNode<String, Integer>> list;

    //parameterized constructor
    public FrequencyOfWords() {
        this.list = new LinkedList<>();
    }

    public void findFrequency(String sentence) {

        //It takes a string (a sentence) and splits it into words using the split method.
        String[] words = sentence.toLowerCase().split(" ");

        //It then loops through each word, checks if it already exists in the linked list,
        //and either increments its frequency or creates a new MyMapNode object for it
        for (String word : words) {
            boolean wordFound = false;
            for (MyMapNode<String, Integer> node : list) {
                if (node.key.equals(word)) {
                    node.value++;
                    wordFound = true;
                    break;
                }
            }

            //If new word found then add to list
            if (!wordFound) {
                MyMapNode<String, Integer> newNode = new MyMapNode<>(word, 1);
                list.add(newNode);
            }
        }
        display();
    }

    //Display the frequency of words
    public void display() {
        for (MyMapNode<String, Integer> node : list) {
            System.out.println(node.key + ": " + node.value);
        }
    }
}
