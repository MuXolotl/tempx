package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lؒۥۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1473l {
    public static final C1473l loadAd;
    public final C17212l yandex;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            loadAd = C7827l.ad;
        } else if (i >= 30) {
            loadAd = C3519l.pro;
        } else {
            loadAd = C17212l.loadAd;
        }
    }

    public C1473l(C1473l c1473l) {
        if (c1473l == null) {
            this.yandex = new C17212l(this);
            return;
        }
        C17212l c17212l = c1473l.yandex;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (c17212l instanceof C8987l)) {
            this.yandex = new C8987l(this, (C8987l) c17212l);
        } else if (i >= 34 && (c17212l instanceof C7827l)) {
            this.yandex = new C7827l(this, (C7827l) c17212l);
        } else if (i >= 31 && (c17212l instanceof C17333l)) {
            this.yandex = new C17333l(this, (C17333l) c17212l);
        } else if (i >= 30 && (c17212l instanceof C3519l)) {
            this.yandex = new C3519l(this, (C3519l) c17212l);
        } else if (i >= 29 && (c17212l instanceof C1928l)) {
            this.yandex = new C1928l(this, (C1928l) c17212l);
        } else if (i >= 28 && (c17212l instanceof C6892l)) {
            this.yandex = new C6892l(this, (C6892l) c17212l);
        } else if (c17212l instanceof C17815l) {
            this.yandex = new C17815l(this, (C17815l) c17212l);
        } else if (c17212l instanceof C3521l) {
            this.yandex = new C3521l(this, (C3521l) c17212l);
        } else {
            this.yandex = new C17212l(this);
        }
        c17212l.purchase(this);
    }

    public static C1473l admob(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C1473l c1473l = new C1473l(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            C1473l c1473lYandex = AbstractC18487l.yandex(view);
            C17212l c17212l = c1473l.yandex;
            c17212l.advert(c1473lYandex);
            View rootView = view.getRootView();
            c17212l.amazon(rootView);
            c17212l.startapp(rootView);
            c17212l.adcel();
            c17212l.signatures(view.getWindowSystemUiVisibility());
        }
        return c1473l;
    }

    public static C15496l purchase(C15496l c15496l, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c15496l.yandex - i);
        int iMax2 = Math.max(0, c15496l.loadAd - i2);
        int iMax3 = Math.max(0, c15496l.crashlytics - i3);
        int iMax4 = Math.max(0, c15496l.amazon - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c15496l : C15496l.loadAd(iMax, iMax2, iMax3, iMax4);
    }

    public final int amazon() {
        return this.yandex.vip().loadAd;
    }

    public final C1473l billing(int i, int i2, int i3, int i4) {
        AbstractC18218l c18209l;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            c18209l = new C1145l(this);
        } else if (i5 >= 35) {
            c18209l = new C0157l(this);
        } else if (i5 >= 34) {
            c18209l = new C11094l(this);
        } else if (i5 >= 31) {
            c18209l = new C13338l(this);
        } else if (i5 >= 30) {
            c18209l = new C14430l(this);
        } else {
            c18209l = i5 >= 29 ? new C18209l(this) : new C4132l(this);
        }
        c18209l.admob(C15496l.loadAd(i, i2, i3, i4));
        return c18209l.loadAd();
    }

    public final int crashlytics() {
        return this.yandex.vip().crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1473l) {
            return Objects.equals(this.yandex, ((C1473l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        C17212l c17212l = this.yandex;
        if (c17212l == null) {
            return 0;
        }
        return c17212l.hashCode();
    }

    public final int loadAd() {
        return this.yandex.vip().yandex;
    }

    public final WindowInsets mopub() {
        C17212l c17212l = this.yandex;
        if (c17212l instanceof C3521l) {
            return ((C3521l) c17212l).crashlytics;
        }
        return null;
    }

    public final int yandex() {
        return this.yandex.vip().amazon;
    }

    public C1473l(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.yandex = new C8987l(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.yandex = new C7827l(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.yandex = new C17333l(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.yandex = new C3519l(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.yandex = new C1928l(this, windowInsets);
        } else if (i >= 28) {
            this.yandex = new C6892l(this, windowInsets);
        } else {
            this.yandex = new C17815l(this, windowInsets);
        }
    }
}
