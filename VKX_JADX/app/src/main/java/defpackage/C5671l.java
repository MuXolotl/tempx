package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5671l extends AbstractC1299l {

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static final String[] f12072l = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final int f12073l;

    public C5671l() {
        this.f12073l = 3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static C17424l m1839catch(C18285l c18285l, C18285l c18285l2) {
        C17424l c17424l = new C17424l();
        c17424l.yandex = false;
        c17424l.loadAd = false;
        if (c18285l != null) {
            HashMap map = c18285l.yandex;
            if (map.containsKey("android:visibility:visibility")) {
                c17424l.crashlytics = ((Integer) map.get("android:visibility:visibility")).intValue();
                c17424l.purchase = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c17424l.crashlytics = -1;
                c17424l.purchase = null;
            }
        } else {
            c17424l.crashlytics = -1;
            c17424l.purchase = null;
        }
        if (c18285l2 != null) {
            HashMap map2 = c18285l2.yandex;
            if (map2.containsKey("android:visibility:visibility")) {
                c17424l.amazon = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c17424l.billing = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c17424l.amazon = -1;
                c17424l.billing = null;
            }
        } else {
            c17424l.amazon = -1;
            c17424l.billing = null;
        }
        if (c18285l != null && c18285l2 != null) {
            int i = c17424l.crashlytics;
            int i2 = c17424l.amazon;
            if (i != i2 || ((ViewGroup) c17424l.purchase) != ((ViewGroup) c17424l.billing)) {
                if (i != i2) {
                    if (i == 0) {
                        c17424l.loadAd = false;
                        c17424l.yandex = true;
                        return c17424l;
                    }
                    if (i2 == 0) {
                        c17424l.loadAd = true;
                        c17424l.yandex = true;
                        return c17424l;
                    }
                } else {
                    if (((ViewGroup) c17424l.billing) == null) {
                        c17424l.loadAd = false;
                        c17424l.yandex = true;
                        return c17424l;
                    }
                    if (((ViewGroup) c17424l.purchase) == null) {
                        c17424l.loadAd = true;
                        c17424l.yandex = true;
                        return c17424l;
                    }
                }
            }
        } else {
            if (c18285l == null && c17424l.amazon == 0) {
                c17424l.loadAd = true;
                c17424l.yandex = true;
                return c17424l;
            }
            if (c18285l2 == null && c17424l.crashlytics == 0) {
                c17424l.loadAd = false;
                c17424l.yandex = true;
            }
        }
        return c17424l;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static void m1840extends(C18285l c18285l) {
        View view = c18285l.loadAd;
        int visibility = view.getVisibility();
        HashMap map = c18285l.yandex;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static float m1841throw(C18285l c18285l, float f) {
        Float f2;
        return (c18285l == null || (f2 = (Float) c18285l.yandex.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.AbstractC1299l
    public final boolean Signature(C18285l c18285l, C18285l c18285l2) {
        if (c18285l == null && c18285l2 == null) {
            return false;
        }
        if (c18285l != null && c18285l2 != null && c18285l2.yandex.containsKey("android:visibility:visibility") != c18285l.yandex.containsKey("android:visibility:visibility")) {
            return false;
        }
        C17424l c17424lM1839catch = m1839catch(c18285l, c18285l2);
        if (c17424lM1839catch.yandex) {
            return c17424lM1839catch.crashlytics == 0 || c17424lM1839catch.amazon == 0;
        }
        return false;
    }

    @Override // defpackage.AbstractC1299l
    public final void admob(C18285l c18285l) {
        m1840extends(c18285l);
        View view = c18285l.loadAd;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC4770l.yandex.admob(view)) : Float.valueOf(0.0f);
        }
        c18285l.yandex.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.AbstractC1299l
    public final String[] ads() {
        return f12072l;
    }

    @Override // defpackage.AbstractC1299l
    public final void amazon(C18285l c18285l) {
        m1840extends(c18285l);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final ObjectAnimator m1842for(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC4770l.yandex.firebase(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC4770l.loadAd, f2);
        C0321l c0321l = new C0321l(view);
        objectAnimatorOfFloat.addListener(c0321l);
        startapp().yandex(c0321l);
        return objectAnimatorOfFloat;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x0200  */
    /* JADX WARN: Code duplicated, block: B:83:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x0217  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (m1839catch(metrica(r3, false), subscription(r3, false)).yandex != false) goto L9;
     */
    @Override // defpackage.AbstractC1299l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator smaato(android.view.ViewGroup r24, defpackage.C18285l r25, defpackage.C18285l r26) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5671l.smaato(android.view.ViewGroup, lّ٘ۢ, lّ٘ۢ):android.animation.Animator");
    }

    public C5671l(int i) {
        this();
        this.f12073l = i;
    }
}
