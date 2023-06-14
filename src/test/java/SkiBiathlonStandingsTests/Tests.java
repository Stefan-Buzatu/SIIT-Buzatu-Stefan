package SkiBiathlonStandingsTests;

import SkiBiathlonStandings.Athlete;
import SkiBiathlonStandings.Place;
import SkiBiathlonStandings.TimeResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Tests {

    public void initialize(List<Athlete> athleteList, List<Athlete> athleteListTest) {

        TimeResult[] timeResults = new TimeResult[3];
        timeResults[0] = new TimeResult(12, 15);
        timeResults[1] = new TimeResult(13, 00);
        timeResults[2] = new TimeResult(14, 53);
        athleteList.add(new Athlete(1, "John", "US", timeResults[0], "xxoox", "oooox", "xxxoo"));//12:15,penalty=80s=>13:35
        athleteList.add(new Athlete(2, "Alex", "US", timeResults[1], "xxxxx", "xxxxx", "xxxxx"));//13:00
        athleteList.add(new Athlete(3, "Maria", "US", timeResults[2], "xxxox", "xxoxx", "xxxoo"));//14:53,penalty=40s=>15:33


        for (Athlete athlete : athleteList) {
            athlete.servePenalty();
        }


        Collections.sort(athleteList);

        athleteList.get(0).setPlace(Place.Winner);
        athleteList.get(1).setPlace(Place.RunnerUp);
        athleteList.get(2).setPlace(Place.ThirdPlace);
        if (athleteList.size() > 3) {
            for (int i = 3; i < athleteList.size(); i++) {
                athleteList.get(i).setPlace(Place.NotOnPodium);
            }
        }


        TimeResult[] timeResultsTest = new TimeResult[3];
        timeResultsTest[0] = new TimeResult(13, 00);
        timeResultsTest[1] = new TimeResult(13, 35);
        timeResultsTest[2] = new TimeResult(15, 33);
        athleteListTest.add(new Athlete(2, "Alex", "US", timeResultsTest[0], "xxxxx", "xxxxx", "xxxxx"));//13:00
        athleteListTest.add(new Athlete(1, "John", "US", timeResultsTest[1], "xxxxx", "xxxxx", "xxxxx"));//12:15,penalty=80s=>13:35
        athleteListTest.add(new Athlete(3, "Maria", "US", timeResultsTest[2], "xxxxx", "xxxxx", "xxxxx"));//14:53,penalty=40s=>15:33

    }

    @Test
    public void test1() {
        List<Athlete> athleteList = new ArrayList<>();
        List<Athlete> athleteListTest = new ArrayList<>();
        initialize(athleteList, athleteListTest);

        Assertions.assertEquals(athleteListTest.get(0).getSkyTimeResult(), athleteList.get(0).getFinalSkyTimeResult());
    }

    @Test
    public void test2() {
        List<Athlete> athleteList = new ArrayList<>();
        List<Athlete> athleteListTest = new ArrayList<>();
        initialize(athleteList, athleteListTest);
        Assertions.assertEquals(athleteListTest.get(1).getSkyTimeResult(), athleteList.get(1).getFinalSkyTimeResult());
    }

    @Test
    public void test3() {
        List<Athlete> athleteList = new ArrayList<>();
        List<Athlete> athleteListTest = new ArrayList<>();
        initialize(athleteList, athleteListTest);
        Assertions.assertEquals(athleteListTest.get(2).getSkyTimeResult(), athleteList.get(2).getFinalSkyTimeResult());
    }

    @Test
    public void test4() {
        List<Athlete> athleteList = new ArrayList<>();

        String line = "";
        String splitBy = ",";
        try {

            BufferedReader br = new BufferedReader(new FileReader("D:\\SIT\\IO Enums\\src\\main\\java\\SkiBiathlonStandings\\resource\\input.csv"));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] athlete = line.split(splitBy);

                TimeResult timeResult = new TimeResult(0, 0);
                timeResult.setMinutes(Integer.parseInt(athlete[3].substring(0, 2)));
                timeResult.setSeconds(Integer.parseInt(athlete[3].substring(3)));
                athleteList.add(new Athlete(Integer.parseInt(athlete[0]), athlete[1], athlete[2], timeResult, athlete[4], athlete[5], athlete[6]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Athlete athlete : athleteList) {
            System.out.println(athlete);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();

        for (Athlete athlete : athleteList) {
            athlete.servePenalty();
        }

        Collections.sort(athleteList);

        athleteList.get(0).setPlace(Place.Winner);
        athleteList.get(1).setPlace(Place.RunnerUp);
        athleteList.get(2).setPlace(Place.ThirdPlace);
        if (athleteList.size() > 3) {
            for (int i = 3; i < athleteList.size(); i++) {
                athleteList.get(i).setPlace(Place.NotOnPodium);
            }
        }

        for (Athlete athlete : athleteList) {
            System.out.println(athlete);
        }

    }
}


