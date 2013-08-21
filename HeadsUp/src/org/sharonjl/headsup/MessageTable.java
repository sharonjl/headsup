package org.sharonjl.headsup;

import android.database.sqlite.SQLiteDatabase;

public class MessageTable {

	public static final String TABLE_MESSAGE = "message";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_TIME = "messageTime";
	public static final String COLUMN_CONTENT = "messageContent";

	private static final String TABLE_CREATE = "create table " + TABLE_MESSAGE + " ("
			+ COLUMN_ID + " integer primary key autoincrement, "
			+ COLUMN_TIME + " integer, "
			+ COLUMN_CONTENT + " text); ";

	public static void onCreate(SQLiteDatabase database) {
		database.execSQL(TABLE_CREATE);
		
		database.execSQL("insert into ( " + COLUMN_TIME + ", "  +  COLUMN_CONTENT +") values ("  + System.currentTimeMillis() + ", 'Set your home location.');");
		database.execSQL("insert into ( " + COLUMN_TIME + ", "  +  COLUMN_CONTENT +") values ("  + System.currentTimeMillis() + ", 'Set your work location.');");
	}

	public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {

	}
}
