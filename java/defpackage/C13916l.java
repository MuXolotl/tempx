package defpackage;

import j$.util.Objects;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13916l implements InterfaceC17094l {
    public InterfaceC8979l admob;
    public final String amazon;
    public final String billing;
    public final C13143l crashlytics;
    public boolean firebase;
    public int isPro;
    public final C5257l loadAd;
    public long metrica;
    public String mopub;
    public final int purchase;
    public C5978l remoteconfig;
    public long smaato;
    public int subs;
    public int vip;
    public final /* synthetic */ int yandex;

    public C13916l(int i, int i2, String str, String str2) {
        this.yandex = i2;
        switch (i2) {
            case 1:
                C5257l c5257l = new C5257l(new byte[16], 16);
                this.loadAd = c5257l;
                this.crashlytics = new C13143l(c5257l.loadAd);
                this.subs = 0;
                this.isPro = 0;
                this.firebase = false;
                this.metrica = -9223372036854775807L;
                this.amazon = str;
                this.purchase = i;
                this.billing = str2;
                break;
            default:
                C5257l c5257l2 = new C5257l(new byte[128], 128);
                this.loadAd = c5257l2;
                this.crashlytics = new C13143l(c5257l2.loadAd);
                this.subs = 0;
                this.metrica = -9223372036854775807L;
                this.amazon = str;
                this.purchase = i;
                this.billing = str2;
                break;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
        int i = this.yandex;
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        switch (this.yandex) {
            case 0:
                this.subs = 0;
                this.isPro = 0;
                this.firebase = false;
                this.metrica = -9223372036854775807L;
                break;
            default:
                this.subs = 0;
                this.isPro = 0;
                this.firebase = false;
                this.metrica = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        switch (this.yandex) {
            case 0:
                cstatic.yandex();
                cstatic.amazon();
                this.mopub = (String) cstatic.purchase;
                cstatic.amazon();
                this.admob = interfaceC2053l.startapp(cstatic.crashlytics, 1);
                break;
            default:
                cstatic.yandex();
                cstatic.amazon();
                this.mopub = (String) cstatic.purchase;
                cstatic.amazon();
                this.admob = interfaceC2053l.startapp(cstatic.crashlytics, 1);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0369  */
    /* JADX WARN: Code duplicated, block: B:186:0x0377  */
    /* JADX WARN: Code duplicated, block: B:188:0x037f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0395 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0397  */
    /* JADX WARN: Code duplicated, block: B:197:0x039c  */
    /* JADX WARN: Code duplicated, block: B:199:0x039f  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iMopub;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j;
        c13143l = c13143l;
        int i19 = this.yandex;
        int i20 = this.purchase;
        String str2 = this.amazon;
        String str3 = this.billing;
        C5257l c5257l = this.loadAd;
        long j2 = -9223372036854775807L;
        int i21 = 0;
        int i22 = 1;
        int i23 = 2;
        C13143l c13143l2 = this.crashlytics;
        int i24 = 16;
        switch (i19) {
            case 0:
                this.admob.getClass();
                while (c13143l.yandex() > 0) {
                    int i25 = this.subs;
                    if (i25 == 0) {
                        while (true) {
                            if (c13143l.yandex() <= 0) {
                                i21 = 0;
                                i22 = 1;
                                i23 = 2;
                            } else if (this.firebase) {
                                int iSignatures = c13143l.signatures();
                                if (iSignatures == 119) {
                                    this.firebase = false;
                                    i22 = 1;
                                    this.subs = 1;
                                    byte[] bArr = c13143l2.yandex;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.isPro = 2;
                                    i23 = 2;
                                    i21 = 0;
                                } else {
                                    this.firebase = iSignatures == 11;
                                }
                            } else {
                                this.firebase = c13143l.signatures() == 11;
                            }
                        }
                    } else if (i25 == i22) {
                        byte[] bArr2 = c13143l2.yandex;
                        int iMin = Math.min(c13143l.yandex(), 128 - this.isPro);
                        c13143l.firebase(this.isPro, iMin, bArr2);
                        int i26 = this.isPro + iMin;
                        this.isPro = i26;
                        if (i26 == 128) {
                            c5257l.remoteconfig(i21);
                            int[] iArr = AbstractC2991l.purchase;
                            int[] iArr2 = AbstractC2991l.crashlytics;
                            int iPurchase = c5257l.purchase();
                            c5257l.metrica(40);
                            int i27 = c5257l.mopub(5) > 10 ? i22 : 0;
                            c5257l.remoteconfig(iPurchase);
                            if (i27 != 0) {
                                c5257l.metrica(i24);
                                int iMopub2 = c5257l.mopub(i23);
                                if (iMopub2 == 0) {
                                    i6 = 0;
                                } else if (iMopub2 != i22) {
                                    i6 = iMopub2 != i23 ? -1 : i23;
                                } else {
                                    i6 = i22;
                                }
                                c5257l.metrica(3);
                                iMopub = (c5257l.mopub(11) + i22) * i23;
                                int iMopub3 = c5257l.mopub(i23);
                                if (iMopub3 == 3) {
                                    i5 = AbstractC2991l.amazon[c5257l.mopub(i23)];
                                    i7 = 3;
                                    i8 = 6;
                                } else {
                                    int iMopub4 = c5257l.mopub(i23);
                                    int i28 = AbstractC2991l.loadAd[iMopub4];
                                    i5 = iArr2[iMopub3];
                                    i7 = iMopub4;
                                    i8 = i28;
                                }
                                i4 = i8 * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                int i29 = (iMopub * i5) / (i8 * 32);
                                int iMopub5 = c5257l.mopub(3);
                                boolean zBilling = c5257l.billing();
                                int i30 = iArr[iMopub5] + (zBilling ? 1 : 0);
                                c5257l.metrica(10);
                                if (c5257l.billing()) {
                                    c5257l.metrica(8);
                                }
                                if (iMopub5 == 0) {
                                    c5257l.metrica(5);
                                    if (c5257l.billing()) {
                                        c5257l.metrica(8);
                                    }
                                }
                                if (i6 == 1 && c5257l.billing()) {
                                    c5257l.metrica(16);
                                }
                                if (c5257l.billing()) {
                                    if (iMopub5 > 2) {
                                        c5257l.metrica(2);
                                    }
                                    if ((iMopub5 & 1) == 0 || iMopub5 <= 2) {
                                        i14 = 6;
                                    } else {
                                        i14 = 6;
                                        c5257l.metrica(6);
                                    }
                                    if ((iMopub5 & 4) != 0) {
                                        c5257l.metrica(i14);
                                    }
                                    if (zBilling && c5257l.billing()) {
                                        c5257l.metrica(5);
                                    }
                                    if (i6 == 0) {
                                        if (c5257l.billing()) {
                                            i15 = 6;
                                            c5257l.metrica(6);
                                        } else {
                                            i15 = 6;
                                        }
                                        if (iMopub5 == 0 && c5257l.billing()) {
                                            c5257l.metrica(i15);
                                        }
                                        if (c5257l.billing()) {
                                            c5257l.metrica(i15);
                                        }
                                        i9 = i30;
                                        int iMopub6 = c5257l.mopub(2);
                                        if (iMopub6 == 1) {
                                            c5257l.metrica(5);
                                        } else if (iMopub6 == 2) {
                                            c5257l.metrica(12);
                                        } else {
                                            if (iMopub6 == 3) {
                                                int iMopub7 = c5257l.mopub(5);
                                                if (c5257l.billing()) {
                                                    c5257l.metrica(5);
                                                    if (c5257l.billing()) {
                                                        i17 = 4;
                                                        c5257l.metrica(4);
                                                    } else {
                                                        i17 = 4;
                                                    }
                                                    if (c5257l.billing()) {
                                                        c5257l.metrica(i17);
                                                    }
                                                    if (c5257l.billing()) {
                                                        c5257l.metrica(i17);
                                                    }
                                                    if (c5257l.billing()) {
                                                        c5257l.metrica(i17);
                                                    }
                                                    if (c5257l.billing()) {
                                                        c5257l.metrica(i17);
                                                    }
                                                    if (c5257l.billing()) {
                                                        c5257l.metrica(i17);
                                                    }
                                                    if (c5257l.billing()) {
                                                        c5257l.metrica(i17);
                                                    }
                                                    if (c5257l.billing()) {
                                                        if (c5257l.billing()) {
                                                            c5257l.metrica(i17);
                                                        }
                                                        if (c5257l.billing()) {
                                                            c5257l.metrica(i17);
                                                        }
                                                    }
                                                }
                                                if (c5257l.billing()) {
                                                    c5257l.metrica(5);
                                                    if (c5257l.billing()) {
                                                        c5257l.metrica(7);
                                                        if (c5257l.billing()) {
                                                            c5257l.metrica(8);
                                                            i16 = 2;
                                                        } else {
                                                            i16 = 2;
                                                        }
                                                    } else {
                                                        i16 = 2;
                                                    }
                                                } else {
                                                    i16 = 2;
                                                }
                                                c5257l.metrica((iMopub7 + i16) * 8);
                                                c5257l.crashlytics();
                                            }
                                            if (iMopub5 < i16) {
                                                if (c5257l.billing()) {
                                                    c5257l.metrica(14);
                                                }
                                                if (iMopub5 == 0 && c5257l.billing()) {
                                                    c5257l.metrica(14);
                                                }
                                            }
                                            i10 = i7;
                                            if (c5257l.billing()) {
                                                if (i10 == 0) {
                                                    c5257l.metrica(5);
                                                } else {
                                                    for (i18 = 0; i18 < i8; i18++) {
                                                        if (c5257l.billing()) {
                                                            c5257l.metrica(5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i16 = 2;
                                        if (iMopub5 < i16) {
                                            if (c5257l.billing()) {
                                                c5257l.metrica(14);
                                            }
                                            if (iMopub5 == 0) {
                                                c5257l.metrica(14);
                                            }
                                        }
                                        i10 = i7;
                                        if (c5257l.billing()) {
                                            if (i10 == 0) {
                                                c5257l.metrica(5);
                                            } else {
                                                while (i18 < i8) {
                                                    if (c5257l.billing()) {
                                                        c5257l.metrica(5);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i9 = i30;
                                        i10 = i7;
                                    }
                                } else {
                                    i9 = i30;
                                    i10 = i7;
                                }
                                if (c5257l.billing()) {
                                    c5257l.metrica(5);
                                    if (iMopub5 == 2) {
                                        c5257l.metrica(4);
                                    }
                                    if (iMopub5 >= 6) {
                                        c5257l.metrica(2);
                                    }
                                    if (c5257l.billing()) {
                                        i13 = 8;
                                        c5257l.metrica(8);
                                    } else {
                                        i13 = 8;
                                    }
                                    if (iMopub5 == 0 && c5257l.billing()) {
                                        c5257l.metrica(i13);
                                    }
                                    i11 = 3;
                                    if (iMopub3 < 3) {
                                        c5257l.vip();
                                    }
                                } else {
                                    i11 = 3;
                                }
                                if (i6 == 0 && i10 != i11) {
                                    c5257l.vip();
                                }
                                if (i6 == 2 && (i10 == i11 || c5257l.billing())) {
                                    i12 = 6;
                                    c5257l.metrica(6);
                                } else {
                                    i12 = 6;
                                }
                                str = (c5257l.billing() && c5257l.mopub(i12) == 1 && c5257l.mopub(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i = i29;
                                i3 = i9;
                            } else {
                                c5257l.metrica(32);
                                int iMopub8 = c5257l.mopub(2);
                                String str4 = iMopub8 == 3 ? null : "audio/ac3";
                                int iMopub9 = c5257l.mopub(6);
                                i = AbstractC2991l.billing[iMopub9 / 2] * 1000;
                                int iSmaato = AbstractC2991l.smaato(iMopub8, iMopub9);
                                c5257l.metrica(8);
                                int iMopub10 = c5257l.mopub(3);
                                if ((iMopub10 & 1) == 0 || iMopub10 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    c5257l.metrica(2);
                                }
                                if ((iMopub10 & 4) != 0) {
                                    c5257l.metrica(i2);
                                }
                                if (iMopub10 == i2) {
                                    c5257l.metrica(i2);
                                }
                                int i31 = iMopub8 < 3 ? iArr2[iMopub8] : -1;
                                i3 = iArr[iMopub10] + (c5257l.billing() ? 1 : 0);
                                i4 = 1536;
                                str = str4;
                                iMopub = iSmaato;
                                i5 = i31;
                            }
                            C5978l c5978l = this.remoteconfig;
                            if (c5978l == null || i3 != c5978l.f12619package || i5 != c5978l.f12622synchronized || !Objects.equals(str, c5978l.metrica)) {
                                C12984l c12984l = new C12984l();
                                c12984l.yandex = this.mopub;
                                c12984l.remoteconfig = AbstractC3825l.vip(str3);
                                c12984l.vip = AbstractC3825l.vip(str);
                                c12984l.f25447throws = i3;
                                c12984l.f25442package = i5;
                                c12984l.amazon = str2;
                                c12984l.billing = i20;
                                c12984l.subs = i;
                                if ("audio/ac3".equals(str)) {
                                    c12984l.admob = i;
                                }
                                C5978l c5978l2 = new C5978l(c12984l);
                                this.remoteconfig = c5978l2;
                                this.admob.mopub(c5978l2);
                            }
                            this.vip = iMopub;
                            this.smaato = (((long) i4) * 1000000) / ((long) this.remoteconfig.f12622synchronized);
                            c13143l2.m3562for(0);
                            this.admob.purchase(128, c13143l2);
                            this.subs = 2;
                            i23 = 2;
                            i21 = 0;
                            i22 = 1;
                        } else {
                            c13143l = c13143l;
                        }
                    } else if (i25 == i23) {
                        int iMin2 = Math.min(c13143l.yandex(), this.vip - this.isPro);
                        this.admob.purchase(iMin2, c13143l);
                        int i32 = this.isPro + iMin2;
                        this.isPro = i32;
                        if (i32 == this.vip) {
                            AbstractC12442l.subscription(this.metrica != -9223372036854775807L ? i22 : i21);
                            this.admob.yandex(this.metrica, 1, this.vip, 0, null);
                            this.metrica += this.smaato;
                            this.subs = i21;
                        }
                    }
                    i24 = 16;
                }
                break;
            default:
                this.admob.getClass();
                while (c13143l.yandex() > 0) {
                    int i33 = this.subs;
                    if (i33 == 0) {
                        j = j2;
                        while (c13143l.yandex() > 0) {
                            if (this.firebase) {
                                int iSignatures2 = c13143l.signatures();
                                this.firebase = iSignatures2 == 172;
                                if (iSignatures2 == 64 || iSignatures2 == 65) {
                                    byte b = iSignatures2 == 65;
                                    this.subs = 1;
                                    byte[] bArr3 = c13143l2.yandex;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (b == true ? 65 : 64);
                                    this.isPro = 2;
                                }
                            } else {
                                this.firebase = c13143l.signatures() == 172;
                            }
                        }
                    } else if (i33 == 1) {
                        j = j2;
                        byte[] bArr4 = c13143l2.yandex;
                        int iMin3 = Math.min(c13143l.yandex(), 16 - this.isPro);
                        c13143l.firebase(this.isPro, iMin3, bArr4);
                        int i34 = this.isPro + iMin3;
                        this.isPro = i34;
                        if (i34 == 16) {
                            c5257l.remoteconfig(0);
                            C15380l c15380lBilling = AbstractC13693l.billing(c5257l);
                            int i35 = c15380lBilling.loadAd;
                            C5978l c5978l3 = this.remoteconfig;
                            if (c5978l3 == null || 2 != c5978l3.f12619package || i35 != c5978l3.f12622synchronized || !"audio/ac4".equals(c5978l3.metrica)) {
                                C12984l c12984l2 = new C12984l();
                                c12984l2.yandex = this.mopub;
                                c12984l2.remoteconfig = AbstractC3825l.vip(str3);
                                c12984l2.vip = AbstractC3825l.vip("audio/ac4");
                                c12984l2.f25447throws = 2;
                                c12984l2.f25442package = i35;
                                c12984l2.amazon = str2;
                                c12984l2.billing = i20;
                                C5978l c5978l4 = new C5978l(c12984l2);
                                this.remoteconfig = c5978l4;
                                this.admob.mopub(c5978l4);
                            }
                            this.vip = c15380lBilling.crashlytics;
                            this.smaato = (((long) c15380lBilling.amazon) * 1000000) / ((long) this.remoteconfig.f12622synchronized);
                            c13143l2.m3562for(0);
                            this.admob.purchase(16, c13143l2);
                            this.subs = 2;
                        }
                    } else if (i33 == 2) {
                        int iMin4 = Math.min(c13143l.yandex(), this.vip - this.isPro);
                        this.admob.purchase(iMin4, c13143l);
                        int i36 = this.isPro + iMin4;
                        this.isPro = i36;
                        if (i36 == this.vip) {
                            AbstractC12442l.subscription(this.metrica != j2);
                            j = j2;
                            this.admob.yandex(this.metrica, 1, this.vip, 0, null);
                            this.metrica += this.smaato;
                            this.subs = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        switch (this.yandex) {
            case 0:
                this.metrica = j;
                break;
            default:
                this.metrica = j;
                break;
        }
    }

    private final void loadAd(boolean z) {
    }

    private final void yandex(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13916l(String str) {
        this(0, 0, null, str);
        this.yandex = 0;
    }
}
