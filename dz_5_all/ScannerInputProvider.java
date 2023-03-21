package HomeWork.dz_5_all;

import java.util.Scanner;

public class ScannerInputProvider implements InputProvider {
    private final Scanner scanner;

    public ScannerInputProvider(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getUserInput() {
        return scanner.nextLine();
    }
}