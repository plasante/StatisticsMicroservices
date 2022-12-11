package com.quicktutorials.learnmicroservices.StatisticsMicroservices.services;

import com.quicktutorials.learnmicroservices.StatisticsMicroservices.entities.Statistics;

import java.util.List;

public interface StatisticsService {

    List<Statistics> getStatistics(String jwt, String email);
}
