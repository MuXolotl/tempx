package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؚْۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13209l {
    public static final ArrayList admob;
    public static final List billing;
    public static SharedPreferences mopub;
    public static C16449l purchase;
    public static final Handler yandex = new Handler(Looper.getMainLooper());
    public static InterfaceC11884l loadAd = InterfaceC11884l.f23706l;
    public static final ArrayList crashlytics = new ArrayList();
    public static final ArrayList amazon = new ArrayList();

    static {
        new ArrayList();
        purchase = C16449l.purchase;
        billing = Collections.EMPTY_LIST;
        admob = new ArrayList();
    }

    public static void loadAd(C16449l c16449l, float[] fArr, boolean z) {
        purchase = c16449l;
        if (c16449l.crashlytics != AbstractC11790l.billing()) {
            AbstractC11790l.loadAd.edit().putBoolean("enabled", false).apply();
        } else {
            AbstractC11790l.loadAd.edit().putString(c16449l.crashlytics ? "dark_theme" : "light_theme", c16449l.loadAd).apply();
        }
        for (Activity activity : crashlytics) {
            View decorView = activity.getWindow().getDecorView();
            int i = 1;
            if (z) {
                Window window = activity.getWindow();
                final C14590l c14590l = new C14590l(activity, decorView, fArr, i);
                try {
                    final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
                    if (Build.VERSION.SDK_INT < 26 || !window.getDecorView().isHardwareAccelerated()) {
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        decorView.draw(canvas);
                        canvas.setBitmap(null);
                        c14590l.accept(bitmapCreateBitmap);
                    } else {
                        int[] iArr = new int[2];
                        decorView.getLocationInWindow(iArr);
                        int i2 = iArr[0];
                        PixelCopy.request(window, new Rect(i2, iArr[1], decorView.getWidth() + i2, iArr[1] + decorView.getHeight()), bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: lَٞ
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i3) {
                                C14590l c14590l2 = c14590l;
                                Bitmap bitmap = bitmapCreateBitmap;
                                if (i3 == 0) {
                                    c14590l2.accept(bitmap);
                                } else {
                                    c14590l2.accept(null);
                                }
                            }
                        }, new Handler(Looper.getMainLooper()));
                    }
                } catch (Exception unused) {
                    c14590l.accept(null);
                }
            } else {
                AbstractC12930l.loadAd(decorView);
            }
            if (activity instanceof AbstractActivityC2569l) {
                AppActivity appActivity = (AppActivity) ((AbstractActivityC2569l) activity);
                if (purchase.amazon) {
                    C6124l c6124lAppmetrica = appActivity.appmetrica();
                    c6124lAppmetrica.loadAd(true);
                    c6124lAppmetrica.yandex(true);
                } else {
                    C6124l c6124lAppmetrica2 = appActivity.appmetrica();
                    c6124lAppmetrica2.loadAd(false);
                    c6124lAppmetrica2.yandex(false);
                }
                AbstractC0170l.amazon(appActivity);
                if (appActivity.f36640l != null) {
                    appActivity.f36642l.crashlytics.loadAd.crashlytics.setValue(AbstractC7252l.purchase(purchase.crashlytics));
                    C2814l c2814l = appActivity.f36637l;
                    FrameLayout[] frameLayoutArr = c2814l.purchase;
                    int length = frameLayoutArr.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length) {
                        FrameLayout frameLayout = frameLayoutArr[i3];
                        int i5 = i4 + 1;
                        if (frameLayout != null && i4 != c2814l.subs) {
                            AbstractC12930l.loadAd(frameLayout);
                        }
                        i3++;
                        i4 = i5;
                    }
                    C7644l c7644l = c2814l.yandex.f36640l;
                    if (c7644l != null) {
                        ((LinearLayout) c7644l.f15739l).setBackgroundColor(yandex(R.attr.nextdock_background));
                    }
                }
            }
        }
        mopub.edit().putString("selected_theme", c16449l.loadAd).apply();
    }

    public static int yandex(int i) {
        if (purchase == null) {
            purchase = C16449l.purchase;
        }
        int i2 = purchase.yandex.get(i, -2);
        if (i2 != -2) {
            return i2;
        }
        TypedArray typedArrayObtainStyledAttributes = AbstractC12930l.yandex.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
