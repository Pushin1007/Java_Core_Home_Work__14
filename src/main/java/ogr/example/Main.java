package ogr.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 78, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(returnArray(arr)));

        int[] arr2 = {1, 4,2,1,1,1};
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr1And4(arr2));
    }

    public static int[] returnArray(int arr[]) {
//    1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//    Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
//    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//    Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//    Вх: [ 1 2 4 2 3 1 7 ] -> вых: [ 2 3 1 7 ].
//    Вх: [ 1 4 ] -> вых: [ ].
//    Вх: [ 1 2 3 1 ] -> вых: RuntimeException
        int poz = arr.length - 1;
        int[] arrayRet;
        for (int i = poz; i >= 0; i--) {
            poz = i;
            if (arr[i] == 4) {
                break;
            }
        }
        if (poz == 0) {
            throw new RuntimeException("Цифра 4 не найдена");
        }
        if (poz == (arr.length) - 1) {
            arrayRet = new int[0];
        } else {
            arrayRet = new int[arr.length - poz - 1];
            System.arraycopy(arr, (poz + 1), arrayRet, 0, (arr.length - poz - 1));
        }
        return arrayRet;
    }

    public static boolean arr1And4(int arr[]) {
//2. Написать метод, который проверяет состав массива из чисел 1 и 4.
// Если в нем нет хоть одной четверки или единицы, то метод вернет false;
// Если есть другое число то вернуть false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//            [ 1 1 1 4 4 1 4 4 ] -> true
//            [ 1 1 1 1 1 1 ] -> false
//            [ 4 4 4 4 ] -> false
//            [ 1 4 4 1 1 4 3 ] -> false
//            [ 14 41 11 44 ] -> false
        int a1 = 0;
        int a4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                a1=1;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==4){
                a4=1;
                break;
            }
        }
        return (a1+a4==2);
    }

}