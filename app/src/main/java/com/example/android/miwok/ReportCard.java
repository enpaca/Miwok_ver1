package com.example.android.miwok;

/**
 * This class was created just for exercise and is not part of the android miwok app.
 * Just ignore this class/file, even though it is in the same package as the app.
 */
public class ReportCard {

    //member fields (instance variables):
    private String mNameOfStudent;
    private int mChemistryGrade;
    private int mPhysicsGrade;
    private int mMathematicsGrade;
    private int mAlbanianGrade;
    private int mEnglishGrade;
    private int mBiologyGrade;

    //constructor:
    public ReportCard(String nameOfStudent, int chemistryGrade, int physicsGrade, int mathematicsGrade, int albanianGrade,
                      int englishGrade, int biologyGrade) {
        this.mNameOfStudent = nameOfStudent;
        this.mChemistryGrade = chemistryGrade;
        this.mPhysicsGrade = physicsGrade;
        this.mMathematicsGrade = mathematicsGrade;
        this.mAlbanianGrade = albanianGrade;
        this.mEnglishGrade = englishGrade;
        this.mBiologyGrade = biologyGrade;
    }

    //member methods (instance methods):
    public String getNameOfStudent() {
        return mNameOfStudent;
    }

    public int getChemistryGrade() {
        return mChemistryGrade;
    }

    public int getPhysicsGrade() {
        return mPhysicsGrade;
    }

    public int getMathematicsGrade() {
        return mMathematicsGrade;
    }

    public int getAlbanianGrade() {
        return mAlbanianGrade;
    }

    public int getEnglishGrade() {
        return mEnglishGrade;
    }

    public int getBiologyGrade() {
        return mBiologyGrade;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.mNameOfStudent = nameOfStudent;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.mChemistryGrade = chemistryGrade;
    }

    public void setPhysicsGrade(int physicsGrade) {
        this.mPhysicsGrade = physicsGrade;
    }

    public void setMathematicsGrade(int mathematicsGrade) {
        this.mMathematicsGrade = mathematicsGrade;
    }

    public void setAlbanianGrade(int albanianGrade) {
        this.mAlbanianGrade = albanianGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.mEnglishGrade = englishGrade;
    }

    public void setBiologyGrade(int biologyGrade) {
        this.mBiologyGrade = biologyGrade;
    }

    @Override
    public String toString() {
        return "Name: " + getNameOfStudent() + "; Chemistry grade: " + getChemistryGrade() + ", English grade: " + getEnglishGrade()
                + " and Mathematics grade: " + getMathematicsGrade();
    }
}
