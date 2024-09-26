package io.arrogantprogrammer.sillystories;

import java.util.List;

public class SillyStory {

    Long id;
    String originalText;
    String updatedText;
    List<ReplacementWordType> replacementWordTypes;

    SillyStory(Long id, String originalText, List<ReplacementWordType> replacementWordTypes) {
        this.id = id;
        this.originalText = originalText;
        this.replacementWordTypes = replacementWordTypes;
    }

    public String getUpdatedStory() {
        return updatedText;
    }

    void build(List<ReplacementWord> replacementWords) {
        replacementWords.forEach(replacementWord -> updatedText = originalText.replace("%0" + replacementWord.position() + "%", replacementWord.word()));
    }
}
