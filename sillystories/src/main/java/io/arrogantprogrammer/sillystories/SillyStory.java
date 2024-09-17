package io.arrogantprogrammer.sillystories;

import java.util.Map;

public class SillyStory {

    String originalText;
    Map<Integer, String> replacementMap;

    public SillyStory(String originalText, Map<Integer, String> replacements) {
        this.originalText = originalText;
        this.replacementMap = replacements;
    }

    public String getOriginalText(Map<Integer, String> replacementValues) {
        String madlibText = originalText;
        for (Map.Entry<Integer, String> entry : replacementValues.entrySet()) {
            String marker = "%0" + entry.getKey() + "%";
            System.out.println("Replacing " + marker + " with " + entry.getValue());
            madlibText = madlibText.replace(marker, entry.getValue());
        }
        return madlibText;
    }
}
