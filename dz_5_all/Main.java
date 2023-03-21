package HomeWork.dz_5_all;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NoteModel model = new NoteModel(new InMemoryNoteStorageImpl());
        NoteView view = new NoteView();
        NoteController controller = new NoteController(model, view);
        controller.run();
    }
}