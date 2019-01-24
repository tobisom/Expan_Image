package com.example.tim.expandablelistview_image;

/**
 * Created by Tim on 24.11.2017.
 */

/**
 * public class Country
 */
public class Country {
    private String name = "";

    private int id = -1;
    private int flag = -1;
    /**
     * public constructor for Country class
     *
     * @param name
     * @param id
     * @param flag
     */
    public Country(String name,  int id, int flag) {
        this.name = name;

        this.id = id;
        this.flag = flag;
    }
    /**
     * method return country name
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * method set country name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * method used to get country id
     *
     * @return
     */
    /**
     * method return country name
     *
     * @return
     */


    public int getId() {
        return id;
    }

    /**
     * method used to set country id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method return drawable flag id
     *
     * @return
     */
    public int getFlag() {
        return flag;
    }

    /**
     * Method set drawable flag id
     *
     * @param flag
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }
}