/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conecta;
import conexao.HibernateUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Twitter;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vag
 */
public class TwitterDaoImpl implements TwitterDAO {

    public TwitterDaoImpl() {
    }

    @Override
    public String incluir(Twitter tt) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(tt);
            transacao.commit();
            return "sucesso";
        } catch (HibernateException e) {
            return ("Não foi possível inserir o cliente. Erro: " + e.getMessage() + " " + e.toString());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                return ("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    @Override
    public List<Twitter> getTwitters() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Twitter> resultado = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Twitter");
            resultado = consulta.list();
            transacao.commit();

        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar tts. Erro: " + e);
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação listar. Mensagem: " + e.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public List<Twitter> getTwittersPorTexto(String filtro) {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Twitter> resultado = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from twitter where texto =: filtro");
            consulta.setString(filtro, "filtro");
            resultado = consulta.list();
            transacao.commit();

        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar tts. Erro: " + e);
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação listar. Mensagem: " + e.getMessage());
            }
        }
        return resultado;

    }

    @Override
    public List<Twitter> getTwittersPorUsuario(String filtro) {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Twitter> resultado = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from twitter where usuario =: filtro");
            consulta.setString(filtro, "filtro");
            resultado = consulta.list();
            transacao.commit();

        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar tts. Erro: " + e);
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação listar. Mensagem: " + e.getMessage());
            }
        }
        return resultado;

    }

    @Override
    public String getTwittersPorId(String id) {
        String retorno="";
        try {
            Conecta c = new Conecta();
            if ("sucesso".equals(c.getMsg())) {
                String sql = "select * from twitter where idTwitter ="+"'"+id+"'";
                ResultSet rs;
                try {

                    rs = c.getStm().executeQuery(sql);
                    while (rs.next()) {
                        retorno = rs.getString("idTwitter");
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }

            } else {
                System.out.println(c.getMsg());
            }
        } finally {
        }
        return retorno;
    }
    }

