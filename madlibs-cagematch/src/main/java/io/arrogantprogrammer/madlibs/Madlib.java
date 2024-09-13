package io.arrogantprogrammer.madlibs;

import java.util.Map;

public class Madlib {

    String orignalText;
    Map<Integer, Replacement> replacementMap;

    public Madlib(String orignalText, Map<Integer, Replacement> replacements) {
        this.orignalText = orignalText;
        this.replacementMap = replacements;
    }

    public String getMadlibText(Map<Integer, String> replacementValues) {
        String madlibText = orignalText;
        for (Map.Entry<Integer, String> entry : replacementValues.entrySet()) {
            String marker = "%0" + entry.getKey() + "%";
            System.out.println("Replacing " + marker + " with " + entry.getValue());
            madlibText = madlibText.replace(marker, entry.getValue());
        }
        return madlibText;
    }
}
