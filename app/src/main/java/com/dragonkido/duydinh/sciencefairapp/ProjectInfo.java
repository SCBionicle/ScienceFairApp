package com.dragonkido.duydinh.sciencefairapp;

import java.sql.Time;

/**
 * Created by Seth Chick on 2/1/2016.
 */
public class ProjectInfo {
    private String projectTitle;
    private String projectID;
    private String studentName;
    private int grade;
    private Time timeJudged;

    public ProjectInfo(String projectTitle, String projectID, String studentName, int grade, Time timeJudged) {
        this.projectTitle = projectTitle;
        this.projectID = projectID;
        this.studentName = studentName;
        this.grade = grade;
        this.timeJudged = timeJudged;
    }


    public void setProjectTitle(String projectTitle)
    {
        this.projectTitle=projectTitle;
    }
    public void setProjectID(String projectID)
    {
        this.projectID=projectID;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public String getProjectID() {
        return projectID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Time getTimeJudged() {
        return timeJudged;
    }

    public void setTimeJudged(Time timeJudged) {
        this.timeJudged = timeJudged;
    }

    @Override
    public String toString() {
        return "" +
                "Project Title: '" + projectTitle + "\'\n" +
                "Project ID: '" + projectID + "\'\n" +
                "\nStudent Name: '" + studentName + '\'' +
                "\nGrade; '" + grade +
                "\nTime Judged; " + timeJudged
                ;
    }
}
