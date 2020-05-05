package de.mohammadamir;

class Trie {
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (!node.has(ch)) {
                node.set(ch, new TrieNode());
            }

            node = node.get(ch);
        }

        node.setEnd(true);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = findNode(word);

        return node != null && node.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    private TrieNode findNode(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (!node.has(ch)) {
                return null;
            } else {
                node = node.get(ch);
            }
        }

        return node;
    }
}