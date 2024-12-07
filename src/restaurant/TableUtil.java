package OOP.restaurant;

public class TableUtil {

    public static Table[] tables = new Table[10];

    private static double totalIncome = 0;

    public static int tablesCount = 0;

    public static double getTotalIncome() {
        return totalIncome;
    }

    public static void setTotalIncome(double totalIncome) {
        TableUtil.totalIncome = totalIncome;
    }

    public static void createNewTable(Table table) {
        int percentage = (tablesCount / tables.length) * 100;
        if (percentage >= 80) {
            Table[] tables1 = new Table[tables.length * 2];
            for (int i = 0; i < tablesCount; i++) {
                tables1[i] = tables[i];
            }
            tables = tables1;
        }
        tables[tablesCount] = table;
        tablesCount++;
    }

    public static void removeTable(String tableName) {
        for (int i = 0; i < tablesCount; i++) {
            if (tables[i].getTableName().equals(tableName)) {
                tables[i] = null;
                for (int j = 0; j < tablesCount; j++) {
                    tables[i+j] = tables[i+j+1];
                    tables[i+j+1] = null;
                }
            }
        }
        tablesCount--;
    }

    public static void showAllTables() {
        for (int i = 0; i < tablesCount; i++) {
            if (tables[i] != null) {
                System.out.println(((i+1)+"."+tables[i].getTableName()));
            }
        }
    }

    public static void setTotalIncome() {
        double totalIncome = 0;
        for (int i = 0; i < tablesCount; i++) {
            totalIncome = totalIncome + TableUtil.tables[i].getTotalPrice();
        }

        setTotalIncome(totalIncome);
    }
}
