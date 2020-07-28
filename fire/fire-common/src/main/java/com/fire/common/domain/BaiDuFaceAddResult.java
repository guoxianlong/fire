package com.fire.common.domain;

/**
 * @Author: xinzhifu
 * @Description:
 */
public class BaiDuFaceAddResult {

    /**
     * error_code : 0
     * error_msg : SUCCESS
     * log_id : 7594259435752
     * timestamp : 1595914715
     * cached : 0
     * result : {"face_token":"9fec987d2bd91153b3f145c403421319","location":{"left":186.65,"top":174.93,"width":152,"height":201,"rotation":4}}
     */

    private int error_code;
    private String error_msg;
    private long log_id;
    private int timestamp;
    private int cached;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getCached() {
        return cached;
    }

    public void setCached(int cached) {
        this.cached = cached;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * face_token : 9fec987d2bd91153b3f145c403421319
         * location : {"left":186.65,"top":174.93,"width":152,"height":201,"rotation":4}
         */

        private String face_token;
        private LocationBean location;

        public String getFace_token() {
            return face_token;
        }

        public void setFace_token(String face_token) {
            this.face_token = face_token;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public static class LocationBean {
            /**
             * left : 186.65
             * top : 174.93
             * width : 152
             * height : 201
             * rotation : 4
             */

            private double left;
            private double top;
            private int width;
            private int height;
            private int rotation;

            public double getLeft() {
                return left;
            }

            public void setLeft(double left) {
                this.left = left;
            }

            public double getTop() {
                return top;
            }

            public void setTop(double top) {
                this.top = top;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getRotation() {
                return rotation;
            }

            public void setRotation(int rotation) {
                this.rotation = rotation;
            }
        }
    }
}
