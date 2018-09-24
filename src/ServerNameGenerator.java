import java.util.Random;
public class ServerNameGenerator {
    String[] adjectives = {
            "fast",
            "tiny",
            "ambitious",
            "funky",
            "cool",
            "blue",
            "bald",
            "untoward",
            "bewildered",
            "sleepy",
            "awake"
            };

    String [] nouns = {
            "rodeo",
            "aardvark",
            "koala",
            "city",
            "dog",
            "panda",
            "shoes",
            "macbook",
            "sea-otter",
            "cat",
            "rat"};

    String pickRandomWord(String[] words) {
        Random rand = new Random();
        int i = rand.nextInt(words.length);
//        System.out.println(i);
        return words[i];

    }

    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
        String word1 = sng.pickRandomWord(sng.adjectives);
        String word2 = sng.pickRandomWord(sng.nouns);
        System.out.println("Here is your server name: ");
        System.out.println(word1 + "-" + word2);

    }

}
