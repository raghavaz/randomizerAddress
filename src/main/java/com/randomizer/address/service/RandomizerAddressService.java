package com.randomizer.address.service;

import java.util.Random;

import org.springframework.stereotype.Service;



@Service
public class RandomizerAddressService {
	
	int i=1;
	String usStates[]= {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
	String candaStates[]= {"Alberta","British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", " Saskatchewan"};
	
	
	String street[]= {"Alley", "Avenue", "Branch", "Bridge", "Brook", "Brooks", "Burg", "Burg", "Bypass"};
	// Camp, Canyon, Cape, Causeway, Center, Centers, Circle, Circles, Cliff, Cliffs, Club, Common, Corner, Corners, Course, Court, Courts, Cove, Coves, Creek, Crescent, Crest, Crossing, Crossroad, Curve, Dale, Dam, Divide, Drive, Drive, Drives, Estate, Estates, Expressway, Extension, Extensions, Fall, Falls, Ferry, Field, Fields, Flat, Flats, Ford, Fords, Forest, Forge, Forges, Fork, Forks, Fort, Freeway, Garden, Gardens, Gateway, Glen, Glens, Green, Greens, Grove, Groves, Harbor, Harbors, Haven, Heights, Highway, Hill, Hills, Hollow, Inlet, Inlet, Island, Island, Islands, Islands, Isle, Isle, Junction, Junctions, Key, Keys, Knoll, Knolls, Lake, Lakes, Land, Landing, Lane, Light, Lights, Loaf, Lock, Locks, Locks, Lodge, Lodge, Loop, Mall, Manor, Manors, Meadow, Meadows, Mews, Mill, Mills, Mission, Mission, Motorway, Mount, Mountain, Mountain, Mountains, Mountains, Neck, Orchard, Oval, Overpass, Park, Parks, Parkway, Parkways, Pass, Passage, Path, Pike, Pine, Pines, Place, Plain, Plains, Plains, Plaza, Plaza, Point, Points, Port, Port, Ports, Ports, Prairie, Prairie, Radial, Ramp, Ranch, Rapid, Rapids, Rest, Ridge, Ridges, River, Road, Road, Roads, Roads, Route, Row, Rue, Run, Shoal, Shoals, Shore, Shores, Skyway, Spring, Springs, Springs, Spur, Spurs, Square, Square, Squares, Squares, Station, Station, Stravenue, Stravenue, Stream, Stream, Street, Street, Streets, Summit, Summit, Terrace, Throughway, Trace, Track, Trafficway, Trail, Trail, Tunnel, Tunnel, Turnpike, Turnpike, Underpass, Union, Unions, Valley, Valleys, Via, Viaduct, View, Views, Village, Village, Villages, Ville, Vista, Vista, Walk, Walks, Wall, Way, Ways, Well, Wells;
	String communityPrefix[]= {"Park", "Summer", "Autumn", "Paradise", "Eagle", "Pine", "Royal", "University", "Willow"};
	String communitySuffix[]= {"Village", "Creek", "Place", "Pointe", "Square", "Oaks", "Gardens", "Crossing", "Court", "Acres", "Estates", "Heights"};
	private static final Random random = new Random();
	
	public String getAddress() {
		return buildAddress();
	}
	
	 public String streetAddressNumber() {
	        return String.valueOf(random.nextInt(1000));
	 }

	 public String houseNumber() {
	        return String.valueOf(random.nextInt(1000));
	 }
	 
	 public String buildAddress() {
		 StringBuilder st=new StringBuilder();
		 st.append(houseNumber());
		 st.append(",");
		 st.append(communityPrefix[random.nextInt(communityPrefix.length)]);
		 st.append(" ");
		 st.append(communitySuffix[random.nextInt(communitySuffix.length)]);
		 st.append(",");
		 st.append(streetAddressNumber());
		 st.append(" ");
		 st.append(street[random.nextInt(street.length)]);
		 st.append(",");
		 if (i%2==0)
		 st.append(usStates[random.nextInt(usStates.length)]); 
		 
		 else 
		 st.append(candaStates[random.nextInt(candaStates.length)]);
		 i++;
		 
		 return st.toString();
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println(new RandomizerAddressService().buildAddress());
		System.out.println(new RandomizerAddressService().buildAddress());
		System.out.println(new RandomizerAddressService().buildAddress());
		System.out.println(new RandomizerAddressService().buildAddress());
	}
}
