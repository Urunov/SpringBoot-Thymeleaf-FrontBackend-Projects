  # SpringBoot-Thymeleaf-Projects
  

![spring_boott](https://user-images.githubusercontent.com/11626327/84758528-88cf5880-b000-11ea-9585-20cacad8bc97.png)
  --------------------------------------------
   ## Project1- SpringBoot-Thymeleaf-Book-Project-Mapping-NoDB
  
   * We'll start by showing how to display elements of a List in a Thymeleaf page and
how to bind a list of objects as user's inputs in a Thymeleaf form.
   * Here, we've added List of Book objects as a model attribute sent to the view, where we'll display it using an HTML table:
               <table>
                <thead>
                    <tr>
                        <th> Title </th>
                        <th> Author </th>
                    </tr>
                </thead>
                <tbody>
                <tr th:if="${books.empty}">
                        <td colspan="2"> No Books Available </td>
                    </tr>
                    <tr th:each="book : ${books}">
                        <td><span th:text="${book.title}"> Title </span></td>
                        <td><span th:text="${book.author}"> Author </span></td>
                    </tr>
                </tbody>
            </table>
     
     ![AddBook](https://user-images.githubusercontent.com/11626327/84759059-33e01200-b001-11ea-81a2-3bfe4ad81b3c.JPG)

#

## Project2-SpringBoot-Thymeleaf-Hibernate-Planet-Project

   * Working with Enums in Thymeleaf
   * Planet Project 
   Let's start by adding the Spring Boot starter for Thymeleaf to our pom.xml file:
 
      <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-thymeleaf</artifactId>
         <versionId>RELEASE</versionId>
      </dependency>
* We're going to be working with widgets that have a few choices of color, so let's define our Color enum:

       public enum Solor {
         MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
       }
* Now, let's create our Widget class:

       public class Planet {
         private String name;
         private Solar solar;
 
        // Standard getters/setters
       }




Reference Materials
1. https://www.baeldung.com/thymeleaf-list      
2. https://frontbackend.com/thymeleaf/thymeleaf-tutorial   
 
