package io.arrogantprogrammer.sillystories;

import java.util.ArrayList;
import java.util.List;

public class AdjectiveService {

    private List<String> adjectives = new ArrayList<>() {{
        add("attractive");
        add("bald");
        add("beautiful");
        add("chubby");
        add("clean");
        add("dazzling");
        add("drab");
        add("elegant");
        add("fancy");
        add("fit");
        add("flabby");
        add("glamorous");
        add("gorgeous");
        add("handsome");
        add("long");
        add("magnificent");
        add("muscular");
        add("plain");
        add("plump");
        add("quaint");
        add("scruffy");
        add("shapely");
        add("short");
        add("skinny");
        add("stocky");
        add("ugly");
        add("unkempt");
        add("unsightly");
    }};

    public String randomAdjective() {
        return adjectives.get((int) (Math.random() * adjectives.size()));
    }
}
