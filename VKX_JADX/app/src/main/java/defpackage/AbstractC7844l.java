package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lًٌؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7844l {
    public static C18152l loadAd;
    public static final LinearInterpolator yandex = new LinearInterpolator();
    public static final C3797l crashlytics = C3797l.appmetrica("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final C3797l amazon = C3797l.appmetrica("x", "y");

    public static void crashlytics(int i, WeakReference weakReference) {
        synchronized (AbstractC7844l.class) {
            loadAd.purchase(i, weakReference);
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static C4529l loadAd(AbstractC9542l abstractC9542l, C10712l c10712l, float f, InterfaceC12702l interfaceC12702l, boolean z, boolean z2) {
        Object obj;
        Interpolator interpolatorYandex;
        Interpolator interpolatorYandex2;
        Interpolator interpolatorYandex3;
        Object obj2;
        C4529l c4529l;
        C3797l c3797l;
        C3797l c3797l2;
        PointF pointF;
        C3797l c3797l3 = crashlytics;
        LinearInterpolator linearInterpolator = yandex;
        if (!z || !z2) {
            C3797l c3797l4 = c3797l3;
            if (!z) {
                return new C4529l(interfaceC12702l.mo1290default(abstractC9542l, f));
            }
            abstractC9542l.billing();
            PointF pointFLoadAd = null;
            PointF pointFLoadAd2 = null;
            PointF pointFLoadAd3 = null;
            PointF pointFLoadAd4 = null;
            boolean z3 = false;
            Object objMo1290default = null;
            float fSignatures = 0.0f;
            Object objMo1290default2 = null;
            while (abstractC9542l.ads()) {
                c3797l4 = c3797l4;
                switch (abstractC9542l.mo1288throw(c3797l4)) {
                    case 0:
                        fSignatures = (float) abstractC9542l.signatures();
                        continue;
                    case 1:
                        objMo1290default = interfaceC12702l.mo1290default(abstractC9542l, f);
                        break;
                    case 2:
                        objMo1290default2 = interfaceC12702l.mo1290default(abstractC9542l, f);
                        break;
                    case 3:
                        pointFLoadAd4 = AbstractC14878l.loadAd(abstractC9542l, 1.0f);
                        break;
                    case 4:
                        pointFLoadAd = AbstractC14878l.loadAd(abstractC9542l, 1.0f);
                        break;
                    case 5:
                        z3 = abstractC9542l.inmobi() == 1;
                        break;
                    case 6:
                        pointFLoadAd2 = AbstractC14878l.loadAd(abstractC9542l, f);
                        break;
                    case 7:
                        pointFLoadAd3 = AbstractC14878l.loadAd(abstractC9542l, f);
                        break;
                    default:
                        abstractC9542l.mo1275continue();
                        break;
                }
            }
            abstractC9542l.vip();
            if (!z3) {
                if (pointFLoadAd4 == null || pointFLoadAd == null) {
                    obj = objMo1290default2;
                } else {
                    interpolatorYandex = yandex(pointFLoadAd4, pointFLoadAd);
                    obj = objMo1290default2;
                }
                C4529l c4529l2 = new C4529l(c10712l, objMo1290default, obj, interpolatorYandex, fSignatures, (Float) null);
                c4529l2.metrica = pointFLoadAd2;
                c4529l2.startapp = pointFLoadAd3;
                return c4529l2;
            }
            obj = objMo1290default;
            interpolatorYandex = linearInterpolator;
            C4529l c4529l3 = new C4529l(c10712l, objMo1290default, obj, interpolatorYandex, fSignatures, (Float) null);
            c4529l3.metrica = pointFLoadAd2;
            c4529l3.startapp = pointFLoadAd3;
            return c4529l3;
        }
        abstractC9542l.billing();
        PointF pointF2 = null;
        PointF pointFLoadAd5 = null;
        PointF pointFLoadAd6 = null;
        boolean z4 = false;
        PointF pointFLoadAd7 = null;
        PointF pointFLoadAd8 = null;
        PointF pointF3 = null;
        Object objMo1290default3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fSignatures2 = 0.0f;
        Object objMo1290default4 = null;
        while (abstractC9542l.ads()) {
            int iMo1288throw = abstractC9542l.mo1288throw(c3797l3);
            C3797l c3797l5 = amazon;
            linearInterpolator = linearInterpolator;
            switch (iMo1288throw) {
                case 0:
                    c3797l = c3797l3;
                    fSignatures2 = (float) abstractC9542l.signatures();
                    c3797l3 = c3797l;
                    break;
                case 1:
                    c3797l = c3797l3;
                    objMo1290default3 = interfaceC12702l.mo1290default(abstractC9542l, f);
                    c3797l3 = c3797l;
                    break;
                case 2:
                    c3797l = c3797l3;
                    objMo1290default4 = interfaceC12702l.mo1290default(abstractC9542l, f);
                    c3797l3 = c3797l;
                    break;
                case 3:
                    c3797l = c3797l3;
                    boolean z5 = z4;
                    Object obj3 = objMo1290default3;
                    PointF pointF6 = pointF4;
                    if (abstractC9542l.mo1287synchronized() == 3) {
                        abstractC9542l.billing();
                        float fSignatures3 = 0.0f;
                        float fSignatures4 = 0.0f;
                        float fSignatures5 = 0.0f;
                        float fSignatures6 = 0.0f;
                        while (abstractC9542l.ads()) {
                            int iMo1288throw2 = abstractC9542l.mo1288throw(c3797l5);
                            if (iMo1288throw2 != 0) {
                                if (iMo1288throw2 != 1) {
                                    abstractC9542l.mo1275continue();
                                } else if (abstractC9542l.mo1287synchronized() == 7) {
                                    fSignatures6 = (float) abstractC9542l.signatures();
                                    fSignatures4 = fSignatures6;
                                } else {
                                    abstractC9542l.yandex();
                                    fSignatures4 = (float) abstractC9542l.signatures();
                                    fSignatures6 = abstractC9542l.mo1287synchronized() == 7 ? (float) abstractC9542l.signatures() : fSignatures4;
                                    abstractC9542l.mopub();
                                }
                            } else if (abstractC9542l.mo1287synchronized() == 7) {
                                fSignatures5 = (float) abstractC9542l.signatures();
                                fSignatures3 = fSignatures5;
                            } else {
                                abstractC9542l.yandex();
                                fSignatures3 = (float) abstractC9542l.signatures();
                                fSignatures5 = abstractC9542l.mo1287synchronized() == 7 ? (float) abstractC9542l.signatures() : fSignatures3;
                                abstractC9542l.mopub();
                            }
                        }
                        PointF pointF7 = new PointF(fSignatures3, fSignatures4);
                        pointF4 = new PointF(fSignatures5, fSignatures6);
                        abstractC9542l.vip();
                        pointF3 = pointF7;
                    } else {
                        pointFLoadAd7 = AbstractC14878l.loadAd(abstractC9542l, f);
                        pointF4 = pointF6;
                    }
                    z4 = z5;
                    objMo1290default3 = obj3;
                    c3797l3 = c3797l;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (abstractC9542l.mo1287synchronized() == 3) {
                        abstractC9542l.billing();
                        float fSignatures7 = 0.0f;
                        float fSignatures8 = 0.0f;
                        float fSignatures9 = 0.0f;
                        float fSignatures10 = 0.0f;
                        while (abstractC9542l.ads()) {
                            Object obj4 = objMo1290default3;
                            int iMo1288throw3 = abstractC9542l.mo1288throw(c3797l5);
                            if (iMo1288throw3 != 0) {
                                c3797l2 = c3797l3;
                                if (iMo1288throw3 != 1) {
                                    abstractC9542l.mo1275continue();
                                } else if (abstractC9542l.mo1287synchronized() == 7) {
                                    fSignatures10 = (float) abstractC9542l.signatures();
                                    pointF4 = pointF4;
                                    fSignatures8 = fSignatures10;
                                } else {
                                    pointF = pointF4;
                                    abstractC9542l.yandex();
                                    fSignatures8 = (float) abstractC9542l.signatures();
                                    fSignatures10 = abstractC9542l.mo1287synchronized() == 7 ? (float) abstractC9542l.signatures() : fSignatures8;
                                    abstractC9542l.mopub();
                                    pointF4 = pointF;
                                }
                            } else {
                                c3797l2 = c3797l3;
                                pointF = pointF4;
                                if (abstractC9542l.mo1287synchronized() == 7) {
                                    fSignatures9 = (float) abstractC9542l.signatures();
                                    pointF4 = pointF;
                                    fSignatures7 = fSignatures9;
                                } else {
                                    abstractC9542l.yandex();
                                    fSignatures7 = (float) abstractC9542l.signatures();
                                    fSignatures9 = abstractC9542l.mo1287synchronized() == 7 ? (float) abstractC9542l.signatures() : fSignatures7;
                                    abstractC9542l.mopub();
                                    pointF4 = pointF;
                                }
                            }
                            objMo1290default3 = obj4;
                            c3797l3 = c3797l2;
                        }
                        c3797l = c3797l3;
                        PointF pointF8 = new PointF(fSignatures7, fSignatures8);
                        pointF2 = new PointF(fSignatures9, fSignatures10);
                        abstractC9542l.vip();
                        pointF5 = pointF8;
                    } else {
                        c3797l = c3797l3;
                        pointFLoadAd8 = AbstractC14878l.loadAd(abstractC9542l, f);
                    }
                    z4 = z6;
                    c3797l3 = c3797l;
                    break;
                case 5:
                    z4 = abstractC9542l.inmobi() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFLoadAd5 = AbstractC14878l.loadAd(abstractC9542l, f);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFLoadAd6 = AbstractC14878l.loadAd(abstractC9542l, f);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    abstractC9542l.mo1275continue();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        Interpolator interpolatorYandex4 = linearInterpolator;
        boolean z7 = z4;
        Object obj5 = objMo1290default3;
        PointF pointF9 = pointF4;
        abstractC9542l.vip();
        if (z7) {
            obj2 = obj5;
        } else {
            if (pointFLoadAd7 == null || pointFLoadAd8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    interpolatorYandex2 = yandex(pointF3, pointF5);
                    interpolatorYandex3 = yandex(pointF9, pointF2);
                    obj2 = objMo1290default4;
                    interpolatorYandex4 = null;
                }
                if (interpolatorYandex2 != null || interpolatorYandex3 == null) {
                    c4529l = new C4529l(c10712l, obj5, obj2, interpolatorYandex4, fSignatures2, (Float) null);
                } else {
                    c4529l = new C4529l(c10712l, obj5, obj2, interpolatorYandex2, interpolatorYandex3, fSignatures2);
                }
                c4529l.metrica = pointFLoadAd5;
                c4529l.startapp = pointFLoadAd6;
                return c4529l;
            }
            interpolatorYandex4 = yandex(pointFLoadAd7, pointFLoadAd8);
            obj2 = objMo1290default4;
        }
        interpolatorYandex2 = null;
        interpolatorYandex3 = null;
        if (interpolatorYandex2 != null) {
            c4529l = new C4529l(c10712l, obj5, obj2, interpolatorYandex4, fSignatures2, (Float) null);
        } else {
            c4529l = new C4529l(c10712l, obj5, obj2, interpolatorYandex4, fSignatures2, (Float) null);
        }
        c4529l.metrica = pointFLoadAd5;
        c4529l.startapp = pointFLoadAd6;
        return c4529l;
    }

    public static Interpolator yandex(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = AbstractC7484l.loadAd(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC7484l.loadAd(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC7484l.loadAd(pointF2.x, -1.0f, 1.0f);
        float fLoadAd = AbstractC7484l.loadAd(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fLoadAd;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = AbstractC4218l.yandex;
        int i = f != 0.0f ? (int) (527.0f * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fLoadAd != 0.0f) {
            i = (int) (i * 31 * fLoadAd);
        }
        synchronized (AbstractC7844l.class) {
            if (loadAd == null) {
                loadAd = new C18152l(0);
            }
            weakReference = (WeakReference) loadAd.crashlytics(i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            crashlytics(i, new WeakReference(pathInterpolator));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }
}
