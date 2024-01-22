package dsa.trie;

public class Trie {

    class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            isEndOfWord = false;
            // 8 bit ASCII = 256
            children = new TrieNode[256];
        }
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            byte index = (byte) ch;

            if (current.children[index] == null) current.children[index] = new TrieNode();

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            byte index = (byte) ch;

            if (current.children[index] == null) return false;

            current = current.children[index];
        }

        return current.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;

        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            byte index = (byte) ch;

            if (current.children[index] == null) return false;

            current = current.children[index];
        }

        return true;
    }

    public boolean delete(String str) {
        byte ans = delete(root, str, 0);
        /*
            -1 means word not found
            0 means word found but not end of word so not deleted
            1 means word found and end of word so deleted
         */
        if (ans == -1) System.out.println("Word not found");
        else if (ans == 0) System.out.println("Word found but not end of word so not deleted");
        else System.out.println("Word found and it was end of word so deleted");
        return ans >= 0;
    }

    private boolean markChildTrieNodeNull(TrieNode current, byte ascii) {
        if (current.children[ascii].isEndOfWord) return false;
        for (TrieNode child : current.children[ascii].children) {
            if (child != null) return false;
        }
        current.children[ascii] = null;
        return true;
    }

    private byte delete(TrieNode current, String str, int index) {
        byte ascii = (byte) str.charAt(index);
        System.out.println("index: " + index + ", char: " + str.charAt(index) + ", ascii: " + ascii);

        if (current.children[ascii] == null) return -1;
        if (index == str.length() - 1) {
            if (!current.children[ascii].isEndOfWord) return 0;
            current.children[ascii].isEndOfWord = false;
            /*
                return 2 if deleted child node
                return 1 if child node has further children, and could only be marked as endOfWord
             */
            if (markChildTrieNodeNull(current, ascii)) return 2;
            return 1;
        }

        byte ans = delete(current.children[ascii], str, index + 1);

        if (ans == 2) {
            if (markChildTrieNodeNull(current, ascii)) return 2;
            return 1;
        }

        return ans;
    }


    public static void main(String[] args) {
        Trie obj = new Trie();

        obj.insert("cat");
        obj.insert("can");
        obj.insert("cane");
        obj.insert("car");
        obj.insert("carrot");
        obj.insert("cart");
        obj.insert("cartoon");
        obj.insert("pick");
        obj.insert("pic");
        obj.insert("pict");
        obj.insert("picture");
        obj.insert("pickle");

        boolean isPresent = obj.search("cat");
        System.out.println("cat word exists: " + isPresent);

        boolean isDeleted = obj.delete("cat");
        System.out.println("cat word deleted: " + isDeleted);

        isPresent = obj.search("cat");
        System.out.println("cat word exists: " + isPresent);

        isPresent = obj.search("picky");
        System.out.println("picky word exists: " + isPresent);

        isPresent = obj.search("pick");
        System.out.println("pick word exists: " + isPresent);

        isPresent = obj.startsWith("ca");
        System.out.println("ca prefix exists: " + isPresent);

        isPresent = obj.startsWith("pen");
        System.out.println("pen prefix exists: " + isPresent);

        isPresent = obj.startsWith("pi");
        System.out.println("pi prefix exists: " + isPresent);;

        isPresent = obj.search("pi");
        System.out.println("pi word exists: " + isPresent);
    }
}
