package HomeWork.dz_5_all;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class GsonNoteFileLoader implements NoteFileLoader {
    private final Gson gson;

    public GsonNoteFileLoader(Gson gson) {
        this.gson = gson;
    }

    @Override
    public List<Note> loadFromFile(File file) throws IOException {
        try (Reader reader = new FileReader(file)) {
            return gson.fromJson(reader, new TypeToken<List<Note>>() {}.getType());
        }
    }
}
