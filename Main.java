package OnlineSurveySystem;

public class Main {

	    public static void main(String[] args) {
	        // Create a sample survey
	        Survey survey = new Survey("Customer Satisfaction Survey");

	        // Add questions to the survey
	        survey.addQuestion(new Question("How satisfied are you with our service?", QuestionType.RATING_SCALE));
	        survey.addQuestion(new Question("What is your favorite feature?", QuestionType.TEXT_INPUT));

	        // Create a sample user
	        User user = new User("admin", "password", UserRole.ADMIN);

	        // Display survey title
	        System.out.println("Survey Title: " + survey.getTitle());

	        // Display survey questions
	        System.out.println("Survey Questions:");
	        for (Question question : survey.getQuestions()) {
	            System.out.println("- " + question.getText());
	        }

	        // Display user information
	        System.out.println("User: " + user.getUsername() + ", Role: " + user.getRole());
	    }
	}


