package HomeWork.dz_5_all;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public interface NoteFileSaver {
    void saveToFile(List<Note> notes, File file) throws IOException;
}
