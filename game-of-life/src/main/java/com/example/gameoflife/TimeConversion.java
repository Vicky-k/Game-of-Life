package com.example.gameoflife;

import java.util.HashMap;
import java.util.Map;

public class TimeConversion {


    public static String time2text(String numberTime) {
        Map<String,String> hours2Word = new HashMap<String,String>();

        Map<Integer,String> firstDigitToWord = new HashMap<Integer,String>();
        Map<Integer,String> secondDigitToWord = new HashMap<Integer,String>();
        Map<Integer,String> minutes10to19ToWord = new HashMap<Integer,String>();
        Map<Integer,String> noonMidnight = new HashMap<Integer,String>();

        hours2Word.put("00", "twelve");
        hours2Word.put("01", "one");
        hours2Word.put("02", "two");
        hours2Word.put("03", "three");
        hours2Word.put("04", "four");
        hours2Word.put("05", "five");
        hours2Word.put("06", "six");
        hours2Word.put("07", "seven");
        hours2Word.put("08", "eight");
        hours2Word.put("09", "nine");
        hours2Word.put("10", "ten");
        hours2Word.put("11", "eleven");
        hours2Word.put("12", "twelve");
        hours2Word.put("13", "one");
        hours2Word.put("14", "two");
        hours2Word.put("15", "three");
        hours2Word.put("16", "four");
        hours2Word.put("17", "five");
        hours2Word.put("18", "six");
        hours2Word.put("19", "seven");
        hours2Word.put("20", "eight");
        hours2Word.put("21", "nine");
        hours2Word.put("22", "ten");
        hours2Word.put("23", "eleven");


        firstDigitToWord.put(2, "twenty");
        firstDigitToWord.put(3, "thirty");
        firstDigitToWord.put(4, "fourty");
        firstDigitToWord.put(5, "fifty");

        secondDigitToWord.put(1, "one");
        secondDigitToWord.put(2, "two");
        secondDigitToWord.put(3, "three");
        secondDigitToWord.put(4, "four");
        secondDigitToWord.put(5, "five");
        secondDigitToWord.put(6, "six");
        secondDigitToWord.put(7, "seven");
        secondDigitToWord.put(8, "eight");
        secondDigitToWord.put(9, "nine");

        minutes10to19ToWord.put(14, "fourteen");
        minutes10to19ToWord.put(16, "sixteen");
        minutes10to19ToWord.put(11, "eleven");
        minutes10to19ToWord.put(12, "twelve");
        minutes10to19ToWord.put(13, "thirteen");
        minutes10to19ToWord.put(17, "seventeen");
        minutes10to19ToWord.put(18, "eighteen");
        minutes10to19ToWord.put(19, "ninteen");
        minutes10to19ToWord.put(10, "ten");

        noonMidnight.put(12,"noon");
        noonMidnight.put(00,"midnight");

        String hoursAndMinutes[] = numberTime.split(":");
        String partOfDay, nextPartOfDay;

        String hourInWord = hours2Word.get(hoursAndMinutes[0]);
        Integer nextHour = Integer.parseInt(hoursAndMinutes[0]) + 1;
        if(nextHour == 24) {
            nextHour = 0;
        }
        String nextHourInWord = hours2Word.get(nextHour.toString());
        if("12:00".equals(numberTime) || "00:00".equals(numberTime)) {
            partOfDay = "";
        } else if(Integer.parseInt(hoursAndMinutes[0]) < 12) {
            partOfDay = "morning";
        } else if(Integer.parseInt(hoursAndMinutes[0]) < 18) {
            partOfDay = "afternoon";
        } else {
            partOfDay = "evening";
        }


        if("00:00".equals(numberTime))  {
            return "midnight";
        }
        if("12:00".equals(numberTime)){
            return "noon";
        }

        int minutes = Integer.parseInt(hoursAndMinutes[1]);

        int firstDigit = minutes/10;

        int secondDigit = minutes%10;
        String secondDigitText = secondDigitToWord.get(secondDigit);

        if(minutes == 5)    {
            return secondDigitText+" past "+ hourInWord+" in the "+partOfDay;
        }
        if(minutes == 10) {
            return "ten past "+ hourInWord+" in the "+partOfDay;
        }
        if (minutes == 20) {
            return "twenty past "+ hourInWord+" in the "+partOfDay;
        }

        if(minutes == 15)    {
            return "quarter past "+ hourInWord+" in the "+partOfDay;
        }

        if(minutes == 55)   {

            if(nextHour == 18)  {
                return "five to "+nextHourInWord+" in the evening";
            }

            if(nextHour == 12 || nextHour == 00)  {
                return "five to "+noonMidnight.get(nextHour);
            }

            return "five to "+nextHourInWord+" in the "+partOfDay;
        }

        if(minutes == 50)   {

            if(nextHour == 18)  {
                return "ten to "+nextHourInWord+" in the evening";
            }

            if(nextHour == 12 || nextHour == 00)  {
                return "ten to "+noonMidnight.get(nextHour);
            }
            return "ten to "+nextHourInWord+" in the "+partOfDay;
        }

        if(minutes == 40)   {
            if(nextHour == 18)  {
                return "twenty to "+nextHourInWord+" in the evening";
            }

            if(nextHour == 12 || nextHour == 00)  {
                return "twenty to "+noonMidnight.get(nextHour);
            }
            return "twenty to "+nextHourInWord+" in the "+partOfDay;
        }

        if(minutes == 45)   {
            if(nextHour == 18)  {
                return "quarter to "+nextHourInWord+" in the evening";
            }

            if(nextHour == 12 || nextHour == 00)  {
                return "quarter to "+noonMidnight.get(nextHour);
            }
            return "quarter to "+nextHourInWord+" in the "+partOfDay;
        }

        if(minutes == 30)   {
            if("12:30".equals(numberTime)) {
                return "half past noon";
            }

            if("00:30".equals(numberTime)) {
                return "half past midnight";
            }
            return "half past "+hourInWord+" in the "+partOfDay;
        }

        if(minutes == 00) {
            return hourInWord+" o’clock in the "+partOfDay;
        }
        if(firstDigit == 0) {

            return hourInWord + " Oh "+ secondDigitText+" in the "+ partOfDay;
        }

        if(firstDigit == 1) {
            return hourInWord + " " + minutes10to19ToWord.get(minutes) + " in the " + partOfDay;
        }



        String firstDigitText = firstDigitToWord.get(firstDigit);

        return hourInWord+ " "+firstDigitText +"-"+ secondDigitText +" in the "+partOfDay;
    }
}
