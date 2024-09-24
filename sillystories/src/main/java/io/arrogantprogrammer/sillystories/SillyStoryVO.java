package io.arrogantprogrammer.sillystories;

import java.util.Map;

public record SillyStoryVO(String originalText, Map<Integer, Replacement> replacementMap) {
}
