package me.nucleartux.circleview;

import android.graphics.Color;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.BaseViewPropertyApplicator;
import com.facebook.react.uimanager.CatalystStylesDiffMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIProp;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.text.ReactTextShadowNode;
import at.grabner.circleprogress.CircleProgressView;

import java.util.Arrays;
import java.util.List;

public class ReactCircleViewManager extends SimpleViewManager<CircleProgressView> {
    public static final String REACT_CLASS = "RCTCircleView";

    // @UIProp(UIProp.Type.STRING)
    // public static final String PROP_ICON = "text";
    @UIProp(UIProp.Type.NUMBER)
    public static final String PROP_CONTOUR_SIZE = "contourSize";
    @UIProp(UIProp.Type.NUMBER)
    public static final String PROP_RIM_WIDTH = "rimWidth";
    @UIProp(UIProp.Type.NUMBER)
    public static final String PROP_BAR_WIDTH = "barWidth";
    @UIProp(UIProp.Type.NUMBER)
    public static final String PROP_VALUE = "value";
    @UIProp(UIProp.Type.NUMBER)
    public static final String PROP_MAX_VALUE = "maxValue";
    @UIProp(UIProp.Type.NUMBER)
    public static final String PROP_VALUE_ANIMATED = "valueAnimated";
    @UIProp(UIProp.Type.STRING)
    public static final String PROP_СONTOUR_COLOR = "сontourColor";
    @UIProp(UIProp.Type.STRING)
    public static final String PROP_RIM_COLOR = "rimColor";
    @UIProp(UIProp.Type.ARRAY)
    public static final String PROP_BAR_COLOR = "barColor";
    // @UIProp(UIProp.Type.STRING)
    // public static final String PROP_SIZE = "fontSize";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public CircleProgressView createViewInstance(ThemedReactContext context) {
        Log.i("CircleProgressView", "create instance");
        // CircleProgressView view = new CircleProgressView(context, null);

        // view.setMaxValue(100);
        // view.setValue(0);
        // view.setValueAnimated(88);

        return new CircleProgressView(context, null);
    }

    @Override
    public void updateView(final CircleProgressView view,
                           final CatalystStylesDiffMap props) {

        BaseViewPropertyApplicator.applyCommonViewProperties(view, props);

        // view.setMaxValue(100);
        // // view.setBarColor("#00796B");
        // view.setValue(0);
        // view.setValueAnimated(24);
        // view.spin();
        // if (props.hasKey(PROP_ICON)) {
        //     Log.i("CircleProgressView", "update view has icon");
        //     view.setText(props.getString(PROP_ICON));
        // }
        if (props.hasKey(PROP_CONTOUR_SIZE)) {
            view.setContourSize(props.getFloat(PROP_CONTOUR_SIZE, 1));
        }
        if (props.hasKey(PROP_BAR_WIDTH)) {
            view.setBarWidth(props.getInt(PROP_BAR_WIDTH, 1));
        }
        if (props.hasKey(PROP_RIM_WIDTH)) {
            view.setRimWidth(props.getInt(PROP_RIM_WIDTH, 1));
        }
        if (props.hasKey(PROP_MAX_VALUE)) {
            view.setMaxValue(props.getInt(PROP_MAX_VALUE, 100));
        }
        if (props.hasKey(PROP_VALUE)) {
            view.setValue(props.getInt(PROP_VALUE, 0));
        }
        if (props.hasKey(PROP_VALUE_ANIMATED)) {
            view.setValueAnimated(props.getInt(PROP_VALUE_ANIMATED, 42));
        }
        if (props.hasKey(PROP_СONTOUR_COLOR)) {
            view.setContourColor(Color.parseColor(props.getString(PROP_СONTOUR_COLOR)));
        }
        if (props.hasKey(PROP_RIM_COLOR)) {
            view.setRimColor(Color.parseColor(props.getString(PROP_RIM_COLOR)));
        }
        if (props.hasKey(PROP_BAR_COLOR)) {
            int size = props.getArray(PROP_BAR_COLOR).size();
            int[] colors = new int[size];
            for (int i = 0; i < size; i++) {
                colors[i] = Color.parseColor(props.getArray(PROP_BAR_COLOR).getString(i));
            }
            view.setBarColor(colors);
        }
        // if (props.hasKey(PROP_SIZE)) {
            // view.setTextSize(props.getFloat(PROP_SIZE, 0.0f));
        // }
        Log.i("CircleProgressView", "updateview finish");
        super.updateView(view, props);
    }
}