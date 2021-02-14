package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectDatabaseDirectly {

    public static void main(String[] args) throws SQLException {
        //Direct approach to connect with Database/DB
        //JDBC Connection
        //URL Syntax
        //https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html
        //rotocol//[hosts][/database][?properties]

        String url = "jdbc:mysql://localhost:3306/wea_selenium_ny_fall2021?serverTimezone=UTC";
        String user = "root";
        String password = "root1234";

        Connection connection = null;
        Statement statement = null;

        Movie titanic = new Movie(1, "Titanic", 1997, "Romance", "PG-15", "Jon Landau");
        Movie trumanShow = new Movie(2, "Truman Show", 1998, "Comedy", "PG-12", "Rudin");
        Movie lionKing = new Movie(3, "Lion King", 1994, "Family", "PG-11", "Fayreau");
        Movie littleThings = new Movie(4, "Little Things", 2021, "Crime", "PG-4", "John Lee");
        Movie shrek = new Movie(5, "Shrek", 2001, "Adventure", "PG-2", "John Willams");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(titanic);
        movies.add(trumanShow);
        movies.add(lionKing);
        movies.add(littleThings);
        movies.add(shrek);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            for (Movie mv : movies) {
                String query = "insert into movie (id,title,releaseYear,genre,mpaRating,Producer)"
                        + "values(" + mv.getId() + ",'" + mv.getTitle() + "'," + mv.getReleaseYear() + ",'" + mv.getGenre() + "','" + mv.getMpaRating() + "','" + mv.getProducer() + "')";

                statement.execute(query);
            }


//            String query = "Select * from students";
//            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        statement.close();
        connection.close();
        }
    }
}

