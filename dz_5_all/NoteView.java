package HomeWork.dz_5_all;

import java.util.List;
import java.util.Scanner;

public class NoteView {
    // add a default constructor
    public NoteView() {
    }
    public int getMenuChoice() {
        System.out.println("Выберите команду:");
        System.out.println("1- добавить запись");
        System.out.println("2- вывести список записей");
        System.out.println("3- выход");
        return scanner.nextInt();
    }

    public String getNoteFromUser() {
        System.out.println("Введите новую запись:");
        Scanner scanner;
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void displayNotes(List<String> notes) { //change parameter type to List
        if (notes.isEmpty()) {
            System.out.println("Записей нет.");
        } else {
            System.out.println("Список записей:");
            for (String note : notes) {
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
        return 0;
    }
}