package task_6;

/**
 * Note stores an information about record
 */
public class Note {
    String note;

    public Note(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return  note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note1 = (Note) o;

        return note != null ? note.equals(note1.note) : note1.note == null;
    }

    @Override
    public int hashCode() {
        return note != null ? note.hashCode() : 0;
    }
}
