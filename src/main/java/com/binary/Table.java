package com.binary;

import java.util.Objects;

public class Table extends Product{
    private int height;
    private int width;
    private int length;
    public Table(int height, int width, int length){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return "Table: " +
                " Height: "+ height+
                " Width: "+ width+
                " Length: "+ length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return getHeight() == table.getHeight() && getWidth() == table.getWidth() && getLength() == table.getLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(), getLength());
    }
}
