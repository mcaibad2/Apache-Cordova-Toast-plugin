# Apache Cordova toast Android plugin
By Andreas Daskalopoulos

## Using the plugin

* Add java code to your project's build source

* Register the plugin in the plugins.xml file

```xml
<plugin name="ToastPlugin" value="com.phonegap.plugins.toast.ToastPlugin"/>
```

* Call the plugin, specifying subject, text, success function, and failure function

```javascript
window.plugins.toast.longshow('Hello World!');

window.plugins.toast.longshow('Hello World!');
```


