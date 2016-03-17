package br.com.fatec.entity;

public class Enrolls {
	
	private Long codeEnrolls;
	private int year;
	private int period;
	private Long codeCourse;
	//private Long codeStudent; - VERIFICAR EDUARDO.
	
	public Enrolls(){};
	
	public Enrolls(Long codeEnrolls, int year, int period, Long codeCourse) {
		this.codeEnrolls = codeEnrolls;
		this.year = year;
		this.period = period;
		this.setCodeCourse(codeCourse);
	}

	public Long getCodeEnrolls() {
		return codeEnrolls;
	}

	public void setCodeEnrolls(Long codeEnrolls) {
		this.codeEnrolls = codeEnrolls;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public Long getCodeCourse() {
		return codeCourse;
	}

	public void setCodeCourse(Long codeCourse) {
		this.codeCourse = codeCourse;
	}	
}
