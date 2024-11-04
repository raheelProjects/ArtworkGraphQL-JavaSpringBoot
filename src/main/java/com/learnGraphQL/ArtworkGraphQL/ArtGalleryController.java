package com.learnGraphQL.ArtworkGraphQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.learnGraphQL.ArtworkGraphQL.ArtWork.ArtWork;
import com.learnGraphQL.ArtworkGraphQL.ArtWork.ArtWorkService;
import com.learnGraphQL.ArtworkGraphQL.Owner.Owner;
import com.learnGraphQL.ArtworkGraphQL.Owner.OwnerService;

@Controller
public class ArtGalleryController {
	
	private ArtWorkService aws;
	private OwnerService os;
	
	@Autowired
	public ArtGalleryController(ArtWorkService aws, OwnerService os) {
		this.aws = aws;
		this.os = os;
	}
	
	@QueryMapping
	List<Owner> getAllOwner(){
		return this.os.getAllOwners();
	}
	
	@QueryMapping
	Owner ownerInfo(@Argument int id) {
		return this.os.getOwner(id);
	}
	
	@QueryMapping
	List<ArtWork> getAllArtWork(){
		return this.aws.getAllArtWork();
	}
	
	@QueryMapping
	ArtWork getArtWork(@Argument int id){
		return this.aws.getArtWork(id);
	}
	
	@SchemaMapping
	public Owner owner(ArtWork artworkData) {
		return this.os.getOwner(artworkData.getOwner());
	}
	
	@MutationMapping
	Owner addOwner(@Argument String name) {
		return this.os.addOwner(new Owner(name));
	}
	
	@MutationMapping
	ArtWork addArtWork(@Argument String name,@Argument String createdYear,@Argument int authorId) {
		return this.aws.addArtWork(new ArtWork(name,createdYear,authorId));
	}
//	@QueryMapping
//	Owner ownerInfo(int id) {
//		return this.os.getOwner(id);
//	}

	

}
