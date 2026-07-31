package defpackage;

/* JADX INFO: renamed from: lؙۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3964l {
    public long amazon;
    public int billing;
    public int crashlytics;
    public boolean loadAd;
    public int mopub;
    public int purchase;
    public final byte[] yandex = new byte[10];

    public final void crashlytics(InterfaceC10430l interfaceC10430l) {
        if (this.loadAd) {
            return;
        }
        int i = 0;
        byte[] bArr = this.yandex;
        interfaceC10430l.yandex(0, 10, bArr);
        interfaceC10430l.smaato();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.loadAd = true;
    }

    public final void loadAd(InterfaceC8979l interfaceC8979l, long j, int i, int i2, int i3, C0472l c0472l) {
        AbstractC12442l.ads("TrueHD chunk samples must be contiguous in the sample queue.", this.mopub <= i2 + i3);
        if (this.loadAd) {
            int i4 = this.crashlytics;
            int i5 = i4 + 1;
            this.crashlytics = i5;
            if (i4 == 0) {
                this.amazon = j;
                this.purchase = i;
                this.billing = 0;
            }
            this.billing += i2;
            this.mopub = i3;
            if (i5 >= 16) {
                yandex(interfaceC8979l, c0472l);
            }
        }
    }

    public final void yandex(InterfaceC8979l interfaceC8979l, C0472l c0472l) {
        if (this.crashlytics > 0) {
            interfaceC8979l.yandex(this.amazon, this.purchase, this.billing, this.mopub, c0472l);
            this.crashlytics = 0;
        }
    }
}
