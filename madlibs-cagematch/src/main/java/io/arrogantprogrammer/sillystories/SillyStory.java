package io.arrogantprogrammer.sillystories;

import java.util.Map;

public class SillyStory {

    String orignalText;
    Map<Integer, String> replacementMap;

    public SillyStory(String orignalText, Map<Integer, String> replacements) {
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
