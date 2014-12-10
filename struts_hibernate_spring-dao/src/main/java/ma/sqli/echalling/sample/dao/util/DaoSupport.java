package ma.sqli.echalling.sample.dao.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DaoSupport extends HibernateDaoSupport {

    @Autowired
    @Qualifier("hibernateSessionFactory")
    public void autowiredSessionFactory(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
}