package com.phonegap.plugins.toast;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.widget.Toast;

public class ToastPlugin extends CordovaPlugin 
{
    final String LOG_TAG = "ToastLog";

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException 
    {
        final String toastText = args.getString(0);
        final int toastDuration = args.getInt(1);
        
        if (toastText != null && !toastText.equals(""))
        {
        	showToast(toastText, toastDuration);
        	return true;
        }
        
        return false;
    }
    
    private void showToast(final String toastText, final int toastDuration) 
    {
		Toast.makeText(cordova.getActivity().getApplicationContext(), toastText, toastDuration).show();
	}
}