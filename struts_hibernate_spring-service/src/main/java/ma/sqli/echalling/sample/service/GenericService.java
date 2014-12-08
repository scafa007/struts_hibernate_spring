package ma.sqli.echalling.sample.service;

import ma.sqli.echalling.sample.dao.GenericDao;

public class GenericService<T, K> {

    private GenericDao<T, K> dao;

    public GenericService(GenericDao<T, K> dao) {
        this.dao = dao;
    }

    public GenericService() {
    }

    T get(K id){
        return dao.get(id);
    }

    public GenericDao<T, K> getDao() {
        return dao;
    }

    public void setDao(GenericDao<T, K> dao) {
        this.dao = dao;
    }
}
