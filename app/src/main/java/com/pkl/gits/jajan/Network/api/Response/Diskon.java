package com.pkl.gits.jajan.Network.api.Response;

/**
 * Created by Varokah on 10/17/2016.
 */
public class Diskon {
    private String nilai,start,end;

    public Diskon(String nilai, String start, String end) {
        this.nilai = nilai;
        this.start = start;
        this.end = end;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
