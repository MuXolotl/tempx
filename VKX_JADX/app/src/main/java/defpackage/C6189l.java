package defpackage;

import java.math.RoundingMode;

/* JADX INFO: renamed from: lؙؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6189l {
    public int admob;
    public final int amazon;
    public int billing;
    public final int crashlytics;
    public int firebase;
    public int isPro;
    public final InterfaceC8979l loadAd;
    public int mopub;
    public final long purchase;
    public long[] remoteconfig;
    public long smaato;
    public int subs;
    public int[] vip;
    public final C18019l yandex;

    public C6189l(int i, C18019l c18019l, InterfaceC8979l interfaceC8979l) {
        int i2 = c18019l.amazon;
        this.yandex = c18019l;
        int iLoadAd = c18019l.loadAd();
        boolean z = true;
        if (iLoadAd != 1 && iLoadAd != 2) {
            z = false;
        }
        AbstractC12442l.admob(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.crashlytics = (iLoadAd == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) c18019l.loadAd) * 1000000;
        long j2 = c18019l.crashlytics;
        String str = AbstractC15323l.yandex;
        this.purchase = AbstractC15323l.m3970import(i2, j, j2, RoundingMode.DOWN);
        this.loadAd = interfaceC8979l;
        this.amazon = iLoadAd == 2 ? i3 | 1650720768 : -1;
        this.smaato = -1L;
        this.remoteconfig = new long[AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE];
        this.vip = new int[AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE];
        this.billing = i2;
    }

    public final C15528l loadAd(long j) {
        if (this.firebase == 0) {
            C4304l c4304l = new C4304l(0L, this.smaato);
            return new C15528l(c4304l, c4304l);
        }
        int i = (int) (j / (this.purchase / ((long) this.billing)));
        int iPurchase = AbstractC15323l.purchase(this.vip, i, true, true);
        if (this.vip[iPurchase] == i) {
            C4304l c4304lYandex = yandex(iPurchase);
            return new C15528l(c4304lYandex, c4304lYandex);
        }
        C4304l c4304lYandex2 = yandex(iPurchase);
        int i2 = iPurchase + 1;
        return i2 < this.remoteconfig.length ? new C15528l(c4304lYandex2, yandex(i2)) : new C15528l(c4304lYandex2, c4304lYandex2);
    }

    public final C4304l yandex(int i) {
        return new C4304l((this.purchase / ((long) this.billing)) * ((long) this.vip[i]), this.remoteconfig[i]);
    }
}
