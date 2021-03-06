/*
Copyright 2013 ISTI-CNR
 
This file is part of SmartFed.

SmartFed is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
 
SmartFed is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
 
You should have received a copy of the GNU General Public License
along with SmartFed. If not, see <http://www.gnu.org/licenses/>.

*/

package it.cnr.isti.smartfed.federation.application;

import it.cnr.isti.smartfed.networking.SecuritySupport;

import org.jgrapht.graph.DefaultEdge;

public class ApplicationEdge extends DefaultEdge
{
	private static final long serialVersionUID = 1423234l;
	
	/* requirements */
	private double bandwidth;
	private SecuritySupport security;
	private double latency;
	
	public ApplicationEdge(double bandwidth, SecuritySupport security, double latency)
	{
		this.bandwidth = bandwidth;
		this.security = security;
		this.latency = latency;
	}
	
	public double getBandwidth()
	{
		return this.bandwidth;
	}

	public SecuritySupport getSecurity()
	{
		return this.security;
	}

	public double getLatency()
	{
		return this.latency;
	}
	
	
}
