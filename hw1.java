import java.util.Arrays;

// Реализуйте 2 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

// ArithmeticalException - например, при делении на ноль, ArrayStoreException - при вводе массива с не подходящим типом,  
// NullPointerException - если массив или один из массивов равен null.


public class hw1 {
    public static void main(String[] args) {
        int [] arr = new int[] {1, 1, 1, 1, 1, 1, -4};
        int [] arr2 = new int[] {1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(subArrays(arr, arr2)));
        System.out.println(Arrays.toString(divideArrays(arr, arr2)));
        
    }

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static int[] subArrays(int[] arr, int [] arr2) {
        int[] result = new int[arr.length];
        if (arr.length != arr2.length) {
            throw new RuntimeException(String.format("Длина первого массива d% не равна длине второго массива %d", arr.length, arr2.length));
        }
        for ( int i = 0; i < arr.length; i ++) {
            result[i] = arr[i] - arr2[i];
        }
        return result;
    }

// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше.

    public static double[] divideArrays(int[] arr, int [] arr2) {
        double[] result = new double[arr.length];
        if (arr.length != arr2.length) {
            throw new RuntimeException(String.format("Длина первого массива d% не равна длине второго массива %d", arr.length, arr2.length));
        }
        for ( int i = 0; i < arr.length; i ++) {
            if (arr[i] == 0 || arr2[i] == 0) {
                throw new RuntimeException("В массиве не должно быть нулей");
            }
            result[i] = (double) arr[i] / arr2[i];
        }
        return result;
    }
}