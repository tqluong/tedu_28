package inventory.model;
// Generated Jun 19, 2019 6:55:39 PM by Hibernate Tools 5.4.2.Final

import java.util.Date;

/**
 * UserRoleId generated by hbm2java
 */
public class UserRoleId implements java.io.Serializable {

	private int id;
	private int userId;
	private int roleId;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;

	public UserRoleId() {
	}

	public UserRoleId(int id, int userId, int roleId, int activeFlag, Date createDate, Date updateDate) {
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRoleId))
			return false;
		UserRoleId castOther = (UserRoleId) other;

		return (this.getId() == castOther.getId()) && (this.getUserId() == castOther.getUserId())
				&& (this.getRoleId() == castOther.getRoleId()) && (this.getActiveFlag() == castOther.getActiveFlag())
				&& ((this.getCreateDate() == castOther.getCreateDate()) || (this.getCreateDate() != null
						&& castOther.getCreateDate() != null && this.getCreateDate().equals(castOther.getCreateDate())))
				&& ((this.getUpdateDate() == castOther.getUpdateDate())
						|| (this.getUpdateDate() != null && castOther.getUpdateDate() != null
								&& this.getUpdateDate().equals(castOther.getUpdateDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getUserId();
		result = 37 * result + this.getRoleId();
		result = 37 * result + this.getActiveFlag();
		result = 37 * result + (getCreateDate() == null ? 0 : this.getCreateDate().hashCode());
		result = 37 * result + (getUpdateDate() == null ? 0 : this.getUpdateDate().hashCode());
		return result;
	}

}
