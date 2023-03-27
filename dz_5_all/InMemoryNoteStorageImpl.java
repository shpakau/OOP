package HomeWork.dz_5_all;
import java.util.ArrayList;
import java.util.List;

public class InMemoryNoteStorage implements NoteStorage {
    private final List<Note> notes = new ArrayList<>();

    @Override
    public void add(Note note) {
        notes.add(note);
    }

    @Override
    public java.awt.List getAll() {
        return new ArrayList<>(notes);
    }
}
