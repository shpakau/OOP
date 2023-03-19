package HomeWork.dz_4;

import java.util.ArrayList;
import java.util.List;

public class Arr<E1> {
    private List<Integer> arr;
    private int size;

    public Arr(){
        this.arr = new ArrayList<Integer>();
    }
    public Arr(Integer[] e1){
        this.arr = new ArrayList<Integer>();
        for (Integer object : e1) {
            arr.add(object);
        }
        this.size = arr.size();
    }
    public void add(Integer obj){   //1
        arr.add(obj);
    }
    public void remove(int index){ //2
        if (index >= 0 && index < arr.size()) {
            arr.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void removeElement(E1 e1) { //3
        arr.removeIf(element -> element.equals(e1));
    }

    public int getMin() { //4
        Optional<Integer> min = arr.stream()
                .filter(element -> element instanceof Integer)
                .map(element -> (Integer) element)
                .min(Comparator.naturalOrder());
        return min.orElse(Integer.MAX_VALUE);
    }

    }
    public int getMax(){                //5
        int max = Integer.MIN_VALUE;
        for (Integer element : arr) {
            if (element instanceof Integer && (Integer)element > max){
                max = (Integer)element;
            }
        }
        return max;
    }
    public int getSum(){                   //6
        int sum = 0;
        for (Integer element : arr) {
            if (element instanceof Integer){
                sum += (Integer)element;
            }
        }
        return sum;
    }
    public int getMultiplication(){                   //7
        int multi = 1;
        for (Integer element : arr) {
            if (element instanceof Integer){
                multi *= (Integer)element;
            }
        }
        return multi;
    }
    public int indexSearch(E1 e1){                     //8
        return arr.indexOf(e1);
    }
    public boolean elementSearch(E1 e1){                     //9
        return arr.contains(e1);
    }
    public void bubbleSort() {                               //10
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < arr.size() - i; j++) {
                if (arr.get(j) instanceof Integer && arr.get(j - 1) instanceof Integer){
                    if((Integer)arr.get(j) < (Integer)arr.get(j - 1)){
                        Integer temp = arr.get(j);
                        arr.set(j, arr.get(j - 1));
                        arr.set(j - 1, temp);
                    }
                }
            }
        }
    }
    public void insertSort(){        //11
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer){
                Integer key = arr.get(i);
                int j = i - 1;
                while (j >= 0 && (Integer)arr.get(j) > (Integer)key){
                    arr.set(j + 1, arr.get(j));
                    j--;
                }
                arr.set(j + 1, key);
            }
        }
    }
    public void selectSort() { //12
        int min = 0;
        int index = 0;
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            if (arr.get(i) instanceof Integer){
                min = (int)arr.get(i);
            }
            for (int j = i; j < size; j++) {
                if (arr.get(j) instanceof Integer ){
                    if(min > (int)arr.get(j)){
                        min = (int)arr.get(j);
                        index = j;
                    }
                }
            }
            if (arr.get(i) instanceof Integer){
                int temp1 = (int)arr.get(i);
                if (temp1 > min){
                    arr.remove(index);
                    arr.add(i, min);
                }
            }
        }
    }
    public E1 getElement(int index){                          //13
        return (E1)arr.get(index);
    }

    public void setElementIndex(Integer e1, int index){             //14
        arr.set(index, e1);
    }

    public void printArr(){                                      //15
        for (Object object : arr) {
            System.out.println(object);
        }
    }

    public int getSize(){                                       //16
        return arr.size();
    }
}
