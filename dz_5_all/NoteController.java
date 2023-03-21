package HomeWork.dz_5_all;

import java.util.List;
import java.util.Scanner;

public class NoteController {
    private final Scanner scanner = new Scanner(System.in);
    private final NoteModel model;
    private final NoteView view;

    public NoteController(NoteModel model, NoteView view) {
        this.model = model;
        this.view = view;
    }

    public int getMenuChoice() {
        System.out.println("Выберите команду:");
        System.out.println("1 - добавить запись");
        System.out.println("2 - вывести список записей");
        System.out.println("3 - выход");
        return scanner.nextInt();
    }

    public String getNoteFromUser() {
        System.out.println("Введите новую запись:");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void displayNotes(List<Note> notesList) {
        if (notesList.isEmpty()) {
            System.out.println("Записей нет.");
        } else {
            System.out.println("Список записей:");
            for (Note note : notesList) {
                System.out.println(note);
            }
        }
    }

    public void displayMessage(String s) {
        System.out.println(s);
    }

    public void displayError(String s) {
        System.err.println(s);
    }

    public void displayControllerMessage(String s) {
        System.out.println(s);
    }

    public int getUserInput() {
        return scanner.nextInt();
    }

    public void run() {
        int choice = -1;
        while (choice != 3) {
            choice = getMenuChoice();
            switch (choice) {
                case 1:
                    String noteText = getNoteFromUser();
                    model.add(new Note(noteText));
                    break;
                case 2:
                    List<String> notesList = model.getAll();
                    displayNotes(notesList);
                    break;
                case 3:
                    displayControllerMessage("Выход");
                    break;
                default:
                    displayError("Неверная команда!");
                    break;
            }
        }
    }

    private void displayNotes(List<String> notesList) {

    }
}