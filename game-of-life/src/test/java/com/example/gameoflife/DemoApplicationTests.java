package com.example.gameoflife;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void givenOneLiveCellAndLessThanTwoLiveNeighbourShouldDie() {
		int numberOfLiveNeighbours = 1;
		boolean cellAlive = true;
		boolean cellAliveInNextState = GameOfLife.nextStateOfCell(cellAlive, numberOfLiveNeighbours);

		assertThat(cellAliveInNextState, is(false));
	}

	@Test
	public void givenOneLiveCellAndZeroLiveNeighbourShouldDie() {
		int numberOfLiveNeighbours = 0;
		boolean cellAlive = true;
		boolean cellAliveInNextState = GameOfLife.nextStateOfCell(cellAlive, numberOfLiveNeighbours);

		assertThat(cellAliveInNextState, is(false));
	}

	@Test
	public void givenOneLiveCellAndBetweenTwoAndThreeLiveNeighbourShouldLive() {
		int numberOfLiveNeighbours = 3;
		boolean cellAlive = true;
		boolean cellAliveInNextState = GameOfLife.nextStateOfCell(cellAlive, numberOfLiveNeighbours);

		assertThat(cellAliveInNextState, is(true));
	}

	@Test
	public void givenOneLiveCellAndMoreThanThreeLiveNeighboursShouldDie() {
		int numberOfLiveNeighbours = 4;
		boolean cellAlive = true;
		boolean cellAliveInNextState = GameOfLife.nextStateOfCell(cellAlive, numberOfLiveNeighbours);

		assertThat(cellAliveInNextState, is(false));
	}

	@Test
	public void givenOneDeadCellAndThreeLiveNeighboursShouldLive() {
		int numberOfLiveNeighbours = 3;
		boolean cellAlive = false;
		boolean cellAliveInNextState = GameOfLife.nextStateOfCell(cellAlive, numberOfLiveNeighbours);

		assertThat(cellAliveInNextState, is(true));
	}

	@Test
	public void givenOneDeadCellAndTwoLiveNeighboursShouldDie() {
		int numberOfLiveNeighbours = 2;
		boolean cellAlive = false;
		boolean cellAliveInNextState = GameOfLife.nextStateOfCell(cellAlive, numberOfLiveNeighbours);

		assertThat(cellAliveInNextState, is(false));
	}

	@Test
	public void givenOneDeadCellAndFourLiveNeighboursShouldDie() {
		int numberOfLiveNeighbours = 4;
		boolean cellAlive = false;
		boolean cellAliveInNextState = GameOfLife.nextStateOfCell(cellAlive, numberOfLiveNeighbours);

		assertThat(cellAliveInNextState, is(false));
	}





}

