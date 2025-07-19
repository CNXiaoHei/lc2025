package org.example.lc;

import java.util.HashSet;
import java.util.List;

public class Lc1233 {
    public static void main(String[] args) {
        String[] a = {"/a/b/c","/a/b/ca","/a/b/d"};
        List<String> aa = removeSubfolders(a);
        System.out.println(aa);
    }

    public static List<String> removeSubfolders(String[] folder) {
        HashSet<String> set = new HashSet<>(List.of(folder));
        for (String f : folder) {
            if (f.lastIndexOf("/") == 0) {
                continue;
            }
            int index = -1;
            String tempStr = f;
            while (index != 0) {
                index = tempStr.lastIndexOf("/");
                tempStr = tempStr.substring(0, index);
                if (set.contains(tempStr)) {
                    set.remove(f);
                    break;
                }
            }

        }
        return set.stream().toList();
    }
}
