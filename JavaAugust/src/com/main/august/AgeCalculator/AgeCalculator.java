package com.main.august.AgeCalculator;

public class AgeCalculator{


    public String YEARS_MONTHS_AND_DAYS(int year, int month, int day){
        String result = "";
        int Year_Difference = year - 2023;
        result = result + Year_Difference + Months.YEARS;
        int Month_Difference = month - 12;
        result = result + Months.SPACE + Month_Difference + Months.MONTHS;
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            int Days_Difference = day - 31;
            result = result + Months.SPACE + Days_Difference + Months.SPACE + Months.DAYS;
        }
        else if(year % 4 == 0){
            int Days_Difference = day - 29;
            result = result + Months.SPACE + Days_Difference + Months.SPACE + Months.DAYS;
        }
        else if(year % 4 != 0){
            int Days_Difference = day - 28;
            result = result + Months.SPACE + Days_Difference + Months.SPACE + Months.DAYS;
        }
        else{
            int Days_Difference = day - 30;
            result = result + Months.SPACE + Days_Difference + Months.SPACE + Months.DAYS;             
        }
        return result;
        
    }
}
    
