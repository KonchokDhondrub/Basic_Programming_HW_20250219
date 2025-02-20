import java.util.Iterator;

public class IterableString implements Iterable<String> {
    private final String text;

    public IterableString(String list) {
        this.text = list;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            String[] words = text.split(" ");
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < words.length;
            }

            @Override
            public String next() {
                return words[currentIndex++];
            }
        };
    }
}
