package com.wakaleo.gameoflife.domain;

import static com.wakaleo.gameoflife.domain.Cell.DEAD_CELL;
import static com.wakaleo.gameoflife.domain.Cell.LIVE_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class WhenYouCreateACell {

<<<<<<< HEAD
//<<<<<<< HEAD
   
=======
    @Test
    public void aLiveCellShouldBeRepresentedByAnAsterisk() {
        Cell cell = Cell.fromSymbol("*");
        assertThat(cell, is(LIVE_CELL));
    }
>>>>>>> parent of 84c6774... Revert "Revert "CellTest""

    @Test
    public void aLiveCellShouldBeRepresentedByAnAsterisk() {
        Cell cell = Cell.fromSymbol("*");
        assertThat(cell, is(LIVE_CELL));
    }

    @Test
    public void aDeadCellShouldBeRepresentedByADot() {
        Cell cell = Cell.fromSymbol(".");
        assertThat(cell, is(DEAD_CELL));
    }

    @Test
    public void aLiveCellShouldBePrintedAsAnAsterisk() {
        assertThat(Cell.LIVE_CELL.toString(), is("*"));
    }
//>>>>>>> parent of 84c6774... Revert "Revert "CellTest""


    @Test
    public void aDeadCellShouldBePrintedAsADot() {
        assertThat(Cell.DEAD_CELL.toString(), is("."));
    }

    @Test
    public void aDeadCellSymbolShouldBeADot() {
        assertThat(Cell.DEAD_CELL.getSymbol(), is("."));
    }

    @Test
    public void aLiveCellSymbolShouldBeAnAsterisk() {
        assertThat(Cell.LIVE_CELL.getSymbol(), is("*"));
    }

}
