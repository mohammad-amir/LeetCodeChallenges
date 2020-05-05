package de.mohammadamir;

public class TrieNode {
    TrieNode[] links;
    boolean end;

    public TrieNode() {
        links = new TrieNode[26];
    }

    public boolean has(char ch) {
        return get(ch) != null;
    }

    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }

    public void set(char ch, TrieNode trieNode) {
        links[ch - 'a'] = trieNode;
    }

    public void  setEnd(boolean end) {
        this.end = end;
    }

    public boolean isEnd() {
        return end;
    }
}