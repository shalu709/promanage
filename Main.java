package com.promnage.main;

import com.promnage.model.Project;
import com.promnage.service.*;

import java.util.List;

public class PromnageSystem {

    public static void main(String[] args) {

        try {
            System.out.println("Connecting to database...");

            List<Integer> history = DataService.getLast3WeekRevenue();

            double predictedRevenue = WeightedMovingAveragePredictor.predict(history);

            System.out.println("Predicted Next Week Revenue = " + predictedRevenue);

            List<Project> projects = DataService.getAllProjects();

            Scheduler.scheduleProjects(projects, predictedRevenue);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
