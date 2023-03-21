package HomeWork.dz_5_all;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NoteSaver{
    @Override
    public void saveToFile(List<NoteModel> notes, File file) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            for (NoteModel note : notes) {
                writer.write(note.getText() + "\n");
            }
        }
    }
}
