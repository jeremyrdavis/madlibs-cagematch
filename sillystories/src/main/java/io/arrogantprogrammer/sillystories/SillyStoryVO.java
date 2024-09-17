package io.arrogantprogrammer.sillystories;

import java.util.Map;

public record SillyStoryVO(String originalText, Map<Integer, String> replacementMap) {
}
