package defpackage;

/* JADX INFO: renamed from: lٍؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4776l implements InterfaceC14206l {
    public final InterfaceC8097l crashlytics;
    public final int loadAd;
    public final int yandex;

    public C4776l(int i, InterfaceC8097l interfaceC8097l, int i2) {
        this(i, 0, (i2 & 4) != 0 ? AbstractC5341l.yandex : interfaceC8097l);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4776l) {
            C4776l c4776l = (C4776l) obj;
            if (c4776l.yandex == this.yandex && c4776l.loadAd == this.loadAd && AbstractC8576l.yandex(c4776l.crashlytics, this.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.crashlytics.hashCode() + (this.yandex * 31)) * 31) + this.loadAd;
    }

    @Override // defpackage.InterfaceC1489l
    public final InterfaceC15930l yandex(C0010l c0010l) {
        return new C5601l(this.yandex, this.loadAd, this.crashlytics);
    }

    public C4776l(int i, int i2, InterfaceC8097l interfaceC8097l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = interfaceC8097l;
    }

    @Override // defpackage.InterfaceC14206l, defpackage.InterfaceC1489l
    public final InterfaceC12145l yandex(C0010l c0010l) {
        return new C5601l(this.yandex, this.loadAd, this.crashlytics);
    }
}
