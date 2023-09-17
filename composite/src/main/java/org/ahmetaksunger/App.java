package org.ahmetaksunger;

import java.util.List;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger("");
    public static void main(String[] args) {

        Member m1 = new Member("John");
        Member m2 = new Member("Ashley");
        Member m3 = new Member("Matthew");
        Member m4 = new Member("Thomson");
        Member m5 = new Member("Julia");

        SalesDepartment salesDepartment = new SalesDepartment(1L,"Sales Department",List.of(m1,m2));
        FinancialDepartment financialDepartment = new FinancialDepartment(2L,"Financial Department",List.of(m2,m3,m4));
        EducationalDepartment educationalDepartment = new EducationalDepartment(3L,"Educational Department",List.of(m5,m1));

        HeadDepartment headDepartment = new HeadDepartment(
                salesDepartment,
                financialDepartment,
                educationalDepartment
        );

        logger.info(headDepartment.calculateMemberAmount().toString());
        headDepartment.printDepartmentName();

    }
}
