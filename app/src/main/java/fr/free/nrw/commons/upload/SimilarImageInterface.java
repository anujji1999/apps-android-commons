package fr.free.nrw.commons.upload;

public interface SimilarImageInterface {
    void showSimilarImageFragment(String originalFilePath, String possibleFilePath,
        GPSExtractor originalPictureExtractor, GPSExtractor similarPictureExtractor);
}
