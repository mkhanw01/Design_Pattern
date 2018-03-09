package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;

/**
 * Created by khan on 2/12/17.
 */
public class CountAverage {
    public static void main(String[] arg) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String string=null;
        String tempString=null;
        int word=0;
        int totalSpaceAndWord=0;
        int totalLength=0;
        float averageResult=0f;
        string=bufferedReader.readLine();
        bufferedReader=(new BufferedReader(new FileReader(string)));
        while ((string=bufferedReader.readLine())!=null){
            tempString=string;
            totalSpaceAndWord=string.length();
            totalLength =string.replaceAll(" .","").length();
            if((tempString.charAt(totalLength-1))=='.'){
                word=(totalSpaceAndWord-totalLength);
            }
            else
                word=(totalSpaceAndWord-totalLength)+1;
            averageResult+=(float)(totalLength/word);
        }
        //averageResult=(int)averageResult;
        System.out.println(averageResult);
    }
}
