package br.gov.ma.tce.util;

import java.io.ByteArrayOutputStream;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class ZxingUtil {
	
	public static byte[] getQRCodeImage(String text, String url, int width, int height) {
		try {			
			
			QRCodeWriter qrCodeWriter = new QRCodeWriter();
			BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			MatrixToImageWriter.writeToStream(bitMatrix, "png", byteArrayOutputStream);

			return byteArrayOutputStream.toByteArray();

		} catch (Exception e) {
			return null;
		}
	}
	
	public static byte[] generateQRCodeImage(String text, int width, int height) {
		try {
			BitMatrix matrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			//MatrixToImageWriter.writeToStream(matrix, MediaType.IMAGE_PNG.getSubtype(), byteArrayOutputStream, new MatrixToImageConfig());

			return byteArrayOutputStream.toByteArray();

		} catch (Exception e) {
			return null;
		}
	}
}
