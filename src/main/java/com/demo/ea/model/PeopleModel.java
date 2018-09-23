package com.demo.ea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "people")
public class PeopleModel{
    @Id
    @GeneratedValue(generator = "people_generator")
    @SequenceGenerator(
            name = "people_generator",
            sequenceName = "people_sequence",
            initialValue = 1000
    )
	
	public Integer id;
	public String name;
	@Column(name = "lastname")
	public String lastName;
	public Integer age;
	@Column(name = "cellphone")
	public String cellPhone;
	@Column(name = "email")
	public String eMail;
	
	public PeopleModel(){}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "responseData [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + ", cellPhone="
				+ cellPhone + ", eMail=" + eMail + "]";
	}
	
}
