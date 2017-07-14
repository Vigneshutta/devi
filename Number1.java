 import java.util.*;
import java.io.*;
import java.lang.*;
public class Number1
{
public static void main(String[] args) throws IOException
{
 String s = "2485083572085748";
    int counter = 0;
    for(char c : s.toCharArray()) {
        if( c >= '0' && c<= '9') {
            ++counter;
        }
    }
    System.out.println(counter);
    }
    }
    
