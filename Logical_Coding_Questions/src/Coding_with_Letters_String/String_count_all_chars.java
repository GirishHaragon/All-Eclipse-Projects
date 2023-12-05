package Coding_with_Letters_String;

public class String_count_all_chars {
	public static void main(String[] args) {
        String inputString = "Java | J2Ee | MySQL | RDBMS | Spring Boot | Hibernate/JPA | Restful APIs | Spring Security | JWT | Validation | Microservices | API Integration | Servlet/JSP | Agile | Angular | TS | NodeJS | AWS";
        int characterCount = countCharacters(inputString);
        System.out.println("Character count: " + characterCount);
    }

    public static int countCharacters(String input) {
        // Remove white spaces if needed
//        input = input.replaceAll("\\s+", "");

        // Count the characters
        return input.length();
    }
}
