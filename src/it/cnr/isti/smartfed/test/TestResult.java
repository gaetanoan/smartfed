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

package it.cnr.isti.smartfed.test;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

public class TestResult
{
	public static SummaryStatistics allocationTime;
	public static SummaryStatistics mappingTime;
	public static SummaryStatistics berger;
	private static SummaryStatistics cost;
	private static SummaryStatistics failures;
	private static SummaryStatistics vmDifference;
	private static SummaryStatistics lockDegree;
	
	static
	{
		reset();
	}
	
	public static void reset()
	{
		allocationTime = new SummaryStatistics();
		mappingTime = new SummaryStatistics();
		berger = new SummaryStatistics();
		cost = new SummaryStatistics();	
		failures = new SummaryStatistics();
		vmDifference = new SummaryStatistics();
		lockDegree= new SummaryStatistics();
	}
		
	public static SummaryStatistics getLockDegree() {
		return lockDegree;
	}

	public static void setLockDegree(SummaryStatistics lockDegree) {
		TestResult.lockDegree = lockDegree;
	}

	public static SummaryStatistics getAllocationTime() {
		return allocationTime;
	}

	public static SummaryStatistics getMappingTime() {
		return mappingTime;
	}
	
	public static SummaryStatistics getBerger() {
		return berger;
	}

	public static SummaryStatistics getCost() {
		return cost;
	}

	public static SummaryStatistics getFailures() {
		return failures;
	}

	public static SummaryStatistics getVmDifference() {
		return vmDifference;
	}

	public static void setVmDifference(SummaryStatistics vmDifference) {
		TestResult.vmDifference = vmDifference;
	}
}
