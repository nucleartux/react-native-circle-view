package me.nucleartux.circleview;

import android.graphics.Color;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.BaseViewPropertyApplicator;
import com.facebook.react.uimanager.CatalystStylesDiffMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.text.ReactTextShadowNode;
import at.grabner.circleprogress.CircleProgressView;

import java.util.Arrays;
import java.util.List;

public class ReactCircleViewManager extends SimpleViewManager<CircleProgressView> {
    public static final String REACT_CLASS = "RCTCircleView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public CircleProgressView createViewInstance(ThemedReactContext context) {
        Log.i("CircleProgressView", "create instance");
        return new CircleProgressView(context, null);
    }

    @ReactProp(name = "showTextWhileSpinning", defaultBoolean = false)
    public void setShowTextWhileSpinning(CircleProgressView view, boolean value) {
      view.setShowTextWhileSpinning(value);
    }

    @ReactProp(name = "autoTextSize", defaultBoolean = false)
    public void setAutoTextSize(CircleProgressView view, boolean value) {
      view.setAutoTextSize(value);
    }

    @ReactProp(name = "autoTextColor", defaultBoolean = false)
    public void setAutoTextColor(CircleProgressView view, boolean value) {
      view.setAutoTextColor(value);
    }

    @ReactProp(name = "showUnit", defaultBoolean = true)
    public void setShowUnit(CircleProgressView view, boolean value) {
      view.setShowUnit(value);
    }

    @ReactProp(name = "textSize", defaultFloat = 10f)
    public void setTextSize(CircleProgressView view, int value) {
      view.setTextSize(value);
    }

    @ReactProp(name = "unitSize",defaultFloat = 10f)
    public void setUnitSize(CircleProgressView view, int value) {
      view.setUnitSize(value);
    }

    @ReactProp(name = "contourSize", defaultFloat = 1f)
    public void setContourSize(CircleProgressView view, float value) {
      view.setContourSize(value);
    }

    @ReactProp(name = "rimWidth",defaultFloat = 1f)
    public void setRimWidth(CircleProgressView view, int value) {
      view.setRimWidth(value);
    }

    @ReactProp(name = "barWidth", defaultFloat = 1f)
    public void setBarWidth(CircleProgressView view, int value) {
      view.setBarWidth(value);
    }

    @ReactProp(name = "value", defaultFloat = 0f)
    public void setValue(CircleProgressView view, int value) {
      view.setValue(value);
    }

    @ReactProp(name = "maxValue", defaultFloat = 100f)
    public void setMaxValue(CircleProgressView view, int value) {
      view.setMaxValue(value);
    }

    @ReactProp(name = "valueAnimated", defaultFloat = 42f)
    public void setValueAnimated(CircleProgressView view, int value) {
      view.setValueAnimated(value);
    }

    @ReactProp(name = "сontourColor")
    public void setContourColor(CircleProgressView view, String value) {
      view.setContourColor(Color.parseColor(value));
    }

    @ReactProp(name = "rimColor")
    public void setRimColor(CircleProgressView view, String value) {
      view.setRimColor(Color.parseColor(value));
    }

    @ReactProp(name = "barColor")
    public void setBarColor(CircleProgressView view, ReadableArray value) {
      int size = value.size();
      int[] colors = new int[size];
      for (int i = 0; i < size; i++) {
          colors[i] = Color.parseColor(value.getString(i));
      }
      view.setBarColor(colors);
    }
}
