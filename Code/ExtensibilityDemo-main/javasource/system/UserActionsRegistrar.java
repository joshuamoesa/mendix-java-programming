package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.registerUserAction(myfirstmodule.actions.CallMyServiceRESTService.class);
    registrator.registerUserAction(myfirstmodule.actions.InvokeService.class);
    registrator.registerUserAction(myfirstmodule.actions.JoinObjectsInList.class);
    registrator.registerUserAction(myfirstmodule.actions.PickRandomPersonFromList.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
