package org.ahmetaksunger;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class HeadDepartment implements Department{

    private List<Department> childDepartments;

    public HeadDepartment(Department... departments){
        this.childDepartments = Arrays.asList(departments);
    }

    public void addDepartment(Department department){
        this.childDepartments.add(department);
    }

    public void removeDepartment(Department department){
        this.childDepartments.remove(department);
    }

    @Override
    public void printDepartmentName() {
        this.childDepartments.forEach(Department::printDepartmentName);
    }

    @Override
    public Integer calculateMemberAmount() {
        return this.childDepartments.stream().mapToInt(Department::calculateMemberAmount).sum();
    }

}
