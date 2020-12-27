package leetcode.editor.cn;

//TinyURL是一种URL简化服务， 比如：当你输入一个URL https://leetcode.com/problems/design-tinyurl 时
//，它将返回一个简化的URL http://tinyurl.com/4e9iAk. 
//
// 要求：设计一个 TinyURL 的加密 encode 和解密 decode 的方法。你的加密和解密算法如何设计和运作是没有限制的，你只需要保证一个URL可
//以被加密成一个TinyURL，并且这个TinyURL可以用解密方法恢复成原本的URL。 
// Related Topics 哈希表 数学 
// 👍 105 👎 0

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyurl{
    public static void main(String[] args) {
        Solution solution = new EncodeAndDecodeTinyurl().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
public class Codec {

    Map<Integer, String> map = new HashMap<>();
    int cnt = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(cnt , longUrl) ;
        return "http://tinyurl.com/" + cnt++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
//leetcode submit region end(Prohibit modification and deletion)

}