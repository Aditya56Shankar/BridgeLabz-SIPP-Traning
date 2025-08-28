import java.util.*;

// ---- Trie Node ----
class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false;
    int popularity = 0;  // Bonus: track popularity
}

// ---- Trie ----
class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node = node.children.computeIfAbsent(c, k -> new TrieNode());
        }
        node.isEndOfWord = true;
        node.popularity++; // each time inserted, increase popularity
    }

    // Get suggestions for a prefix
    public List<String> getSuggestions(String prefix, int limit) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (!node.children.containsKey(c)) {
                return Collections.emptyList(); // no match
            }
            node = node.children.get(c);
        }

        List<String> results = new ArrayList<>();
        dfs(node, prefix, results);

        // sort by popularity (descending)
        results.sort((a, b) -> getPopularity(b) - getPopularity(a));

        if (results.size() > limit) {
            return results.subList(0, limit);
        }
        return results;
    }

    // DFS to collect all words starting from node
    private void dfs(TrieNode node, String prefix, List<String> results) {
        if (node.isEndOfWord) {
            results.add(prefix);
        }
        for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
            dfs(entry.getValue(), prefix + entry.getKey(), results);
        }
    }

    // Helper to get popularity of a word
    private int getPopularity(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (!node.children.containsKey(c)) return 0;
            node = node.children.get(c);
        }
        return node.popularity;
    }
}

// ---- Demo ----
public class AutocompleteDemo {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert keywords
        trie.insert("pizza hut");
        trie.insert("pizza point");
        trie.insert("pita bread");
        trie.insert("pizzeria");

        // Simulate popularity (more orders)
        trie.insert("pita bread");
        trie.insert("pita bread");  // now more popular

        // User types "pi"
        System.out.println("Suggestions for 'pi': " + trie.getSuggestions("pi", 3));

        // Add new restaurant
        trie.insert("pineapple cafe");

        System.out.println("Suggestions for 'pi': " + trie.getSuggestions("pi", 5));
    }
}
