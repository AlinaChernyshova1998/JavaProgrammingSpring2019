package vasil_class;

public class dataBase {
	public static String lameDb(String db, String op, String id, String data) {
		String[] str = db.split("#");
		String db2 = "";
		int id2 = Integer.parseInt(id);
		switch (op) {
		case "add":
			db += "#" + id + data;
			return db;
		case "edit":

			str[id2 - 1] = id + data;
			break;
		case "delete":
			str[id2 - 1] = "";

		}
		for (String db1 : str) {
			db2 += db1 + "#";
		}
		while (db2.charAt(db2.length() - 1) == '#') {
			db2 = db2.substring(0, db2.length() - 1);
		}

		return db2;
	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}
}
