	package com.hibernate.Entity;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		String name;
		long conNo;
		String email;
		String password;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(int id, String name, long conNo, String email, String password) {
			super();
			this.id = id;
			this.name = name;
			this.conNo = conNo;
			this.email = email;
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", conNo=" + conNo + ", email=" + email + ", password=" + password
					+ "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getConNo() {
			return conNo;
		}
		public void setConNo(long conNo) {
			this.conNo = conNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	}
