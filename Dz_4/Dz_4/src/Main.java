
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{2, 9, -3, 12, 3, 10};
        DynamicArray<Integer> myArray = new DynamicArray(array);
        myArray.printArray();
        myArray.add(8);
        myArray.printArray();
        System.out.println(myArray.getLength());
        myArray.remove(3);
        myArray.printArray();
        myArray.findMin();
        myArray.findMax();
        myArray.findSumm();
        myArray.findMultiply();
        System.out.println(myArray.findIndGetEl(10));
        System.out.println(myArray.haveElmt(30));
        System.out.println("Ваш отсортированный пузырьком массив");
        myArray.bubbleSort();
        myArray.printArray();
        System.out.println(myArray.getElByInd(3));
        myArray.getValByInd(2, 30);
        myArray.printArray();
        System.out.println(myArray.getLength());// Длинна массива
    }
}

