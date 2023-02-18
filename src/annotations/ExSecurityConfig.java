package annotations;

@SecurityConfig(allowed = { @Group("admin"), @Group("user")})
public class ExSecurityConfig {
}
