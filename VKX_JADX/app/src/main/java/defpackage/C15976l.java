package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٕ۠ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15976l {
    public final float admob;
    public final C15728l amazon;
    public boolean billing;
    public boolean crashlytics;
    public final ArrayList firebase;
    public float isPro;
    public float loadAd;
    public boolean metrica;
    public final float mopub;
    public final AbstractC5646l purchase;
    public C10427l remoteconfig;
    public final ArrayList smaato;
    public long subs;
    public float vip;
    public float yandex;
    public static final C9210l startapp = new C9210l(1);
    public static final C9210l adcel = new C9210l(2);
    public static final C9210l ads = new C9210l(3);
    public static final C9210l subscription = new C9210l(4);
    public static final C9210l tapsense = new C9210l(5);
    public static final C9210l Signature = new C9210l(0);

    public C15976l(C15728l c15728l) {
        C14367l c14367l = C15728l.f30895l;
        this.yandex = 0.0f;
        this.loadAd = Float.MAX_VALUE;
        this.crashlytics = false;
        this.billing = false;
        this.mopub = Float.MAX_VALUE;
        this.admob = -3.4028235E38f;
        this.subs = 0L;
        this.firebase = new ArrayList();
        this.smaato = new ArrayList();
        this.amazon = c15728l;
        this.purchase = c14367l;
        if (c14367l == ads || c14367l == subscription || c14367l == tapsense) {
            this.isPro = 0.1f;
        } else if (c14367l == Signature || c14367l == startapp || c14367l == adcel) {
            this.isPro = 0.00390625f;
        } else {
            this.isPro = 1.0f;
        }
        this.remoteconfig = null;
        this.vip = Float.MAX_VALUE;
        this.metrica = false;
    }

    public final void amazon() {
        C10427l c10427l = this.remoteconfig;
        if (c10427l == null) {
            C10754l.ads("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double d = (float) c10427l.subs;
        float f = this.mopub;
        if (d > f) {
            C10754l.ads("Final position of the spring cannot be greater than the max value.");
            return;
        }
        float f2 = this.admob;
        if (d < f2) {
            C10754l.ads("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.isPro * 0.75f);
        c10427l.amazon = dAbs;
        c10427l.purchase = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.billing;
        if (z || z) {
            return;
        }
        this.billing = true;
        if (!this.crashlytics) {
            this.loadAd = this.purchase.smaato(this.amazon);
        }
        float f3 = this.loadAd;
        if (f3 > f || f3 < f2) {
            C8339l.metrica("Starting value need to be in between min value and max value");
            return;
        }
        ThreadLocal threadLocal = C11494l.billing;
        if (threadLocal.get() == null) {
            threadLocal.set(new C11494l());
        }
        C11494l c11494l = (C11494l) threadLocal.get();
        ArrayList arrayList = c11494l.loadAd;
        if (arrayList.size() == 0) {
            if (c11494l.amazon == null) {
                c11494l.amazon = new C18449l(c11494l.crashlytics);
            }
            C18449l c18449l = c11494l.amazon;
            ((Choreographer) c18449l.f36009l).postFrameCallback((ChoreographerFrameCallbackC17929l) c18449l.f36012l);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void crashlytics() {
        if (this.remoteconfig.loadAd <= 0.0d) {
            C10754l.ads("Spring animations can only come to an end when there is damping");
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            if (this.billing) {
                this.metrica = true;
            }
        }
    }

    public final void loadAd(float f) {
        ArrayList arrayList;
        this.purchase.startapp(this.amazon, f);
        int i = 0;
        while (true) {
            arrayList = this.smaato;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((InterfaceC16591l) arrayList.get(i)).admob(this.loadAd);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void yandex(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.billing = false;
        ThreadLocal threadLocal = C11494l.billing;
        if (threadLocal.get() == null) {
            threadLocal.set(new C11494l());
        }
        C11494l c11494l = (C11494l) threadLocal.get();
        c11494l.yandex.remove(this);
        ArrayList arrayList2 = c11494l.loadAd;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            c11494l.purchase = true;
        }
        this.subs = 0L;
        this.crashlytics = false;
        while (true) {
            arrayList = this.firebase;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                C1169l c1169l = (C1169l) arrayList.get(i);
                float f = this.loadAd;
                C1796l c1796l = c1169l.yandex;
                c1796l.yandex = f;
                Iterator it = ((ArrayList) c1796l.amazon).iterator();
                while (it.hasNext()) {
                    ((InterfaceC14255l) it.next()).yandex(c1796l);
                }
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public C15976l(C4553l c4553l) {
        this.yandex = 0.0f;
        this.loadAd = Float.MAX_VALUE;
        this.crashlytics = false;
        this.billing = false;
        this.mopub = Float.MAX_VALUE;
        this.admob = -3.4028235E38f;
        this.subs = 0L;
        this.firebase = new ArrayList();
        this.smaato = new ArrayList();
        this.amazon = null;
        this.purchase = new C9419l(c4553l);
        this.isPro = 1.0f;
        this.remoteconfig = null;
        this.vip = Float.MAX_VALUE;
        this.metrica = false;
    }
}
