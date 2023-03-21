package HomeWork.dz_5_all;

import java.util.ArrayList;
import java.util.List;

public class NoteStorage {
    private final List<Note> notes = new ArrayList<>();

    @Override
    public void add(Note note) {
        notes.add(note);
    }

    @Override
    public List<String> getAll() { // change method visibility to public
        List<String> noteStrings = new ArrayList<>();
        for (Note note : notes) {
            noteStrings.add(note.getText());
        }
        return noteStrings;
    }

    @Override
    public boolean remove(Note note) {
        return notes.remove(note);
    }
}