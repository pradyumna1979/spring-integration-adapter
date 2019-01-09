/**
 * 
 */
package com.att.springBoot.model;

/**
 * @author pradyumna
 *
 */
public class Course {
	
	 private Integer  id ;
	 private  String description;
	 private  String iconUrl;
	 private String courseListIcon;
	 private  String longDescription;
	 private  String category;
	 private  Integer lessonsCount;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the iconUrl
	 */
	public String getIconUrl() {
		return iconUrl;
	}
	/**
	 * @return the courseListIcon
	 */
	public String getCourseListIcon() {
		return courseListIcon;
	}
	/**
	 * @return the longDescription
	 */
	public String getLongDescription() {
		return longDescription;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @return the lessonsCount
	 */
	public Integer getLessonsCount() {
		return lessonsCount;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param iconUrl the iconUrl to set
	 */
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	/**
	 * @param courseListIcon the courseListIcon to set
	 */
	public void setCourseListIcon(String courseListIcon) {
		this.courseListIcon = courseListIcon;
	}
	/**
	 * @param longDescription the longDescription to set
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @param lessonsCount the lessonsCount to set
	 */
	public void setLessonsCount(Integer lessonsCount) {
		this.lessonsCount = lessonsCount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [id=" + id + ", description=" + description + ", iconUrl=" + iconUrl + ", courseListIcon="
				+ courseListIcon + ", longDescription=" + longDescription + ", category=" + category + ", lessonsCount="
				+ lessonsCount + "]";
	}
	 
	
}
