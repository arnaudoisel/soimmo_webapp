package fr.soat.service;

import java.util.List;

import fr.soat.model.Accommodation;
import fr.soat.model.SearchAccommodationParams;

public interface AccommodationService {

	List<Accommodation> findAll();

	List<Accommodation> find(SearchAccommodationParams searchParams);
	
}
