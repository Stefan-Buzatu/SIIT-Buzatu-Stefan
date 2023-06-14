package SkiBiathlonStandings;

import java.util.Objects;

public class TimeResult {
    private int minutes;
    private int seconds;

    public TimeResult(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "TimeResult{" +
                "minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimeResult that)) return false;
        return getMinutes() == that.getMinutes() && getSeconds() == that.getSeconds();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMinutes(), getSeconds());
    }
}
