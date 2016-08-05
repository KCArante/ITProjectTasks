package com.kcarante.app.itproject.Constructor;

/**
 * Created by SARJ on 8/5/2016.
 */
public class Project {

    private String id;
    private String name;
    private String description;
    private String ads_url;
    private double needed_fund;
    private String project_category;
    private int wishlistCounter;
    private double received_funds;
    private int progress;
    private long startDate;
    private long endDate;
    private String smeId;
    private int logo;

    public Project() {
    }

    public Project(String id, String name, String description, String ads_url, double needed_fund,
                   String project_category, int wishlistCounter, double received_funds, int progress,
                   long startDate, long endDate, String smeId, int logo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ads_url = ads_url;
        this.needed_fund = needed_fund;
        this.project_category = project_category;
        this.wishlistCounter = wishlistCounter;
        this.received_funds = received_funds;
        this.progress = progress;
        this.startDate = startDate;
        this.endDate = endDate;
        this.smeId = smeId;
        this.logo = logo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAds_url() {
        return ads_url;
    }

    public void setAds_url(String ads_url) {
        this.ads_url = ads_url;
    }

    public double getNeeded_fund() {
        return needed_fund;
    }

    public void setNeeded_fund(double needed_fund) {
        this.needed_fund = needed_fund;
    }

    public String getProject_category() {
        return project_category;
    }

    public void setProject_category(String project_category) {
        this.project_category = project_category;
    }

    public int getWishlistCounter() {
        return wishlistCounter;
    }

    public void setWishlistCounter(int wishlistCounter) {
        this.wishlistCounter = wishlistCounter;
    }

    public double getReceived_funds() {
        return received_funds;
    }

    public void setReceived_funds(double received_funds) {
        this.received_funds = received_funds;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public String getSmeId() {
        return smeId;
    }

    public void setSmeId(String smeId) {
        this.smeId = smeId;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
