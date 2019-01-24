package com.example.tim.expandablelistview_image;

/**
 * Created by Tim on 24.11.2017.
 */

import java.util.ArrayList;

/**
 * Public class Continent that will hold list of couuntries
 */
public class Continent {
private int id = -1;
private String name = "";
private ArrayList<Country> country = null;
private int flag = -1;

/**
 * Public constructor of Continent class
 *
 * @param id
 * @param name
 * @param country
 * @param flag
 */
public Continent(int id, String name, ArrayList<Country> country, int flag) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.flag = flag;
        }

/**
 * @return id
 */
public int getId() {
        return id;
        }

/**
 * set id
 *
 * @param id
 */
public void setId(int id) {
        this.id = id;
        }

/**
 * return name of continent
 *
 * @return name
 */
public String getName() {
        return name;
        }

/**
 * method used to continent name
 *
 * @param name
 */
public void setName(String name) {
        this.name = name;
        }

/**
 * Return list of countries within a continent
 *
 * @return
 */
public ArrayList<Country> getCountry() {
        return country;
        }

/**
 * method used to countries for a continent
 *
 * @param country
 */
public void setCountry(ArrayList<Country> country) {
        this.country = country;
        }

/**
 * return drawable image id for continent
 *
 * @return
 */
public int getFlag() {
        return flag;
        }

/**
 * set flag for continent
 *
 * @param flag
 */
public void setFlag(int flag) {
        this.flag = flag;
        }
        }