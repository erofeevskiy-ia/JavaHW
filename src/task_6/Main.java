package task_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        notebook.addNote("hello");
        notebook.addNote("hello1");
        notebook.addNote("hello2");
        notebook.addNote("hello3");
        notebook.deleteNote("hell");
        notebook.rewriteNote(4,"asdasdsad");
        notebook.printAllNotes();

    }
}
