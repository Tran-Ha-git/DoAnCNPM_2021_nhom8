package model;


public class UserModel {
    private Long id;
    private String username;
    private String password;
    private  int status;
    private RoleModel role = new RoleModel();
    private Long roleId;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public int getStatus() { return status; }

    public void setStatus(int status) { this.status = status; }

    public RoleModel getRol() { return role; }

    public void setRol(RoleModel rol) { this.role = role; }

    public Long getRoleId() { return roleId; }

    public void setRoleId(Long roleId) { this.roleId = roleId; }
}
