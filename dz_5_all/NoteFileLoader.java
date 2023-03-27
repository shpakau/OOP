package HomeWork.dz_5_all;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public interface NoteFileLoader {
    List<Note> loadFromFile(File file) throws IOException;
}
