package com.example.github.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResultsItem {

    @SerializedName("overview")
    private String overview;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("video")
    private Boolean video;

    @SerializedName("title")
    private String title;

    @SerializedName("genre_ids")
    private ArrayList<Integer> genreIds;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("popularity")
    private Double popularity;

    @SerializedName("vote_average")
    private float voteAverage;

    @SerializedName("id")
    private Integer id;

    @SerializedName("adult")
    private Boolean adult;

    @SerializedName("vote_count")
    private Integer voteCount;

    public void setOverview(String overview){
        this.overview = overview;
    }

    public String getOverview(){
        return overview;
    }

    public void setOriginalLanguage(String originalLanguage){
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalLanguage(){
        return originalLanguage;
    }

    public void setOriginalTitle(String originalTitle){
        this.originalTitle = originalTitle;
    }

    public String getOriginalTitle(){
        return originalTitle;
    }

    public void setVideo(Boolean video){
        this.video = video;
    }

    public boolean isVideo(){
        return video;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setGenreIds(ArrayList<Integer> genreIds){
        this.genreIds = genreIds;
    }

    public ArrayList<Integer> getGenreIds(){
        return genreIds;
    }

    public void setPosterPath(String posterPath){
        this.posterPath = posterPath;
    }

    public String getPosterPath(){
        return posterPath;
    }

    public void setBackdropPath(String backdropPath){
        this.backdropPath = backdropPath;
    }

    public String getBackdropPath(){
        return backdropPath;
    }

    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate(){
        return releaseDate;
    }

    public void setPopularity(Double popularity){
        this.popularity = popularity;
    }

    public Double getPopularity(){
        return popularity;
    }

    public void setVoteAverage(float voteAverage){
        this.voteAverage = voteAverage;
    }

    public float getVoteAverage(){
        return voteAverage;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setAdult(Boolean adult){
        this.adult = adult;
    }

    public boolean isAdult(){
        return adult;
    }

    public void setVoteCount(Integer voteCount){
        this.voteCount = voteCount;
    }

    public Integer getVoteCount(){
        return voteCount;
    }
}