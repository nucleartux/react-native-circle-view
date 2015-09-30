# react-native-circle-view
circle progress bar for react native android using circle-view

## Installation and How to use

#### Step 1 - NPM Install

```shell
npm install --save react-native-circle-view
```
#### Step 2 - Update Gradle Settings

```gradle
// file: android/settings.gradle
...

include ':reactcircleview', ':app'
project(':reactcircleview').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-circle-view')
```

#### Step 3 - Update android Gradle Build

```gradle
// file: android/build.gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

#### Step 4 - Update app Gradle Build

```gradle
// file: android/app/build.gradle
...

dependencies {
    ...
    compile project(':reactcircleview')
}
```

#### Step 5 - Register React Package

```java
...
import me.nucleartux.circleview.ReactCircleViewPackage; // import

public class MainActivity extends Activity implements DefaultHardwareBackBtnHandler {

    private ReactInstanceManager mReactInstanceManager;
    private ReactRootView mReactRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mReactRootView = new ReactRootView(this);
        mReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setBundleAssetName("index.android.bundle")
                .setJSMainModuleName("index.android")
                .addPackage(new MainReactPackage())
                .addPackage(new ReactCircleViewPackage()) // register react circleview package here
                .setUseDeveloperSupport(BuildConfig.DEBUG)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build();
        mReactRootView.startReactApplication(mReactInstanceManager, "AwesomeProject", null);
        setContentView(mReactRootView);
    }
...

```

#### Step 6 - Require and use in Javascript

```js
// file: index.android.js

var React = require('react-native');
var CircleProgressView = require('react-native-circle-view');
var { AppRegistry,StyleSheet,Text,View } = React;

var AwesomeProject = React.createClass({
    render: function() {
        return (
            <View style={styles.container}>
                <CircleProgressView
                  style={styles.progress}
                  сontourColor="#f4f4f4"
                  rimColor="#f4f4f4"
                  barColor={["#15e064", "#17aecc", "#15e064"]}
                  value={90}
                  maxValue={100}
                  сontourSize={280}
                  rimWidth={120}
                  barWidth={100}
                />
            </View>
        );
    }
});

var styles = StyleSheet.create({
  progress: {
    width: 250,
    height: 250
  },
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  }
});

AppRegistry.registerComponent('AwesomeProject', () => AwesomeProject);
```

## Credits

- [Circle-Progress-View](https://github.com/jakob-grabner/Circle-Progress-View)

## Notes
- Please report any issues or send patches to get fixes in
