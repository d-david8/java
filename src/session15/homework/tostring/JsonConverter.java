package session15.homework.tostring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/*
 * Create a method that returns a JSON representation of an object. The method should make use of the toString
 * method to facilitate this.
 * */
public class JsonConverter {
    private final int id;
    private final String name;
    private final String description;

    public JsonConverter(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        try {
            ObjectMapper mapper = new ObjectMapper();

            ObjectNode user = mapper.createObjectNode();
            user.put("id", id);
            user.put("name", name);
            user.put("description", description);
            String json = null;
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            return json;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JsonConverter jsonConverter = new JsonConverter(1212, "Object name", "Object description");

        System.out.println(jsonConverter);
    }
}
