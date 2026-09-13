package InCodeVision;

import java.util.HashMap;
import java.util.Scanner;

public class SimpleQuiz {

    static HashMap<Integer, String[]> questions = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    static void addquestions() {
        questions.put(1, new String[] {
                "Which keyword is used to create a class in Java?",
                "A.class",
                "B.new",
                "C.object",
                "D.create",
                "A"
        });

        questions.put(2, new String[] {
                "Which method is the starting point of a Java program?",
                "A.start()",
                "B.main()",
                "C.run()",
                "D.init()",
                "B"
        });

        questions.put(3, new String[] {
                "Which data type is used to store whole numbers?",
                "A.double",
                "B.float",
                "C.int",
                "D.String",
                "C"
        });

        questions.put(4, new String[] {
                "Which symbol is used to end a statement in Java?",
                "A. '.'",
                "B. ':'",
                "C. ';'",
                "D. ','",
                "C"
        });

        questions.put(5, new String[] {
                "Which keyword is used to create an object?",
                "A.this",
                "B.new",
                "C.class",
                "D.object",
                "B"
        });

        questions.put(6, new String[] {
                "Which of these is NOT a primitive data type?",
                "A.int",
                "B.char",
                "C.double",
                "D.String",
                "D"
        });

        questions.put(7, new String[] {
                "Which operator is used to compare two values?",
                "A. '='",
                "B. '=='",
                "C. '+='",
                "D. '!='",
                "B"
        });

        questions.put(8, new String[] {
                "Which loop executes at least once?",
                "A.for",
                "B.while",
                "C.do-while",
                "D.foreach",
                "C"
        });

        questions.put(9, new String[] {
                "Which collection stores key-value pairs?",
                "A.ArrayList",
                "B.HashSet",
                "C.HashMap",
                "D.Stack",
                "C"
        });

        questions.put(10, new String[] {
                "Which keyword is used for inheritance?",
                "A.implements",
                "B.extends",
                "C.inherits",
                "D.super",
                "B"
        });
    }

    static void test() {
        int count = 0;
        String[] q = questions.get(1);

        System.out.println(q[0]); // Question
        System.out.println(q[1]);
        System.out.println(q[2]);
        System.out.println(q[3]);
        System.out.println(q[4]);
        String correctAnswer = q[5];
        System.out.print("Enter your answer : ");
        sc.nextLine();
        String ans = sc.nextLine();
        String answer = ans.toUpperCase();
        if(answer.equals(correctAnswer)){
            count++;
        }
        String[] q2 = questions.get(2);

        System.out.println(q2[0]); // Question
        System.out.println(q2[1]);
        System.out.println(q2[2]);
        System.out.println(q2[3]);
        System.out.println(q2[4]);
        String correctAnswer2 = q2[5];
        System.out.print("Enter your answer : ");
        String ans2 = sc.nextLine();
        String answer2 = ans2.toUpperCase();
        if(answer2.equals(correctAnswer2)){
            count++;
        }
        String[] q3 = questions.get(3);

        System.out.println(q3[0]); // Question
        System.out.println(q3[1]);
        System.out.println(q3[2]);
        System.out.println(q3[3]);
        System.out.println(q3[4]);
        String correctAnswer3 = q3[5];
        System.out.print("Enter your answer : ");
        String ans3 = sc.nextLine();
        String answer3 = ans3.toUpperCase();
        if(answer3.equals(correctAnswer3)){
            count++;
        }
        String[] q4 = questions.get(4);

        System.out.println(q4[0]); // Question
        System.out.println(q4[1]);
        System.out.println(q4[2]);
        System.out.println(q4[3]);
        System.out.println(q4[4]);
        String correctAnswer4 = q4[5];
        System.out.print("Enter your answer : ");
        String ans4 = sc.nextLine();
        String answer4 = ans4.toUpperCase();
        if(answer4.equals(correctAnswer4)){
            count++;
        }
        String[] q5 = questions.get(5);

        System.out.println(q5[0]); // Question
        System.out.println(q5[1]);
        System.out.println(q5[2]);
        System.out.println(q5[3]);
        System.out.println(q5[4]);
        String correctAnswer5 = q5[5];
        System.out.print("Enter your answer : ");
        String ans5 = sc.nextLine();
        String answer5 = ans5.toUpperCase();
        if(answer5.equals(correctAnswer5)){
            count++;
        }
        String[] q6 = questions.get(6);

        System.out.println(q6[0]); // Question
        System.out.println(q6[1]);
        System.out.println(q6[2]);
        System.out.println(q6[3]);
        System.out.println(q6[4]);
        String correctAnswer6 = q6[5];
        System.out.print("Enter your answer : ");
        String ans6 = sc.nextLine();
        String answer6 = ans6.toUpperCase();
        if(answer6.equals(correctAnswer6)){
            count++;
        }
        String[] q7 = questions.get(7);

        System.out.println(q7[0]); // Question
        System.out.println(q7[1]);
        System.out.println(q7[2]);
        System.out.println(q7[3]);
        System.out.println(q7[4]);
        String correctAnswer7 = q7[5];
        System.out.print("Enter your answer : ");
        String ans7 = sc.nextLine();
        String answer7 = ans7.toUpperCase();
        if(answer7.equals(correctAnswer7)){
            count++;
        }
        String[] q8 = questions.get(8);

        System.out.println(q8[0]); // Question
        System.out.println(q8[1]);
        System.out.println(q8[2]);
        System.out.println(q8[3]);
        System.out.println(q8[4]);
        String correctAnswer8 = q8[5];
        System.out.print("Enter your answer : ");
        String ans8 = sc.nextLine();
        String answer8 = ans8.toUpperCase();
        if(answer8.equals(correctAnswer8)){
            count++;
        }
        String[] q9 = questions.get(9);

        System.out.println(q9[0]); // Question
        System.out.println(q9[1]);
        System.out.println(q9[2]);
        System.out.println(q9[3]);
        System.out.println(q9[4]);
        String correctAnswer9 = q9[5];
        System.out.print("Enter your answer : ");
        String ans9 = sc.nextLine();
        String answer9 = ans9.toUpperCase();
        if(answer9.equals(correctAnswer9)){
            count++;
        }
        String[] q10 = questions.get(10);

        System.out.println(q10[0]); // Question
        System.out.println(q10[1]);
        System.out.println(q10[2]);
        System.out.println(q10[3]);
        System.out.println(q10[4]);
        String correctAnswer10 = q10[5];
        System.out.print("Enter your answer : ");
        String ans10 = sc.nextLine();
        String answer10 = ans10.toUpperCase();
        if(answer10.equals(correctAnswer10)){
            count++;
        }

        System.out.println("==================================================================TEST HAVE BEEN SUCCESSFULLY COMPLETED ==================================================================");
        System.out.println("           YOU HAVE SCORED " + count + " OUT OF 10 MARKS");

    }

    static void start() {
        System.out.println("1.Start the Test");
        System.out.println("2.Exit the Test");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println(
                    "=============================================================================Welcome To Your Java Programming Test=============================================================================");
            test();
        } else if (choice == 2) {
            System.out.println(
                    "=============================================================================You have successfully exited the  Java Programming Test=============================================================================");
        } else {
            System.out.println(
                    "=============================================================================you have entered a wrong choice=============================================================================");
        }

    }

    static void main() {
        addquestions();
        start();
    }

}
