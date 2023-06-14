package SkiBiathlonStandings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args) {
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
