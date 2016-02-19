package br.com.fatec.model.student;

import java.util.Date;

import br.com.fatec.model.User;
import br.com.fatec.model.Competencies.Competence;

public class Student extends User{
	
	public static final String TABLE = "ALUNO";
	public static final String COL_CODIGO = "ALU_CODIGO";
	public static final String COL_NOME = "ALU_NOME";
	public static final String COL_RA = "ALU_RA";
	public static final String COL_CPF = "ALU_CPF";
	public static final String COL_NASCIMENTO = "ALU_NASCIMENTO";
	public static final String COL_CEP = "ALU_CEP";
	public static final String COL_ENDERECO = "ALU_ENDERECO";
	public static final String COL_BAIRRO = "ALU_BAIRRO";
	public static final String COL_CIDADE = "ALU_CIDADE";
	public static final String COL_UF = "ALU_UF";
	public static final String COL_NUMERO = "ALU_NUMERO";
	public static final String COL_COMPLEMENTO = "ALU_COMPLEMENO";
	public static final String COL_TELEFONE = "ALU_TELEFONE";
	public static final String COL_CELULAR = "ALU_CELULAR";
	public static final String COL_DATA_CADASTRO = "ALU_DATA_CADASTRO";
	public static final String COL_USUARIO_CADASTRO = "ALU_USUARIO_CADASTRO";
	public static final String COL_USUARIO_CODIGO = "USU_CODIGO";
		
	private Long number;
	private String name;
	private String ra;
	private String cpf;
	private Date birthDay;
	private String cep;
	private String address;
	private String neighborhood;
	private String city;
	private String uf;
	private int numberHouse;
	private String complement;
	private String telephone;
	private String cellphone;
	private Date register;
	private Long user_register;
	private User user;
	
	public Student(Long number, String name, String ra, String cpf, Date birthDay, String cep, String address,
			String neighborhood, String city, String uf, int numberHouse, String complement, String telephone,
			String cellphone, Date register, Long user_register) {
		super();
		this.number = number;
		this.name = name;
		this.ra = ra;
		this.cpf = cpf;
		this.birthDay = birthDay;
		this.cep = cep;
		this.address = address;
		this.neighborhood = neighborhood;
		this.city = city;
		this.uf = uf;
		this.numberHouse = numberHouse;
		this.complement = complement;
		this.telephone = telephone;
		this.cellphone = cellphone;
		this.register = register;
		this.user_register = user_register;
	}

	public Student(){
		
	}
	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getNumberHouse() {
		return numberHouse;
	}

	public void setNumberHouse(int numberHouse) {
		this.numberHouse = numberHouse;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Date getRegister() {
		return register;
	}

	public void setRegister(Date register) {
		this.register = register;
	}

	public Long getUser_register() {
		return user_register;
	}

	public void setUser_register(Long user_register) {
		this.user_register = user_register;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
