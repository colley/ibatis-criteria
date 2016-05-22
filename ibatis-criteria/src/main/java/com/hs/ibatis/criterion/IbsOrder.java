/*
 * Copyright (c) 2016-2017 by Colley
 * All rights reserved.
 */
package com.hs.ibatis.criterion;

import java.io.Serializable;


/**
 *@FileName  IbatisOrder.java
 *@Date  16-5-19 下午1:44
 *@author Colley
 *@version 1.0
 */
public class IbsOrder implements Serializable {
    private static final long serialVersionUID = 7787512397141967676L;
    private boolean ascending;
    private String propertyName;

    public String toString() {
        return propertyName + ' ' + (ascending ? "asc" : "desc");
    }
    
    public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public boolean isAscending() {
		return ascending;
	}

	/**
     * Constructor for Order.
     */
    protected IbsOrder(String propertyName, boolean ascending) {
        this.propertyName = propertyName;
        this.ascending = ascending;
    }

    /**
     * Ascending order
     *
     * @param propertyName
     * @return Order
     */
    public static IbsOrder asc(String propertyName) {
        return new IbsOrder(propertyName, true);
    }

    /**
     * Descending order
     *
     * @param propertyName
     * @return Order
     */
    public static IbsOrder desc(String propertyName) {
        return new IbsOrder(propertyName, false);
    }
}
