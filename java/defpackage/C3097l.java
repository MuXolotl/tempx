package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lْؕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3097l {
    public static final Logger firebase = Logger.getLogger(C3097l.class.getName());
    public static final C3097l smaato = new C3097l(new C3585l(new ThreadFactoryC10406l(AbstractC0653l.ads(new StringBuilder(), AbstractC11432l.loadAd, " TaskRunner"), true)));
    public boolean amazon;
    public int billing;
    public int mopub;
    public long purchase;
    public final C3585l yandex;
    public final Logger loadAd = firebase;
    public int crashlytics = ModuleDescriptor.MODULE_VERSION;
    public final ArrayList admob = new ArrayList();
    public final ArrayList subs = new ArrayList();
    public final RunnableC5360l isPro = new RunnableC5360l(24, this);

    public C3097l(C3585l c3585l) {
        this.yandex = c3585l;
    }

    public static final void yandex(C3097l c3097l, AbstractC13821l abstractC13821l, long j, boolean z) {
        TimeZone timeZone = AbstractC11432l.yandex;
        C7522l c7522l = abstractC13821l.crashlytics;
        if (c7522l.amazon != abstractC13821l) {
            C8339l.smaato("Check failed.");
            return;
        }
        boolean z2 = c7522l.billing;
        c7522l.billing = false;
        c7522l.amazon = null;
        c3097l.admob.remove(c7522l);
        if (j != -1 && !z2 && !c7522l.crashlytics) {
            c7522l.purchase(abstractC13821l, j, true);
        }
        if (c7522l.purchase.isEmpty()) {
            return;
        }
        c3097l.subs.add(c7522l);
        if (z) {
            return;
        }
        c3097l.purchase();
    }

    public final C7522l amazon() {
        int i;
        synchronized (this) {
            i = this.crashlytics;
            this.crashlytics = i + 1;
        }
        return new C7522l(this, AbstractC0653l.vip(i, "Q"));
    }

    public final void crashlytics(C7522l c7522l) {
        TimeZone timeZone = AbstractC11432l.yandex;
        if (c7522l.amazon == null) {
            boolean zIsEmpty = c7522l.purchase.isEmpty();
            ArrayList arrayList = this.subs;
            if (zIsEmpty) {
                arrayList.remove(c7522l);
            } else {
                byte[] bArr = AbstractC7712l.yandex;
                if (!arrayList.contains(c7522l)) {
                    arrayList.add(c7522l);
                }
            }
        }
        if (this.amazon) {
            notify();
        } else {
            purchase();
        }
    }

    public final AbstractC13821l loadAd() {
        boolean z;
        TimeZone timeZone = AbstractC11432l.yandex;
        while (true) {
            ArrayList arrayList = this.subs;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC13821l abstractC13821l = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC13821l abstractC13821l2 = (AbstractC13821l) ((C7522l) it.next()).purchase.get(0);
                long jMax = Math.max(0L, abstractC13821l2.amazon - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC13821l != null) {
                        z = true;
                        break;
                    }
                    abstractC13821l = abstractC13821l2;
                }
            }
            ArrayList arrayList2 = this.admob;
            if (abstractC13821l != null) {
                TimeZone timeZone2 = AbstractC11432l.yandex;
                abstractC13821l.amazon = -1L;
                C7522l c7522l = abstractC13821l.crashlytics;
                c7522l.purchase.remove(abstractC13821l);
                arrayList.remove(c7522l);
                c7522l.amazon = abstractC13821l;
                arrayList2.add(c7522l);
                if (z || (!this.amazon && !arrayList.isEmpty())) {
                    purchase();
                }
                return abstractC13821l;
            }
            if (this.amazon) {
                if (jMin >= this.purchase - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.amazon = true;
            this.purchase = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = AbstractC11432l.yandex;
                    if (jMin > 0) {
                        long j = jMin / 1000000;
                        Long.signum(j);
                        long j2 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j2);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = AbstractC11432l.yandex;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C7522l) arrayList2.get(size)).loadAd();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        C7522l c7522l2 = (C7522l) arrayList.get(size2);
                        c7522l2.loadAd();
                        if (c7522l2.purchase.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.amazon = false;
            } catch (Throwable th) {
                this.amazon = false;
                throw th;
            }
        }
        return null;
    }

    public final void purchase() {
        TimeZone timeZone = AbstractC11432l.yandex;
        int i = this.billing;
        if (i > this.mopub) {
            return;
        }
        this.billing = i + 1;
        ((ThreadPoolExecutor) this.yandex.f7511l).execute(this.isPro);
    }
}
