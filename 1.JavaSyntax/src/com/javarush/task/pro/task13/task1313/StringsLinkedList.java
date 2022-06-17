package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node noteToAdd = new Node();
        noteToAdd.value=value;
        if (first.next == null && last.prev == null) {
            first.next = noteToAdd;
            last.prev = noteToAdd;

        } else {
            Node lastNode = last.prev;
            lastNode.next = noteToAdd;
            noteToAdd.prev = lastNode;
            last.prev = noteToAdd;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
