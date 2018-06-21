package cc.touchuan.jbus.common.helper;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

public class ByteHelper {

	// ByteBuf to byte[]
	public static byte[] bb2bytes(ByteBuf bb) {
		
		
		ByteBuf copy = bb.copy();
		byte[] bytes = new byte[copy.readableBytes()];
		
		copy.readBytes(bytes);
		
		return bytes;
	}
	

	// string to ByteBuf
	public static ByteBuf str2bb(String str) {
		 return Unpooled. copiedBuffer(str, CharsetUtil. UTF_8);
	}
}
