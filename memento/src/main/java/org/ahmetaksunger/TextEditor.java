package org.ahmetaksunger;

public class TextEditor {

    private TextArea textArea;
    private TextArea.Memento memento;

    public TextEditor(TextArea textArea) {
        this.textArea = textArea;
    }

    public void save(){
        this.memento = textArea.save();
    }

    public void print(){
        System.out.println(textArea.getText());
    }

    public void undo(){
        textArea.restore(memento);
    }

}
