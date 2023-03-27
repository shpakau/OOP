package HomeWork.dz_5_all;

import com.google.gson.Gson;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GsonNoteFileSaver implements NoteFileSaver {
    private final Gson gson;

    public GsonNoteFileSaver(Gson gson) {
        this.gson = gson;
    }

    @Override
    public void saveToFile(List<Note> notes, File file) throws IOException {
        try (Writer writer = new FileWriter(file)) {
            gson.toJson(notes, writer);
        }
    }
}
