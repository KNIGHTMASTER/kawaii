package com.una.kawaii.common.util;

import com.una.kawaii.common.constant.ICommonConstant;
import com.una.kawaii.common.dto.DTOPasswordValidMessenger;
import com.una.kawaii.common.exception.CommonException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class GeneralValidation {


    public boolean isValidAge(String birthDate, int validAge) {
        SimpleDateFormat df = new SimpleDateFormat(ICommonConstant.TimeStampManipulation.TIMESTAMP_TO_DATE_HYPHEN_SEPARATOR);
        Calendar bdCal = Calendar.getInstance();

        boolean result;
        try {
            bdCal.setTime(df.parse(birthDate));
            if(this.getAge(bdCal.get(1), bdCal.get(1), bdCal.get(1)) >= validAge) {
                result = true;
            } else {
                result = false;
            }
        } catch (ParseException var7) {
            new CommonException(var7.getMessage(), var7);
            var7.printStackTrace();
            result = false;
        }

        return result;
    }

    public int getAge(int year, int month, int day) {
        Date now = new Date();
        int nowMonth = now.getMonth() + 1;
        int nowYear = now.getYear() + 1900;
        int result = nowYear - year;
        if(month > nowMonth) {
            --result;
        } else if(month == nowMonth) {
            int nowDay = now.getDate();
            if(day > nowDay) {
                --result;
            }
        }

        return result;
    }

    public boolean isValidEmail(String email) {
        String emailPattern = ICommonConstant.Validation.IS_VALID_EMAIL_REGEX_VALIDATOR;
        email = email.trim();
        boolean result = email.matches(emailPattern) && email.length() > 0;
        return result;
    }

    public boolean isValidPhoneNumber(String phoneNumber) {
        String phoneNumberPattern = ICommonConstant.Validation.IS_VALID_PHONE_NUMBER_REGEX_VALIDATOR;
        phoneNumber = phoneNumber.trim();
        boolean result = phoneNumber.matches(phoneNumberPattern) && phoneNumber.length() > 0;
        return result;
    }

    public boolean isContainUpperCase(String str) {
        String pattern = ".*[A-Z].*";
        str = str.trim();
        boolean result = str.matches(pattern);
        return result;
    }

    public boolean isContainLowerCase(String str) {
        String pattern = ICommonConstant.Validation.IS_CONTAIN_LOWER_CASE_REGEX_VALIDATOR;
        str = str.trim();
        boolean result = str.matches(pattern);
        return result;
    }

    public boolean isContainNumber(String str) {
        String pattern = ICommonConstant.Validation.IS_CONTAIN_NUMBER_REGEX_VALIDATOR;
        str = str.trim();
        boolean result = str.matches(pattern);
        return result;
    }

    public boolean isContainSpecialSymbols(String str) {
        String pattern = ICommonConstant.Validation.IS_CONTAIN_SPECIAL_SYMBOL_REGEX_VALIDATOR;
        str = str.trim();
        boolean result = str.matches(pattern);
        return result;
    }

    public boolean isInDeterminedLength(String str) {
        String pattern = ICommonConstant.Validation.IS_IN_DETERMINED_LENGTH_REGEX_VALIDATOR;
        str = str.trim();
        boolean result = str.matches(pattern);
        return result;
    }

    public boolean isValidNumeric(String value) {
        String numericPattern = ICommonConstant.Validation.IS_VALID_NUMERIX_REGEX_VALIDATOR;
        value = value.trim();
        boolean result = value.matches(numericPattern) && value.length() > 0;
        return result;
    }

    public boolean isValidIpAddress(String ipAddress) {
        String ipPattern = ICommonConstant.Validation.IS_VALID_IP_ADDRESS_REGEX_VALIDATOR;
        ipAddress = ipAddress.trim();
        boolean result = ipAddress.matches(ipPattern) && ipAddress.length() > 0;
        return result;
    }

    public boolean isWorkingHour(int startWorkingHour, int stopWorkingHour) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(7);
        int currentHour = calendar.get(11);
        boolean result = currentHour >= startWorkingHour && currentHour < stopWorkingHour;
        return result;
    }

    public boolean hasPassedNMinutes(Date p_LastRecordTime, Date p_CurrentTime, int p_CheckedTime) {
        long duration = p_CurrentTime.getTime() - p_LastRecordTime.getTime();
        long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        return diffInMinutes == (long)p_CheckedTime;
    }

    public boolean isValidPasswordBundle(String password) {
        Pattern pattern = Pattern.compile(ICommonConstant.Validation.IS_VALID_PASSWORD_BUNDLE_REGEX_VALIDATOR);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public DTOPasswordValidMessenger isValidPasswordPerMessage(String password) {
        DTOPasswordValidMessenger dtoPasswordValidMessenger = new DTOPasswordValidMessenger();
        if(this.isContainNumber(password)) {
            dtoPasswordValidMessenger.setResult(true);
            if(this.isContainLowerCase(password)) {
                dtoPasswordValidMessenger.setResult(true);
                if(this.isContainUpperCase(password)) {
                    dtoPasswordValidMessenger.setResult(true);
                    if(this.isContainSpecialSymbols(password)) {
                        dtoPasswordValidMessenger.setResult(true);
                        if(this.isInDeterminedLength(password)) {
                            dtoPasswordValidMessenger.setResult(true);
                        } else {
                            dtoPasswordValidMessenger.setResult(false);
                            dtoPasswordValidMessenger.setMessage("Password length min 8 max 20");
                        }
                    } else {
                        dtoPasswordValidMessenger.setResult(false);
                        dtoPasswordValidMessenger.setMessage("Password should contain special symbols @#$%");
                    }
                } else {
                    dtoPasswordValidMessenger.setResult(false);
                    dtoPasswordValidMessenger.setMessage("Password should contain upper case");
                }
            } else {
                dtoPasswordValidMessenger.setResult(false);
                dtoPasswordValidMessenger.setMessage("Password should contain lower case");
            }
        } else {
            dtoPasswordValidMessenger.setResult(false);
            dtoPasswordValidMessenger.setMessage("Password should contain number");
        }

        return dtoPasswordValidMessenger;
    }

    public boolean isOnlyNumbersLimited45(String str) {
        String pattern = ICommonConstant.Validation.IS_ONLY_NUMBERS_LIMITED_45;
        str = str.trim();
        boolean result = str.matches(pattern);
        return result;
    }

}
