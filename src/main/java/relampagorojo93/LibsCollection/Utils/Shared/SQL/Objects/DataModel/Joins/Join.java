package relampagorojo93.LibsCollection.Utils.Shared.SQL.Objects.DataModel.Joins;

import relampagorojo93.LibsCollection.Utils.Shared.SQL.Objects.DataModel.Column;

public abstract class Join {
	private Column append, origin;

	public Join(Column append, Column origin) {
		this.append = append;
		this.origin = origin;
	}
	public Column getAppend() { return append; }
	public Column getOrigin() { return origin; }
	@Override
	public String toString() {
		return new StringBuilder().append("JOIN ").append(append.getTable().getName()).append(" ON ")
				.append(origin.getTable().getName()).append(".").append(origin.getName()).append(" = ")
				.append(append.getTable().getName()).append(".").append(append.getName()).toString();
	}
}
