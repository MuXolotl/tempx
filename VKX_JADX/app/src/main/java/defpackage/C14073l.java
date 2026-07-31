package defpackage;

/* JADX INFO: renamed from: lُٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14073l implements InterfaceC8865l {
    public boolean admob;
    public int amazon;
    public boolean billing;
    public boolean firebase;
    public int isPro;
    public boolean mopub;
    public C16391l purchase;
    public long smaato;
    public int subs;
    public final InterfaceC17094l yandex;
    public final C5257l loadAd = new C5257l(new byte[10], 10);
    public int crashlytics = 0;

    public C14073l(InterfaceC17094l interfaceC17094l) {
        this.yandex = interfaceC17094l;
    }

    @Override // defpackage.InterfaceC8865l
    public final void billing() {
        this.crashlytics = 0;
        this.amazon = 0;
        this.admob = false;
        this.yandex.billing();
    }

    public final boolean crashlytics() {
        C5257l c5257l = this.loadAd;
        c5257l.remoteconfig(0);
        int iMopub = c5257l.mopub(24);
        if (iMopub != 1) {
            AbstractC12900l.subscription("Unexpected start code prefix: ", iMopub, "PesReader");
            this.isPro = -1;
            return false;
        }
        c5257l.metrica(8);
        int iMopub2 = c5257l.mopub(16);
        c5257l.metrica(5);
        this.firebase = c5257l.billing();
        c5257l.metrica(2);
        this.billing = c5257l.billing();
        this.mopub = c5257l.billing();
        c5257l.metrica(6);
        int iMopub3 = c5257l.mopub(8);
        this.subs = iMopub3;
        if (iMopub2 == 0) {
            this.isPro = -1;
            return true;
        }
        int i = (iMopub2 - 3) - iMopub3;
        this.isPro = i;
        if (i < 0) {
            AbstractC6427l.vip("PesReader", "Found negative packet payload size: " + this.isPro);
            this.isPro = -1;
        }
        return true;
    }

    public final boolean loadAd(C13143l c13143l, byte[] bArr, int i) {
        int iMin = Math.min(c13143l.yandex(), i - this.amazon);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c13143l.m3568throw(iMin);
        } else {
            c13143l.firebase(this.amazon, iMin, bArr);
        }
        int i2 = this.amazon + iMin;
        this.amazon = i2;
        return i2 == i;
    }

    @Override // defpackage.InterfaceC8865l
    public final void subs(C16391l c16391l, InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        this.purchase = c16391l;
        this.yandex.mopub(interfaceC2053l, cstatic);
    }

    @Override // defpackage.InterfaceC8865l
    public final void yandex(int i, C13143l c13143l) {
        this.purchase.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        InterfaceC17094l interfaceC17094l = this.yandex;
        if (i2 != 0) {
            int i5 = this.crashlytics;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    AbstractC6427l.vip("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        C18073l.admob();
                        return;
                    }
                    if (this.isPro != -1) {
                        AbstractC6427l.vip("PesReader", "Unexpected start indicator: expected " + this.isPro + " more bytes");
                    }
                    interfaceC17094l.admob(c13143l.crashlytics == 0);
                }
            }
            this.crashlytics = 1;
            this.amazon = 0;
        }
        int i6 = i;
        while (c13143l.yandex() > 0) {
            int i7 = this.crashlytics;
            if (i7 != 0) {
                C5257l c5257l = this.loadAd;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (loadAd(c13143l, c5257l.loadAd, Math.min(10, this.subs)) && loadAd(c13143l, null, this.subs)) {
                            c5257l.remoteconfig(0);
                            this.smaato = -9223372036854775807L;
                            if (this.billing) {
                                c5257l.metrica(4);
                                long jMopub = ((long) c5257l.mopub(3)) << 30;
                                c5257l.metrica(1);
                                long jMopub2 = ((long) (c5257l.mopub(15) << 15)) | jMopub;
                                c5257l.metrica(1);
                                long jMopub3 = jMopub2 | ((long) c5257l.mopub(15));
                                c5257l.metrica(1);
                                if (!this.admob && this.mopub) {
                                    c5257l.metrica(4);
                                    long jMopub4 = ((long) c5257l.mopub(3)) << 30;
                                    c5257l.metrica(1);
                                    long jMopub5 = jMopub4 | ((long) (c5257l.mopub(15) << 15));
                                    c5257l.metrica(1);
                                    long jMopub6 = jMopub5 | ((long) c5257l.mopub(15));
                                    c5257l.metrica(1);
                                    this.purchase.loadAd(jMopub6);
                                    this.admob = true;
                                }
                                this.smaato = this.purchase.loadAd(jMopub3);
                            }
                            i6 |= this.firebase ? 4 : 0;
                            interfaceC17094l.subs(i6, this.smaato);
                            this.crashlytics = 3;
                            this.amazon = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            C18073l.admob();
                            return;
                        }
                        int iYandex = c13143l.yandex();
                        int i8 = this.isPro;
                        int i9 = i8 == i3 ? 0 : iYandex - i8;
                        if (i9 > 0) {
                            iYandex -= i9;
                            c13143l.m3561extends(c13143l.loadAd + iYandex);
                        }
                        interfaceC17094l.purchase(c13143l);
                        int i10 = this.isPro;
                        if (i10 != i3) {
                            int i11 = i10 - iYandex;
                            this.isPro = i11;
                            if (i11 == 0) {
                                interfaceC17094l.admob(false);
                                this.crashlytics = 1;
                                this.amazon = 0;
                            }
                        }
                    }
                } else if (loadAd(c13143l, c5257l.loadAd, 9)) {
                    this.crashlytics = crashlytics() ? 2 : 0;
                    this.amazon = 0;
                }
            } else {
                c13143l.m3568throw(c13143l.yandex());
            }
            i3 = -1;
            i4 = 2;
        }
    }
}
