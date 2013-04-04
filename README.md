# Apache Cordova Toast plugin
By Andreas Daskalopoulos

## Using the plugin

* Add java code to your project's build source

* Register the plugin in the plugins.xml file

```xml
<plugin name="ToastPlugin" value="com.phonegap.plugins.toast.ToastPlugin"/>
```

* Copy javascript and use the script tag

```javascript
<script type="text/javascript" charset="utf-8" src="toast.js"></script>  
```

* Call the plugin, specifying subject, text, success function, and failure function

```javascript
window.plugins.toast.longshow('Hello World!');

window.plugins.toast.longshow('Hello World!');
```


