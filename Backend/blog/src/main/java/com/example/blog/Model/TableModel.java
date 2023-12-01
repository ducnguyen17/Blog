package com.example.blog.Model;

public class TableModel {
    private String name ;
    public TableModel(){}
    public TableModel(String name){
       this.name = name;
    }
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
//  khai bao value cho contructer
    TableModel table = new TableModel("duc nguyen 17");
}
