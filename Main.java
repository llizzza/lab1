import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x;

        System.out.println("1. Методы");
        System.out.println("2. Условия");
        System.out.println("3. Циклы");
        System.out.println("4. Массивы");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер задания: ");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                if (x >= 1 && x <= 4) {
                    break;
                } else {
                    System.out.println("Введите число от 1 до 4.");
                }
            } else {
                System.out.println("Нужно ввести число.");
                scanner.next();
            }
        }

        lab1 t =new lab1();

        if (x == 1){
            System.out.println("Задача 2. Сумма знаков.");

            while (true){
                System.out.println("Введите число >= 10:");
                if (scanner.hasNextInt()){
                    x = scanner.nextInt();
                    if (x>=10){
                        System.out.println("Сумма двух последних знаков: " + t.sumLastNums(x));
                        break;
                    } else{
                        System.out.println("Введите число >= 10.");
                    }
                } else{
                    System.out.println("Нужно ввести число.");
                    scanner.next();
                }
            }

            System.out.println("Задача 4. Есть ли позитив.");

            while (true){
                System.out.println("Введите число:");
                if (scanner.hasNextInt()){
                    x = scanner.nextInt();
                    System.out.println(t.isPositive(x));
                    break;
                } else{
                    System.out.println("Нужно ввести число.");
                    scanner.next();
                }
            }

            System.out.println("Задача 6. Большая буква.");

            while (true){
                System.out.println("Введите букву: ");
                char c = scanner.next().charAt(0);
                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                    System.out.println(t.isUpperCase(c));
                    break;
                } else{
                    System.out.println("Нужно ввести букву!");
                    scanner.next();
                }
            }

            System.out.println("Задача 8. Делитель.");

            int a, b;

            while (true){
                System.out.println("Введите число a: ");
                if (scanner.hasNextInt()){
                    a = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            while (true){
                System.out.println("Введите число b: ");
                if (scanner.hasNextInt()){
                    b = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println(t.isDivisor(a,b));

            System.out.println("Задача 10. Многократный вызов.");

            while (true){
                System.out.println("Введите число a: ");
                if (scanner.hasNextInt()){
                    a = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            while (true){
                System.out.println("Введите число b: ");
                if (scanner.hasNextInt()){
                    b = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int rez = t.lastNumSum(a,b);

            while (true){
                System.out.println("Введите число a: ");
                if (scanner.hasNextInt()){
                    a = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int rez1 = t.lastNumSum(a,rez);

            while (true){
                System.out.println("Введите число a: ");
                if (scanner.hasNextInt()){
                    a = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int rez2 = t.lastNumSum(a,rez1);

            while (true){
                System.out.println("Введите число a: ");
                if (scanner.hasNextInt()){
                    a = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int rez3 = t.lastNumSum(a,rez2);

            System.out.println("Итог: " + rez3);
        }

        if (x == 2){
            int y;

            System.out.println("Задача 2. Безопасное деление. ");

            while (true){
                System.out.println("Введите x: ");
                if (scanner.hasNextInt()){
                    x = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            while (true){
                System.out.println("Введите y: ");
                if (scanner.hasNextInt()){
                    y = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println("Ответ: " + t.safeDiv(x,y));

            System.out.println("Задание 4. Строка сравнения.");

            while (true) {
                System.out.println("Введите x: ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            while (true){
                System.out.println("Введите y:");
                if (scanner.hasNextInt()){
                    y = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println("Ответ: " + x + t.makeDecision(x, y) + y);

            System.out.println("Задание 6. Тройная сумма. ");

            int z;

            while (true) {
                System.out.println("Введите x: ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            while (true){
                System.out.println("Введите y:");
                if (scanner.hasNextInt()){
                    y = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            while (true){
                System.out.println("Введите z:");
                if (scanner.hasNextInt()){
                    z = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println("Ответ : " + t.sum3(x, y, z));

            System.out.println("Задание 8. Возраст. ");

            while (true) {
                System.out.println("Введите x: ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    if (x>0){
                        System.out.println("Ответ: " + x + " " + t.age(x));
                        break;
                    } else {
                        System.out.println("Число должно быть положительным!");
                    }
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println("Задание 10. Вывод дней недели. ");

            while (true) {
                System.out.println("Введите день недели (с маленькой буквы): ");
                scanner.nextLine();
                String s = scanner.nextLine();
                if (s.equals("понедельник") || s.equals("вторник") || s.equals("среда") || s.equals("четверг") || s.equals("пятница") || s.equals("суббота") || s.equals("воскресенье")){
                    t.printDays(s);
                    break;
                } else {
                    System.out.println("Нужно ввести день недели(с маленькой буквы)! ");
                    scanner.next();
                }
            }
        }

        if (x==3){

            int y;

            System.out.println("Задание 2. Числа наоборот.");

            while (true){
                System.out.println("Введите число: ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    if (x>0){
                        System.out.println(t.reverseListNums(x));
                        break;
                    }else {
                        System.out.println("Число должно быть положительным!");
                    }
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println("Задание 4. Степень числа. ");

            while (true){
                System.out.println("Введите число x: ");
                if (scanner.hasNextInt()){
                    x = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            while (true){
                System.out.println("Введите число y: ");
                if (scanner.hasNextInt()){
                    y = scanner.nextInt();
                    break;
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println(t.pow(x,y));

            System.out.println("Задание 6. Одинаковость. ");

            while (true){
                System.out.println("Введите число x");
                if (scanner.hasNextInt()){
                    x = scanner.nextInt();
                    if (x>0){
                        System.out.println(t.equalNum(x));
                        break;
                    } else{
                        System.out.println("Введите положительное число!");
                    }
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println("Задание 8. Левый треугольник.");

            while (true) {
                System.out.println("Введите x: ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    if (x>0){
                        t.leftTriangle(x);
                        break;
                    } else {
                        System.out.println("Число должно быть положительным!");
                    }
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println("Задание 10. Угадайка.");

            t.guessGame();

        }

        if (x==4){

            System.out.println("Задание 2. Поиск последнего значения. ");

            int size;

            while (true){
                System.out.println("Введите размер массива: ");
                if (scanner.hasNextInt()){
                    size = scanner.nextInt();
                    if (size > 0){
                        break;
                    } else {
                        System.out.println("Размер массива должен быть положительным числом:");
                    }
                } else {
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int[] arr = new int[size];

            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size; i++) {
                while (true) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        arr[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Нужно ввести число!");
                        scanner.next();
                    }
                }
            }

            while (true) {
                System.out.println("Введите x: ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    if (x>0){
                        System.out.println("Результат: " + t.findLast(arr,x));
                        break;
                    } else {
                        System.out.println("Число должно быть положительным!");
                    }
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            System.out.println("Задание 4. Добавление в массив.");

            int size1;

            while (true){
                System.out.println("Введите размер массива: ");
                if (scanner.hasNextInt()){
                    size1 = scanner.nextInt();
                    scanner.nextLine();
                    if (size1 > 0){
                        break;
                    } else {
                        System.out.println("Размер массива должен быть положительным числом:");
                    }
                } else {
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int[] arr1 = new int[size1];

            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size1; i++) {
                while (true) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        arr1[i] = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Нужно ввести число!");
                        scanner.next();
                    }
                }
            }

            while (true) {
                System.out.println("Введите x: ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt();
                    if (x>0){
                        break;
                    } else {
                        System.out.println("Число должно быть положительным!");
                    }
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int pos;

            while (true) {
                System.out.println("Введите pos: ");
                if (scanner.hasNextInt()) {
                    pos = scanner.nextInt();
                    if (pos >= 0 && pos <= arr1.length){
                        break;
                    } else {
                        System.out.println("Число должно быть положительным!");
                    }
                } else{
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int[] newarr = t.add(arr1, x, pos);

            for (int i = 0; i < newarr.length; i++) {
                System.out.print(newarr[i] + " ");
            }

            System.out.println("Задание 6. Реверс.");

            int size2;

            while (true){
                System.out.println("Введите размер массива: ");
                if (scanner.hasNextInt()){
                    size2 = scanner.nextInt();
                    scanner.nextLine();
                    if (size2 > 0){
                        break;
                    } else {
                        System.out.println("Размер массива должен быть положительным числом:");
                    }
                } else {
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int[] arr2 = new int[size2];

            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size2; i++) {
                while (true) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        arr2[i] = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Нужно ввести число!");
                        scanner.next();
                    }
                }
            }

            t.reverse(arr2);

            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }

            System.out.println("Задание 8. Объединение");

            int size3;

            while (true){
                System.out.println("Введите размер массива: ");
                if (scanner.hasNextInt()){
                    size3 = scanner.nextInt();
                    scanner.nextLine();
                    if (size3 > 0){
                        break;
                    } else {
                        System.out.println("Размер массива должен быть положительным числом:");
                    }
                } else {
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int[] arr11 = new int[size3];

            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size3; i++) {
                while (true) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        arr11[i] = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Нужно ввести число!");
                        scanner.next();
                    }
                }
            }

            int size4;

            while (true){
                System.out.println("Введите размер 1 массива: ");
                if (scanner.hasNextInt()){
                    size4 = scanner.nextInt();
                    scanner.nextLine();
                    if (size4 > 0){
                        break;
                    } else {
                        System.out.println("Размер массива должен быть положительным числом:");
                    }
                } else {
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int[] arr22 = new int[size4];

            System.out.println("Введите элементы 2 массива:");

            for (int i = 0; i < size4; i++) {
                while (true) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        arr22[i] = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Нужно ввести число!");
                        scanner.next();
                    }
                }
            }

            int[] newarr1 = t.concat(arr11, arr22);

            for (int i = 0; i < newarr1.length; i++) {
                System.out.print(newarr1[i] + " ");
            }

            System.out.println("Задание 10. Удалить негатив. ");

            int size5;

            while (true){
                System.out.println("Введите размер 1 массива: ");
                if (scanner.hasNextInt()){
                    size5 = scanner.nextInt();
                    scanner.nextLine();
                    if (size5 > 0){
                        break;
                    } else {
                        System.out.println("Размер массива должен быть положительным числом:");
                    }
                } else {
                    System.out.println("Нужно ввести число!");
                    scanner.next();
                }
            }

            int[] arr3 = new int[size5];

            System.out.println("Введите элементы 2 массива:");

            for (int i = 0; i < size5; i++) {
                while (true) {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        arr3[i] = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Нужно ввести число!");
                        scanner.next();
                    }
                }
            }

            int[] newarr2 = t.deleteNegative(arr3);

            for (int i = 0; i < newarr2.length; i++) {
                System.out.print(newarr2[i] + " ");
            }
        }
    }
}
