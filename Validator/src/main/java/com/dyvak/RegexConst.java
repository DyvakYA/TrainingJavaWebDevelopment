package com.dyvak;

/**
 * RegexConstants.java
 * <p>
 * It is class for store all finalizing variable.
 * This class describes all the rules for validation.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 5.11.2016.
 */
public class RegexConst {

    // The Regex
    protected final String STRING_REG = "^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$";

    protected final String NUMBER_REG = "^[0-9-_\\.]{1,20}$";

    // «+38(044)555-55-55»
    protected final String PHONE_REG = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
    protected final String PHONE_REG_PLUS_NULL = "^(((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10})?$";

    // «nick@mail.com»
    protected final String MAIL_REG = "[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@([a-zA-Z]+\\u002E){1,2}((net)|(com)|(org))";

    // «http://www.my-site.com»
    protected final String URL_REG = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";

}
