package com.xuyifan.dspmanager.bean;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.OPERATOR_ID
     *
     * @mbggenerated
     */
    private Long operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.OPERATOR_TYPE
     *
     * @mbggenerated
     */
    private String operatorType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.RESOURCE_TYPE
     *
     * @mbggenerated
     */
    private String resourceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.RESOURCE_ID
     *
     * @mbggenerated
     */
    private Long resourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.PERMISSION_ACTION
     *
     * @mbggenerated
     */
    private Integer permissionAction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.PERMISSION_ALLOW
     *
     * @mbggenerated
     */
    private Integer permissionAllow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.ID
     *
     * @return the value of permission.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.ID
     *
     * @param id the value for permission.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.OPERATOR_ID
     *
     * @return the value of permission.OPERATOR_ID
     *
     * @mbggenerated
     */
    public Long getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.OPERATOR_ID
     *
     * @param operatorId the value for permission.OPERATOR_ID
     *
     * @mbggenerated
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.OPERATOR_TYPE
     *
     * @return the value of permission.OPERATOR_TYPE
     *
     * @mbggenerated
     */
    public String getOperatorType() {
        return operatorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.OPERATOR_TYPE
     *
     * @param operatorType the value for permission.OPERATOR_TYPE
     *
     * @mbggenerated
     */
    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType == null ? null : operatorType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.RESOURCE_TYPE
     *
     * @return the value of permission.RESOURCE_TYPE
     *
     * @mbggenerated
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.RESOURCE_TYPE
     *
     * @param resourceType the value for permission.RESOURCE_TYPE
     *
     * @mbggenerated
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.RESOURCE_ID
     *
     * @return the value of permission.RESOURCE_ID
     *
     * @mbggenerated
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.RESOURCE_ID
     *
     * @param resourceId the value for permission.RESOURCE_ID
     *
     * @mbggenerated
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.PERMISSION_ACTION
     *
     * @return the value of permission.PERMISSION_ACTION
     *
     * @mbggenerated
     */
    public Integer getPermissionAction() {
        return permissionAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.PERMISSION_ACTION
     *
     * @param permissionAction the value for permission.PERMISSION_ACTION
     *
     * @mbggenerated
     */
    public void setPermissionAction(Integer permissionAction) {
        this.permissionAction = permissionAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.PERMISSION_ALLOW
     *
     * @return the value of permission.PERMISSION_ALLOW
     *
     * @mbggenerated
     */
    public Integer getPermissionAllow() {
        return permissionAllow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.PERMISSION_ALLOW
     *
     * @param permissionAllow the value for permission.PERMISSION_ALLOW
     *
     * @mbggenerated
     */
    public void setPermissionAllow(Integer permissionAllow) {
        this.permissionAllow = permissionAllow;
    }
}