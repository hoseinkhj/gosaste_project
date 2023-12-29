package exeercise.gosaste_project;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class gosasteMain {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = "بله";
        do {
            gosaste obj = new gosaste();
            int[][] array1 = obj.makeArray();
            int[][] array2 = obj.makeArray();
            System.out.println("حالت مورد نظر را وارد کنید: (اجتماع  /  اشتراک   / قرینه   )");
            String s = input.nextLine();
            switch (s){
                case "اجتماع":
                    obj.ejtema(array1,array2);
                    break;
                case "اشتراک" :
                    obj.eshterak(array1,array2);
                    break;
                case "قرینه":
                    System.out.println("قرینه آرایه 1 برابر است با:       ");
                    obj.gharine(array1);
                    System.out.println("===========================");
                    System.out.println("قرینه آرایه 2 برابر است با:       ");
                    obj.gharine(array2);
            }
            System.out.println("آیا میخواهید ادامه دهید؟  (بله    /   خیر  )");
            x = input.nextLine();
//            x = JOptionPane.showInputDialog("آیا میخواهید ادامه دهید؟ ");
            System.out.println(x);
        }while (!x.equals("خیر"));

    }
}
