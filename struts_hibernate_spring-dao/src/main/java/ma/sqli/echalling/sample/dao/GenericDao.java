package ma.sqli.echalling.sample.dao;

public class GenericDao<T, K> {

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
