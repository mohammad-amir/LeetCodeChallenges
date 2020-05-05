package de.mohammadamir;

public class DoubleLinkedListNode {
    public int key;
    public int value;
    public DoubleLinkedListNode prev;
    public DoubleLinkedListNode next;

    public DoubleLinkedListNode(int key, int value){
        this.key=key;
        this.value=value;
    }
}