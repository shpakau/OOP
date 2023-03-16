package HomeWork.dz_3;
import static HomeWork.dz_3.CollectionOfFigures.getAllFigure;
import static HomeWork.dz_3.CollectionOfFigures.getGeometricShapes;
import static HomeWork.dz_3.AddTriangle.addTriangle;
import static HomeWork.dz_3.CollectionOfFigures.changeFigure;
import static HomeWork.dz_3.AddCircle.addCircle;
import static HomeWork.dz_3.AddRectangle.addRectangle;
import static HomeWork.dz_3.AddSquare.addSquare;
import static HomeWork.dz_3.CollectionOfFigures.getSize;
import java.util.Scanner;
public class ChangeShape {

    public static void changeShape(){

        System.out.println("Какую фигуру вы хотите изменить?");
        getAllFigure();
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        int size = getSize();
        GeometricShapes geometricShapes = getGeometricShapes(choice - 1);
        if(geometricShapes instanceof Triangle){
            addTriangle();
        }
        if(geometricShapes instanceof Circle){
            addCircle();
        }
        if(geometricShapes instanceof Quadrate){
            addSquare();
        }
        if(geometricShapes instanceof Rectangle){
            addRectangle();
        }
        int newSize = getSize();
        if(size != newSize){
            changeFigure(choice - 1);
        }
    }
}
