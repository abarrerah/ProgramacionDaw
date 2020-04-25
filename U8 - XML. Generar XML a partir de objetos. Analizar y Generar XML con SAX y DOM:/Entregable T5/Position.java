package EntregableT4;

import java.util.Objects;

public class Position {
    private String position;
    private String optionalPosition;

    public Position(String position) {
        this.position = position;
    }

    public Position(String position, String optionalPosition) {
        this.position = position;
        this.optionalPosition = optionalPosition;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOptionalPosition() {
        return optionalPosition;
    }

    public void setOptionalPosition(String optionalPosition) {
        this.optionalPosition = optionalPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return Objects.equals(getPosition(), position1.getPosition()) &&
                Objects.equals(getOptionalPosition(), position1.getOptionalPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPosition(), getOptionalPosition());
    }

    @Override
    public String toString() {
        return "Position{" +
                "position='" + position + '\'' +
                ", optionalPosition='" + optionalPosition + '\'' +
                '}';
    }
}
