package exeercise.gosaste_project;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class gosaste {
    Scanner input = new Scanner(System.in);
    int len;
//    =================make array
    public int[][] makeArray(){
//        System.out.println("مقادیر را وارد کنید:    ");
        int[][] array = new int[len][len];
        int c = 1;
        for (int i = 0 ; i<len;i++){
            for (int j = 0 ; j<len;j++){
                System.out.printf("مقدار %d را وارد کنید:   ",c);
                array[i][j]=input.nextInt();
//                array[i][j]= Integer.parseInt(JOptionPane.showInputDialog("مقدار  را وارد کنید:   "));
                c++;
            }
        }
        System.out.println("=======================");
        return array;
    }
//    =========================ejtema function
    public void ejtema(int[][]array1,int[][]array2) {
        int[][] array3 = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (array1[i][j] == 1 | array2[i][j] == 1) {
                    array3[i][j] = 1;
                } else {
                    array3[i][j] = 0;
                }
            }
        }
        System.out.println("اجتماع آرایه 1 و آرایه 2 را وارد کنید:    ");
//        System.out.println(Arrays.deepToString(array3));
        showArray(array3);
        System.out.println("=======================");
    }
//    ====================eshterak function
    public void eshterak(int[][]array1,int[][]array2) {
        int[][] array3 = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (array1[i][j] == 1 && array2[i][j] == 1) {
                    array3[i][j] = 1;
                } else {
                    array3[i][j] = 0;
                }
            }
        }
        System.out.println("اشتراک آرایه 1 و آرایه 2 را وارد کنید:     ");
//        System.out.println(Arrays.deepToString(array3));
        showArray(array3);
        System.out.println("=======================");
    }
//==========================gharine
    public void gharine(int[][] array) {
        int[][] array3 = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (array[i][j] == 0) {
                    array3[i][j] = 1;
                } else {
                    array3[i][j] = 0;
                }
            }

        }
        System.out.println("قرینه آرایه مورد نظر برابر است با :      ");
//        System.out.println(Arrays.deepToString(array3));
        showArray(array3);
        System.out.println("=======================");
    }
//    =======================constractor
    public gosaste() {
        System.out.println("تعداد سطر و ستون را وارد کنید:       ");
        this.len = input.nextInt();
        System.out.println("=======================");
    }
//    ==================================show array
    public void showArray(int[][] Array){
        for (int i = 0;i<Array.length;i++){
            System.out.println(Arrays.toString(Array[i]));
        }
    }
}
