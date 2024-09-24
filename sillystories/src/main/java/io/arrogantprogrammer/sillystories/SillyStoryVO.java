package io.arrogantprogrammer.sillystories;

import java.util.List;

public record SillyStoryVO(Long id, List<ReplacementNeeded> replacementsNeeded) {
}
