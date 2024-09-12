package last.file;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    // ObjectMapper 생성
    ObjectMapper objectMapper = new ObjectMapper();

    // 메서드 오버로딩 => 매개변수 모양만 다르면 동일한 이름의 메서드 여러개 만들기 가능
    public String toJsonString(Object object) {
        // 직렬화할 객체 생성

        try {
            // 객체를 JSON 문자열로 직렬화
            String jsonString = objectMapper.writeValueAsString(object);
            return jsonString;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object toClass(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, Object.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
