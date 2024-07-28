package org.hibernate;

import org.hibernate.entity.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {



    public static void main(String[] args) {
        System.out.println("Hello world!");

        Produto produto = new Produto();

        produto.setNome("Produto 1");

        /*
        * CONFIGURAÇÃO UTILIZANDO A CONFIG JAVAX E HIBERNATE ENTITYMANAGER PARA IMPLEMENTAÇÃO
        * */
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }
}