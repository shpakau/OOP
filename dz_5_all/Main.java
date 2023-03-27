package HomeWork.dz_5_all;

import com.google.gson.Gson;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputProvider inputProvider = new ScannerInputProvider(new Scanner(System.in));
        NoteStorage noteStorage = new InMemoryNoteStorage();
        NoteFileLoader noteFileLoader = new GsonNoteFileLoader(new Gson());
        NoteManager noteManager = new NoteManager(inputProvider, noteStorage, noteFileLoader, new Gson());

        while (true) {
            System.out.println("Введите команду: (create, list, load, save, exit)");
            String command = inputProvider.getUserInput();
            switch (command) {
                case "create":
                    noteManager.createNote();
                    break;
                case "list":
                    noteManager.listNotes();
                    break;
                case "load":
                    System.out.println("Введите путь к файлу:");
                    String loadFilePath = inputProvider.getUserInput();
                    noteManager.loadNotes(new File(loadFilePath));
                    break;
                case "save":
                    System.out.println("Введите путь к файлу:");
                    String saveFilePath = inputProvider;
                    getUserInput();
                    noteManager.saveNotes(new File(saveFilePath));
                    break;
                case "exit":
                    System.out.println("Программа завершена.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неизвестная команда.");
                    break;
            }
        }
    }
}