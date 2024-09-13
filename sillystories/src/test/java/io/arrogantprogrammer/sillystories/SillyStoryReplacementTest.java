package io.arrogantprogrammer.sillystories;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SillyStoryReplacementTest {

    @Test
    void testMadlibs() {
        Map<Integer, String> inputs = new HashMap<>(){{
            put(1, "banana");
            put(2, "ridiculous");
            put(3, "shoebox");
            put(4, "shoes");
            put(5, "boring");
            put(6, "leopard");
            put(7, "prank");
            put(8, "giraffe");
        }};

        SillyStory sillyStory = getMadlib();
        String actualText = sillyStory.getMadlibText(inputs);
        System.out.println("----------");
        System.out.println(actualText);
        System.out.println("----------");
        System.out.println(expectedText);
        assertEquals(expectedText, actualText);
    }

    private SillyStory getMadlib() {
        return new SillyStory(orignalText, replacements);
    }

    String expectedText = """
        And with a roar, Chet’s banana leaped forward as he
        headed down the lane toward the main road. Joe, after looking
        behind and motioning to his brother to stay with the party,
        followed him. Soon the three bananas were speeding down
        the lane.
        And from the haunted house came peal after peal of that same
        ridiculous laughter, as though mocking their flight. Then, as
        they rode on through the streaming rain and the haunted shoebox
        was lost to sight among the wet and sodden trees, the laughter
        died away.
        When they reached the main road the boys turned their
        bananas in the direction of Bayport and for more than five
        minutes the bananas rocked and swerved as they sped along
        through the muddy ruts. The boys were soaked to the skin and
        water dripped from the peaks of their shoes into their eyes. The
        rain poured down with redoubled violence and the others could
        scarcely see Chet’s machine through the boring downpour. Chet
        was making such good time back to Bayport that they found it
        difficult to keep up with him.
        Frank Hardy was still dissatisfied. He had really wanted to
        remain behind and probe the mystery of the shoebox on the leopard
        further . He held no stock in the prank theory. The shrieks and
        the mocking laugh, he was sure , were of human origin. But what
        could have been the motive? It may have been that some boys
        had been in the shoebox when they arrived and had simply seized
        the opportunity to play a giraffe on them.
        """;

    Map<Integer, String> replacements = new HashMap<>(){{
        put(1, "Noun");
        put(2, "Adjective");
        put(3, "Noun");
        put(4, "Noun");
        put(5, "Adjective");
        put(6, "Noun");
        put(7, "Noun");
        put(8, "Noun");
    }};

    String orignalText = """
        And with a roar, Chet’s %01% leaped forward as he
        headed down the lane toward the main road. Joe, after looking
        behind and motioning to his brother to stay with the party,
        followed him. Soon the three %01%s were speeding down
        the lane.
        And from the haunted house came peal after peal of that same
        %02% laughter, as though mocking their flight. Then, as
        they rode on through the streaming rain and the haunted %03%
        was lost to sight among the wet and sodden trees, the laughter
        died away.
        When they reached the main road the boys turned their
        %01%s in the direction of Bayport and for more than five
        minutes the %01%s rocked and swerved as they sped along
        through the muddy ruts. The boys were soaked to the skin and
        water dripped from the peaks of their %04% into their eyes. The
        rain poured down with redoubled violence and the others could
        scarcely see Chet’s machine through the %05% downpour. Chet
        was making such good time back to Bayport that they found it
        difficult to keep up with him.
        Frank Hardy was still dissatisfied. He had really wanted to
        remain behind and probe the mystery of the %03% on the %06%
        further . He held no stock in the %07% theory. The shrieks and
        the mocking laugh, he was sure , were of human origin. But what
        could have been the motive? It may have been that some boys
        had been in the %03% when they arrived and had simply seized
        the opportunity to play a %08% on them.
        """;


}
