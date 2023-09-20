package org.ahmetaksunger;

import lombok.Getter;
import lombok.Setter;

// Originator
@Getter
@Setter
public class TextArea {

    private String text = "";

    public TextArea() {
        this.save();
    }

    public void add(String text) {
        this.text += text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }

    // Memento
    public static class Memento {

        private String savedText;

        public Memento(String text) {
            this.savedText = text;
        }

        public String getSavedText() {
            return savedText;
        }
    }
}
