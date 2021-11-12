package com.example.github.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MainModel {

    @SerializedName("page")
    private Integer page;

    @SerializedName("total_pages")
    private Integer totalPages;

    @SerializedName("results")
    private ArrayList<ResultsItem> results;

    @SerializedName("total_results")
    private Integer totalResults;

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPage() {
        return page;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setResults(ArrayList<ResultsItem> results) {
        this.results = results;
    }

    public ArrayList<ResultsItem> getResults() {
        return results;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalResults() {
        return totalResults;
    }
}
