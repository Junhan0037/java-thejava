package org.example;

public class Moim {

    int maxNumberOfAttendes;
    int numberOfEnrollment;

    public boolean isEnrollmentFull() {
        if (maxNumberOfAttendes == 0 ) {
            return false;
        }
        if (numberOfEnrollment < maxNumberOfAttendes) {
            return false;
        }
        return true;
    }

}
