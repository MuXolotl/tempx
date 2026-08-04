package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l٘ٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC17929l implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f34901l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34902l;

    public /* synthetic */ ChoreographerFrameCallbackC17929l(int i, Object obj) {
        this.f34902l = i;
        this.f34901l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x0306  */
    /* JADX WARN: Code duplicated, block: B:111:0x0313  */
    /* JADX WARN: Code duplicated, block: B:145:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:37:0x013d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C18480l c18480l;
        boolean z;
        long j2;
        long j3;
        boolean z2;
        float f;
        C10427l c10427l;
        boolean z3;
        float f2;
        C10427l c10427l2;
        boolean z4;
        int i = this.f34902l;
        Object obj = this.f34901l;
        switch (i) {
            case 0:
                boolean z5 = true;
                C14667l c14667l = (C14667l) obj;
                if (!c14667l.amazon || c14667l.yandex == null) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                C18480l c18480l2 = c14667l.yandex;
                double d = jUptimeMillis - c14667l.purchase;
                CopyOnWriteArraySet<C11260l> copyOnWriteArraySet = (CopyOnWriteArraySet) c18480l2.f36088l;
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) c18480l2.f36089l;
                Iterator it = copyOnWriteArraySet2.iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
                for (C11260l c11260l : copyOnWriteArraySet) {
                    if (c11260l.loadAd() && c11260l.subs) {
                        copyOnWriteArraySet.remove(c11260l);
                    } else {
                        double d2 = d / 1000.0d;
                        C5533l c5533l = c11260l.purchase;
                        C5533l c5533l2 = c11260l.billing;
                        C5533l c5533l3 = c11260l.amazon;
                        boolean zLoadAd = c11260l.loadAd();
                        if (!zLoadAd || !c11260l.subs) {
                            if (d2 > 0.064d) {
                                d2 = 0.064d;
                            }
                            c11260l.firebase += d2;
                            C17930l c17930l = c11260l.yandex;
                            double d3 = c17930l.loadAd;
                            double d4 = c17930l.yandex;
                            double d5 = c5533l3.yandex;
                            double d6 = c5533l3.loadAd;
                            double d7 = c5533l2.yandex;
                            double d8 = d6;
                            double d9 = d5;
                            double d10 = c5533l2.loadAd;
                            double d11 = d7;
                            while (true) {
                                double d12 = c11260l.firebase;
                                if (d12 >= 0.001d) {
                                    double d13 = d12 - 0.001d;
                                    c11260l.firebase = d13;
                                    if (d13 < 0.001d) {
                                        c5533l.yandex = d9;
                                        c5533l.loadAd = d8;
                                    }
                                    double d14 = c11260l.admob;
                                    double d15 = ((d14 - d11) * d3) - (d4 * d8);
                                    double d16 = (d15 * 0.001d * 0.5d) + d8;
                                    double d17 = ((d14 - (((d8 * 0.001d) * 0.5d) + d9)) * d3) - (d4 * d16);
                                    double d18 = (d17 * 0.001d * 0.5d) + d8;
                                    double d19 = ((d14 - (((d16 * 0.001d) * 0.5d) + d9)) * d3) - (d4 * d18);
                                    double d20 = (d18 * 0.001d) + d9;
                                    double d21 = (d19 * 0.001d) + d8;
                                    double d22 = (((d17 + d19) * 2.0d) + d15 + (((d14 - d20) * d3) - (d4 * d21))) * 0.16666666666666666d;
                                    d9 = ((((d16 + d18) * 2.0d) + d8 + d21) * 0.16666666666666666d * 0.001d) + d9;
                                    d8 += d22 * 0.001d;
                                    d11 = d20;
                                    d10 = d21;
                                } else {
                                    c5533l2.yandex = d11;
                                    c5533l2.loadAd = d10;
                                    c5533l3.yandex = d9;
                                    c5533l3.loadAd = d8;
                                    if (d12 > 0.0d) {
                                        double d23 = d12 / 0.001d;
                                        double d24 = 1.0d - d23;
                                        c5533l3.yandex = (c5533l.yandex * d24) + (d9 * d23);
                                        c5533l3.loadAd = (c5533l.loadAd * d24) + (d8 * d23);
                                    }
                                    if (c11260l.loadAd()) {
                                        if (d3 > 0.0d) {
                                            double d25 = c11260l.admob;
                                            c11260l.mopub = d25;
                                            c5533l3.yandex = d25;
                                        } else {
                                            double d26 = c5533l3.yandex;
                                            c11260l.admob = d26;
                                            c11260l.mopub = d26;
                                        }
                                        if (0.0d != c5533l3.loadAd) {
                                            c5533l3.loadAd = 0.0d;
                                            c11260l.smaato.billing(c11260l.crashlytics);
                                        }
                                        zLoadAd = z5;
                                    } else if (c11260l.loadAd && c11260l.yandex.loadAd > 0.0d) {
                                        double d27 = c11260l.mopub;
                                        double d28 = c11260l.admob;
                                        if ((d27 < d28 && c5533l3.yandex > d28) || (d27 > d28 && c5533l3.yandex < d28)) {
                                            if (d3 > 0.0d) {
                                                double d29 = c11260l.admob;
                                                c11260l.mopub = d29;
                                                c5533l3.yandex = d29;
                                            } else {
                                                double d210 = c5533l3.yandex;
                                                c11260l.admob = d210;
                                                c11260l.mopub = d210;
                                            }
                                            if (0.0d != c5533l3.loadAd) {
                                                c5533l3.loadAd = 0.0d;
                                                c11260l.smaato.billing(c11260l.crashlytics);
                                            }
                                            zLoadAd = z5;
                                        }
                                    }
                                    if (c11260l.subs) {
                                        c11260l.subs = false;
                                        z = z5;
                                    } else {
                                        z = false;
                                    }
                                    if (zLoadAd) {
                                        c11260l.subs = z5;
                                    }
                                    for (InterfaceC18216l interfaceC18216l : c11260l.isPro) {
                                        if (z) {
                                            interfaceC18216l.getClass();
                                        }
                                        interfaceC18216l.yandex(c11260l);
                                    }
                                }
                            }
                        }
                        copyOnWriteArraySet = copyOnWriteArraySet;
                        copyOnWriteArraySet2 = copyOnWriteArraySet2;
                        d = d;
                        jUptimeMillis = jUptimeMillis;
                        c14667l = c14667l;
                        c18480l2 = c18480l2;
                        z5 = true;
                    }
                    copyOnWriteArraySet = copyOnWriteArraySet;
                    copyOnWriteArraySet2 = copyOnWriteArraySet2;
                    d = d;
                    jUptimeMillis = jUptimeMillis;
                    c14667l = c14667l;
                    c18480l2 = c18480l2;
                    z5 = true;
                }
                C14667l c14667l2 = c14667l;
                C18480l c18480l3 = c18480l2;
                long j4 = jUptimeMillis;
                CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
                if (copyOnWriteArraySet.isEmpty()) {
                    c18480l = c18480l3;
                    c18480l.f36085l = true;
                } else {
                    c18480l = c18480l3;
                }
                Iterator it2 = copyOnWriteArraySet3.iterator();
                if (it2.hasNext()) {
                    throw AbstractC15560l.adcel(it2);
                }
                if (c18480l.f36085l) {
                    C14667l c14667l3 = (C14667l) c18480l.f36087l;
                    c14667l3.amazon = false;
                    c14667l3.loadAd.removeFrameCallback(c14667l3.crashlytics);
                }
                c14667l2.purchase = j4;
                c14667l2.loadAd.postFrameCallback(c14667l2.crashlytics);
                return;
            default:
                C11494l c11494l = (C11494l) ((C10975l) ((C18449l) obj).f36010l).f22121l;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                ArrayList arrayList = c11494l.loadAd;
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    C15976l c15976l = (C15976l) arrayList.get(i2);
                    if (c15976l == null) {
                        jUptimeMillis2 = jUptimeMillis2;
                    } else {
                        C5128l c5128l = c11494l.yandex;
                        Long l = (Long) c5128l.get(c15976l);
                        if (l == null) {
                            j2 = c15976l.subs;
                            if (j2 == 0) {
                                c15976l.subs = jUptimeMillis2;
                                c15976l.loadAd(c15976l.loadAd);
                                jUptimeMillis2 = jUptimeMillis2;
                            } else {
                                j3 = jUptimeMillis2 - j2;
                                c15976l.subs = jUptimeMillis2;
                                z2 = c15976l.metrica;
                                f = c15976l.vip;
                                if (z2) {
                                    if (f != Float.MAX_VALUE) {
                                        c15976l.remoteconfig.subs = f;
                                        c15976l.vip = Float.MAX_VALUE;
                                    }
                                    c15976l.loadAd = (float) c15976l.remoteconfig.subs;
                                    c15976l.yandex = 0.0f;
                                    c15976l.metrica = false;
                                    jUptimeMillis2 = jUptimeMillis2;
                                    z4 = true;
                                } else {
                                    c10427l = c15976l.remoteconfig;
                                    if (f != Float.MAX_VALUE) {
                                        double d30 = c10427l.subs;
                                        z3 = true;
                                        long j5 = j3 / 2;
                                        C4033l c4033lCrashlytics = c10427l.crashlytics(c15976l.loadAd, c15976l.yandex, j5);
                                        C10427l c10427l3 = c15976l.remoteconfig;
                                        c10427l3.subs = c15976l.vip;
                                        c15976l.vip = Float.MAX_VALUE;
                                        C4033l c4033lCrashlytics2 = c10427l3.crashlytics(c4033lCrashlytics.f8314l, c4033lCrashlytics.f8313l, j5);
                                        c15976l.loadAd = c4033lCrashlytics2.f8314l;
                                        c15976l.yandex = c4033lCrashlytics2.f8313l;
                                    } else {
                                        z3 = true;
                                        C4033l c4033lCrashlytics3 = c10427l.crashlytics(c15976l.loadAd, c15976l.yandex, j3);
                                        c15976l.loadAd = c4033lCrashlytics3.f8314l;
                                        c15976l.yandex = c4033lCrashlytics3.f8313l;
                                    }
                                    float fMax = Math.max(c15976l.loadAd, c15976l.admob);
                                    c15976l.loadAd = fMax;
                                    float fMin = Math.min(fMax, c15976l.mopub);
                                    c15976l.loadAd = fMin;
                                    f2 = c15976l.yandex;
                                    c10427l2 = c15976l.remoteconfig;
                                    c10427l2.getClass();
                                    if (Math.abs(f2) < c10427l2.purchase) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                float fMin2 = Math.min(c15976l.loadAd, c15976l.mopub);
                                c15976l.loadAd = fMin2;
                                float fMax2 = Math.max(fMin2, c15976l.admob);
                                c15976l.loadAd = fMax2;
                                c15976l.loadAd(fMax2);
                                if (z4) {
                                    c15976l.yandex(false);
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis3) {
                            c5128l.remove(c15976l);
                            j2 = c15976l.subs;
                            if (j2 == 0) {
                                c15976l.subs = jUptimeMillis2;
                                c15976l.loadAd(c15976l.loadAd);
                                jUptimeMillis2 = jUptimeMillis2;
                            } else {
                                j3 = jUptimeMillis2 - j2;
                                c15976l.subs = jUptimeMillis2;
                                z2 = c15976l.metrica;
                                f = c15976l.vip;
                                if (z2) {
                                    if (f != Float.MAX_VALUE) {
                                        c15976l.remoteconfig.subs = f;
                                        c15976l.vip = Float.MAX_VALUE;
                                    }
                                    c15976l.loadAd = (float) c15976l.remoteconfig.subs;
                                    c15976l.yandex = 0.0f;
                                    c15976l.metrica = false;
                                    jUptimeMillis2 = jUptimeMillis2;
                                    z4 = true;
                                } else {
                                    c10427l = c15976l.remoteconfig;
                                    if (f != Float.MAX_VALUE) {
                                        double d31 = c10427l.subs;
                                        z3 = true;
                                        long j6 = j3 / 2;
                                        C4033l c4033lCrashlytics4 = c10427l.crashlytics(c15976l.loadAd, c15976l.yandex, j6);
                                        C10427l c10427l4 = c15976l.remoteconfig;
                                        c10427l4.subs = c15976l.vip;
                                        c15976l.vip = Float.MAX_VALUE;
                                        C4033l c4033lCrashlytics5 = c10427l4.crashlytics(c4033lCrashlytics4.f8314l, c4033lCrashlytics4.f8313l, j6);
                                        c15976l.loadAd = c4033lCrashlytics5.f8314l;
                                        c15976l.yandex = c4033lCrashlytics5.f8313l;
                                    } else {
                                        z3 = true;
                                        C4033l c4033lCrashlytics6 = c10427l.crashlytics(c15976l.loadAd, c15976l.yandex, j3);
                                        c15976l.loadAd = c4033lCrashlytics6.f8314l;
                                        c15976l.yandex = c4033lCrashlytics6.f8313l;
                                    }
                                    float fMax3 = Math.max(c15976l.loadAd, c15976l.admob);
                                    c15976l.loadAd = fMax3;
                                    float fMin3 = Math.min(fMax3, c15976l.mopub);
                                    c15976l.loadAd = fMin3;
                                    f2 = c15976l.yandex;
                                    c10427l2 = c15976l.remoteconfig;
                                    c10427l2.getClass();
                                    if (Math.abs(f2) < c10427l2.purchase || Math.abs(fMin3 - ((float) c10427l2.subs)) >= c10427l2.amazon) {
                                        z4 = false;
                                    } else {
                                        c15976l.loadAd = (float) c15976l.remoteconfig.subs;
                                        c15976l.yandex = 0;
                                        z4 = z3;
                                    }
                                }
                                float fMin4 = Math.min(c15976l.loadAd, c15976l.mopub);
                                c15976l.loadAd = fMin4;
                                float fMax4 = Math.max(fMin4, c15976l.admob);
                                c15976l.loadAd = fMax4;
                                c15976l.loadAd(fMax4);
                                if (z4) {
                                    c15976l.yandex(false);
                                }
                            }
                        } else {
                            jUptimeMillis2 = jUptimeMillis2;
                        }
                    }
                    i2++;
                    jUptimeMillis2 = jUptimeMillis2;
                }
                if (c11494l.purchase) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    c11494l.purchase = false;
                }
                if (arrayList.size() > 0) {
                    if (c11494l.amazon == null) {
                        c11494l.amazon = new C18449l(c11494l.crashlytics);
                    }
                    C18449l c18449l = c11494l.amazon;
                    ((Choreographer) c18449l.f36009l).postFrameCallback((ChoreographerFrameCallbackC17929l) c18449l.f36012l);
                    return;
                }
                return;
        }
    }
}
