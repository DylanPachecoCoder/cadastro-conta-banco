package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String cpf;
    private String profession;
    private Date birthday;
    private String accountType;

    
    
	public Client(String name, String cpf, String profession, Date birthday, String accountType) {
		this.name = name;
		this.cpf = cpf;
		this.profession = profession;
		this.birthday = birthday;
		this.accountType = accountType;
	}

	
	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getBirthday() {
		return sdf.format(birthday);
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

}
