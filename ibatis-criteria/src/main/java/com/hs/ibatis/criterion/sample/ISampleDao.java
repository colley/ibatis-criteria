/*
 * Copyright (c) 2016-2017 by Colley
 * All rights reserved.
 */
package com.hs.ibatis.criterion.sample;

import java.util.List;

import com.hs.ibatis.criterion.beans.DetachedIbtsCriteria;
import com.hs.ibatis.criterion.sample.entity.SemUser;


/**
 *@FileName  ISampleDao.java
 *@Date  16-5-21 下午3:56
 *@author Colley
 *@version 1.0
 */
public interface ISampleDao {
    List<SemUser> findByCriteria(DetachedIbtsCriteria detachedIbtsCriteria);
    
    List<SemUser> findByCriteria(DetachedIbtsCriteria detachedIbtsCriteria,String statment);
}
