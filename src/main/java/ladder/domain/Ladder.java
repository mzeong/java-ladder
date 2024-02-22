package ladder.domain;

import ladder.util.BooleanListGenerator;
import ladder.util.RandomBooleanListGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ladder {

    private final List<Line> lines = new ArrayList<>();

    public Ladder(People people, Height height) {
        BooleanListGenerator booleanListGenerator = new RandomBooleanListGenerator();

        while (!height.isSame(lines.size())) {
            Line line = new Line(people.count(), booleanListGenerator);
            lines.add(line);
        }
    }

    public List<Line> getLadder() {
        return Collections.unmodifiableList(lines);
    }
}
