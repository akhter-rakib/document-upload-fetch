package com.rakib.documentuploadfetch.util;

public class UrlConstraint {
    private UrlConstraint() {

    }

    private static final String VERSION = "/v1";
    private static final String API = "/api";

    public static class DocumentManagement {
        public static final String ROOT = API + VERSION + "/documents";
        public static final String CREATE = "/create";
    }

    public static class EmployeeManagement {
        public static final String ROOT = API + VERSION + "/employees";
        public static final String CREATE = "/create";
    }
}
