package ru.spb.zubov.creational.factoryMethodSimple;

//https://evileg.com/ru/post/402/
public class FactoryMethod {

    public static void main(String[] args) {
        String image = "test.jpeg";
        String format = image.substring(image.indexOf('.') + 1);
        ImageReader reader = null;
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        DecodedImage decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}