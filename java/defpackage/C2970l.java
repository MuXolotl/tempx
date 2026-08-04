package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: lٟؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2970l {
    public TextPaint admob;
    public final C2399l firebase;
    public final Context isPro;
    public final TextView subs;
    public static final RectF smaato = new RectF();
    public static final ConcurrentHashMap remoteconfig = new ConcurrentHashMap();
    public int yandex = 0;
    public boolean loadAd = false;
    public float crashlytics = -1.0f;
    public float amazon = -1.0f;
    public float purchase = -1.0f;
    public int[] billing = new int[0];
    public boolean mopub = false;

    public C2970l(TextView textView) {
        this.subs = textView;
        this.isPro = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.firebase = new C16645l();
        } else {
            this.firebase = new C2399l();
        }
    }

    public static Method amazon(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = remoteconfig;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static int[] loadAd(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Object purchase(Object obj, Object obj2, String str) {
        try {
            return amazon(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public final boolean admob() {
        if (isPro() && this.yandex == 1) {
            if (!this.mopub || this.billing.length == 0) {
                int iFloor = ((int) Math.floor((this.purchase - this.amazon) / this.crashlytics)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.crashlytics) + this.amazon);
                }
                this.billing = loadAd(iArr);
            }
            this.loadAd = true;
        } else {
            this.loadAd = false;
        }
        return this.loadAd;
    }

    public final boolean billing() {
        return isPro() && this.yandex != 0;
    }

    public final int crashlytics(RectF rectF) {
        CharSequence transformation;
        int length = this.billing.length;
        if (length == 0) {
            C8339l.smaato("No available text sizes to choose from.");
            return 0;
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int[] iArr = this.billing;
            if (i3 > i) {
                return iArr[i2];
            }
            int i4 = (i3 + i) / 2;
            int i5 = iArr[i4];
            TextView textView = this.subs;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.admob;
            if (textPaint == null) {
                this.admob = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.admob.set(textView.getPaint());
            this.admob.setTextSize(i5);
            StaticLayout staticLayoutYandex = AbstractC5292l.yandex(charSequence, (Layout.Alignment) purchase(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.subs, this.admob, this.firebase);
            if ((maxLines == -1 || (staticLayoutYandex.getLineCount() <= maxLines && staticLayoutYandex.getLineEnd(staticLayoutYandex.getLineCount() - 1) == charSequence.length())) && staticLayoutYandex.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
    }

    public final void firebase(float f, float f2, float f3) {
        if (f <= 0.0f) {
            C8339l.metrica(AbstractC4582l.loadAd("Minimum auto-size text size (", f, "px) is less or equal to (0px)"));
            return;
        }
        if (f2 <= f) {
            C11983l.vip("Maximum auto-size text size (", f2, "px) is less or equal to minimum auto-size text size (", f, "px)");
            return;
        }
        if (f3 <= 0.0f) {
            C8339l.metrica(AbstractC4582l.loadAd("The auto-size step granularity (", f3, "px) is less or equal to (0px)"));
            return;
        }
        this.yandex = 1;
        this.amazon = f;
        this.purchase = f2;
        this.crashlytics = f3;
        this.mopub = false;
    }

    public final boolean isPro() {
        return !(this.subs instanceof C5217l);
    }

    public final void mopub(int i, float f) {
        Context context = this.isPro;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.subs;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.loadAd = false;
                try {
                    Method methodAmazon = amazon("nullLayouts");
                    if (methodAmazon != null) {
                        methodAmazon.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean subs() {
        int[] iArr = this.billing;
        int length = iArr.length;
        boolean z = length > 0;
        this.mopub = z;
        if (z) {
            this.yandex = 1;
            this.amazon = iArr[0];
            this.purchase = iArr[length - 1];
            this.crashlytics = -1.0f;
        }
        return z;
    }

    public final void yandex() {
        if (billing()) {
            if (this.loadAd) {
                if (this.subs.getMeasuredHeight() <= 0 || this.subs.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.firebase.loadAd(this.subs) ? 1048576 : (this.subs.getMeasuredWidth() - this.subs.getTotalPaddingLeft()) - this.subs.getTotalPaddingRight();
                int height = (this.subs.getHeight() - this.subs.getCompoundPaddingBottom()) - this.subs.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = smaato;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fCrashlytics = crashlytics(rectF);
                        if (fCrashlytics != this.subs.getTextSize()) {
                            mopub(0, fCrashlytics);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.loadAd = true;
        }
    }
}
