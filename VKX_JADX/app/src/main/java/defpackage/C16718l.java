package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lٖۢۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16718l implements InterfaceC17094l {
    public boolean Signature;
    public InterfaceC8979l billing;
    public int firebase;
    public int metrica;
    public String purchase;
    public int smaato;
    public boolean subs;
    public int subscription;
    public int vip;
    public int amazon = 0;
    public final C13143l yandex = new C13143l(new byte[15], 2);
    public final C5257l loadAd = new C5257l();
    public final C13143l crashlytics = new C13143l();
    public final C17116l startapp = new C17116l();
    public int adcel = -2147483647;
    public int ads = -1;
    public long tapsense = -1;
    public boolean isPro = true;
    public boolean remoteconfig = true;
    public double mopub = -9.223372036854776E18d;
    public double admob = -9.223372036854776E18d;

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        this.amazon = 0;
        this.smaato = 0;
        this.yandex.m3563native(2);
        this.vip = 0;
        this.metrica = 0;
        this.adcel = -2147483647;
        this.ads = -1;
        this.subscription = 0;
        this.tapsense = -1L;
        this.Signature = false;
        this.subs = false;
        this.remoteconfig = true;
        this.isPro = true;
        this.mopub = -9.223372036854776E18d;
        this.admob = -9.223372036854776E18d;
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        cstatic.yandex();
        cstatic.amazon();
        this.purchase = (String) cstatic.purchase;
        cstatic.amazon();
        this.billing = interfaceC2053l.startapp(cstatic.crashlytics, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02de  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ba  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) throws C17655l {
        int i;
        int i2;
        int iMopub;
        int iMopub2;
        int i3;
        char c;
        byte[] bArr;
        long j;
        long j2;
        C13708l c13708lSignatures;
        int iMopub3;
        long j3;
        boolean z;
        int i4;
        this.billing.getClass();
        while (c13143l.yandex() > 0) {
            int i5 = this.amazon;
            int i6 = 8;
            int i7 = 3;
            int i8 = 1;
            if (i5 != 0) {
                C13143l c13143l2 = this.crashlytics;
                C17116l c17116l = this.startapp;
                if (i5 == 1) {
                    int iYandex = c13143l.yandex();
                    C13143l c13143l3 = this.yandex;
                    int iMin = Math.min(iYandex, c13143l3.yandex());
                    c13143l.firebase(c13143l3.loadAd, iMin, c13143l3.yandex);
                    c13143l3.m3568throw(iMin);
                    if (c13143l3.yandex() == 0) {
                        int i9 = c13143l3.crashlytics;
                        byte[] bArr2 = c13143l3.yandex;
                        C5257l c5257l = this.loadAd;
                        c5257l.firebase(i9, bArr2);
                        c5257l.amazon();
                        int iPurchase = AbstractC6725l.purchase(c5257l, 3, 8, 8);
                        c17116l.f33286l = iPurchase;
                        if (iPurchase != -1) {
                            AbstractC12442l.admob(Math.max(Math.max(2, 8), 32) <= 63);
                            AbstractC3483l.loadAd(AbstractC3483l.loadAd(3L, 255L), 4294967296L);
                            if (c5257l.loadAd() < 2) {
                                j3 = -1;
                            } else {
                                long jSubs = c5257l.subs(2);
                                if (jSubs == 3) {
                                    if (c5257l.loadAd() >= 8) {
                                        long jSubs2 = c5257l.subs(8);
                                        jSubs += jSubs2;
                                        if (jSubs2 == 255) {
                                            if (c5257l.loadAd() >= 32) {
                                                jSubs = c5257l.subs(32) + jSubs;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jSubs;
                            }
                            c17116l.f33285l = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw C17655l.crashlytics("Contains sub-stream with an invalid packet label " + c17116l.f33285l);
                                }
                                if (j3 == 0) {
                                    int i10 = c17116l.f33286l;
                                    if (i10 == 1) {
                                        throw C17655l.yandex(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i10 == 2) {
                                        throw C17655l.yandex(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i10 == 17) {
                                        throw C17655l.yandex(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iPurchase2 = AbstractC6725l.purchase(c5257l, 11, 24, 24);
                                c17116l.f33288l = iPurchase2;
                                if (iPurchase2 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i4 = 0;
                            this.vip = 0;
                            this.metrica = c17116l.f33288l + i9 + this.metrica;
                        } else {
                            i4 = 0;
                        }
                        if (z) {
                            c13143l3.m3562for(i4);
                            this.billing.purchase(c13143l3.crashlytics, c13143l3);
                            c13143l3.m3563native(2);
                            c13143l2.m3563native(c17116l.f33288l);
                            this.remoteconfig = true;
                            this.amazon = 2;
                        } else {
                            int i11 = c13143l3.crashlytics;
                            if (i11 < 15) {
                                c13143l3.m3561extends(i11 + 1);
                                this.remoteconfig = false;
                            }
                        }
                    } else {
                        this.remoteconfig = false;
                    }
                } else {
                    if (i5 != 2) {
                        C18073l.admob();
                        return;
                    }
                    int i12 = c17116l.f33286l;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = c13143l.loadAd;
                        int iMin2 = Math.min(c13143l.yandex(), c13143l2.yandex());
                        c13143l.firebase(c13143l2.loadAd, iMin2, c13143l2.yandex);
                        c13143l2.m3568throw(iMin2);
                        c13143l.m3562for(i13);
                    }
                    int iMin3 = Math.min(c13143l.yandex(), c17116l.f33288l - this.vip);
                    this.billing.purchase(iMin3, c13143l);
                    int i14 = this.vip + iMin3;
                    this.vip = i14;
                    if (i14 != c17116l.f33288l) {
                        continue;
                    } else {
                        int i15 = c17116l.f33286l;
                        if (i15 == 1) {
                            byte[] bArr3 = c13143l2.yandex;
                            C5257l c5257l2 = new C5257l(bArr3, bArr3.length);
                            int iMopub4 = c5257l2.mopub(8);
                            int iMopub5 = c5257l2.mopub(5);
                            if (iMopub5 != 31) {
                                switch (iMopub5) {
                                    case 0:
                                        iMopub2 = 96000;
                                        break;
                                    case 1:
                                        iMopub2 = 88200;
                                        break;
                                    case 2:
                                        iMopub2 = 64000;
                                        break;
                                    case 3:
                                        iMopub2 = 48000;
                                        break;
                                    case 4:
                                        iMopub2 = 44100;
                                        break;
                                    case 5:
                                        iMopub2 = 32000;
                                        break;
                                    case 6:
                                        iMopub2 = 24000;
                                        break;
                                    case 7:
                                        iMopub2 = 22050;
                                        break;
                                    case 8:
                                        iMopub2 = AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE;
                                        break;
                                    case 9:
                                        iMopub2 = 12000;
                                        break;
                                    case 10:
                                        iMopub2 = 11025;
                                        break;
                                    case 11:
                                        iMopub2 = 8000;
                                        break;
                                    case 12:
                                        iMopub2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw C17655l.crashlytics("Unsupported sampling rate index " + iMopub5);
                                    case 15:
                                        iMopub2 = 57600;
                                        break;
                                    case 16:
                                        iMopub2 = 51200;
                                        break;
                                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                        iMopub2 = 40000;
                                        break;
                                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                        iMopub2 = 38400;
                                        break;
                                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                        iMopub2 = 34150;
                                        break;
                                    case 20:
                                        iMopub2 = 28800;
                                        break;
                                    case 21:
                                        iMopub2 = 25600;
                                        break;
                                    case 22:
                                        iMopub2 = 20000;
                                        break;
                                    case 23:
                                        iMopub2 = 19200;
                                        break;
                                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                        iMopub2 = 17075;
                                        break;
                                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                        iMopub2 = 14400;
                                        break;
                                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                        iMopub2 = 12800;
                                        break;
                                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                        iMopub2 = 9600;
                                        break;
                                }
                            } else {
                                iMopub2 = c5257l2.mopub(24);
                            }
                            int iMopub6 = c5257l2.mopub(3);
                            if (iMopub6 == 0) {
                                i3 = 768;
                            } else if (iMopub6 == 1) {
                                i3 = 1024;
                            } else if (iMopub6 == 2 || iMopub6 == 3) {
                                i3 = 2048;
                            } else {
                                if (iMopub6 != 4) {
                                    throw C17655l.crashlytics("Unsupported coreSbrFrameLengthIndex " + iMopub6);
                                }
                                i3 = 4096;
                            }
                            int i16 = i3;
                            if (iMopub6 == 0 || iMopub6 == 1) {
                                c = 0;
                            } else if (iMopub6 == 2) {
                                c = 2;
                            } else if (iMopub6 == 3) {
                                c = 3;
                            } else {
                                if (iMopub6 != 4) {
                                    throw C17655l.crashlytics("Unsupported coreSbrFrameLengthIndex " + iMopub6);
                                }
                                c = 1;
                            }
                            c5257l2.metrica(2);
                            AbstractC6725l.subs(c5257l2);
                            int iMopub7 = c5257l2.mopub(5);
                            int i17 = 0;
                            int iPurchase3 = 0;
                            while (true) {
                                int i18 = i8;
                                int i19 = 16;
                                if (i17 < iMopub7 + 1) {
                                    int iMopub8 = c5257l2.mopub(3);
                                    iPurchase3 = AbstractC6725l.purchase(c5257l2, 5, 8, 16) + 1 + iPurchase3;
                                    if ((iMopub8 == 0 || iMopub8 == 2) && c5257l2.billing()) {
                                        AbstractC6725l.subs(c5257l2);
                                    }
                                    i17++;
                                    i8 = i18;
                                } else {
                                    int iPurchase4 = AbstractC6725l.purchase(c5257l2, 4, 8, 16) + 1;
                                    c5257l2.vip();
                                    int i20 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i20 < iPurchase4) {
                                            int iMopub9 = c5257l2.mopub(2);
                                            if (iMopub9 == 0) {
                                                c5257l2.metrica(i7);
                                                if (c5257l2.billing()) {
                                                    c5257l2.metrica(13);
                                                }
                                                if (c > 0) {
                                                    AbstractC6725l.admob(c5257l2);
                                                }
                                            } else if (iMopub9 == i18) {
                                                c5257l2.metrica(i7);
                                                boolean zBilling = c5257l2.billing();
                                                if (zBilling) {
                                                    c5257l2.metrica(13);
                                                }
                                                if (zBilling) {
                                                    c5257l2.vip();
                                                }
                                                if (c > 0) {
                                                    AbstractC6725l.admob(c5257l2);
                                                    iMopub3 = c5257l2.mopub(2);
                                                } else {
                                                    iMopub3 = 0;
                                                }
                                                if (iMopub3 > 0) {
                                                    c5257l2.metrica(6);
                                                    int iMopub10 = c5257l2.mopub(2);
                                                    c5257l2.metrica(4);
                                                    if (c5257l2.billing()) {
                                                        c5257l2.metrica(5);
                                                    }
                                                    if (iMopub3 == 2 || iMopub3 == i7) {
                                                        c5257l2.metrica(6);
                                                    }
                                                    if (iMopub10 == 2) {
                                                        c5257l2.vip();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iPurchase3 - 1) / Math.log(2.0d))) + 1;
                                                int iMopub11 = c5257l2.mopub(2);
                                                if (iMopub11 > 0 && c5257l2.billing()) {
                                                    c5257l2.metrica(iFloor);
                                                }
                                                if (c5257l2.billing()) {
                                                    c5257l2.metrica(iFloor);
                                                }
                                                if (c == 0 && iMopub11 == 0) {
                                                    c5257l2.vip();
                                                }
                                            } else if (iMopub9 == i7) {
                                                AbstractC6725l.purchase(c5257l2, 4, i6, i19);
                                                int iPurchase5 = AbstractC6725l.purchase(c5257l2, 4, i6, i19);
                                                if (c5257l2.billing()) {
                                                    AbstractC6725l.purchase(c5257l2, i6, i19, 0);
                                                }
                                                c5257l2.vip();
                                                if (iPurchase5 > 0) {
                                                    c5257l2.metrica(iPurchase5 * 8);
                                                }
                                            }
                                            i20++;
                                            i6 = 8;
                                            i7 = 3;
                                            i19 = 16;
                                            i18 = 1;
                                        } else {
                                            if (c5257l2.billing()) {
                                                int i21 = 8;
                                                int iPurchase6 = AbstractC6725l.purchase(c5257l2, 2, 4, 8) + 1;
                                                int i22 = 0;
                                                bArr = null;
                                                while (i22 < iPurchase6) {
                                                    int iPurchase7 = AbstractC6725l.purchase(c5257l2, 4, i21, 16);
                                                    int iPurchase8 = AbstractC6725l.purchase(c5257l2, 4, i21, 16);
                                                    if (iPurchase7 == 7) {
                                                        int iMopub12 = c5257l2.mopub(4) + 1;
                                                        c5257l2.metrica(4);
                                                        byte[] bArr4 = new byte[iMopub12];
                                                        for (int i23 = 0; i23 < iMopub12; i23++) {
                                                            bArr4[i23] = (byte) c5257l2.mopub(i21);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        c5257l2.metrica(iPurchase8 * i21);
                                                    }
                                                    i22++;
                                                    i21 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iMopub2) {
                                                case 14700:
                                                case AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                                                    d = 3.0d;
                                                    this.adcel = (int) (((double) iMopub2) * d);
                                                    this.ads = (int) (((double) i16) * d);
                                                    j = this.tapsense;
                                                    j2 = c17116l.f33285l;
                                                    if (j != j2) {
                                                        this.tapsense = j2;
                                                        String strConcat = iMopub4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iMopub4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            c13708lSignatures = null;
                                                        } else {
                                                            c13708lSignatures = AbstractC1186l.signatures(AbstractC15323l.loadAd, bArr);
                                                        }
                                                        C12984l c12984l = new C12984l();
                                                        c12984l.yandex = this.purchase;
                                                        c12984l.remoteconfig = AbstractC3825l.vip("video/mp2t");
                                                        c12984l.vip = AbstractC3825l.vip("audio/mhm1");
                                                        c12984l.f25442package = this.adcel;
                                                        c12984l.isPro = strConcat;
                                                        c12984l.adcel = c13708lSignatures;
                                                        this.billing.mopub(new C5978l(c12984l));
                                                    }
                                                    i2 = 1;
                                                    this.Signature = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.adcel = (int) (((double) iMopub2) * d);
                                                    this.ads = (int) (((double) i16) * d);
                                                    j = this.tapsense;
                                                    j2 = c17116l.f33285l;
                                                    if (j != j2) {
                                                        this.tapsense = j2;
                                                        if (iMopub4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c13708lSignatures = null;
                                                        } else {
                                                            c13708lSignatures = null;
                                                        }
                                                        C12984l c12984l2 = new C12984l();
                                                        c12984l2.yandex = this.purchase;
                                                        c12984l2.remoteconfig = AbstractC3825l.vip("video/mp2t");
                                                        c12984l2.vip = AbstractC3825l.vip("audio/mhm1");
                                                        c12984l2.f25442package = this.adcel;
                                                        c12984l2.isPro = strConcat;
                                                        c12984l2.adcel = c13708lSignatures;
                                                        this.billing.mopub(new C5978l(c12984l2));
                                                    }
                                                    i2 = 1;
                                                    this.Signature = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.adcel = (int) (((double) iMopub2) * d);
                                                    this.ads = (int) (((double) i16) * d);
                                                    j = this.tapsense;
                                                    j2 = c17116l.f33285l;
                                                    if (j != j2) {
                                                        this.tapsense = j2;
                                                        if (iMopub4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c13708lSignatures = null;
                                                        } else {
                                                            c13708lSignatures = null;
                                                        }
                                                        C12984l c12984l3 = new C12984l();
                                                        c12984l3.yandex = this.purchase;
                                                        c12984l3.remoteconfig = AbstractC3825l.vip("video/mp2t");
                                                        c12984l3.vip = AbstractC3825l.vip("audio/mhm1");
                                                        c12984l3.f25442package = this.adcel;
                                                        c12984l3.isPro = strConcat;
                                                        c12984l3.adcel = c13708lSignatures;
                                                        this.billing.mopub(new C5978l(c12984l3));
                                                    }
                                                    i2 = 1;
                                                    this.Signature = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.adcel = (int) (((double) iMopub2) * d);
                                                    this.ads = (int) (((double) i16) * d);
                                                    j = this.tapsense;
                                                    j2 = c17116l.f33285l;
                                                    if (j != j2) {
                                                        this.tapsense = j2;
                                                        if (iMopub4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c13708lSignatures = null;
                                                        } else {
                                                            c13708lSignatures = null;
                                                        }
                                                        C12984l c12984l4 = new C12984l();
                                                        c12984l4.yandex = this.purchase;
                                                        c12984l4.remoteconfig = AbstractC3825l.vip("video/mp2t");
                                                        c12984l4.vip = AbstractC3825l.vip("audio/mhm1");
                                                        c12984l4.f25442package = this.adcel;
                                                        c12984l4.isPro = strConcat;
                                                        c12984l4.adcel = c13708lSignatures;
                                                        this.billing.mopub(new C5978l(c12984l4));
                                                    }
                                                    i2 = 1;
                                                    this.Signature = true;
                                                    break;
                                                default:
                                                    throw C17655l.crashlytics("Unsupported sampling rate " + iMopub2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr5 = c13143l2.yandex;
                                C5257l c5257l3 = new C5257l(bArr5, bArr5.length);
                                if (c5257l3.billing()) {
                                    c5257l3.metrica(2);
                                    iMopub = c5257l3.mopub(13);
                                } else {
                                    iMopub = 0;
                                }
                                this.subscription = iMopub;
                            } else if (i15 == 2) {
                                if (this.Signature) {
                                    this.isPro = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.ads - this.subscription)) * 1000000.0d) / ((double) this.adcel);
                                long jRound = Math.round(this.mopub);
                                if (this.subs) {
                                    this.subs = false;
                                    this.mopub = this.admob;
                                } else {
                                    this.mopub += d2;
                                }
                                this.billing.yandex(jRound, i, this.metrica, 0, null);
                                this.Signature = false;
                                this.subscription = 0;
                                this.metrica = 0;
                            }
                            i2 = 1;
                        }
                        this.amazon = i2;
                    }
                }
            } else {
                int i24 = this.firebase;
                if ((i24 & 2) == 0) {
                    c13143l.m3562for(c13143l.crashlytics);
                } else {
                    if ((i24 & 4) == 0) {
                        while (true) {
                            if (c13143l.yandex() > 0) {
                                int i25 = this.smaato << 8;
                                this.smaato = i25;
                                int iSignatures = i25 | c13143l.signatures();
                                this.smaato = iSignatures;
                                if ((iSignatures & 16777215) == 12583333) {
                                    c13143l.m3562for(c13143l.loadAd - 3);
                                    this.smaato = 0;
                                }
                            }
                        }
                    }
                    this.amazon = 1;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        this.firebase = i;
        if (!this.isPro && (this.metrica != 0 || !this.remoteconfig)) {
            this.subs = true;
        }
        if (j != -9223372036854775807L) {
            if (this.subs) {
                this.admob = j;
            } else {
                this.mopub = j;
            }
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
    }
}
