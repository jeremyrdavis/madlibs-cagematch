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

    Integer getNumberOfNouns() {
        return getNumberOfType(WordType.NOUN);
    }

    Integer getNumberOfAdjectives() {
        return getNumberOfType(WordType.ADJECTIVE);
    }

    Integer getNumberOfAdverbs() {
        return getNumberOfType(WordType.ADVERB);
    }

    Integer getNumberOfVerbs() {
        return getNumberOfType(WordType.VERB);
    }

    private Integer getNumberOfType(WordType wordType) {
        return replacementNeeds.stream()
                .filter(needed -> needed.wordType().equals(wordType))
                .toList().size();
    }

    void build(List<ReplacementWord> replacementWords) {
        replacementWords.forEach(replacementWord -> {
            updatedText = originalText.replace("%0" + replacementWord.position() + "%", replacementWord.word());
        });
    }
}
