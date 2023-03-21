package HomeWork.dz_5_all;

import java.util.ArrayList;
import java.util.List;

public class InMemoryNoteStorage {
    private final List<Note> notes = new ArrayList<>();

    @Override
    public void add(Note note) {
        notes.add(note);
    }

    @Override
    public List<Note> getAll() {
        return new ArrayList<>(notes);
    }
}
