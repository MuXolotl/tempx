package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC1792l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f431l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f432l;

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f432l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f431l = Alert.DURATION_SHOW_INDEFINITELY;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1792l.admob, i, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Alert.DURATION_SHOW_INDEFINITELY));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Alert.DURATION_SHOW_INDEFINITELY));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f431l;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f432l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(maxWidth, RecyclerView.UNDEFINED_DURATION);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(maxHeight, RecyclerView.UNDEFINED_DURATION);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.f431l = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.f432l = i;
        super.setMaxWidth(i);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context) {
        this(context, null);
    }
}
