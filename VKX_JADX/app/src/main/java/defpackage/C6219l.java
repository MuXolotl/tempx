package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: renamed from: lؙؓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6219l {
    public static final C0120l admob = new C0120l(2);
    public static final Random subs = new Random();
    public C15081l amazon;
    public String billing;
    public final C4322l yandex = new C4322l();
    public final C3904l loadAd = new C3904l();
    public final HashMap crashlytics = new HashMap();
    public AbstractC10759l purchase = AbstractC10759l.yandex;
    public long mopub = -1;

    public final synchronized String amazon(AbstractC10759l abstractC10759l, C5019l c5019l) {
        return crashlytics(abstractC10759l.mopub(c5019l.yandex, this.loadAd).crashlytics, c5019l).yandex;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0057, B:34:0x0063, B:35:0x0067, B:37:0x006c, B:39:0x0072, B:41:0x0089, B:42:0x00b7, B:44:0x00bb, B:45:0x00c2, B:47:0x00cc, B:49:0x00d0), top: B:54:0x0001 }] */
    public final synchronized void billing(C5597l c5597l) {
        long j;
        this.amazon.getClass();
        if (c5597l.loadAd.startapp()) {
            return;
        }
        C5019l c5019l = c5597l.amazon;
        if (c5019l != null) {
            long j2 = c5019l.amazon;
            if (j2 != -1) {
                C6964l c6964l = (C6964l) this.crashlytics.get(this.billing);
                if (c6964l != null) {
                    j = c6964l.crashlytics;
                    if (j == -1) {
                        j = this.mopub + 1;
                    }
                } else {
                    j = this.mopub + 1;
                }
                if (j2 < j) {
                    return;
                }
            }
            C6964l c6964l2 = (C6964l) this.crashlytics.get(this.billing);
            if (c6964l2 != null && c6964l2.crashlytics == -1 && c6964l2.loadAd != c5597l.crashlytics) {
                return;
            }
        }
        C6964l c6964lCrashlytics = crashlytics(c5597l.crashlytics, c5597l.amazon);
        if (this.billing == null) {
            this.billing = c6964lCrashlytics.yandex;
        }
        C5019l c5019l2 = c5597l.amazon;
        if (c5019l2 != null && c5019l2.loadAd()) {
            C5019l c5019l3 = c5597l.amazon;
            C6964l c6964lCrashlytics2 = crashlytics(c5597l.crashlytics, new C5019l(c5019l3.yandex, c5019l3.amazon, c5019l3.loadAd));
            if (!c6964lCrashlytics2.purchase) {
                c6964lCrashlytics2.purchase = true;
                c5597l.loadAd.mopub(c5597l.amazon.yandex, this.loadAd);
                Math.max(0L, AbstractC15323l.m3986try(this.loadAd.amazon(c5597l.amazon.loadAd)) + AbstractC15323l.m3986try(this.loadAd.purchase));
                this.amazon.getClass();
            }
        }
        if (!c6964lCrashlytics.purchase) {
            c6964lCrashlytics.purchase = true;
            this.amazon.getClass();
        }
        if (c6964lCrashlytics.yandex.equals(this.billing) && !c6964lCrashlytics.billing) {
            c6964lCrashlytics.billing = true;
            this.amazon.m3930finally(c5597l, c6964lCrashlytics.yandex);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final C6964l crashlytics(int i, C5019l c5019l) {
        long j;
        long j2;
        long j3;
        HashMap map = this.crashlytics;
        C6964l c6964l = null;
        long j4 = Long.MAX_VALUE;
        for (C6964l c6964l2 : map.values()) {
            long j5 = c6964l2.crashlytics;
            C5019l c5019l2 = c6964l2.amazon;
            if (j5 == -1 && i == c6964l2.loadAd && c5019l != null) {
                long j6 = c5019l.amazon;
                C6219l c6219l = c6964l2.mopub;
                j = -1;
                C6964l c6964l3 = (C6964l) c6219l.crashlytics.get(c6219l.billing);
                if (c6964l3 != null) {
                    j3 = c6964l3.crashlytics;
                    if (j3 == -1) {
                        j3 = c6219l.mopub + 1;
                    }
                } else {
                    j3 = c6219l.mopub + 1;
                }
                if (j6 >= j3) {
                    c6964l2.crashlytics = j6;
                }
            } else {
                j = -1;
            }
            if (c5019l != null) {
                long j7 = c5019l.amazon;
                if (j7 != j) {
                    if (c5019l2 == null) {
                        if (!c5019l.loadAd() && j7 == c6964l2.crashlytics) {
                            j2 = c6964l2.crashlytics;
                            if (j2 != j || j2 < j4) {
                                c6964l = c6964l2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = AbstractC15323l.yandex;
                                if (c6964l.amazon != null && c5019l2 != null) {
                                    c6964l = c6964l2;
                                }
                            }
                        }
                    } else if (j7 == c5019l2.amazon && c5019l.loadAd == c5019l2.loadAd && c5019l.crashlytics == c5019l2.crashlytics) {
                        j2 = c6964l2.crashlytics;
                        if (j2 != j) {
                        }
                        c6964l = c6964l2;
                        j4 = j2;
                    }
                }
            }
            if (i == c6964l2.loadAd) {
                j2 = c6964l2.crashlytics;
                if (j2 != j) {
                }
                c6964l = c6964l2;
                j4 = j2;
            }
        }
        if (c6964l != null) {
            return c6964l;
        }
        String str2 = (String) admob.get();
        C6964l c6964l4 = new C6964l(this, str2, i, c5019l);
        map.put(str2, c6964l4);
        return c6964l4;
    }

    public final synchronized void loadAd(C5597l c5597l) {
        C15081l c15081l;
        try {
            String str = this.billing;
            if (str != null) {
                C6964l c6964l = (C6964l) this.crashlytics.get(str);
                c6964l.getClass();
                yandex(c6964l);
            }
            Iterator it = this.crashlytics.values().iterator();
            while (it.hasNext()) {
                C6964l c6964l2 = (C6964l) it.next();
                it.remove();
                if (c6964l2.purchase && (c15081l = this.amazon) != null) {
                    c15081l.m3934this(c5597l, c6964l2.yandex);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void mopub(C5597l c5597l, int i) {
        try {
            this.amazon.getClass();
            boolean z = i == 0;
            Iterator it = this.crashlytics.values().iterator();
            while (it.hasNext()) {
                C6964l c6964l = (C6964l) it.next();
                if (c6964l.yandex(c5597l)) {
                    it.remove();
                    boolean zEquals = c6964l.yandex.equals(this.billing);
                    if (zEquals) {
                        yandex(c6964l);
                    }
                    if (c6964l.purchase) {
                        if (z && zEquals) {
                            boolean z2 = c6964l.billing;
                        }
                        this.amazon.m3934this(c5597l, c6964l.yandex);
                    }
                }
            }
            purchase(c5597l);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void purchase(C5597l c5597l) {
        C5019l c5019l;
        AbstractC10759l abstractC10759l = c5597l.loadAd;
        int i = c5597l.crashlytics;
        C5019l c5019l2 = c5597l.amazon;
        boolean zStartapp = abstractC10759l.startapp();
        String str = this.billing;
        HashMap map = this.crashlytics;
        if (zStartapp) {
            if (str != null) {
                C6964l c6964l = (C6964l) map.get(str);
                c6964l.getClass();
                yandex(c6964l);
                return;
            }
            return;
        }
        C6964l c6964l2 = (C6964l) map.get(str);
        this.billing = crashlytics(i, c5019l2).yandex;
        billing(c5597l);
        if (c5019l2 != null) {
            long j = c5019l2.amazon;
            if (c5019l2.loadAd()) {
                if (c6964l2 != null && c6964l2.crashlytics == j && (c5019l = c6964l2.amazon) != null && c5019l.loadAd == c5019l2.loadAd && c5019l.crashlytics == c5019l2.crashlytics) {
                    return;
                }
                crashlytics(i, new C5019l(j, c5019l2.yandex));
                this.amazon.getClass();
            }
        }
    }

    public final void yandex(C6964l c6964l) {
        long j = c6964l.crashlytics;
        if (j != -1 && c6964l.purchase) {
            this.mopub = j;
        }
        this.billing = null;
    }
}
