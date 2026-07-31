package defpackage;

import java.math.RoundingMode;

/* JADX INFO: renamed from: lؘؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1665l implements InterfaceC11823l {
    public long admob;
    public final C5978l amazon;
    public long billing;
    public final C7200l crashlytics;
    public final InterfaceC8979l loadAd;
    public int mopub;
    public final int purchase;
    public final InterfaceC2053l yandex;

    public C1665l(InterfaceC2053l interfaceC2053l, InterfaceC8979l interfaceC8979l, C7200l c7200l, String str, int i) throws C17655l {
        this.yandex = interfaceC2053l;
        this.loadAd = interfaceC8979l;
        this.crashlytics = c7200l;
        int i2 = c7200l.yandex;
        int i3 = c7200l.loadAd;
        int i4 = (c7200l.amazon * i2) / 8;
        int i5 = c7200l.crashlytics;
        if (i5 != i4) {
            throw C17655l.yandex(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.purchase = iMax;
        C12984l c12984l = new C12984l();
        c12984l.remoteconfig = AbstractC3825l.vip("audio/wav");
        c12984l.vip = AbstractC3825l.vip(str);
        c12984l.admob = i7;
        c12984l.subs = i7;
        c12984l.metrica = iMax;
        c12984l.f25447throws = i2;
        c12984l.f25442package = i3;
        c12984l.f25445synchronized = i;
        this.amazon = new C5978l(c12984l);
    }

    @Override // defpackage.InterfaceC11823l
    public final void crashlytics(int i, long j) {
        C10948l c10948l = new C10948l(this.crashlytics, 1, i, j);
        this.yandex.tapsense(c10948l);
        C5978l c5978l = this.amazon;
        InterfaceC8979l interfaceC8979l = this.loadAd;
        interfaceC8979l.mopub(c5978l);
        interfaceC8979l.amazon(c10948l.purchase);
    }

    @Override // defpackage.InterfaceC11823l
    public final boolean loadAd(InterfaceC10430l interfaceC10430l, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.mopub) < (i2 = this.purchase)) {
            int iBilling = this.loadAd.billing(interfaceC10430l, (int) Math.min(i2 - i, j2), true);
            if (iBilling == -1) {
                j2 = 0;
            } else {
                this.mopub += iBilling;
                j2 -= (long) iBilling;
            }
        }
        C7200l c7200l = this.crashlytics;
        int i3 = c7200l.crashlytics;
        int i4 = this.mopub / i3;
        if (i4 > 0) {
            long j3 = this.billing;
            long j4 = this.admob;
            long j5 = c7200l.loadAd;
            String str = AbstractC15323l.yandex;
            long jM3970import = j3 + AbstractC15323l.m3970import(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.mopub - i5;
            this.loadAd.yandex(jM3970import, 1, i5, i6, null);
            this.admob += (long) i4;
            this.mopub = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.InterfaceC11823l
    public final void yandex(long j) {
        this.billing = j;
        this.mopub = 0;
        this.admob = 0L;
    }
}
