package fr.soat.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.soat.model.Accommodation;
import fr.soat.model.SearchAccommodationParams;

@Service("accommodationService")
public class AccommodationServiceImpl implements AccommodationService {

	public static final String URL_DOMAIN = "http://localhost:8080";

	public static final String SEARCH_METHOD = "/search";
	public static final String SEARCH_ALL_METHOD = "/searchAll";

	public List<Accommodation> findAll() {

		RestTemplate rest = getRestService();

		Accommodation[] accommodations = rest.getForObject(URL_DOMAIN + SEARCH_ALL_METHOD, Accommodation[].class);

		return Arrays.asList(accommodations);
	}

	@Override
	public List<Accommodation> find(SearchAccommodationParams searchParams) {

		RestTemplate rest = getRestService();
		
		Accommodation[] accommodations = rest.getForObject(URL_DOMAIN + SEARCH_METHOD +
				"?type={type}"
				+ "&city={city}"
				+ "&minSurface={minSurface}"
				+ "&minRooms={minRooms}"
				+ "&floor={floor}"
				+ "&elevator={elevator}"
				+ "&maxRentCharge={maxRentCharge}"
				+ "&maxAvailabilityDate={maxAvailabilityDate}",
				Accommodation[].class,
				searchParams.getType(),
				searchParams.getCity(),
				searchParams.getMinSurface(),
				searchParams.getMinRooms(), 
				searchParams.getFloor(),
				searchParams.getElevator(),
				searchParams.getMaxRentCharge(), 
				searchParams.getMaxAvailabilityDate());

		return Arrays.asList(accommodations);
	}

	private RestTemplate getRestService() {
		
		RestTemplate rest = new RestTemplate();

		List<HttpMessageConverter<?>> converters = rest.getMessageConverters();
		
		for (HttpMessageConverter<?> converter : converters) {
			if (converter instanceof MappingJackson2HttpMessageConverter) {
				System.out.println("hello from " + AccommodationServiceImpl.class);

				MappingJackson2HttpMessageConverter jacksonConverter = (MappingJackson2HttpMessageConverter) converter;

				ObjectMapper objMapper = new ObjectMapper();
				objMapper.setDateFormat(new SimpleDateFormat() {

					@Override
					public Date parse(String source) throws ParseException {
						return new Date(Long.parseLong(source));
					}

				});

				jacksonConverter.setObjectMapper(objMapper);
			}
		}
		
		rest.setMessageConverters(converters);
		
		return rest;
	}
}
