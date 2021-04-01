/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Mariaam
 */
public class Campus {
    
        private String Studentname , Studentnumber , course;

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String Studentname) {
        this.Studentname = Studentname;
    }

    public String getStudentnumber() {
        return Studentnumber;
    }

    public void setStudentnumber(String Studentnumber) {
        this.Studentnumber = Studentnumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Assignment_1{" + "Studentname=" + Studentname + ", Studentnumber=" + Studentnumber + ", course=" + course + '}';
    }
        
}


