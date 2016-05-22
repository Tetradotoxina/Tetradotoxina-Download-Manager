package com.tdm.db.dao;

import com.tdm.util.Data;
import java.util.List;

/**
 *
 * @author tetradotoxina
 */
public interface IDataAccessObject {
    public List<?> getList();
    public List<Data> getData(int id);
    public void showClose();
}
