package defpackage;

import java.io.EOFException;

/* JADX INFO: renamed from: lِؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11587l {
    public int amazon;
    public boolean purchase;
    public final C6673l yandex = new C6673l();
    public final C13143l loadAd = new C13143l(new byte[65025], 0);
    public int crashlytics = -1;

    public final boolean loadAd(InterfaceC10430l interfaceC10430l) {
        int i;
        AbstractC12442l.subscription(interfaceC10430l != null);
        boolean z = this.purchase;
        C13143l c13143l = this.loadAd;
        if (z) {
            this.purchase = false;
            c13143l.m3563native(0);
        }
        while (!this.purchase) {
            int i2 = this.crashlytics;
            C6673l c6673l = this.yandex;
            if (i2 < 0) {
                if (c6673l.loadAd(interfaceC10430l, -1L) && c6673l.yandex(interfaceC10430l, true)) {
                    int iYandex = c6673l.amazon;
                    if ((c6673l.yandex & 1) == 1 && c13143l.crashlytics == 0) {
                        iYandex += yandex(0);
                        i = this.amazon;
                    } else {
                        i = 0;
                    }
                    try {
                        interfaceC10430l.remoteconfig(iYandex);
                        this.crashlytics = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iYandex2 = yandex(this.crashlytics);
            int i3 = this.crashlytics + this.amazon;
            if (iYandex2 > 0) {
                c13143l.crashlytics(c13143l.crashlytics + iYandex2);
                try {
                    interfaceC10430l.readFully(c13143l.yandex, c13143l.crashlytics, iYandex2);
                    c13143l.m3561extends(c13143l.crashlytics + iYandex2);
                    this.purchase = c6673l.billing[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c6673l.crashlytics) {
                i3 = -1;
            }
            this.crashlytics = i3;
        }
        return true;
    }

    public final int yandex(int i) {
        int i2;
        int i3 = 0;
        this.amazon = 0;
        do {
            int i4 = this.amazon;
            int i5 = i + i4;
            C6673l c6673l = this.yandex;
            if (i5 >= c6673l.crashlytics) {
                break;
            }
            int[] iArr = c6673l.billing;
            this.amazon = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
