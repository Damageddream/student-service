package com.DD.students.exception;

public enum StudentError {
    STUDENT_NOT_FOUND("Student does not exists");
    private String message;

    StudentError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
