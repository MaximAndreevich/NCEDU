package Dao;

import tables.JarNameAndVersion;

import java.util.List;

/**
 * Created by nik on 18.02.2016.
 */
public interface JarNameAndVersionDao {
    public void addNameAndVersion(JarNameAndVersion nav);
    public List<JarNameAndVersion> getAll();

}