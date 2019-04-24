package com.kgisl.code;

/**
 * Emp
 */
public class Emp {

    int id;
    String n;
    float sal;
    Emp(int id,String n,float sal)     
    {
    this.id=id;
    this.n=n;
    this.sal=sal;
        
    }
   

int getId(){
    return id;
}

String getN()
{
    return n;
}
float getSal()
{
    return sal;
}
public String tosString(){
    return "id "+id+"name "+n+"Salary "+sal;
}

}