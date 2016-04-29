package com.itcuties.android.apps.itcsqliteexample.sql;

public class Todo {

	private int id, priority;
	private String text;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
