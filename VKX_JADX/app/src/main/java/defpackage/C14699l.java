package defpackage;

import android.os.SystemClock;
import android.os.Trace;

/* JADX INFO: renamed from: lٔؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14699l {
    public long admob;
    public final C7221l billing;
    public C15074l firebase;
    public long isPro;
    public final C7578l loadAd;
    public final C8887l mopub;
    public long smaato;
    public long subs;
    public final C0458l yandex;
    public final C3535l crashlytics = new C3535l();
    public final C11522l amazon = new C11522l();
    public final C11522l purchase = new C11522l();

    public C14699l(C0458l c0458l, C7578l c7578l, C8887l c8887l) {
        this.yandex = c0458l;
        this.loadAd = c7578l;
        this.mopub = c8887l;
        C7221l c7221l = new C7221l(3);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c7221l.f15049l = 0;
        c7221l.f15048l = -1;
        c7221l.f15052l = 0;
        c7221l.f15053l = new long[iHighestOneBit];
        c7221l.f15051l = iHighestOneBit - 1;
        this.billing = c7221l;
        this.admob = -9223372036854775807L;
        this.firebase = C15074l.amazon;
        this.subs = -9223372036854775807L;
        this.isPro = -9223372036854775807L;
    }

    public final void yandex(long j, long j2) {
        final C0458l c0458l = this.yandex;
        C14000l c14000l = (C14000l) c0458l.f1690l;
        while (true) {
            C7221l c7221l = this.billing;
            int i = c7221l.f15052l;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                C4875l.firebase();
                return;
            }
            long j3 = ((long[]) c7221l.f15053l)[c7221l.f15049l];
            Long l = (Long) this.purchase.m3103continue(j3);
            C7578l c7578l = this.loadAd;
            if (l != null && l.longValue() != this.smaato) {
                this.smaato = l.longValue();
                c7578l.purchase(2);
            }
            long j4 = this.smaato;
            C7578l c7578l2 = this.loadAd;
            C3535l c3535l = this.crashlytics;
            int iYandex = c7578l2.yandex(j3, j, j2, j4, false, false, c3535l);
            if (iYandex != 5 && iYandex != 4) {
                this.mopub.yandex(j3, c3535l.yandex);
            }
            final int i2 = 0;
            final int i3 = 1;
            if (iYandex == 0 || iYandex == 1) {
                this.subs = j3;
                boolean z = iYandex == 0;
                long jRemoteconfig = c7221l.remoteconfig();
                C15074l c15074l = (C15074l) this.amazon.m3103continue(jRemoteconfig);
                if (c15074l != null && !c15074l.equals(C15074l.amazon) && !c15074l.equals(this.firebase)) {
                    this.firebase = c15074l;
                    C12984l c12984l = new C12984l();
                    c12984l.Signature = c15074l.yandex;
                    c12984l.license = c15074l.loadAd;
                    c12984l.vip = AbstractC3825l.vip("video/raw");
                    c0458l.f1691l = new C5978l(c12984l);
                    c14000l.subs.execute(new RunnableC0336l(c0458l, c15074l, 7));
                }
                long jNanoTime = z ? System.nanoTime() : c3535l.loadAd;
                i3 = c7578l.purchase == 3 ? 0 : 1;
                c7578l.purchase = 3;
                c7578l.smaato.getClass();
                c7578l.mopub = AbstractC15323l.m3962continue(SystemClock.elapsedRealtime());
                if (i3 != 0 && c14000l.purchase != null) {
                    c14000l.subs.execute(new Runnable() { // from class: lؚٗۨ
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            C0458l c0458l2 = c0458l;
                            switch (i4) {
                                case 0:
                                    ((C14000l) c0458l2.f1690l).admob.subs();
                                    break;
                                default:
                                    ((C14000l) c0458l2.f1690l).admob.advert();
                                    break;
                            }
                        }
                    });
                }
                C5978l c5978l = (C5978l) c0458l.f1691l;
                c14000l.isPro.loadAd(jRemoteconfig, jNanoTime, c5978l == null ? new C5978l(new C12984l()) : c5978l, null);
                C9809l c9809l = (C9809l) c14000l.amazon.remove();
                c9809l.crashlytics.m3225l(c9809l.yandex, c9809l.loadAd, jNanoTime);
            } else if (iYandex == 2 || iYandex == 3) {
                this.subs = j3;
                c7221l.remoteconfig();
                c14000l.subs.execute(new Runnable() { // from class: lؚٗۨ
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        C0458l c0458l2 = c0458l;
                        switch (i4) {
                            case 0:
                                ((C14000l) c0458l2.f1690l).admob.subs();
                                break;
                            default:
                                ((C14000l) c0458l2.f1690l).admob.advert();
                                break;
                        }
                    }
                });
                C9809l c9809l2 = (C9809l) c14000l.amazon.remove();
                C11727l c11727l = c9809l2.crashlytics;
                InterfaceC17529l interfaceC17529l = c9809l2.yandex;
                int i4 = c9809l2.loadAd;
                Trace.beginSection("dropVideoBuffer");
                interfaceC17529l.billing(i4);
                Trace.endSection();
                c11727l.m3233l(0, 1);
            } else {
                if (iYandex != 4) {
                    if (iYandex == 5) {
                        return;
                    }
                    C8339l.smaato(String.valueOf(iYandex));
                    return;
                }
                this.subs = j3;
            }
        }
    }
}
