package com.quicktutorials.learnmicroservices.StatisticsMicroservices.services;

import com.quicktutorials.learnmicroservices.StatisticsMicroservices.entities.Statistics;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Override
    public List<Statistics> getStatistics(String jwt, String email) {
        //1. Call ToDoMicroservice
        //2. Calculate the statistics
        //3. save the new statistics
        //4. return the List of statistics



        return null;
    }

    private List<LinkedHashMap> getNewDataFromToDoMicroservice(String jwt) {

        return null;
    }
}
