import java.util.Arrays;

//https://www.youtube.com/watch?v=vouTRD1iKZo&list=PL6Gtav8N4O7hBE01SU-rFPuQ2qg_a7IwQ&index=11
public class HW4_1 {
    public static void main(String[] args) {
        
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println("Task 1");
//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все нечетные числа из массива.
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
        System.out.println();
//----------------------------------------------------------
        System.out.println("Task 2");
//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все значения массива больше 5.
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] > 5) {
                System.out.println(array[i]);
            }
        }
        System.out.println();
//--------------------------------------------------------------------
        System.out.println("Task 3");
//        Задача №3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = array[i] + 15;
        }
        System.out.println(Arrays.toString(array));
    }
}