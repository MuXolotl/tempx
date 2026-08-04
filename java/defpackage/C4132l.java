package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: lٕؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4132l extends AbstractC18218l {
    public static boolean admob = false;
    public static boolean isPro = false;
    public static Field mopub;
    public static Constructor subs;
    public C15496l billing;
    public WindowInsets purchase;

    public C4132l() {
        this.purchase = isPro();
    }

    private static WindowInsets isPro() {
        if (!admob) {
            try {
                mopub = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            admob = true;
        }
        Field field = mopub;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!isPro) {
            try {
                subs = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            isPro = true;
        }
        Constructor constructor = subs;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC18218l
    public void admob(C15496l c15496l) {
        WindowInsets windowInsets = this.purchase;
        if (windowInsets != null) {
            this.purchase = windowInsets.replaceSystemWindowInsets(c15496l.yandex, c15496l.loadAd, c15496l.crashlytics, c15496l.amazon);
        }
    }

    @Override // defpackage.AbstractC18218l
    public void billing(C15496l c15496l) {
        this.billing = c15496l;
    }

    @Override // defpackage.AbstractC18218l
    public C1473l loadAd() {
        yandex();
        C1473l c1473lAdmob = C1473l.admob(this.purchase, null);
        C15496l[] c15496lArr = this.loadAd;
        C17212l c17212l = c1473lAdmob.yandex;
        c17212l.pro(c15496lArr);
        c17212l.isVip(this.billing);
        c17212l.license(null);
        c17212l.premium(this.crashlytics);
        c17212l.applovin(this.amazon);
        return c1473lAdmob;
    }

    public C4132l(C1473l c1473l) {
        super(c1473l);
        this.purchase = c1473l.mopub();
    }
}
