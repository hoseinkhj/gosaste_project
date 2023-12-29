package exeercise.gosaste_project;//package exeercise.gosaste_project;
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//import java.util.Scanner;
//
//    public class GosasteMainGUI extends Application {
//        private Scanner input = new Scanner(System.in);
//        private Gosaste obj = new Gosaste();
//
//        public static void main(String[] args) {
//            launch(args);
//        }
//
//        @Override
//        public void start(Stage primaryStage) {
//            primaryStage.setTitle("برنامه گسسته");
//
//            GridPane grid = new GridPane();
//            grid.setPadding(new Insets(10, 10, 10, 10));
//            grid.setVgap(8);
//            grid.setHgap(10);
//
//            Label label = new Label("حالت مورد نظر را وارد کنید:");
//            GridPane.setConstraints(label, 0, 0);
//
//            TextField inputField = new TextField();
//            inputField.setPromptText("مثال: اجتماع");
//            GridPane.setConstraints(inputField, 1, 0);
//
//            Button submitButton = new Button("تأیید");
//            GridPane.setConstraints(submitButton, 1, 1);
//
//            grid.getChildren().addAll(label, inputField, submitButton);
//
//            Scene scene = new Scene(grid, 300, 200);
//            primaryStage.setScene(scene);
//
//            submitButton.setOnAction(e -> handleButtonClick(inputField.getText()));
//
//            primaryStage.show();
//        }
//
//        private void handleButtonClick(String choice) {
//            int[][] array1 = obj.makeArray();
//            int[][] array2 = obj.makeArray();
//
//            switch (choice) {
//                case "اجتماع":
//                    obj.ejtema(array1, array2);
//                    break;
//                case "اشتراک":
//                    obj.eshterak(array1, array2);
//                    break;
//                case "قرینه":
//                    System.out.println("قرینه آرایه 1 برابر است با:       ");
//                    obj.gharine(array1);
//                    System.out.println("===========================");
//                    System.out.println("قرینه آرایه 2 برابر است با:       ");
//                    obj.gharine(array2);
//                    break;
//            }
//
//            System.out.println("آیا میخواهید ادامه دهید؟    ");
//            String x = input.nextLine();
//            if (x.equals("خیر")) {
//                System.exit(0);
//            }
//        }
//    }
//
//}

import javax.swing.JOptionPane;

public class MessageBoxExample {
    public static void main(String[] args) {
        // نمایش پنجره پیام با یک دکمه "تأیید"
        JOptionPane.showMessageDialog(null, "پیام خوش آمدگویی!", "عنوان پیام", JOptionPane.INFORMATION_MESSAGE);

        // نمایش پنجره پیام با دکمه‌های "تأیید" و "لغو"
        int result = JOptionPane.showConfirmDialog(null, "آیا مطمئن هستید؟", "تأیید", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("شما دکمه تأیید را زدید.");
        } else {
            System.out.println("شما دکمه لغو را زدید یا پنجره را بستیدید.");
        }

        // نمایش پنجره با محتویات ورودی
        String input = JOptionPane.showInputDialog("لطفاً یک مقدار وارد کنید:");
        System.out.println("ورودی شما: " + input);



//        String input2 = JOptionPane.show("لطفاً یک مقدار وارد کنید:");
    }
}

