package HomeWork.dz_3;
import java.util.Scanner;

public class Start {
    public static void start(){
        boolean start = true;
        Scanner in = new Scanner(System.in);
        while(start){
            System.out.println("Выберите действие: \n" +
                    "1 - Добавить геометрическую фигуру\n" +
                    "2 - Удалить геометрическую фигуру\n" +
                    "3 - Показать информацию обо всех фигурах\n" +
                    "4 - Вычислить периметр всех фигур\n" +
                    "5 - Вычислить площадь всех фигур\n" +
                    "6 - Изменить фигуру\n" +
                    "7 - Сортировка по площади\n" +
                    "8 - Выключить программу" );
            int choice = in.nextInt();

            switch(choice){
                case 1:
                    HomeWork.dz_3.AddGeometricShape.addGeometricShape(choice);
                    break;
                case 2:
                    HomeWork.dz_3.DeleteGeometricShape.deleteGeometricShape();
                    break;
                case 3:
                    HomeWork.dz_3.ShowAllInformation.showAllInformation();
                    break;
                case 4:
                    HomeWork.dz_3.AllPerimeters.allPerimeters();
                    break;
                case 5:
                    HomeWork.dz_3.AllArea.allArea();
                    break;
                case 6:
                    HomeWork.dz_3.ChangeShape.changeShape();
                    break;
                case 7:
                    HomeWork.dz_3.CollectionOfFigures.getSortSquare();
                    break;
                case 8:
                    start = false;
                    break;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
        in.close();
    }
}