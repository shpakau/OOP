package HomeWork.dz_5_all;

import java.util.List;

public class NoteModel {
    private final NoteStorage noteStorage;

    public NoteModel(NoteStorage noteStorage) {
        this.noteStorage = noteStorage;
    }

    public void add(Note note) {
        noteStorage.add(note);
    }

    public List<String> getAll() {
        return noteStorage.getAll();
    }

    public int getText() {
    }
}