package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    //state of object (fields)
    //default translation for the word
    private String mDefaultTranslation;
    //miwok translation for the word
    private String mMiwokTranslation;
    //resource ID of the image to be included along the word
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    //a constant that represents a no image state
    private static final int NO_IMAGE_PROVIDED = -1;
    //resource ID of a raw audio
    private int mAudioResourceID;

    //constructor


    /**
     * Create a new word object
     *
     * @param wordInMiwok   is the word in Miwok language
     * @param wordInEnglish is the word in a language that the user is already familiar with (in english)
     */
    public Word(String wordInMiwok, String wordInEnglish) {
        this.mDefaultTranslation = wordInEnglish;
        this.mMiwokTranslation = wordInMiwok;
    }

    /**
     * Create a new word object that has an associated image
     *
     * @param wordInMiwok   is the word in Miwok language
     * @param wordInEnglish is the word in a language that the user is already familiar with (in english)
     * @param rawAudioID    is the drawable resource ID of the image
     */
    public Word(String wordInMiwok, String wordInEnglish, int rawAudioID) {
        this.mDefaultTranslation = wordInEnglish;
        this.mMiwokTranslation = wordInMiwok;
        this.mAudioResourceID = rawAudioID;
    }

    /**
     * Create a new word object that has an associated image and an audio file.
     *
     * @param wordInMiwok   is the word in Miwok language
     * @param wordInEnglish is the word in a language that the user is already familiar with (in english)
     * @param resourceID    is the drawable resource ID of the image
     * @param rawAudio      is the raw resource ID of the audio file
     */
    public Word(String wordInMiwok, String wordInEnglish, int resourceID, int rawAudio) {
        this.mDefaultTranslation = wordInEnglish;
        this.mMiwokTranslation = wordInMiwok;
        this.mImageResourceID = resourceID;
        this.mAudioResourceID = rawAudio;
    }


    //methods of object

    /**
     * Get the default translation of the word
     *
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word
     *
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the resource ID of the image associated with the word
     *
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this word
     *
     * @return Returns true if a word has an associated image. Returns false otherwise
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the resource ID of the audio file saved in the raw directory of res folder(directory)
     * @return
     */
    public int getAudioFileID() {
        return this.mAudioResourceID;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }

}
