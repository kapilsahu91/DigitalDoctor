/**
 * 
 */
package com.afour.digital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kapil.s
 *
 */
@Entity
@Table(name="beauty11_role")
public class Role {
	@Id
	@GeneratedValue
	@Column(name="role_id")
	private long roleId;
	@Column(name="name")
	private String name;
	
	/**
	 * 
	 */
	public Role() {}
	
	public Role(String name){
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the roleId
	 */
	public long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	
	
	
}
