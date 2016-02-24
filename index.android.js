var { requireNativeComponent, PropTypes } = require('react-native');

var iface = {
    name: 'CircleView',
    propTypes: {
      showTextWhileSpinning: PropTypes.bool,
      autoTextColor: PropTypes.bool,
      autoTextSize: PropTypes.bool,
      showUnit: PropTypes.bool,
      сontourColor: PropTypes.string,
      barColor: PropTypes.array,
      rimColor: PropTypes.string,
      value: PropTypes.number,
      maxValue: PropTypes.number,
      valueAnimated: PropTypes.number,
      contourSize: PropTypes.number,
      barWidth: PropTypes.number,
      rimWidth: PropTypes.number,
      unitSize: PropTypes.number,
      textSize: PropTypes.number,
      renderToHardwareTextureAndroid: PropTypes.bool,
      onLayout: PropTypes.bool,
      importantForAccessibility: PropTypes.string,
      accessibilityLabel: PropTypes.string,
      accessibilityLiveRegion: PropTypes.string,
      accessibilityComponentType: PropTypes.string,
      testID: PropTypes.string
    }
};

module.exports = requireNativeComponent('RCTCircleView', iface);
