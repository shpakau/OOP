package HomeWork.dz_5_all;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class NoteManager {
    private final InputProvider inputProvider;
    private final NoteStorage noteStorage;
    private final NoteFileLoader noteFileLoader;
    private final Gson gson;

    public NoteManager(InputProvider inputProvider, NoteStorage noteStorage,
                       NoteFileLoader noteFileLoader, Gson gson) {
        this.inputProvider = inputProvider;
        this.noteStorage = noteStorage;
        this.noteFileLoader = noteFileLoader;
        this.gson = gson;
    }

    public void createNote() {
        System.out.println("Введите заголовок заметки:");
        String title = inputProvider.getUserInput();
        System.out.println("Введите текст заметки:");
        String text = inputProvider.getUserInput();
        Note note = new NoteImpl(title, text);
        noteStorage.add(note);
        System.out.println("Заметка создана.");
    }

    public void listNotes() {
        List<Note> notes = noteStorage.getAll();
        if (notes.isEmpty()) {
            System.out.println("Заметок нет.");
        } else {
            for (Note note : notes) {
                System.out.println(note.getTitle());
            }
        }
    }

    public void loadNotes(File file) {
        try {
            List<Note> notes = noteFileLoader.loadFromFile(file);
            for (Note note : notes) {
                noteStorage.add(note);
            }
            System.out.println("Заметки загружены.");
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке заметок: " + e.getMessage());
        }
    }

    public void saveNotes(File file) {
        try (Writer writer = new FileWriter(file)) {
            gson.toJson(noteStorage.getAll(), writer);
            System.out.println("Заметки сохранены.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении заметок: " + e.getMessage());
        }
    }
}
