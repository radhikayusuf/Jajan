package com.pkl.gits.jajan.DetailBarang.RecycleView.Dao;

/**
 * Created by Varokah on 10/18/2016.
 */

public class RowDao {
    private String RowContent,status;

    public RowDao(String rowContent, String status) {
        RowContent = rowContent;
        this.status = status;
    }

    public String getRowContent() {
        return RowContent;
    }

    public void setRowContent(String rowContent) {
        RowContent = rowContent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
