package in.sts.springdatajpa;

import javax.transaction.Transactional;

import org.springframework.orm.jpa.JpaTemplate;

@Transactional
public class AccountDao {
	
	JpaTemplate template;

	public void setTemplate(JpaTemplate template) {
		this.template = template;
	}
	
	public void createAccount(int accountNumber,String owner,double balance) {
		Account account = new Account(accountNumber,owner,balance);
		template.persist(account);
	}
	
	
}
