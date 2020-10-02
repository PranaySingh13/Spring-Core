package com.gk.beans;

import java.util.ArrayList;

public class City_State_Collection {

	public ArrayList<City_State> city_state = new ArrayList<City_State>();

	public ArrayList<City_State> getCity_state() {
		city_state.add(new City_State("Indore", "M.P."));
		city_state.add(new City_State("Gwalior", "M.P."));
		city_state.add(new City_State("Pune", "Maharashtra"));
		city_state.add(new City_State("Mumbai", "Maharashtra"));
		city_state.add(new City_State("Gurgaon", "Uttar pradesh"));
		city_state.add(new City_State("Noida", "Uttar pradesh"));
		return city_state;
	}

}
