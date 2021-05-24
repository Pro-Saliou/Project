package com.example.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.MappedSuperclass; 
import javax.persistence.Version;

@MappedSuperclass
public class AbstractEntity implements Serializable {
private static final long serialVersionUID = 1L; 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 protected Long id;
 @Version
 protected Long version;
 @Override
public int hashCode() {
  int hash = 0;
  hash += (id != null ? id.hashCode() : 0); 
  return hash;
}
// initialisation
public AbstractEntity build(Long id, Long version) { 
	this.id = id;
    this.version = version;
    return this;
}
public boolean equals(Object entity) {
	 String class1 = this.getClass().getName();
	 String class2 = entity.getClass().getName();
	if (!class2.equals(class1) || entity==null) {
     return false;
	}
    AbstractEntity other = (AbstractEntity) entity;
	return this.id.longValue() == other.id.longValue();
}
/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @return the version
 */
public Long getVersion() {
	return version;
}
/**
 * @param version the version to set
 */
public void setVersion(Long version) {
	this.version = version;
}

} 