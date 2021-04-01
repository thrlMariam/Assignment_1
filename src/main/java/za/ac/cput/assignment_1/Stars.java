/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Tyler Fredericks - 218047894
 */
public class Stars 
{
    public String WhiteDwarf, YellowDwarf, Sun;

    public String getWhiteDwarf() 
    {
        return WhiteDwarf;
    }

    public void setWhiteDwarf(String WhiteDwarf) 
    {
        this.WhiteDwarf = WhiteDwarf;
    }

    public String getYellowDwarf() 
    {
        return YellowDwarf;
    }

    public void setYellowDwarf(String YellowDwarf) 
    {
        this.YellowDwarf = YellowDwarf;
    }

    public String getSun() 
    {
        return Sun;
    }

    public void setSun(String Sun) 
    {
        this.Sun = Sun;
    }
    
    @Override
    public String toString() 
    {
        return "Stars{" + "WhiteDwarf=" + WhiteDwarf + ", YellowDwarf=" + YellowDwarf + ", Sun=" + Sun + '}';
    }
    
}
