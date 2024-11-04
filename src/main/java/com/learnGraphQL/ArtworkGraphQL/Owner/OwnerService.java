package com.learnGraphQL.ArtworkGraphQL.Owner;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class OwnerService {

	private ArrayList<Owner> owners;
	private int idgen;


	public OwnerService() {
		this.owners = new ArrayList();
		this.idgen = 0;	
	}
	
	public Owner addOwner(Owner artworkData){
		artworkData.setId(idgen++);
		this.owners.add(artworkData);
		return artworkData;
	}
	
	public ArrayList<Owner> getAllOwners(){
		return this.owners;
	}
	
	public Owner getOwner(int id) {
		return this.owners.stream().filter(artData->artData.getId()==id).findFirst().orElse(null);
	}

}
