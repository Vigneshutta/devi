import java.util.*;
import java.io.*;
import java.lang.*;
public class Spacial
{
public static void main(String[] args) throws IOException
{
String yourString = "hi@123)$!#%^&*(";
    List specialCharacters = new ArrayList();
    specialCharacters.add('@');
    specialCharacters.add('#');
    specialCharacters.add('$');
    specialCharacters.add(')');
    specialCharacters.add('!');
    specialCharacters.add('%');
    specialCharacters.add('^');
    specialCharacters.add('&');
    specialCharacters.add('*');
    specialCharacters.add('(');
    int count = 0;
    for (int i = 0; i < yourString.length(); i++) {
       for (int j=0; j < specialCharacters.size(); j++) {
             if ( yourString.charAt(i) == ((Character) specialCharacters.get(j)).charValue()) {
                count++;
          }
       }
    }
    System.out.println(count);
    }
    }
