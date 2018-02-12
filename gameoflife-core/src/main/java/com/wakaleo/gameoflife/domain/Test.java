/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wakaleo.gameoflife.domain;

/**
 *
 * @author Camila
 */
public class Test {

    private String symbol;


    private Test(final String initialSymbol) {
        this.symbol = initialSymbol;
    }

	// Override function for easy printing of cell's symbol
	// Functions identically to default getter ( getSymbol() )
    @Override
    public String toString() {
        return symbol;
    }

	// Function used for creating a cell given a string
    static Cell fromSymbol(final String symbol) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

	// Default getter
    public String getSymbol() {
        return symbol;
    }
    
}
