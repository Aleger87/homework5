public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
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


        System.out.println("Задание 3");
            /*3
            Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
            Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
            Запятая между последним элементом одного массива и первым элементом следующего не нужна.
            * */
        i = weight.length-1;
        while (i >= 0){
            func (Integer.toString(weight[i]), 0, i);
            i--;
        }
        i = drob.length-1;
        while (i >= 0){
            func (Float.toString(drob[i]), 0, i);
            i--;
        }
        i = weights.length-1;
        while (i >= 0){
            func (Integer.toString(weights[i]), 0, i);
            i--;
        }

        System.out.println("Задание 4");
        /*
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        Распечатайте результат преобразования в консоль
        * */
        for (int j = 0; j < weight.length; j++) {
            weight[j] = convertAnEven(weight[j]);
            func (Integer.toString(weight[j]), weight.length-1, j);
        }
        for (int j = 0; j < weights.length; j++) {
            weights[j] = convertAnEven(weights[j]);
            func (Integer.toString(weights[j]), weights.length-1, j);
        }


    }



    private static void func(String a, int b, int c) {
        if (c != b){
            System.out.print(a + ",");
        }else {
            System.out.println(a + " ");
        }

    }

    private static int convertAnEven(int a) {
        if (a % 2 != 0) {
            a += 1;
        }
        return a;
    }



}