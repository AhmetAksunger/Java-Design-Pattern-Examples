package org.ahmetaksunger;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SalesDepartment implements Department{

    private Long id;
    private String name;
    private List<Member> members;

    @Override
    public void printDepartmentName() {
        logger.info(name);
    }

    @Override
    public Integer calculateMemberAmount() {
        return members.size();
    }
}
