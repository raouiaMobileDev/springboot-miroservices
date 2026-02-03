package net.javaguide.departementservice.service;

import net.javaguide.departementservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

     DepartmentDto getDepartmentByCode(String code);
}
