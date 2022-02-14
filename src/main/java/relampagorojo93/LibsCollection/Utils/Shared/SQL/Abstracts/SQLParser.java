package relampagorojo93.LibsCollection.Utils.Shared.SQL.Abstracts;

import relampagorojo93.LibsCollection.Utils.Shared.SQL.SQLObject;

public abstract class SQLParser {
	public abstract boolean parse(SQLObject api, String version, String prefix);
}
