package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٜؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C3521l extends C17212l {
    public static Field adcel = null;
    public static Field ads = null;
    public static Method metrica = null;
    public static Class startapp = null;
    public static boolean vip = false;
    public int admob;
    public C15496l[] amazon;
    public C1473l billing;
    public final WindowInsets crashlytics;
    public int firebase;
    public int isPro;
    public C15496l mopub;
    public C15496l purchase;
    public Rect[][] remoteconfig;
    public Rect[][] smaato;
    public C18078l subs;

    public C3521l(C1473l c1473l, WindowInsets windowInsets) {
        super(c1473l);
        this.purchase = null;
        this.smaato = new Rect[10][];
        this.remoteconfig = new Rect[10][];
        this.crashlytics = windowInsets;
    }

    private C18078l appmetrica(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.yandex.yandex.tapsense()) {
            return C18078l.yandex(point.x, point.y, true, 0, 0, 0, 0);
        }
        C12135l c12135lAds = AbstractC12148l.ads(display, 0);
        C12135l c12135lAds2 = AbstractC12148l.ads(display, 1);
        C12135l c12135lAds3 = AbstractC12148l.ads(display, 2);
        C12135l c12135lAds4 = AbstractC12148l.ads(display, 3);
        return C18078l.yandex(point.x, point.y, false, c12135lAds != null ? c12135lAds.loadAd : 0, c12135lAds2 != null ? c12135lAds2.loadAd : 0, c12135lAds3 != null ? c12135lAds3.loadAd : 0, c12135lAds4 != null ? c12135lAds4.loadAd : 0);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static boolean m1347extends(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private static List<Rect> inmobi(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC2920l.purchase(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: package, reason: not valid java name */
    private C15496l m1348package(int i, boolean z) {
        C15496l c15496lYandex = C15496l.purchase;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c15496lYandex = C15496l.yandex(c15496lYandex, m1354synchronized(i2, z));
            }
        }
        return c15496lYandex;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: private, reason: not valid java name */
    private static void m1349private() {
        try {
            metrica = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            startapp = cls;
            adcel = cls.getDeclaredField("mVisibleInsets");
            ads = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            adcel.setAccessible(true);
            ads.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        vip = true;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    private C15496l m1350strictfp() {
        C1473l c1473l = this.billing;
        return c1473l != null ? c1473l.yandex.smaato() : C15496l.purchase;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    private Rect[] m1351throws(C15496l c15496l) {
        ArrayList arrayList = new ArrayList();
        int i = c15496l.yandex;
        int i2 = c15496l.amazon;
        int i3 = c15496l.crashlytics;
        int i4 = c15496l.loadAd;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c15496l.yandex, this.isPro));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.firebase, i4));
        }
        if (i3 != 0) {
            int i5 = this.firebase;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.isPro));
        }
        if (i2 != 0) {
            int i6 = this.isPro;
            arrayList.add(new Rect(0, i6 - i2, this.firebase, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    private C15496l m1352volatile(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C10754l.ads("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!vip) {
            m1349private();
        }
        Method method = metrica;
        if (method != null && startapp != null && adcel != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) adcel.get(ads.get(objInvoke));
                if (rect != null) {
                    return C15496l.loadAd(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // defpackage.C17212l
    @SuppressLint({"WrongConstant"})
    public boolean Signature(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m1353native(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.C17212l
    public void ad(C15496l c15496l) {
        this.mopub = c15496l;
    }

    @Override // defpackage.C17212l
    @SuppressLint({"WrongConstant"})
    public void adcel() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iPurchase = AbstractC2920l.purchase(i);
            this.smaato[iPurchase] = m1351throws(subs(i));
            if (i != 8) {
                this.remoteconfig[iPurchase] = m1351throws(isPro(i));
            }
        }
    }

    @Override // defpackage.C17212l
    public C1473l ads(int i, int i2, int i3, int i4) {
        AbstractC18218l c18209l;
        C1473l c1473lAdmob = C1473l.admob(this.crashlytics, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            c18209l = new C1145l(c1473lAdmob);
        } else if (i5 >= 35) {
            c18209l = new C0157l(c1473lAdmob);
        } else if (i5 >= 34) {
            c18209l = new C11094l(c1473lAdmob);
        } else if (i5 >= 31) {
            c18209l = new C13338l(c1473lAdmob);
        } else if (i5 >= 30) {
            c18209l = new C14430l(c1473lAdmob);
        } else {
            c18209l = i5 >= 29 ? new C18209l(c1473lAdmob) : new C4132l(c1473lAdmob);
        }
        c18209l.admob(C1473l.purchase(vip(), i, i2, i3, i4));
        c18209l.billing(C1473l.purchase(smaato(), i, i2, i3, i4));
        return c18209l.loadAd();
    }

    @Override // defpackage.C17212l
    public void advert(C1473l c1473l) {
        this.billing = c1473l;
    }

    @Override // defpackage.C17212l
    public void amazon(View view) {
        this.firebase = view.getWidth();
        this.isPro = view.getHeight();
        C15496l c15496lM1352volatile = m1352volatile(view);
        if (c15496lM1352volatile == null) {
            c15496lM1352volatile = C15496l.purchase;
        }
        ad(c15496lM1352volatile);
    }

    @Override // defpackage.C17212l
    public void applovin(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.remoteconfig = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.C17212l
    public List<Rect> billing(int i) {
        return inmobi(this.smaato, i);
    }

    @Override // defpackage.C17212l
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C3521l c3521l = (C3521l) obj;
        return Objects.equals(this.mopub, c3521l.mopub) && m1347extends(this.admob, c3521l.admob);
    }

    @Override // defpackage.C17212l
    public C15496l isPro(int i) {
        return m1348package(i, true);
    }

    @Override // defpackage.C17212l
    public void license(C18078l c18078l) {
        this.subs = c18078l;
    }

    @Override // defpackage.C17212l
    public List<Rect> mopub(int i) {
        return inmobi(this.remoteconfig, i);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public boolean m1353native(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m1354synchronized(i, false).equals(C15496l.purchase);
    }

    @Override // defpackage.C17212l
    public void premium(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.smaato = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.C17212l
    public void pro(C15496l[] c15496lArr) {
        this.amazon = c15496lArr;
    }

    @Override // defpackage.C17212l
    public void purchase(C1473l c1473l) {
        c1473l.yandex.advert(this.billing);
        C15496l c15496l = this.mopub;
        C17212l c17212l = c1473l.yandex;
        c17212l.ad(c15496l);
        c17212l.signatures(this.admob);
        c17212l.license(this.subs);
        c17212l.premium(this.smaato);
        c17212l.applovin(this.remoteconfig);
    }

    @Override // defpackage.C17212l
    public void signatures(int i) {
        this.admob = i;
    }

    @Override // defpackage.C17212l
    public void startapp(View view) {
        this.subs = appmetrica(view);
    }

    @Override // defpackage.C17212l
    public C15496l subs(int i) {
        return m1348package(i, false);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C15496l m1354synchronized(int i, boolean z) {
        C15496l c15496lSmaato;
        int i2;
        C15496l c15496l = C15496l.purchase;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C15496l[] c15496lArr = this.amazon;
                    c15496lSmaato = c15496lArr != null ? c15496lArr[AbstractC2920l.purchase(8)] : null;
                    if (c15496lSmaato != null) {
                        return c15496lSmaato;
                    }
                    C15496l c15496lVip = vip();
                    C15496l c15496lM1350strictfp = m1350strictfp();
                    int i3 = c15496lVip.amazon;
                    if (i3 > c15496lM1350strictfp.amazon) {
                        return C15496l.loadAd(0, 0, 0, i3);
                    }
                    C15496l c15496l2 = this.mopub;
                    if (c15496l2 != null && !c15496l2.equals(c15496l) && (i2 = this.mopub.amazon) > c15496lM1350strictfp.amazon) {
                        return C15496l.loadAd(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return remoteconfig();
                    }
                    if (i == 32) {
                        return firebase();
                    }
                    if (i == 64) {
                        return metrica();
                    }
                    if (i == 128) {
                        C1473l c1473l = this.billing;
                        C17518l c17518lAdmob = c1473l != null ? c1473l.yandex.admob() : admob();
                        if (c17518lAdmob != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C15496l.loadAd(i4 >= 28 ? AbstractC13950l.appmetrica(c17518lAdmob.yandex) : 0, i4 >= 28 ? AbstractC13950l.m3828throws(c17518lAdmob.yandex) : 0, i4 >= 28 ? AbstractC13950l.inmobi(c17518lAdmob.yandex) : 0, i4 >= 28 ? AbstractC13950l.applovin(c17518lAdmob.yandex) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C15496l c15496lM1350strictfp2 = m1350strictfp();
                    C15496l c15496lSmaato2 = smaato();
                    return C15496l.loadAd(Math.max(c15496lM1350strictfp2.yandex, c15496lSmaato2.yandex), 0, Math.max(c15496lM1350strictfp2.crashlytics, c15496lSmaato2.crashlytics), Math.max(c15496lM1350strictfp2.amazon, c15496lSmaato2.amazon));
                }
                if ((this.admob & 2) == 0) {
                    C15496l c15496lVip2 = vip();
                    C1473l c1473l2 = this.billing;
                    c15496lSmaato = c1473l2 != null ? c1473l2.yandex.smaato() : null;
                    int iMin = c15496lVip2.amazon;
                    if (c15496lSmaato != null) {
                        iMin = Math.min(iMin, c15496lSmaato.amazon);
                    }
                    return C15496l.loadAd(c15496lVip2.yandex, 0, c15496lVip2.crashlytics, iMin);
                }
            }
        } else {
            if (z) {
                return C15496l.loadAd(0, Math.max(m1350strictfp().loadAd, vip().loadAd), 0, 0);
            }
            if ((this.admob & 4) == 0) {
                return C15496l.loadAd(0, vip().loadAd, 0, 0);
            }
        }
        return c15496l;
    }

    @Override // defpackage.C17212l
    public boolean tapsense() {
        return this.crashlytics.isRound();
    }

    @Override // defpackage.C17212l
    public final C15496l vip() {
        if (this.purchase == null) {
            WindowInsets windowInsets = this.crashlytics;
            this.purchase = C15496l.loadAd(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.purchase;
    }

    public C3521l(C1473l c1473l, C3521l c3521l) {
        this(c1473l, new WindowInsets(c3521l.crashlytics));
    }
}
