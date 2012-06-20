package ningbo.media.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Image {

	public static void main(String args[]) {
		String str = getImageBase64("C:\\images_test\\3.jpg");

		//System.out.println(str);
		System.out.println(StringUtil.replaceBlank(str));
		//System.out.println(str.length()) ;//1064408
		String temp = StringUtil.replaceBlank(str) ;
		if (generateImage(temp,"C:/server/apache-tomcat-6.0.35/230")) {
			System.out.println("ok");
		}

	}

	public static String getImageBase64(String imagePath) {
		String content = null ;
		if (null == imagePath) {
			return null;
		}
		InputStream in = null;
		byte[] data = null;
		// 读取图片字节数组
		try {
			in = new FileInputStream(imagePath);
			data = new byte[in.available()];
			in.read(data);
			// 对字节数组Base64编码
			BASE64Encoder encoder = new BASE64Encoder();
			content = encoder.encode(data).trim() ;
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return content;
	}

	public static boolean generateImage(String imageCode, String savePath) {

		if (null == imageCode) {
			return false;
		}

		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// Base64解码
			byte[] b = decoder.decodeBuffer(imageCode.trim());
			//for (int i = 0; i < b.length; ++i) {
			//	if (b[i] < 0) {// 调整异常数据
			//		b[i] += 256;
			//	}
			//}
			RandomAccessFile inOut = new RandomAccessFile(savePath,"rw");
			//OutputStream out = new FileOutputStream(savePath);
			//out.write(b);
			//out.flush();
			//out.close();
			inOut.write(b) ;
			inOut.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
