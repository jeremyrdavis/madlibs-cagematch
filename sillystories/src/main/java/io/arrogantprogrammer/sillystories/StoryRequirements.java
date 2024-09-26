package io.arrogantprogrammer.sillystories;

import java.util.List;

public record StoryRequirements(Long storyId, List<ReplacementWordType> replacementWords) {
}
