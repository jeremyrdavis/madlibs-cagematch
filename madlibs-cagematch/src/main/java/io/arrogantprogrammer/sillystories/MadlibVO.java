package io.arrogantprogrammer.sillystories;

import java.util.Map;

public record MadlibVO(String orignalText, Map<Integer, String> replacementMap) {
}
