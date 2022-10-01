package Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFileFromResources {

    String[] inputData = new String[128999];

    /*
    * Read the data from the text file and store it in an ArrayList of Strings
    */
    public String[] getInputStream() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("data.txt");
        if (inputStream == null) {
            throw new IllegalArgumentException("FILE_NAME" + " is not found in the resources");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        int i = 0;
        while (br.ready()) {
            inputData[i++] = br.readLine();
        }
        return inputData;
    }
}
