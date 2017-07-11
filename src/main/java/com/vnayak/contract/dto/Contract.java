/**
 * 
 */
package com.vnayak.contract.dto;

/**
 * @author vnayak
 *
 */
public class Contract {
  private String name;
  private int id;
  
  

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Contract [name=").append(name).append(", id=").append(id).append("]");
	return builder.toString();
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
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

  
  
}
