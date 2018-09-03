package au.com.gridstone.debugdrawer.sampleapp

import android.app.Activity
import android.view.ViewGroup
import au.com.gridstone.debugdrawer.DebugDrawer
import au.com.gridstone.debugdrawer.DeviceInfoModule
import au.com.gridstone.debugdrawer.LeakCanaryModule

fun getRootViewContainerFor(activity: Activity): ViewGroup {
  return DebugDrawer.with(activity)
      .addSectionTitle("Logs")
      .addModule(LeakCanaryModule())
      .addSectionTitle("Device information")
      .addModule(DeviceInfoModule())
      .finishAndGetMainContainer()
}