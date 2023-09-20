package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {

        TextArea textArea = new TextArea();
        TextEditor textEditor = new TextEditor(textArea);

        textArea.add("Hello");
        textEditor.save();
        textEditor.print();

        textArea.add(" World!");
        textEditor.print();

        textEditor.undo();
        textEditor.print();

    }
}
