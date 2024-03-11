package OnlineSurveySystem;
import java.util.ArrayList;
import java.util.List;
public class Survey {

	// Survey class representing a survey
	
	    private String title;
	    private List<Question> questions;

	    public Survey(String title) {
	        this.title = title;
	        this.questions = new ArrayList<>();
	    }

	    // Getters and setters
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public List<Question> getQuestions() {
	        return questions;
	    }

	    public void setQuestions(List<Question> questions) {
	        this.questions = questions;
	    }

	    // Method to add a question to the survey
	    public void addQuestion(Question question) {
	        questions.add(question);
	    }
	}
//Question class representing a survey question
class Question {
 private String text;
 private QuestionType type;

 public Question(String text, QuestionType type) {
     this.text = text;
     this.type = type;
 }

 // Getters and setters
 public String getText() {
     return text;
 }

 public void setText(String text) {
     this.text = text;
 }

 public QuestionType getType() {
     return type;
 }

 public void setType(QuestionType type) {
     this.type = type;
 }
}

//Enum representing question types
enum QuestionType {
 MULTIPLE_CHOICE,
 TEXT_INPUT,
 RATING_SCALE
}


