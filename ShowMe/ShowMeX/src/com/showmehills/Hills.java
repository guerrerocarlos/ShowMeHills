/*
    Copyright 2012 Nik Cain nik@showmehills.com
    
    This file is part of ShowMeHills.

    ShowMeHills is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ShowMeHills is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ShowMeHills.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.showmehills;

public class Hills {
	public Hills(int _id, String n, double lon, double lat, double ht) {
		id = _id;
		hillname = n;
		longitude = lon;
		latitude = lat;
		height = ht;
	}
	int id;
	String hillname;
	double longitude;
	double latitude;
	double direction;
	double distance;
	double visualElevation; // vertical angle looking at peak
	double height;
}

