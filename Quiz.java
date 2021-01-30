import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    Scanner sc1 = new Scanner(System.in);

    private ArrayList<Question>  Quiz_1 = new ArrayList<Question>();

    public void add_question(){

        System.out.println("What is the question Text? ");
        String q1 = sc1.nextLine();

        System.out.println("What is the answer? ");
        String a1 = sc1.nextLine();

        System.out.println("How Difficult (1-3)? ");
        int d1 = sc1.nextInt();
        sc1.nextLine();

        Question ading_ques = new Question(q1,a1,d1);
        Quiz_1.add(ading_ques);
    }

    public void remove_question(){
        System.out.println("Choose the question to remove? ");
        for (int i=0;i<Quiz_1.size();i++){
            System.out.println(i+"."+Quiz_1.get(i).getQuestiontxt());
            }
        int removeChoice = sc1.nextInt();
        sc1.nextLine();
        Quiz_1.remove(removeChoice);
        }

    public void modify_question(){
        System.out.println("Choose the question to modify? ");
        for (int i=0;i<Quiz_1.size();i++){
            System.out.println(i+"."+Quiz_1.get(i).getQuestiontxt());
        }
        int index = sc1.nextInt();
        sc1.nextLine();
        System.out.println("What is the question Text? ");
        String q2 = sc1.nextLine();

        System.out.println("What is the answer? ");
        String a2 = sc1.nextLine();

        System.out.println("How Difficult (1-3)? ");
        int d2 = sc1.nextInt();
        sc1.nextLine();
        Quiz_1.set(index,new Question(q2,a2,d2));
    }

    public void give_quiz(){
        int countr = 0;
        for (int i=0;i< Quiz_1.size();i++){
            System.out.println(Quiz_1.get(i).getQuestiontxt());
            String answer = sc1.nextLine();
            if (answer.equals(Quiz_1.get(i).getQuestionanswer())){
                System.out.println("Correct");
                countr++;
            }
            else{
                System.out.println("Incorrect");


            }
        }
        System.out.println("you got "+countr+" out of "+Quiz_1.size());
    }






}



