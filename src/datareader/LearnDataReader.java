package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnDataReader {

    // Path/ Location
    // Absolute Path: Full Path
    // D:\SOFTWARE ENGINEERING\PROJECTS\IdeaProjects\PNT\LearnJava_WeekendAfternoon_Selenium_NY_Fall2020\DataTest\Sample.txt
    // Relative Path/ Partial path
    // DataTest\Sample.txt


    public static void main(String[] args) throws IOException {
        LearnDataReader.readData();

    }

    public static void readData(){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        String filePath = "../LearnJava_WeekendAfternoon_Selenium_NY_Fall2020/DataTest/Sample.txt";
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e){
                System.out.println("File already closed");
            }
        }
    }


}