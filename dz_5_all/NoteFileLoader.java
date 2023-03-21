package HomeWork.dz_5_all;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface NoteFileLoader {
    List<Note> loadFromFile(File file) throws IOException;
}

