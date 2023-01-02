/**********************************************
Workshop #
Course:<JAC44> - Semester
Last Name:<Ahir Ahir>
First Name:<Devang Ramubhai>
ID:<153484209>
Section:<NCC>
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<submission date>
**********************************************/


package ws4;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Task1 {

    public String readFileToString(String filename) throws IOException {
        StringBuilder bd = new StringBuilder();
        File f = new File(filename);
        //f.createNewFile();
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            bd.append(s.nextLine());
        }
        return bd.toString();
    }

    public String[] getWordsFromString(String filename) throws IOException {
        String s = readFileToString(filename);
        return s.split("[\b\\W\b]");

    }

    public String returnRandomWord(String filename) throws IOException {
        String[] words = getWordsFromString(filename);
        double rand = Math.random() * words.length - 1;
        int r = (int) Math.floor(rand);
        String s = words[r];
        while (!" ".equals(s)) {
            break;
        }
        return s;

    }

    public void showWordInAsterik(String s, List<Character> st) {
        int sz = s.length();
        int count = 0;
        while (count < sz) {
            Character c = s.charAt(count);
            if (st.contains(c)) {
                System.out.print(c);
                count++;
            } else {
                System.out.print("*");
                count++;
            }

        }
        System.out.print(">");

    }

    public boolean checkExist(char c, List<Character> cs) {
        boolean test = false;
        if (cs.contains(c)) {
            return true;
        }
        return test;
    }

    public void play() throws IOException {
        //Task1 t=new Task1();
        int misses = 0;

        List<Character> cs = new ArrayList<>();
        List<Character> tries = new ArrayList<>();
        String word = this.returnRandomWord("hangman.txt");
        String content=readFileToString("hangman.txt");
       List<Character> wc = new ArrayList<Character>();
        for (int i = 0; i < word.length(); i++) {
            wc.add(word.charAt(i));
        }

        //System.out.print("(Guess) Enter a letter in the word");
        Scanner s = new Scanner(System.in);
        outer: while (true) {
            oo:
            if (cs.size() == word.length()) {
                System.out.println("The word is " + word + ". You missed " + misses);
                System.out.println("Enter new word to be added to the memory table");
                String new_word = s.next();
                PrintStream o = new PrintStream(new File("hangman.txt"));
                // Store current System.out
                // before assigning a new value
                PrintStream console = System.out;

                // Assign o to output stream
                // using setOut() method
                System.setOut(o);

                // Display message only
                System.out.println(content);
                System.out.println(new_word.trim());
                 o.close();

                // Use stored value for output stream
                System.setOut(console);
                System.out.println("Do you want to guess another word? Enter y or n>");
                String ck = s.next();
                if (ck.equalsIgnoreCase("y")) {
                    cs = new ArrayList<>();
                    word = this.returnRandomWord("hangman.txt");
                    continue outer;
                } else {
                    break outer;
                   // break outer;
                }

            }
            System.out.print("(Guess) Enter a letter in the word");
            this.showWordInAsterik(word, cs);
            Character c = s.next().charAt(0);

            if (cs.contains(c)) {
                System.out.println(c + " is already entered");
            } if (!wc.contains(c)) {
                System.out.println(c + " is not in the word");
                misses++;

            } else {
            cs.add(c);
            }
            
            if (tries.contains(c)) {
                System.out.println("You have already tried " + c + " try another letter");

            } if(!tries.contains(c)){
               tries.add(c);
            } 

        }

    }

    public static void main(String[] args) throws IOException {
        Task1 t = new Task1();
        t.play();
    }
}
