import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class lab1 {

    public int sumLastNums(int x){
        int y, z, w;
        y = x % 10;
        z = x / 10;
        w = z % 10;
        return y + w;
    }

    public boolean isPositive (int x){
        if (x > 0)
            return true;
        else
            return false;
    }

    public boolean isUpperCase (char x){
        if (x >= 'A' && x <= 'Z')
            return true;
        else
            return false;
    }

    public boolean isDivisor (int a, int b){
        if (a%b==0)
            return true;
        if (b%a==0)
            return true;
        else
            return false;
    }

    public int lastNumSum(int a, int b){
        int x = a%10;
        int y = b%10;
        return x + y;
    }

    public double safeDiv (int x, int y){
        if (y == 0)
            return 0;
        else
            return x/y;
    }

    public String makeDecision (int x, int y){
        String str1 = ">";
        String str2 = "<";
        String str3 = "==";
        if (x>y)
            return str1;
        else if (x<y)
            return str2;
        else
            return str3;
    }

    public boolean sum3 (int x, int y, int z){
        if (x+y==z || x+z==y || y+z==x)
            return true;
        else
            return false;
    }

    public String age (int x){
        String str1 = "год";
        String str2 = "года";
        String str3 = "лет";
        if (x%10==1 && x%100!=11)
            return str1;
        else if ((x%10==2 || x%10==3 || x%10==4) && (x%100!=12 && x%100!=13 && x%100!=14))
            return str2;
        else
            return str3;
    }

    public void printDays (String x){
        switch (x.toLowerCase()){
            case "понедельник":
                System.out.println("понедельник\nвторник\nсреда\nчетверг\nпятница\nсуббота\nвоскресенье" ); break;
            case "вторник":
                System.out.println("вторник\nсреда\nчетверг\nпятница\nсуббота\nвоскресенье" ); break;
            case "среда":
                System.out.println("среда\nчетверг\nпятница\nсуббота\nвоскресенье" ); break;
            case "четверг":
                System.out.println("четверг\nпятница\nсуббота\nвоскресенье" ); break;
            case "пятница":
                System.out.println("пятница\nсуббота\nвоскресенье" ); break;
            case "суббота":
                System.out.println("суббота\nвоскресенье" ); break;
            case "воскресенье":
                System.out.println("воскресенье" ); break;
            default:
                System.out.println("Ошибка");
        }
    }

    public String reverseListNums (int x){
        String strNumber = " ";
        for (int i = x; i >= 0; i--) {
            strNumber += i + " ";
        }
        return strNumber ;
    }

    public int pow (int x, int y){
        int p=1;
        for (int i = 0; i<y; i++){
            p = x * p;
        }
        return p;
    }

    public boolean equalNum (int x){
        int last = x%10;
        while (x>0){
            int current = x% 10;
            if (last != current){
                return false;
            }
            x = x/10;
        }
        return true;
    }

    public void leftTriangle (int x){
        String str = "";
        for (int i = 0; i<x; i++){
            str += "*";
            System.out.println(str);
        }
    }

    public void guessGame(){
        Random random = new Random();
        int num = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int user = -1;
        int attempts = 0;
        while (user != num) {
            System.out.print("Введите число от 0 до 9: ");

            if (scanner.hasNextInt()) {
                user = scanner.nextInt();

                if (user >= 0 && user <= 9) {
                    attempts++;

                    if (user == num) {
                        System.out.println("Вы угадали!");
                        System.out.println("Вы отгадали число за " + attempts + (attempts == 1 ? " попытку" : " попыток"));
                    } else {
                        System.out.println("Вы не угадали, попробуйте снова.");
                    }
                } else {
                    System.out.println("Число должно быть от 0 до 9!");
                }
            } else {
                System.out.println("Нужно ввести число!");
                scanner.next();
            }
        }
        }


    public int findLast (int[] arr, int x){
        for (int i = arr.length-1; i >=0; i--){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public int[]add (int[] arr, int x, int pos){
        int[] newarr = new int[arr.length + 1];
        for (int i = 0; i<pos; i++){
            newarr[i]+=arr[i];
        }
        newarr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newarr[i + 1] = arr[i];
        }
        return newarr;
    }

    public void reverse (int[] arr){
        int[] newarr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newarr[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newarr[i];
        }
    }

    public int[] concat (int[] arr1,int[] arr2){
        int [] newarr = new int[arr1.length+arr2.length];
        for (int i =0; i<arr1.length; i++){
            newarr[i]=arr1[i];
        }
        for (int i =0; i<arr2.length; i++){
            newarr[arr1.length+i]=arr2[i];
        }
        return newarr;
    }

    public int[] deleteNegative (int[] arr){
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] >=0){
                count++;
            }
        }
        int[] newarr = new int[count];
        int index=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]>=0){
                newarr[index++]=arr[i];
            }
        }
        return newarr;
    }

}
