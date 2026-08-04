package defpackage;

/* JADX INFO: renamed from: lؓٞ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2006l {
    public double adcel;
    public final int admob;
    public final float amazon;
    public final int billing;
    public final float crashlytics;
    public int firebase;
    public int isPro;
    public final int loadAd;
    public int metrica;
    public final int mopub;
    public final float purchase;
    public int remoteconfig;
    public int smaato;
    public int startapp;
    public final InterfaceC18043l subs;
    public int vip;
    public final int yandex;

    public C2006l(int i, int i2, float f, float f2, int i3, boolean z) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = f;
        this.amazon = f2;
        this.purchase = i / i3;
        this.billing = i / 400;
        int i4 = i / 65;
        this.mopub = i4;
        this.admob = i4 * 2;
        this.subs = z ? new C3707l(this) : new C17724l(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadAd() {
        float f;
        int iAdcel;
        double d;
        int i;
        int iRound;
        int i2;
        int iRound2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5 = this.firebase;
        float f2 = this.crashlytics;
        float f3 = this.amazon;
        double d2 = f2 / f3;
        float f4 = this.purchase * f3;
        int i6 = this.yandex;
        int i7 = 1;
        InterfaceC18043l interfaceC18043l = this.subs;
        int i8 = this.loadAd;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i9 = this.isPro;
            int i10 = this.admob;
            if (i9 >= i10) {
                int i11 = 0;
                while (true) {
                    int i12 = this.metrica;
                    if (i12 > 0) {
                        int iMin = Math.min(i10, i12);
                        yandex(i11, iMin);
                        this.metrica -= iMin;
                        i11 += iMin;
                        f = f4;
                        d = d2;
                        i2 = i7;
                        i = i10;
                    } else {
                        int i13 = i6 > 4000 ? i6 / 4000 : i7;
                        int i14 = this.mopub;
                        int i15 = this.billing;
                        if (i8 == i7 && i13 == i7) {
                            iAdcel = interfaceC18043l.billing(i11, i15, i14);
                            f = f4;
                        } else {
                            interfaceC18043l.purchase(i11, i13);
                            f = f4;
                            int iAdcel2 = interfaceC18043l.adcel(i15 / i13, i14 / i13);
                            if (i13 != i7) {
                                int i16 = iAdcel2 * i13;
                                int i17 = i13 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                if (i18 >= i15) {
                                    i15 = i18;
                                }
                                if (i19 <= i14) {
                                    i14 = i19;
                                }
                                if (i8 == i7) {
                                    iAdcel = interfaceC18043l.billing(i11, i15, i14);
                                } else {
                                    interfaceC18043l.purchase(i11, i7);
                                    iAdcel = interfaceC18043l.adcel(i15, i14);
                                }
                            } else {
                                iAdcel = iAdcel2;
                            }
                        }
                        int i20 = interfaceC18043l.firebase() ? this.startapp : iAdcel;
                        interfaceC18043l.mopub();
                        this.startapp = iAdcel;
                        double d3 = this.adcel;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                double d4 = (((double) i20) / (d2 - 1.0d)) + d3;
                                iRound2 = (int) Math.round(d4);
                                d = d2;
                                this.adcel = d4 - ((double) iRound2);
                                interfaceC18043l = interfaceC18043l;
                            } else {
                                d = d2;
                                double d5 = (((2.0d - d) * ((double) i20)) / (d - 1.0d)) + d3;
                                int iRound3 = (int) Math.round(d5);
                                this.metrica = iRound3;
                                this.adcel = d5 - ((double) iRound3);
                                iRound2 = i20;
                            }
                            interfaceC18043l.isPro(iRound2);
                            int i21 = i10;
                            int i22 = iRound2;
                            interfaceC18043l.remoteconfig(i22, this.loadAd, this.firebase, i11, i11 + i20);
                            this.firebase += i22;
                            i11 = i20 + i22 + i11;
                            i = i21;
                            i2 = i7;
                        } else {
                            d = d2;
                            int i23 = i7;
                            i = i10;
                            if (d < 0.5d) {
                                double d6 = ((((double) i20) * d) / (1.0d - d)) + d3;
                                iRound = (int) Math.round(d6);
                                this.adcel = d6 - ((double) iRound);
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * ((double) i20)) / (1.0d - d)) + d3;
                                int iRound4 = (int) Math.round(d7);
                                this.metrica = iRound4;
                                this.adcel = d7 - ((double) iRound4);
                                iRound = i20;
                            }
                            int i24 = i20 + iRound;
                            interfaceC18043l.isPro(i24);
                            i2 = i23;
                            System.arraycopy(interfaceC18043l.admob(), i11 * i8, interfaceC18043l.subs(), this.firebase * i8, i20 * i8);
                            int i25 = i11;
                            interfaceC18043l.remoteconfig(iRound, this.loadAd, this.firebase + i20, i20 + i11, i25);
                            this.firebase += i24;
                            i11 = i25 + iRound;
                        }
                    }
                    if (i11 + i > i9) {
                        break;
                    }
                    i10 = i;
                    f4 = f;
                    i7 = i2;
                    d2 = d;
                }
                int i26 = this.isPro - i11;
                System.arraycopy(interfaceC18043l.admob(), i11 * i8, interfaceC18043l.admob(), 0, i26 * i8);
                this.isPro = i26;
            }
            if (f != 1.0f || this.firebase == i5) {
            }
            long j3 = (long) (i6 / f);
            long j4 = i6;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i27 = this.firebase - i5;
            interfaceC18043l.vip(i27);
            System.arraycopy(interfaceC18043l.subs(), i5 * i8, interfaceC18043l.smaato(), this.smaato * i8, i27 * i8);
            this.firebase = i5;
            this.smaato += i27;
            int i28 = 0;
            while (true) {
                i3 = this.smaato - 1;
                if (i28 >= i3) {
                    break;
                }
                while (true) {
                    i4 = this.remoteconfig + 1;
                    j = i4;
                    long j5 = j * j3;
                    j2 = this.vip;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    int i29 = i2;
                    interfaceC18043l.isPro(i29);
                    interfaceC18043l.crashlytics(i28, j4, j3);
                    this.vip += i29;
                    this.firebase += i29;
                }
                int i30 = i2;
                this.remoteconfig = i4;
                if (j == j4) {
                    this.remoteconfig = 0;
                    AbstractC12442l.subscription(j2 == j3 ? i30 : 0);
                    this.vip = 0;
                }
                i28++;
                i2 = i30;
            }
            if (i3 == 0) {
                return;
            }
            System.arraycopy(interfaceC18043l.smaato(), i3 * i8, interfaceC18043l.smaato(), 0, (this.smaato - i3) * i8);
            this.smaato -= i3;
            return;
        }
        yandex(0, this.isPro);
        this.isPro = 0;
        f = f4;
        i2 = 1;
        if (f != 1.0f) {
        }
    }

    public final void yandex(int i, int i2) {
        InterfaceC18043l interfaceC18043l = this.subs;
        interfaceC18043l.isPro(i2);
        Object objAdmob = interfaceC18043l.admob();
        int i3 = this.loadAd;
        System.arraycopy(objAdmob, i * i3, interfaceC18043l.subs(), this.firebase * i3, i3 * i2);
        this.firebase += i2;
    }
}
