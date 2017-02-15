package com.ptrml.rpncalc;

/**
 * Calculators display. Composes the numbers berfore entered in the calculators stack.
 */
public class RPNNumComposer {

    private String value = "";
    private Boolean isVolatile = false;

    public void setVolatileValue(String input)
    {
        value = input;
        isVolatile = true;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNormalValue(String value) {
        this.value = value;
        isVolatile = false;
    }

    public void appendValue(Character input) {
        if(this.isVolatile)
        {
            this.setNormalValue("");
        }

        this.value = this.value.concat(input.toString());
    }

    public Boolean isEmpty()
    {
        return this.value.isEmpty();
    }
    public Boolean getIsVolatile(){
        return isVolatile;
    }
}
