import java.io.IOException;

import java.net.URL;

import java.util.Scanner;
/**
 *
 * @author Xizi Yang
 *
 */
public class Lab3 {
    /**
     *
     * @param args asdfsd
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
    }


/**

 * Retrieve contents from a URL and return them as a string.

 *

 * @param url url to retrieve contents from

 * @return the contents from the url as a string, or an empty string on error

 */

public static String urlToString(final String url) {

    Scanner urlScanner;

    try {

        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");

    } catch (IOException e) {

        return "";

    }

    String contents = urlScanner.useDelimiter("\\A").next();

    urlScanner.close();

    return contents;

}


}
