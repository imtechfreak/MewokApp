package in.co.rohitjain.mewokapp;


public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultWord;
    private String mMiwokWord;
    private int mAudioResourceId;
    private int mResourceID = NO_IMAGE_PROVIDED;

    public Word(String defaultword, String miwokword,int audioResourceId){
       mDefaultWord = defaultword;
       mMiwokWord = miwokword;
       mAudioResourceId = audioResourceId;
    }

    public Word(String defaultWord,String miwokWord,int resourceID,int audioResourceId){
     mDefaultWord = defaultWord;
     mMiwokWord  =   miwokWord;
     mResourceID = resourceID;
     mAudioResourceId = audioResourceId;
    }

    public int getmResourceID() {
        return mResourceID;
    }

    public String getmDefaultWord() {
        return mDefaultWord;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public boolean hasImage(){
        return mResourceID != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
