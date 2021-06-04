package ink.lch.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.department_id
     *
     * @mbg.generated
     */
    private String departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.parent_department_id
     *
     * @mbg.generated
     */
    private String parentDepartmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.leader_user_id
     *
     * @mbg.generated
     */
    private String leaderUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dept_order
     *
     * @mbg.generated
     */
    private Integer deptOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dept
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.department_id
     *
     * @return the value of dept.department_id
     *
     * @mbg.generated
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.department_id
     *
     * @param departmentId the value for dept.department_id
     *
     * @mbg.generated
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.name
     *
     * @return the value of dept.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.name
     *
     * @param name the value for dept.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.parent_department_id
     *
     * @return the value of dept.parent_department_id
     *
     * @mbg.generated
     */
    public String getParentDepartmentId() {
        return parentDepartmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.parent_department_id
     *
     * @param parentDepartmentId the value for dept.parent_department_id
     *
     * @mbg.generated
     */
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId == null ? null : parentDepartmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.leader_user_id
     *
     * @return the value of dept.leader_user_id
     *
     * @mbg.generated
     */
    public String getLeaderUserId() {
        return leaderUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.leader_user_id
     *
     * @param leaderUserId the value for dept.leader_user_id
     *
     * @mbg.generated
     */
    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId == null ? null : leaderUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dept_order
     *
     * @return the value of dept.dept_order
     *
     * @mbg.generated
     */
    public Integer getDeptOrder() {
        return deptOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dept_order
     *
     * @param deptOrder the value for dept.dept_order
     *
     * @mbg.generated
     */
    public void setDeptOrder(Integer deptOrder) {
        this.deptOrder = deptOrder;
    }
}