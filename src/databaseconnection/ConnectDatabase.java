package databaseconnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectDatabase {

    // Secret.properties file
    // jdbc driver
    // jdbc url
    // config jdbc
    // mySql Query

    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;
    public static String filePath = "C:\\Users\\ExTraxex\\IdeaProjects\\LearnJava_WeekendAfternoon_Selenium_NY_Fall2020_IntelliJ\\ExtLibrary\\Properties\\Secret.properties";


    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        //ConnectDatabase.connectToSQLDatabase();
        // ConnectDatabase.readDatabase("movie", "title");
        //ConnectDatabase.insertDataFromStringToSQLTable("FastAndFu", "movie", "title");
        // int[] numbers = {23, 24, 25, 26, 27, 28, 29, 30, 31};
        //ConnectDatabase.insertDataFromArrayToSqlTable(numbers, "productDetails", "productId");

        List<String> stNames=new ArrayList<>();
        stNames.add("Negash");
        stNames.add("Lyes");
        stNames.add("Zahra");
        stNames.add("Mamunur Khan");
        stNames.add("Parisa");
        //ConnectDatabase.insertDataFromArrayListToSqlTable(stNames,"students","studentName");

        ConnectDatabase.readUserProfileFromSqlTable("movie");

    }


    // Load Properties
    public static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }

    // Database Connection
    public static Connection connectToSQLDatabase() throws IOException, ClassNotFoundException, SQLException {
        Properties prop = ConnectDatabase.loadProperties(filePath);
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String user = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
        System.out.println("Database is Connected successfully");
        return connection;
    }

    public static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<>();

        while (resultSet.next()) {
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    public static List<String> readDatabase(String tableName, String columnName) {
        List<String> data = new ArrayList<>();
        try {
            ConnectDatabase.connectToSQLDatabase();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = ConnectDatabase.getResultSetData(resultSet, columnName);
            for (String dt : data) {
                System.out.println(dt + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ConnectDatabase.close();
        }
        return data;
    }
    public static void insertProfileToSqlTable(String tableName, String columnName1, String columnName2, String name, int num) {
        try {
            connectToSQLDatabase();
            preparedStatement = connection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName1 + "," + columnName2 + " ) VALUES(?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, num);
            preparedStatement.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataFromStringToSQLTable(String data, String tableName, String columnName) {
        try {
            connectToSQLDatabase();
            preparedStatement = connection.prepareStatement("Insert into " + tableName + " (" + columnName + ") values(?)");
            preparedStatement.setString(1, data);
            preparedStatement.executeUpdate();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (SQLException sq) {
            sq.printStackTrace();
        } catch (ClassNotFoundException cf) {
            cf.printStackTrace();
        }
    }

    public static void insertDataFromArrayToSqlTable(int[] arrayData, String tableName, String columnName) {
        try {
            connectToSQLDatabase();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("CREATE TABLE `" + tableName + "`(`ID` int (11) not null AUTO_INCREMENT,`" + columnName + "` bigint(20) DEFAULT NULL, PRIMARY KEY (`ID`));");
            preparedStatement.executeUpdate();

            for (int i = 0; i < arrayData.length; i++) {
                // Insert into tableName (columnName) values();
                preparedStatement = connection.prepareStatement("INSERT  INTO " + tableName + " (" + columnName + ") values (?)");
                preparedStatement.setInt(1, arrayData[i]);
                preparedStatement.executeUpdate();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void insertDataFromArrayListToSqlTable(List<String> list,String tableName, String columnName){
        try {
            connectToSQLDatabase();
            preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("CREATE TABLE `" + tableName + "`(`ID` int (11) not null AUTO_INCREMENT,`" + columnName + "` varchar (200) DEFAULT NULL, PRIMARY KEY (`ID`));");
            preparedStatement.executeUpdate();
            for (String st: list){
                preparedStatement = connection.prepareStatement("INSERT  INTO " + tableName + " (" + columnName + ") values (?)");
                preparedStatement.setObject(1,st);
                preparedStatement.executeUpdate();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static List<Movie> readUserProfileFromSqlTable(String tableName){
        List<Movie> list= new ArrayList<>();
        Movie movie= null;
        try {
            Connection con= connectToSQLDatabase();
            String query="Select * from "+tableName+"";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                int id= rs.getInt("id");
                String title= rs.getString("title");
                int releaseYear= rs.getInt("releaseYear");
                String genre= rs.getString("genre");
                String rating= rs.getString("mpaRating");
                String producer= rs.getString("producer");
                System.out.format("%s,%s,%s,%s,%s,%s\n",id,title,releaseYear,genre,rating,producer);
                movie=new Movie(id,title,releaseYear,genre,rating,producer);
                list.add(movie);
            }
            st.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }




}