

public class Main {
    public static void main(String[] args) {

        /*1
        Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
            с помощью ключевого слова или сразу заполненный элементами
        * */

        int [] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weight[i]);
        }

        float[] drob = {1.57F, 7.654F, 9.986F};
        for (int i = 0; i < 3; i++) {
            System.out.println(drob[i]);
        }

        int [] weights = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            System.out.println(" ");
        }

        /*2
        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        начиная с первого элемента, через запятую.
        Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        * */


        System.out.println("Задание 2");
        int max = Math.max(weights.length, weight.length);
        max = Math.max(max, drob.length);

        int i=0;
            while (i < weight.length){
                func (Integer.toString(weight[i]), weight.length-1, i);
                i++;
            }
            i=0;
            while (i < drob.length){
                func(Float.toString(drob[i]), drob.length-1, i);
                i++;
            }
            i=0;
            while (i < weights.length){
                func (Integer.toString(weights[i]), weights.length-1, i);
                i++;
            }


    }

    private static void func(String a, int b, int c) {
        if (c != b){
            System.out.print(a + ",");
        }else {
            System.out.print(a + " ");
        }
    }

}