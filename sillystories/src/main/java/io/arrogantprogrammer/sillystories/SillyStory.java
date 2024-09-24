package io.arrogantprogrammer.sillystories;

import java.util.List;

public class SillyStory {

    Long id;
    String originalText;
    String updatedText;
    List<ReplacementNeeded> replacementNeeds;

    SillyStory(Long id, String originalText, List<ReplacementNeeded> replacementNeeds) {
        this.id = id;
        this.originalText = originalText;
        this.replacementNeeds = replacementNeeds;
    }

    public String getUpdatedStory() {
        return updatedText;
    }

    void build(List<ReplacementWord> replacementWords) {
        replacementWords.forEach(replacementWord -> updatedText = originalText.replace("%0" + replacementWord.position() + "%", replacementWord.word()));
    }
}
