package defpackage;

/* JADX INFO: renamed from: lٓٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14144l implements InterfaceC8865l {
    public int amazon;
    public boolean billing;
    public int crashlytics;
    public final C13143l loadAd = new C13143l(32);
    public boolean purchase;
    public final InterfaceC13919l yandex;

    public C14144l(InterfaceC13919l interfaceC13919l) {
        this.yandex = interfaceC13919l;
    }

    @Override // defpackage.InterfaceC8865l
    public final void billing() {
        this.billing = true;
    }

    @Override // defpackage.InterfaceC8865l
    public final void subs(C16391l c16391l, InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        this.yandex.subs(c16391l, interfaceC2053l, cstatic);
        this.billing = true;
    }

    @Override // defpackage.InterfaceC8865l
    public final void yandex(int i, C13143l c13143l) {
        int iSignatures;
        boolean z = (i & 1) != 0;
        if (z) {
            iSignatures = c13143l.loadAd + c13143l.signatures();
        } else {
            iSignatures = -1;
        }
        if (this.billing) {
            if (!z) {
                return;
            }
            this.billing = false;
            c13143l.m3562for(iSignatures);
            this.amazon = 0;
        }
        while (c13143l.yandex() > 0) {
            int i2 = this.amazon;
            C13143l c13143l2 = this.loadAd;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iSignatures2 = c13143l.signatures();
                    c13143l.m3562for(c13143l.loadAd - 1);
                    if (iSignatures2 == 255) {
                        this.billing = true;
                        return;
                    }
                }
                int iMin = Math.min(c13143l.yandex(), 3 - this.amazon);
                c13143l.firebase(this.amazon, iMin, c13143l2.yandex);
                int i3 = this.amazon + iMin;
                this.amazon = i3;
                if (i3 == 3) {
                    c13143l2.m3562for(0);
                    c13143l2.m3561extends(3);
                    c13143l2.m3568throw(1);
                    int iSignatures3 = c13143l2.signatures();
                    int iSignatures4 = c13143l2.signatures();
                    this.purchase = (iSignatures3 & 128) != 0;
                    int i4 = (((iSignatures3 & 15) << 8) | iSignatures4) + 3;
                    this.crashlytics = i4;
                    byte[] bArr = c13143l2.yandex;
                    if (bArr.length < i4) {
                        c13143l2.crashlytics(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c13143l.yandex(), this.crashlytics - this.amazon);
                c13143l.firebase(this.amazon, iMin2, c13143l2.yandex);
                int i5 = this.amazon + iMin2;
                this.amazon = i5;
                int i6 = this.crashlytics;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.purchase) {
                        c13143l2.m3561extends(i6);
                    } else {
                        if (AbstractC15323l.adcel(c13143l2.yandex, 0, i6, -1) != 0) {
                            this.billing = true;
                            return;
                        }
                        c13143l2.m3561extends(this.crashlytics - 4);
                    }
                    c13143l2.m3562for(0);
                    this.yandex.purchase(c13143l2);
                    this.amazon = 0;
                }
            }
        }
    }
}
