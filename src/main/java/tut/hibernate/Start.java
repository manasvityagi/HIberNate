package tut.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Random;
import java.util.UUID;

public class Start {
    private static final Random rnd = new Random();


    public static void main(String[] args) {
        System.out.println("Hibernate Hello");
        addMachine();
        // getMachine(525);

    }

    public static void addMachine() {

        String id = UUID.randomUUID().toString();
        MachineEntity machineObject = new MachineEntity(id, String.valueOf(rnd.nextLong()), rnd.nextLong(), rnd.nextLong());

        Configuration conf = new Configuration().configure().addAnnotatedClass(MachineEntity.class);

        StandardServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sessionFactory = conf.buildSessionFactory(sr);
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        //session.save(machineObject);
        MachineEntity getObjM = session.get(MachineEntity.class,"31446f0f-dae8-4d04-9de0-9468969b2bc8");
        System.out.println(session.getIdentifier(getObjM));
        System.out.println(session.getHibernateFlushMode());
        System.out.println(session.getCacheMode());
        System.out.println(session.getHibernateFlushMode());


        System.out.println(getObjM.getPressure());
        System.out.println(getObjM.getTemperature());
        System.out.println(getObjM.getTimeTurnedOm());


        tx.commit();
    }


//    private static void getMachine(int topN) {
//        Session session = getCurrentSessionFromConfig();
//        Query query=session.createQuery("from Emp");//here persistent class name is Emp
//        List list=query.list();
//        System.out.println(list.toString());
//
//    }


}

