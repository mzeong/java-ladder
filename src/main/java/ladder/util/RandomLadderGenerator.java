package ladder.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import ladder.domain.Direction;
import ladder.domain.Line;

public class RandomLadderGenerator {

    private final Random random = new Random();

    public List<Line> generate(int width, int height) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            Line line = generateLine(width);
            lines.add(line);
        }
        return lines;
    }

    private Line generateLine(int size) {
        List<Direction> directions = generateDirections(size);
        adjustMiddleDirectionsIfAllDown(directions);
        return new Line(size, directions);
    }

    private List<Direction> generateDirections(int size) {
        List<Direction> directions = new ArrayList<>() {{
            add(randomStartDirection());
        }};
        for (int i = 1; i < size - 1; i++) {
            Direction previous = directions.get(i - 1);
            directions.add(randomMiddleDirection(previous));
        }
        Direction previous = directions.get(size - 2);
        directions.add(generateEndDirection(previous));
        return directions;
    }

    private Direction randomStartDirection() {
        return randomDirection();
    }

    private Direction randomMiddleDirection(Direction previous) {
        if (previous.isRight()) {
            return Direction.LEFT;
        }
        return randomDirection();
    }

    private Direction randomDirection() {
        Direction[] directions = {Direction.RIGHT, Direction.DOWN};
        return directions[random.nextInt(directions.length)];
    }

    private Direction generateEndDirection(Direction previous) {
        if (previous.isRight()) {
            return Direction.LEFT;
        }
        return Direction.DOWN;
    }

    private void adjustMiddleDirectionsIfAllDown(List<Direction> directions) {
        boolean allDown = directions.stream().allMatch(Direction::isDown);
        if (allDown) {
            adjustMiddleDirections(directions);
        }
    }

    private void adjustMiddleDirections(List<Direction> directions) {
        int index = randomMiddleIndex(directions.size());
        directions.set(index, Direction.RIGHT);
        directions.set(index + 1, Direction.LEFT);
    }

    private int randomMiddleIndex(int size) {
        return random.nextInt(size - 2) + 1;
    }
}
