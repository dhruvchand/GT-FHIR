package edu.gatech.i3l.jpa.model.omop;

import ca.uhn.fhir.model.api.IResource;

/**
 * This interface is used to mapping properties of an Entity to a given Resource.
 * @author Ismael Sarmento
 */
public interface IResourceTable {

	/**
	 * Creates an object of the Resource type related to this entity and sets each property accordingly.
	 * @return the related Resource Instance.
	 */
	public <T extends IResource> T getRelatedResource();
	
	/**
	 * @return The Resource Class related to the Entity. 
	 */
	public Class<? extends IResource> getRelatedResourceType();
}