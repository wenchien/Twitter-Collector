package com.twitterWeb.main.beans;

import com.twitterWeb.jsonMap.TaskConfig;

public class Task {
	private TaskConfig taskConf;
	private int status;
	
	public Task() {
		
	}
	
	public Task(TaskConfig tc) {
		this.taskConf = tc;
	}
	
	//do i need synchronized here? do i access data
	//that will be affected during multi-threading?
	public synchronized void execute() {
		
	}
}
