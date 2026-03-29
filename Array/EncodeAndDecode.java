
import java.util.ArrayList;
import java.util.List;

class Codec {

    
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append("#").append(s);
        }
        return encoded.toString();
    }

    
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
           
            int hashIndex = s.indexOf('#', i);
            
           
            int length = Integer.parseInt(s.substring(i, hashIndex));
            
            int wordStart = hashIndex + 1;
            int wordEnd = wordStart + length;
            
            decoded.add(s.substring(wordStart, wordEnd));
            i = wordEnd;
        }
        
        return decoded;
    }
}

public class EncodeAndDecode {
    
}
