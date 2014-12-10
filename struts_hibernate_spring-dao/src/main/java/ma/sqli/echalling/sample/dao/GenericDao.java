package ma.sqli.echalling.sample.dao;

import ma.sqli.echalling.sample.dao.util.DaoSupport;

public class GenericDao<T, K> extends DaoSupport{

    private Class<T> persistentClass;

    public GenericDao(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    public Class<T> getPersistentClass(){
        return persistentClass;
    }

    public T get(K id){
        T res = null;
        return res;
    }
}
