package com.example.gameoflife;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

//@RunWith(SpringRunner.class)
public class TimeToTextTests {


    @Test
    public void Given12colon00shouldReturnNoon() {

        String numberTime = "12:00";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("noon"));
    }

    @Test
    public void Given00colon00shouldReturnMidnight() {

        String numberTime = "00:00";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("midnight"));
    }

    @Test
    public void given10colon24ShouldReturnTenTwentyFiveInTheMorning() {
        String numberTime = "10:24";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("ten twenty-four in the morning"));
    }

    @Test
    public void given22colon24ShouldReturnTenTwentyFiveInTheEvening() {
        String numberTime = "22:24";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("ten twenty-four in the evening"));
    }

    @Test
    public void given14colon24ShouldReturnTwoTwentyFiveInTheAfterNoon() {
        String numberTime = "14:24";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("two twenty-four in the afternoon"));
    }

    @Test
    public void given09colon24ShouldReturnNineTwentyFiveInTheMorning()  {
        String numberTime = "09:24";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine twenty-four in the morning"));
    }

    @Test
    public void given09colon34ShouldReturnNineThirtyFiveInTheMorning()  {
        String numberTime = "09:34";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine thirty-four in the morning"));
    }

    @Test
    public void given09colon44ShouldReturnNineFourtyFourInTheMorning()  {
        String numberTime = "09:44";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine fourty-four in the morning"));
    }


    @Test
    public void given09colon54ShouldReturnNineFiftyFourInTheMorning()  {
        String numberTime = "09:54";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine fifty-four in the morning"));
    }

    @Test
    public void given09colon04ShouldReturnNineOhFourInTheMorning()  {
        String numberTime = "09:04";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine Oh four in the morning"));
    }

    @Test
    public void given09colon14ShouldReturnNineFourteenInTheMorning()  {
        String numberTime = "09:14";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine fourteen in the morning"));
    }
    @Test
    public void given09colon16ShouldReturnNineSixteenInTheMorning()  {
        String numberTime = "09:16";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine sixteen in the morning"));
    }

    @Test
    public void given09colon06ShouldReturnNineOhSixInTheMorning()  {
        String numberTime = "09:06";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine Oh six in the morning"));
    }

    @Test
    public void given09colon07ShouldReturnNineOhSevenInTheMorning()  {
        String numberTime = "09:07";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine Oh seven in the morning"));
    }

    @Test
    public void given09colon26ShouldReturnNineTwentySixInTheMorning()  {
        String numberTime = "09:26";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("nine twenty-six in the morning"));
    }

    @Test
    public void given09colon05ShouldReturnFivePastNineInTheMorning()  {
        String numberTime = "09:05";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("five past nine in the morning"));
    }

    @Test
    public void given09colon15ShouldReturnQuarterPastNineInTheMorning()  {
        String numberTime = "09:15";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("quarter past nine in the morning"));
    }

    @Test
    public void given09colon20ShouldReturntwentyPastNineInTheMorning()  {
        String numberTime = "09:20";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("twenty past nine in the morning"));
    }

    @Test
    public void given09colon10ShouldReturntenPastNineInTheMorning()  {
        String numberTime = "09:10";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("ten past nine in the morning"));
    }

    @Test
    public void given10colon55ShouldReturnFiveToElevenInTheMorning()  {
        String numberTime = "10:55";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("five to eleven in the morning"));
    }

    @Test
    public void given10colon50ShouldReturnTenToElevenInTheMorning()  {
        String numberTime = "10:50";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("ten to eleven in the morning"));
    }

    @Test
    public void given10colon40ShouldReturnTwentyToElevenInTheMorning()  {
        String numberTime = "10:40";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("twenty to eleven in the morning"));
    }

    @Test
    public void given10colon44ShouldReturnQuarterToElevenInTheMorning()  {
        String numberTime = "10:45";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("quarter to eleven in the morning"));
    }


    @Test
    public void given11colon55ShouldReturnFiveToNoon()  {
        String numberTime = "11:55";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("five to noon"));
    }

    @Test
    public void given23colon55ShouldReturnFiveToNMidnight()  {
        String numberTime = "23:55";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("five to midnight"));
    }

    @Test
    public void given17colon55ShouldReturnFiveToSixInTheEvening()  {
        String numberTime = "17:55";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("five to six in the evening"));
    }


    @Test
    public void given11colon50ShouldReturnTenToNoon()  {
        String numberTime = "11:50";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("ten to noon"));
    }

    @Test
    public void given23colon50ShouldReturnTenToNMidnight()  {
        String numberTime = "23:50";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("ten to midnight"));
    }

    @Test
    public void given17colon50ShouldReturnTenToSixInTheEvening()  {
        String numberTime = "17:50";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("ten to six in the evening"));
    }

    @Test
    public void given11colon40ShouldReturnTwentyToNoon()  {
        String numberTime = "11:40";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("twenty to noon"));
    }

    @Test
    public void given23colon40ShouldReturnTwentyToNMidnight()  {
        String numberTime = "23:40";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("twenty to midnight"));
    }

    @Test
    public void given17colon40ShouldReturnTwentyToSixInTheEvening()  {
        String numberTime = "17:40";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("twenty to six in the evening"));
    }

    @Test
    public void given11colon45ShouldReturnQuarterToNoon()  {
        String numberTime = "11:45";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("quarter to noon"));
    }

    @Test
    public void given23colon45ShouldReturnQuarterToNMidnight()  {
        String numberTime = "23:45";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("quarter to midnight"));
    }

    @Test
    public void given17colon45ShouldReturnQuarterToSixInTheEvening()  {
        String numberTime = "17:45";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("quarter to six in the evening"));
    }

    @Test
    public void given17colon30ShouldReturnHalfPastFiveInTheAfterNoon()  {
        String numberTime = "17:30";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("half past five in the afternoon"));
    }

    @Test
    public void given12colon30ShouldReturnHalfPastNoon()  {
        String numberTime = "12:30";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("half past noon"));
    }

    @Test
    public void given00colon30ShouldReturnHalfPastMidnight()  {
        String numberTime = "00:30";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("half past midnight"));
    }

    @Test
    public void given10colon00ShouldReturnTenOClockInTheMorning()  {
        String numberTime = "10:00";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("ten o’clock in the morning"));
    }

    @Test
    public void given16colon00ShouldReturnFourOClockInTheMorning()  {
        String numberTime = "16:00";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("four o’clock in the afternoon"));
    }

    @Test
    public void given20colon00ShouldReturnEightOClockInTheMorning()  {
        String numberTime = "20:00";

        String textTime = TimeConversion.time2text(numberTime);

        assertThat(textTime, is("eight o’clock in the evening"));
    }




}

