import java.util.*;

public class Assignment1 {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        {
            //Question 1
            System.out.println("Q1. Enter a sentence : ");
            String sentence = in.nextLine();
            StringBuilder modified_sentence = new StringBuilder();

            for (String words : sentence.split(" "))
                modified_sentence.append(Character.toUpperCase(words.charAt(0))).append(words.substring(1)).append(" ");

            System.out.println("The modified sentence : " + modified_sentence);
        }
        {
            //Question 2
            System.out.println("Q2. Enter a word : ");
            String word = in.next();
            String pad = word.substring(word.length() - 3);
            String modified_word = pad + word + pad;
            System.out.println("The modified word is : " + modified_word);
        }
        {
            // Question 3
            System.out.println("Q3. Enter the size of the array : ");
            int n = in.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements of the array : ");
            for(int i = 0; i < n; i++)
                array[i] = in.nextInt();
            Arrays.sort(array);
            System.out.println("Sorted array : " + Arrays.toString((array)));
        }
        {
            //Question 4
            System.out.println("Q4. Enter a word ; ");
            String word = in.next();
            for(int i = 0; i <=word.length(); i++) {
                for (int j = i; j < word.length(); j++)
                    System.out.print(" ");
                for(int j = 0; j < i; j++)
                    System.out.print(word.charAt(j) + " ");
                System.out.println();
            }
        }
        {
            //Question 5
            System.out.println("Enter a sentence : ");
            String sentence = in.nextLine();
            System.out.println("Enter a character : ");
            char ch = in.next().charAt(0);

            ArrayList<Integer> index = new ArrayList<Integer>();
            for (int i = 0; i < sentence.length(); i++) {
                if(ch == sentence.charAt(i))
                    index.add(i);
            }
            int difference = index.get(index.size() - 1) - index.get(0);
            System.out.println("The difference is : " + difference);
        }
    }
}
