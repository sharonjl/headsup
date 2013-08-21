package org.sharonjl.headsup;

public class MessageTable {

	public static final String TABLE_MESSAGE = "message";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_TIME = "messageTime";
	public static final String COLUMN_CONTENT = "messageContent";

	private static final String TABLE_CREATE = "create table " + TABLE_MESSAGE + " ("
			+ COLUMN_ID + " integer primary key autoincrement, "
			+ COLUMN_TIME + " integer, " 
			+ COLUMN_CONTENT + " text); ";
	
	

}
