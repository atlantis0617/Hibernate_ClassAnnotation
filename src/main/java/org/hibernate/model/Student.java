package org.hibernate.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t1_student")
public class Student {
	private long id;// 学号
    private String name;// 姓名
    private Date birthday;// 出生日志
    private String sex;// 性别
    private Address address;// 地址
    
    public Student() {
    }
     
    public Student(long id, String name, Date birthday, String sex, Address address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }
    
    @Id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
