package com.mycompany.basicjava.practices_file;

public class OthersClass extends Students{
    
    public static String university = "Barisal Information Technology College";
    public int fav_no;
    public String fav_color;
    
    public OthersClass(int fav_no,String fav_color){
        super();
        this.fav_no = fav_no;
        this.fav_color = fav_color;
    }
    
    
    @Override
    public void setPrinted(){
        //super.setPrinted();
        System.out.println("University : " + university);
        System.out.println("Favourite No : " + fav_no);
        System.out.println("Favourite Color : " + fav_color);
    }
    
}
