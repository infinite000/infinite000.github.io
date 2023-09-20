package com.soft.apl;

import com.baidu.aip.face.AipFace;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.*;


/**
 * @Author:
 * @Description: 百度api人脸搜索
 * @Date: Create in 10:37 2021/8/11
 */
@Component
public class FaceSerach {

    //设置APPID/AK/SK 可以换成自己账号的信息
//    public static final String APP_ID = "24328669";
//    public static final String API_KEY = "s8VLQ0djm7BQLbmmo5MoG6AU";
//    public static final String SECRET_KEY = "Tttv9EaRb4KKjKh6vDFN7bTr8InHvIK0";
  public static final String APP_ID = "32575743";
    public static final String API_KEY = "MDDQmbiEaRwj3tqv8mFkSLZt";
    public static final String SECRET_KEY = "6c7jK1oTzaukzO1dGzRp2zbqcotrCWx0";

    /**
     *
     * @param faceImage     图片的base64，前端拿过来的是截取22位的
     * @param groupIdList   搜索人脸库的组列表
     * @return
     * @throws IOException
     */
    public JSONObject searchbase64(String faceImage,String groupIdList) throws IOException {
        // 初始化一个AipFace
        AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);
        // 传入可选参数调用接口
       /* HashMap<String, String> options = new HashMap<String, String>();
        options.put("max_face_num", "3");
        options.put("match_threshold", "70");
        options.put("quality_control", "NORMAL");
        options.put("liveness_control", "LOW");
        options.put("user_id", "001");
        options.put("max_user_num", "3");*/
        String imageType = "BASE64";

        // 人脸搜索
        JSONObject res = client.search(faceImage, imageType, groupIdList, null);
        System.out.println(res.toString(2));
        return res;
    }


}
