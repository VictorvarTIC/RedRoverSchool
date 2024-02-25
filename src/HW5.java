//https://www.youtube.com/watch?v=tTIZ9wwDTl0&list=PL6Gtav8N4O7hBE01SU-rFPuQ2qg_a7IwQ&index=15
public class HW5 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println("Task 1");
//      Задача №1
//      Дан массив:
//      int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//      необходимо вывести сумму всех значений массива.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println();
//-----------------------------------------------------
        System.out.println("Task 2");
//      Задача №2
//      Дан массив:
//      int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//      необходимо вывести максимальное значение массива.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println();
//-------------------------------------------------------
        System.out.println("Task 3");
//      Задача №3
//      Дан массив:
//      int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//      необходимо вывести минимальное значение массива.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        System.out.println();
//-------------------------------------------------------------
        System.out.println("Task 4");
//      Задача №4
//      Дан массив:
//      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//      необходимо вывести среднее арифметическое всех значений массива.
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double sum4 = 0;
        for (int i = 0; i < array4.length; i++) {
            sum4 += array4[i];
        }
        System.out.println(sum4 / array4.length);
        System.out.println();
//-----------------------------------------------------
        System.out.println("Task 5");
//      Задача №5
//      Дан массив:
//      int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//      необходимо вывести сумму элементов массива.

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};


        double sum5 = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++){
                sum5 += array5[i][j];
            }
        }
        System.out.println(sum5 / array5.length);
        System.out.println();
//-----------------------------------------------------
        System.out.println("Task 6");
//      Задача №6
//      Дан массив:
//      int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//      необходимо вывести максимальное значение массива.

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};


        int max6 = Integer.MIN_VALUE;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++){
                if (array6[i][j] > max6) {
                    max6 = array6[i][j];
                }
            }
        }
        System.out.println(max6);
        System.out.println();
//-----------------------------------------------------
        System.out.println("Task 7");
//      Задача №7
//      Дан массив:
//      int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//      необходимо вывести количество элементов в массиве.

        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};


        int count = 0;
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
    }
}
