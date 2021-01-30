public class Question {

    private String questiontxt;
    private String questionanswer;
    private int difficulty;

    public Question(){
        questiontxt = "";
        questionanswer = "";
        difficulty = 0;
    }

    public Question(String questiontxt,String questionanswer,int difficulty){
        this.questiontxt = questiontxt;
        this.questionanswer =questionanswer;
        this.difficulty = difficulty;
    }

    public String getQuestiontxt(){
        return this.questiontxt;
    }
    public String getQuestionanswer(){
        return this.questionanswer;
    }
    public int getDifficulty(){
        return this.difficulty;
    }

    public void setQuestiontxt(String questio3n1){

        questio3n1 = questiontxt;
    }




}
