/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class beans implements Serializable  
{
    
    
    String stu_nm;
    
    public void setNm(String a)
    {
        stu_nm=a;
    }
    
    
    public String getNm()
    {
        return stu_nm;
    }
    
}
