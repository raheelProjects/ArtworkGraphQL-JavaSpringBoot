package com.learnGraphQL.ArtworkGraphQL.ArtWork;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ArtWorkService {
	
	private ArrayList<ArtWork> artWorks;
	private int idgen;

	public ArtWorkService() {
		this.artWorks = new ArrayList();
		this.idgen = 0;	
	}
	
	public ArtWork addArtWork(ArtWork artworkData){
		artworkData.setId(idgen++);
		this.artWorks.add(artworkData);
		return artworkData;
	}
	
	public ArrayList<ArtWork> getAllArtWork(){
		return this.artWorks;
	}
	
	public ArtWork getArtWork(int id) {
		return this.artWorks.stream().filter(artData->artData.getId()==id).findFirst().orElse(null);
	}

}
