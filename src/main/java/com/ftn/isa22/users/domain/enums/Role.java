package com.ftn.isa22.users.domain.enums;

public enum Role {
    SysAdmin(Values.SysAdmin), BloodBankAdmin(Values.BloodBankAdmin), Customer(Values.Customer);

    Role(String value) {
        if(!this.name().equals(value)) {
            throw new IllegalArgumentException("Incorrect use of role!");
        }
    }

    public static class Values {
        public static final String SysAdmin = "SysAdmin";
        public static final String BloodBankAdmin = "BloodBankAdmin";
        public static final String Customer = "Customer";
    }
}
