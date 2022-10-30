package com.example.javamini;



public class tbv2  {
    String CourseId;
    String date;

//    public tbv2(String courseId, String date) {
//    }


    public String getCourseId() {
        return CourseId;
    }

    public String getDate() {
        return date;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public  void setDate(String date) {
        this.date = date;
    }

    public tbv2(String CourseId, String date) {

        this.CourseId = CourseId;
        this.date = date;

    }

}
