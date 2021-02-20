package in.arjsna.permissionchecker.models;

import java.util.HashSet;
import java.util.Set;

/**
 * developed by team shark
 */

public class PermissionGroupDetails {
  public String permissionGroupName;
  public String permissionGroupDes;
  public int appsCount;
  public final Set<String> appPackages = new HashSet<>();
}
