/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ez Ammar
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, Integer> hashMap = new HashMap();
        File file = new File("./src/Q3/test.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String word = scanner.next();
            Integer i = hashMap.get(word);
            if (i == null) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, i + 1);
            }
            for (int j = 0; j < word.length(); j++) {
                Character chr = word.charAt(j);
                Integer i2 = hashMap.get(chr.toString());
                if (i2 == null) {
                    hashMap.put(chr.toString(), 1);
                } else {
                    hashMap.put(chr.toString(), i2 + 1);
                }
            }
        }
        System.out.println(hashMap);
    }
}
