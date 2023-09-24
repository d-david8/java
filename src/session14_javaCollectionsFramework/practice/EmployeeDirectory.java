package session14_javaCollectionsFramework.practice;

import java.util.HashMap;
import java.util.Map;

class EmployeeDirectory {

    public static void main(String[] args) {
        Map<String, String> employeeMap1 = new HashMap<>();
        employeeMap1.put("E100", "Alice");
        employeeMap1.put("E101", "John");
        employeeMap1.put("E102", "Andrew");
        //displayEmployeeInfo(employeeMap1);

        Map<String, String> employeeMap2 = new HashMap<>();
        employeeMap1.put("E102", "Andrew");
        employeeMap1.put("E103", "Joe");

        Map<String, String> commonEntries = getCommonEntries(employeeMap1, employeeMap2);
        displayEmployeeInfo(commonEntries);
    }

    private static void displayEmployeeInfo(Map<String, String> map) {
        for (Map.Entry<String, String> employee : map.entrySet()) {
            System.out.println("Employee with id: " + employee.getKey() + ", employee name: " + employee.getValue());
        }
    }

    private static Map<String, String> getCommonEntries(Map<String, String> firstMap, Map<String, String> secondMap) {
        Map<String, String> result = new HashMap<>();
        for (String key : firstMap.keySet()) {
            if (secondMap.containsKey(key) && secondMap.get(key).equals(firstMap.get(key))) {
                result.put(key, firstMap.get(key));
            }
        }
        return result;
    }
}
