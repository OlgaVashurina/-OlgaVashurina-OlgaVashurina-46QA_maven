package demoqa.utils;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    public Iterator<Object[]> addNewUserFormFromCSVFile() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/user.csv"));
        String line = reader.readLine();
        while (line != null) {
            list.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }

}