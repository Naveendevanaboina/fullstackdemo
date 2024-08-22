package com.neoteric.fullstackdemo.model;

public class Otp {



        public String mobileNumber;
        public String otp;

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        @Override
        public String toString() {
            return "OTP{" +
                    "mobileNumber='" + mobileNumber + '\'' +
                    ", otp='" + otp + '\'' +
                    '}';

    }
}
