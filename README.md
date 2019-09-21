Any remarks regarding this practice will be put here.

Remark no 1:
-adding <service-name>.yml on shared folder on config-service allows you to set some things from the service there.
-if you do that, you need to make a bootstrap.yml (no need application.properties) on the service. put cloud -> config -> uri