package org.ahmetaksunger;

import java.util.logging.Logger;

public interface Department {

    Logger logger = Logger.getLogger("Department Logger");

    void printDepartmentName();

    Integer calculateMemberAmount();

}
