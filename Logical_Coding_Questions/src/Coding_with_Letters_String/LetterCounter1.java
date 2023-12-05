package Coding_with_Letters_String;

public class LetterCounter1 {
    public static void main(String[] args) {
        String s = "Java | J2Ee | MySQL | RDBMS | Spring Boot | Hibernate/JPA | API | Restful API | Spring Security | JWT | Validation | Microservices | API Integration | Servlet/JSP | Agile | Angular | TypeScript | NodeJS | AWS"; //or we can write here "new String("aabaaabaz");" after =.
        int count = 0;
        int index = s.indexOf('a');//The indexOf method returns the index of the first occurrence of 
        		//the specified character in the string.
        
        while (index != -1) {
            count++;
            index = s.indexOf('a', index + 1);
        }

        System.out.println("Number of 'a' letters: " + count);
    }
}