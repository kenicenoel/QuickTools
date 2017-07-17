#QuickTools
An Android Library that provides a toolkit that simplifies some tasks related to Strings, Colors and other functions.

Welcome to my first Android Library which combines several useful utility classes to make coding easier. You can be sure that more useful features will be added over time.

##Getting started (:

  Add the library to your project first then
  In your fragment, create an instance of Toolkit. e.g Toolkit toolkit = new Toolkit(getContext());
  Or, in your activity, create an instance of Toolkit. e.g Toolkit toolkit = new Toolkit(this);

</dl>

## Toolkit class
After you created an instance of the toolkit class, you can use two of its built in functions:
<dl>
  <dt>Generate random number - toolkit.generateRandomNumber(min, max); </dt>
  <dd>This takes an integer min and max range and returns a random integer with the min and max range included.</dd>
</dl>

<dl>
  <dt>Is app installed? - toolkit.isAppInstalled(packageName); e.g toolkit.isAppInstalled(com.kenicenoel.doze)</dt>
  <dd>This takes a package name of any app and returns true if it is installed or false if not.</dd>
  <dd>It can be used for instance to take the user of the store or do somthing that requires the presence of another app.</dd>
</dl>



##Available tools
In this release, there are 4 kits that can take advantage of:

### 1. ColorBuddy
ColorBuddy is your helper that makes getting colors for your project a sinch. You can get a random color or add your own color.
You can also use standalone e.g ColorBuddy colorBuddy = new ColorBuddy() without first creating a Toolkit object.
<dl>
  <dt>Getting a color - toolkit.colorBuddy.newColor(); </dt>
  <dd>This returns a random color in the HEX format eg. #EA1E63</dd>
</dl>
<dl>
	<dt>You can use this however you wish, example:</dt>
	<dd> String color = toolkit.colorBuddy.newColor();</dd>
	<dd> TextView header = (TextView) findViewById('testId');</dd>
	<dd> header.setColor(Color.parseColor(color));</dd>
</dl>

You can also add colors in a similar way

<dl>
  <dt>Adding a color - toolkit.colorBuddy.add('#EA1E63'); </dt>
  <dd>Add a  color to the list of colors in the HEX format</dd>
</dl>

<dl>
	<dt>Get all colors - toolkit.colorBuddy.getColors();</dt>
	<dd> Returns an ArrayList of Strings of HEX format colors (ArrayList<String> colorsList for example)</dd>
</dl>

<dl>
	<dt>Get all colors - toolkit.colorBuddy.size();</dt>
	<dd> Returns an integer value of the number of colors</dd>
</dl>

### 2. StringBuddy
StringBuddy provides some useful functions for working with Strings
You can also use standalone e.g StringBuddy stringBuddy = new StringBuddy() without first creating a Toolkit object.

<dl>
  <dt>Remove Non Alpha-Numberic characters from String - toolkit.stringBuddy.removeNonAlphaNumericCharacters(myStringHere); </dt>
  <dd>This returns a String with all characters that aren't letters or numbers removed.</dd>
</dl>

<dl>
  <dt>Convert to proper case - toolkit.stringBuddy.convertToProperCase(myStringHere); </dt>
  <dd>This returns a String in proper format e.g HEllo wORlD! becomes Hello World!</dd>
</dl>

<dl>
  <dt>Strip HTML - toolkit.stringBuddy.stripHTML(myStringHere); </dt>
  <dd>This returns a String with the Html.escapeHtml function performmed on it</dd>
</dl>

<dl>
  <dt>Get Current timestamp - toolkit.stringBuddy.getCurrentTimeStamp(); </dt>
  <dd>This returns a String of current timestamp in format: yyyy-MM-dd HH:mm:ss</dd>
</dl>


### SettingsBuddy
SettingsBuddy makes working with shared preferences easier. If you are using it stand alone,
create like so: SettingsBuddy settingsBuddy = SettingsBuddy.getInstance(context);
If you created a toolkit instance then you can just use its functions like toolkit.settingsBuddy.functionName() without having to create the
stand alone instance. The name of the shared preference is 'AppSettings' and the context mode is Context.MODE_PRIVATE

<dl>
  <dt>Saving data - toolkit.settingsBuddy.saveData(key, value) </dt>
  <dd>This saves the key/value pair in the  shared preference</dd>
</dl>

<dl>
  <dt>Get data - toolkit.settingsBuddy.getData(key) </dt>
  <dd>This returns the value for the supplied key if it exists or the default value if non-existant.</dd>
</dl>

<dl>
  <dt>Default value - By default the default value is "N/A" but you can change this:  </dt>
  <dd>call toolkit.settingsBuddy.getDefault() to get the current default value or </dd>
   <dd>toolkit.settingsBuddy.setDefault(aStringValue) to set the default value </dd>
</dl>

###ZipBuddy
ZipBuddy makes working with Zip files easier. It provides 2 functions:
Zip and Unzip. You can also use standalone e.g ZipBuddy zipBuddy = new ZipBuddy() without first creating a Toolkit object.

<dl>
  <dt>Zip files - toolkit.zipBuddy.zip(filesToZip, nameOfZipFile ) </dt>
  <dd>This takes a list of files (string paths) to zip and the name to call the generated zip file and zips them</dd>
</dl>

<dl>
  <dt>UnZip files - toolkit.zipBuddy.unzip(fileToUnzip, targetDirectory ) </dt>
  <dd>This takes the zip file (string path) to unzip and the target directory to put the result and unzips it.</dd>
</dl>

