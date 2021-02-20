package in.arjsna.permissionchecker.models;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/**
 * developed by team shark
 */

public class AppDetails {
  public String name;
  public Drawable icon;
  public String packageName;
  public String publicSrcDir;
  public ArrayList<String> grantedPermissionList = new ArrayList<>();
  public final ArrayList<String> deniedPermissionList = new ArrayList<>();
}
