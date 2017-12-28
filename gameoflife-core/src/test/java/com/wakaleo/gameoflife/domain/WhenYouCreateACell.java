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

   

}
