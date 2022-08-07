package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

        String result = "";
        while (chars.length != 0) {
            result = String.valueOf(chars);
            break;

        }
        System.out.print(result);

    }

    public static void main(String[] args) {
        WordsBuilder w = new WordsBuilder();
        w.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
}
