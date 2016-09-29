package com.una.kawaii.common.constant;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ICommonConstant {

    interface TimeStampManipulation{
        /**
         * Timestamp Manipulation
         */
        String TIMESTAMP_TO_STRING = "dd-MM-yyyy hh:mm:ss";

        String TIMESTAMP_TO_TIME = "hh:mm:ss";

        String TIMESTAMP_TO_DATE_HYPHEN_SEPARATOR = "dd-MM-yyyy";

        String TIMESTAMP_TO_DATE_COLON_SEPARATOR = "dd:MM:yyyy";
    }

    interface Validation{
        /**
         * Character Manipulation
         */
        String SPECIAL_CHAR = "[^\\w\\s\\-_]";

        String IS_VALID_EMAIL_REGEX_VALIDATOR = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        String IS_VALID_PHONE_NUMBER_REGEX_VALIDATOR = "^([0-9\\(\\)\\/\\+ \\-]*)$";

        String IS_CONTAIN_UPPER_CASE_REGEX_VALIDATOR = ".*[A-Z].*";

        String IS_CONTAIN_LOWER_CASE_REGEX_VALIDATOR = ".*[a-z].*";

        String IS_CONTAIN_NUMBER_REGEX_VALIDATOR = ".*\\d.*";

        String IS_CONTAIN_SPECIAL_SYMBOL_REGEX_VALIDATOR = ".*[@*$!].*"; //@#$%

        String IS_IN_DETERMINED_LENGTH_REGEX_VALIDATOR = ".{8,20}";

        String IS_VALID_NUMERIX_REGEX_VALIDATOR = "[0-9]+?";

        String IS_VALID_IP_ADDRESS_REGEX_VALIDATOR = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";

        /**
         * Validate password with requirements :
         * - must contains one digit from 0-9
         * - must contains one lowercase characters
         * - must contains one uppercase characters
         * - must contains one special symbols in the list "@#$%"
         * - match anything with previous condition checking
         * - length at least 6 characters and maximum of 20
         */
        String IS_VALID_PASSWORD_BUNDLE_REGEX_VALIDATOR = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

        /**
         * Validate a String only contains a number in specific 45 characters range
         */
        String IS_ONLY_NUMBERS_LIMITED_45 = "^[0-9]{1,45}$";
    }

    interface Error{
        String APPLICATION_ERROR    = "application error";
    }

    public interface BinaryValue {
        int MINUS_ONE = -1;
        int ZERO = 0;
        int ONE = 1;
    }

    public interface Punctuation {
        String SPACE = " ";
        String COLON = ":";
        String SEMI_COLON = ";";
        String COMMA = ",";
        String QUESTION = "?";
        String UNDERSCORE = "_";
        String HYPHEN = "-";
        String SLASH = "/";
        String EMPTY = "";
    }
}
