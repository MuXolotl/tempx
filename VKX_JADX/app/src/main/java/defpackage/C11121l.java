package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lُٙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11121l {
    public final boolean admob;
    public final boolean amazon;
    public final int billing;
    public final boolean crashlytics;
    public final boolean firebase;
    public final boolean isPro;
    public final boolean loadAd;
    public final byte metrica;
    public final int mopub;
    public final boolean purchase;
    public final byte remoteconfig;
    public final boolean smaato;
    public final boolean subs;
    public final byte vip;
    public final boolean yandex;

    public C11121l(C6915l c6915l) {
        int i = c6915l.yandex;
        ByteBuffer byteBuffer = c6915l.loadAd;
        AbstractC12442l.admob(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C5257l c5257l = new C5257l(bArr, iRemaining);
        this.mopub = c5257l.mopub(3);
        c5257l.vip();
        boolean zBilling = c5257l.billing();
        this.yandex = zBilling;
        if (zBilling) {
            c5257l.mopub(5);
            this.loadAd = false;
            this.admob = false;
        } else {
            if (c5257l.billing()) {
                c5257l.metrica(64);
                if (c5257l.billing()) {
                    int i2 = 0;
                    while (!c5257l.billing()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        c5257l.metrica(i2);
                    }
                }
                boolean zBilling2 = c5257l.billing();
                this.loadAd = zBilling2;
                if (zBilling2) {
                    c5257l.metrica(47);
                }
            } else {
                this.loadAd = false;
            }
            this.admob = c5257l.billing();
            int iMopub = c5257l.mopub(5);
            for (int i3 = 0; i3 <= iMopub; i3++) {
                c5257l.metrica(12);
                if (i3 == 0) {
                    if (c5257l.mopub(5) > 7) {
                        c5257l.billing();
                    }
                } else if (c5257l.mopub(5) > 7) {
                    c5257l.vip();
                }
                if (this.loadAd) {
                    c5257l.vip();
                }
                if (this.admob && c5257l.billing()) {
                    if (i3 == 0) {
                        c5257l.mopub(4);
                    } else {
                        c5257l.metrica(4);
                    }
                }
            }
        }
        int iMopub2 = c5257l.mopub(4);
        int iMopub3 = c5257l.mopub(4);
        c5257l.metrica(iMopub2 + 1);
        c5257l.metrica(iMopub3 + 1);
        if (this.yandex) {
            this.crashlytics = false;
        } else {
            this.crashlytics = c5257l.billing();
        }
        if (this.crashlytics) {
            c5257l.metrica(4);
            c5257l.metrica(3);
        }
        c5257l.metrica(3);
        if (this.yandex) {
            this.purchase = true;
            this.amazon = true;
            this.billing = 0;
        } else {
            c5257l.metrica(4);
            boolean zBilling3 = c5257l.billing();
            if (zBilling3) {
                c5257l.metrica(2);
            }
            if (c5257l.billing()) {
                this.amazon = true;
            } else {
                this.amazon = c5257l.billing();
            }
            if (!this.amazon || c5257l.billing()) {
                this.purchase = true;
            } else {
                this.purchase = c5257l.billing();
            }
            if (zBilling3) {
                this.billing = c5257l.mopub(3) + 1;
            } else {
                this.billing = 0;
            }
        }
        c5257l.metrica(3);
        boolean zBilling4 = c5257l.billing();
        if (this.mopub == 2 && zBilling4) {
            this.subs = c5257l.billing();
        } else {
            this.subs = false;
        }
        if (this.mopub != 1) {
            this.isPro = c5257l.billing();
        } else {
            this.isPro = false;
        }
        if (c5257l.billing()) {
            this.remoteconfig = (byte) c5257l.mopub(8);
            this.vip = (byte) c5257l.mopub(8);
            this.metrica = (byte) c5257l.mopub(8);
        } else {
            this.remoteconfig = (byte) 0;
            this.vip = (byte) 0;
            this.metrica = (byte) 0;
        }
        if (this.isPro) {
            c5257l.vip();
            this.firebase = false;
            this.smaato = false;
        } else if (this.remoteconfig == 1 && this.vip == 13 && this.metrica == 0) {
            this.firebase = false;
            this.smaato = false;
        } else {
            c5257l.vip();
            int i4 = this.mopub;
            if (i4 == 0) {
                this.firebase = true;
                this.smaato = true;
            } else if (i4 == 1) {
                this.firebase = false;
                this.smaato = false;
            } else if (this.subs) {
                boolean zBilling5 = c5257l.billing();
                this.firebase = zBilling5;
                if (zBilling5) {
                    this.smaato = c5257l.billing();
                } else {
                    this.smaato = false;
                }
            } else {
                this.firebase = true;
                this.smaato = false;
            }
            if (this.firebase && this.smaato) {
                c5257l.mopub(2);
            }
        }
        c5257l.vip();
    }
}
