package defpackage;

/* JADX INFO: renamed from: l٘ٚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18019l implements InterfaceC15967l {
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final int loadAd;
    public final int purchase;
    public final int yandex;

    public C18019l(int i, int i2, int i3, int i4, int i5, int i6) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        this.purchase = i5;
        this.billing = i6;
    }

    public final int loadAd() {
        int i = this.yandex;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        AbstractC6427l.vip("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }

    @Override // defpackage.InterfaceC15967l
    public final int yandex() {
        return 1752331379;
    }
}
