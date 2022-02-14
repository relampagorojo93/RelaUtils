package relampagorojo93.LibsCollection.Utils.Shared.SQL.Objects.DataModel.Constraints;

import java.util.ArrayList;
import java.util.List;

import relampagorojo93.LibsCollection.Utils.Shared.SQL.Objects.DataModel.Column;

public class UniqueConstraint {
	private List<Column> uniques = new ArrayList<>();
	public UniqueConstraint(Column...columns) { for (Column column:columns) uniques.add(column); }
	public List<Column> getUniques() { return uniques; }
}
