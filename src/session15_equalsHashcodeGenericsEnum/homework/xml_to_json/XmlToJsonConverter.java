package session15_equalsHashcodeGenericsEnum.homework.xml_to_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlToJsonConverter {
    public static String convertXmlToJson(String fileName) {
        String jsonString = null;
        try {
            File xmlFile = new File(fileName);

            ObjectMapper xmlMapper = new XmlMapper();
            ObjectMapper jsonMapper = new ObjectMapper();

            Object xmlObject = xmlMapper.readValue(xmlFile, Object.class);
            jsonString = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(xmlObject);

            return jsonString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

    public static void main(String[] args) {
        String fileName = "/Users/david/java/src/session15/homework/xml_to_json/bookstore.xml";
        String fileName2 = "/Users/david/java/src/session15/homework/xml_to_json/catalog.xml";
        System.out.println(convertXmlToJson(fileName));
        System.out.println(convertXmlToJson(fileName2));
    }
}

