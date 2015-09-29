var { requireNativeComponent, PropTypes } = require('react-native');

var iface = {
    name: 'CircleView',
    propTypes: {
      сontourColor: PropTypes.string,
      barColor: PropTypes.array,
      rimColor: PropTypes.string,
      value: PropTypes.number,
      maxValue: PropTypes.number,
      valueAnimated: PropTypes.number,
      contourSize: PropTypes.number,
      barWidth: PropTypes.number,
      rimWidth: PropTypes.number,
    },
};

module.exports = requireNativeComponent('RCTCircleView', iface);
