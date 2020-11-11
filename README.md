# rnsub

For the project setup:
1-Run npm install from the folder where the package.json is located, that is: rnsub/android/app/reactnative/rnapp
2-acess the file: rnsub/android/app/reactnative/rnapp/node_modules/@react-native-community/cli-platform-android/native_modules.graddle
3-comment the following line:
270 - def projectRoot = rootProject.projectDir
4-Add the two following lines right underneath line 270 and before the command "def autoModules = new ReactNativeModules(logger, projectRoot)":
def projectRootOriginal = rootProject.projectDir.toString()
def projectRoot = new File("$projectRoot1/app/reactnative/rnapp/android")
