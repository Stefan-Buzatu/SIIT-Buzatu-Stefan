package SkiBiathlonStandings;

import java.util.concurrent.TimeUnit;

public class Athlete implements Comparable<Athlete> {
    private final int athleteNumber;
    private final String athleteName;
    private final String countryCode;
    private final String firstShootingRange;
    private final String secondShootingRange;
    private final String thirdShootingRange;
    private TimeResult skyTimeResult;
    private Place place;
    private int penalty;
    private TimeResult finalSkyTimeResult;


    public Athlete(int athleteNumber, String athleteName, String countryCode, TimeResult skyTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skyTimeResult = skyTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
        this.penalty = 0;
        this.finalSkyTimeResult = new TimeResult(0, 0);
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public int compareTo(Athlete o) {
        if (this.finalSkyTimeResult.getMinutes() == o.finalSkyTimeResult.getMinutes())
            return (this.finalSkyTimeResult.getSeconds() > o.finalSkyTimeResult.getSeconds()) ? 1 : -1;
        return (this.finalSkyTimeResult.getMinutes() > o.finalSkyTimeResult.getMinutes()) ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "athleteNumber=" + athleteNumber +
                ", athleteName='" + athleteName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skyTimeResult=" + skyTimeResult +
                ", firstShootingRange='" + firstShootingRange + '\'' +
                ", secondShootingRange='" + secondShootingRange + '\'' +
                ", thirdShootingRange='" + thirdShootingRange + '\'' +
                ", place=" + place +
                ", penalty=" + penalty +
                ", finalSkyTimeResult=" + finalSkyTimeResult +
                '}';
    }

    public void servePenalty() {
        for (int i = 0; i < firstShootingRange.length(); i++)
            if (firstShootingRange.charAt(i) == 'o')
                penalty += 10;
        for (int i = 0; i < secondShootingRange.length(); i++)
            if (secondShootingRange.charAt(i) == 'o')
                penalty += 10;
        for (int i = 0; i < thirdShootingRange.length(); i++)
            if (thirdShootingRange.charAt(i) == 'o')
                penalty += 10;


        finalSkyTimeResult.setMinutes(skyTimeResult.getMinutes() + ((int) TimeUnit.SECONDS.toMinutes(penalty + skyTimeResult.getSeconds())));
        finalSkyTimeResult.setSeconds((penalty + skyTimeResult.getSeconds()) - (60 * ((int) TimeUnit.SECONDS.toMinutes(penalty + skyTimeResult.getSeconds()))));

        if (finalSkyTimeResult.getSeconds() == 60)
            finalSkyTimeResult.setSeconds(0);
    }

    public TimeResult getFinalSkyTimeResult() {
        return finalSkyTimeResult;
    }

    public TimeResult getSkyTimeResult() {
        return skyTimeResult;
    }

    public void setSkyTimeResult(TimeResult skyTimeResult) {
        this.skyTimeResult = skyTimeResult;
    }
}
