package conexao;

import org.hibernate.Session;


public class ConectaJavaDB {
    
    public static void main(String[] args) {
            Session sessao = null;
            try {
                    sessao = HibernateUtil.getSessionFactory().openSession();
                    System.out.println("Conectou!");
            } finally {
                    sessao.close();
            }
	}
}
