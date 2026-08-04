package defpackage;

import android.R;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lؙٓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6453l extends Resources {
    public static final int crashlytics;
    public static final ArrayList loadAd;
    public Resources yandex;

    static {
        ArrayList arrayList = new ArrayList();
        loadAd = arrayList;
        arrayList.add(Integer.valueOf(R.attr.color));
        arrayList.add(Integer.valueOf(R.attr.tint));
        crashlytics = Build.VERSION.SDK_INT >= 29 ? 7 : 6;
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getAnimation(int i) {
        return this.yandex.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) {
        return this.yandex.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i) {
        return this.yandex.getColor(i);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i) {
        return this.yandex.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public final Configuration getConfiguration() {
        return this.yandex.getConfiguration();
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i) {
        return this.yandex.getDimension(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i) {
        return this.yandex.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i) {
        return this.yandex.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        return this.yandex.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) {
        return this.yandex.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.yandex.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public final Typeface getFont(int i) {
        return this.yandex.getFont(i);
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i, int i2, int i3) {
        return this.yandex.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        return this.yandex.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public final int[] getIntArray(int i) {
        return this.yandex.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i) {
        return this.yandex.getInteger(i);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i) {
        return this.yandex.getLayout(i);
    }

    @Override // android.content.res.Resources
    public final Movie getMovie(int i) {
        return this.yandex.getMovie(i);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... objArr) {
        return this.yandex.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        return this.yandex.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i) {
        return this.yandex.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i) {
        return this.yandex.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i) {
        return this.yandex.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i) {
        return this.yandex.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        return this.yandex.getString(i);
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) {
        return this.yandex.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) {
        return this.yandex.getText(i);
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) {
        return this.yandex.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public final void getValue(int i, TypedValue typedValue, boolean z) {
        this.yandex.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.yandex.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getXml(int i) {
        return this.yandex.getXml(i);
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        int[] iArr2;
        TypedArray typedArrayObtainAttributes = this.yandex.obtainAttributes(attributeSet, iArr);
        try {
            iArr2 = (int[]) AbstractC13355l.yandex.get(typedArrayObtainAttributes);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            iArr2 = new int[0];
        }
        for (int i = 0; i < iArr.length; i++) {
            try {
                if (loadAd.contains(Integer.valueOf(iArr[i]))) {
                    int i2 = crashlytics * i;
                    if (iArr2[i2] == 2) {
                        int i3 = i2 + 1;
                        int iYandex = AbstractC13209l.yandex(iArr2[i3]);
                        iArr2[i2] = 28;
                        iArr2[i3] = iYandex;
                        iArr2[i2 + 2] = 0;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return typedArrayObtainAttributes;
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainTypedArray(int i) {
        return this.yandex.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i) {
        return this.yandex.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i) {
        return this.yandex.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.yandex.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.yandex.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        Resources resources = this.yandex;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z) {
        this.yandex.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i, Resources.Theme theme) {
        return this.yandex.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i, Resources.Theme theme) {
        return this.yandex.getColorStateList(i, theme);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i, Resources.Theme theme) {
        return this.yandex.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.yandex.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        return this.yandex.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... objArr) {
        return this.yandex.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        return this.yandex.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i, TypedValue typedValue) {
        return this.yandex.openRawResource(i, typedValue);
    }
}
