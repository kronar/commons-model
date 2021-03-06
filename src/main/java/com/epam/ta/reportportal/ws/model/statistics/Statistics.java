/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */ 
 
package com.epam.ta.reportportal.ws.model.statistics;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class Statistics {

	@Valid
	@JsonProperty(value = "executions")
	private ExecutionCounter executions;

	@JsonProperty(value = "defects")
	private IssueCounter defects;

	public ExecutionCounter getExecutions() {
		return executions;
	}

	public void setExecutions(ExecutionCounter executions) {
		this.executions = executions;
	}

	public IssueCounter getDefects() {
		return defects;
	}

	public void setDefects(IssueCounter defects) {
		this.defects = defects;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Statistics{");
		sb.append("executions=").append(executions);
		sb.append(", defects=").append(defects);
		sb.append('}');
		return sb.toString();
	}
}