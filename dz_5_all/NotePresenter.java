package HomeWork.dz_5_all;

import java.util.List;

public class NotePresenter {
    private final NoteModel model;
    private final NoteView view;

    public NotePresenter(NoteModel model, NoteView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        int userInput;
        do {
            userInput = view.getUserInput();
            switch (userInput) {
                case 1:
                    String newNote = view.getNoteFromUser();
                    model.add(new NoteModel(newNote));
                    break;
                case 2:
                    List<String> notesList = model.getAll();
                    view.displayNotes(notesList);
                    break;
                case 3:
                    view.displayControllerMessage("Выход");
                    break;
                default:
                    view.displayError("Неверная команда!");
                    break;
            }
        } while (userInput != 3);
    }
}

