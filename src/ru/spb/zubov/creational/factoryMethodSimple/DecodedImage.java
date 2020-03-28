package ru.spb.zubov.creational.factoryMethodSimple;

class DecodedImage {

    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}
