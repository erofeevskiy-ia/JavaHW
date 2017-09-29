package task_6;

import java.util.ArrayList;
import java.util.List;


/**
 * class notebook is created for simple storage note in Notebook
 */
public class Notebook {
    private List<Note> notesInNotebook = new ArrayList();

    /**
     * @param s - note
     * @return - result of adding: true - successful addition, false - unsuccessful addition
     */
    public boolean addNote(String s) {
        Note note = new Note(s);
        return notesInNotebook.add(note);
    }

    /**
     * Get a note by index
     *
     * @param index
     * @return note from notebook
     */
    public Note getNote(int index) {
        return notesInNotebook.get(index);
    }

    /**
     * @param n - Note
     * @return result of removing
     */
    public boolean deleteNote(Note n) {
        return notesInNotebook.remove(n);
    }

    /**
     * @param s - String in note
     * @return result of removing
     */
    public boolean deleteNote(String s) {
        return this.deleteNote(new Note(s));
    }

    /**
     * remove a note by index
     *
     * @param n - index of record
     * @return result of removing
     */
    public Note deleteNote(int n) {
        return notesInNotebook.remove(n);
    }

    /**
     * print all notes from the notebook
     */
    public void printAllNotes() {
        for (Note n : notesInNotebook)
            System.out.printf("%s%n", n);
    }

    /**
     * rewrite note in notebook
     * @param index - note number
     * @param s - new string for rewriting
     * @return
     */
    public boolean rewriteNote(int index, String s) {

        if (index >= notesInNotebook.size()) {
            System.out.printf("you cannot rewrite the note in notebook: ur index> notebook.size");
            return false;
        }
        Note oldNote = notesInNotebook.set(index, new Note(s));
        if (oldNote != null)
            return true;
        return false;

    }
}
