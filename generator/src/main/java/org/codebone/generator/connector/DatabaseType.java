package org.codebone.generator.connector;

public enum DatabaseType {
	MYSQL, MSSQL;
	
	public static boolean isMySQL(DatabaseType databaseType) {
		return databaseType == MYSQL ? true : false;
	}
	
	public static boolean isMSSQL(DatabaseType databaseType) {
		return databaseType == MSSQL ? true : false;
	}
}