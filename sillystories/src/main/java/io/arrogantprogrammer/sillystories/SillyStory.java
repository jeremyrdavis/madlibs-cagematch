package io.arrogantprogrammer.sillystories;

import java.util.Map;
import java.util.stream.Collectors;

public class SillyStory {

    Long id;
    String originalText;
    Map<Integer, Replacement> replacementMap;

    public SillyStory(Long id, String originalText, Map<Integer, Replacement> replacements) {
        this.id = id;
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

    Integer getNumberOfNouns() {
        return replacementMap.entrySet().stream()
            .filter(entry -> entry.getValue().equals(Replacement.NOUN))
            .collect(Collectors.toList()).size();
    }

    Integer getNumberOfAdjectives() {
        return replacementMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(Replacement.ADJECTIVE))
                .collect(Collectors.toList()).size();
    }

    Integer getNumberOfAdverbs() {
        return replacementMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(Replacement.ADVERB))
                .collect(Collectors.toList()).size();
    }

    Integer getNumberOfVerbs() {
        return replacementMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(Replacement.VERB))
                .collect(Collectors.toList()).size();
    }

}
