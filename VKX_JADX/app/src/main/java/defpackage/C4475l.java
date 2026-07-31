package defpackage;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lۣؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4475l implements InterfaceC17094l {
    public final int amazon;
    public String billing;
    public final String crashlytics;
    public long firebase;
    public int isPro;
    public InterfaceC8979l mopub;
    public int remoteconfig;
    public C5978l smaato;
    public int subs;
    public int vip;
    public final C13143l yandex;
    public int admob = 0;
    public long adcel = -9223372036854775807L;
    public final AtomicInteger loadAd = new AtomicInteger();
    public int metrica = -1;
    public int startapp = -1;
    public final String purchase = "video/mp2t";

    public C4475l(String str, int i, int i2) {
        this.yandex = new C13143l(new byte[i2]);
        this.crashlytics = str;
        this.amazon = i;
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        this.admob = 0;
        this.subs = 0;
        this.isPro = 0;
        this.adcel = -9223372036854775807L;
        this.loadAd.set(0);
    }

    public final void loadAd(Cimport cimport) {
        int i = cimport.loadAd;
        String str = cimport.yandex;
        int i2 = cimport.crashlytics;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        C5978l c5978l = this.smaato;
        if (c5978l != null && i2 == c5978l.f12619package && i == c5978l.f12622synchronized && str.equals(c5978l.metrica)) {
            return;
        }
        C5978l c5978l2 = this.smaato;
        C12984l c12984l = c5978l2 == null ? new C12984l() : c5978l2.yandex();
        c12984l.yandex = this.billing;
        c12984l.remoteconfig = AbstractC3825l.vip(this.purchase);
        c12984l.vip = AbstractC3825l.vip(str);
        c12984l.f25447throws = i2;
        c12984l.f25442package = i;
        c12984l.amazon = this.crashlytics;
        c12984l.billing = this.amazon;
        C5978l c5978l3 = new C5978l(c12984l);
        this.smaato = c5978l3;
        this.mopub.mopub(c5978l3);
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        cstatic.yandex();
        cstatic.amazon();
        this.billing = (String) cstatic.purchase;
        cstatic.amazon();
        this.mopub = interfaceC2053l.startapp(cstatic.crashlytics, 1);
    }

    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) throws C17655l {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int iMopub;
        int iMopub2;
        int iMopub3;
        int i5;
        long jM3970import;
        int i6;
        long jM3970import2;
        int i7;
        int i8;
        int i9;
        int i10;
        this.mopub.getClass();
        while (c13143l.yandex() > 0) {
            int i11 = this.admob;
            C13143l c13143l2 = this.yandex;
            switch (i11) {
                case 0:
                    while (c13143l.yandex() > 0) {
                        int i12 = this.isPro << 8;
                        this.isPro = i12;
                        int iSignatures = i12 | c13143l.signatures();
                        this.isPro = iSignatures;
                        int iPurchase = AbstractC0441l.purchase(iSignatures);
                        this.vip = iPurchase;
                        if (iPurchase != 0) {
                            byte[] bArr = c13143l2.yandex;
                            int i13 = this.isPro;
                            bArr[0] = (byte) ((i13 >> 24) & 255);
                            bArr[1] = (byte) ((i13 >> 16) & 255);
                            bArr[2] = (byte) ((i13 >> 8) & 255);
                            bArr[3] = (byte) (i13 & 255);
                            this.subs = 4;
                            this.isPro = 0;
                            if (iPurchase != 3 && iPurchase != 4) {
                                if (iPurchase == 1) {
                                    this.admob = 1;
                                } else {
                                    this.admob = 2;
                                }
                            }
                            this.admob = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (yandex(c13143l, c13143l2.yandex, 18)) {
                        byte[] bArr2 = c13143l2.yandex;
                        if (this.smaato == null) {
                            String str = this.billing;
                            C5257l c5257lBilling = AbstractC0441l.billing(bArr2);
                            c5257lBilling.metrica(60);
                            int i14 = AbstractC0441l.yandex[c5257lBilling.mopub(6)];
                            int i15 = AbstractC0441l.loadAd[c5257lBilling.mopub(4)];
                            int iMopub4 = c5257lBilling.mopub(5);
                            int i16 = iMopub4 >= 29 ? -1 : (AbstractC0441l.crashlytics[iMopub4] * 1000) / 2;
                            c5257lBilling.metrica(10);
                            int i17 = i14 + (c5257lBilling.mopub(2) > 0 ? 1 : 0);
                            C12984l c12984l = new C12984l();
                            c12984l.yandex = str;
                            c12984l.remoteconfig = AbstractC3825l.vip(this.purchase);
                            c12984l.vip = AbstractC3825l.vip("audio/vnd.dts");
                            c12984l.admob = i16;
                            c12984l.f25447throws = i17;
                            c12984l.f25442package = i15;
                            c12984l.ads = null;
                            c12984l.amazon = this.crashlytics;
                            c12984l.billing = this.amazon;
                            C5978l c5978l = new C5978l(c12984l);
                            this.smaato = c5978l;
                            this.mopub.mopub(c5978l);
                        }
                        this.remoteconfig = AbstractC0441l.amazon(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.firebase = AbstractC9966l.loadAd(AbstractC15323l.m3969goto(this.smaato.f12622synchronized, (((i2 >> 2) | i) + 1) * 32));
                            c13143l2.m3562for(0);
                            this.mopub.purchase(18, c13143l2);
                            this.admob = 6;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.firebase = AbstractC9966l.loadAd(AbstractC15323l.m3969goto(this.smaato.f12622synchronized, (((i2 >> 2) | i) + 1) * 32));
                        c13143l2.m3562for(0);
                        this.mopub.purchase(18, c13143l2);
                        this.admob = 6;
                        break;
                    }
                    break;
                case 2:
                    if (yandex(c13143l, c13143l2.yandex, 7)) {
                        C5257l c5257lBilling2 = AbstractC0441l.billing(c13143l2.yandex);
                        c5257lBilling2.metrica(42);
                        this.metrica = c5257lBilling2.mopub(c5257lBilling2.billing() ? 12 : 8) + 1;
                        this.admob = 3;
                    }
                    break;
                case 3:
                    int i18 = 8;
                    if (yandex(c13143l, c13143l2.yandex, this.metrica)) {
                        C5257l c5257lBilling3 = AbstractC0441l.billing(c13143l2.yandex);
                        c5257lBilling3.metrica(40);
                        int iMopub5 = c5257lBilling3.mopub(2);
                        if (c5257lBilling3.billing()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        c5257lBilling3.metrica(i4);
                        int iMopub6 = c5257lBilling3.mopub(i3) + 1;
                        boolean zBilling = c5257lBilling3.billing();
                        if (zBilling) {
                            iMopub = c5257lBilling3.mopub(2);
                            iMopub2 = (c5257lBilling3.mopub(3) + 1) * AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            if (c5257lBilling3.billing()) {
                                c5257lBilling3.metrica(36);
                            }
                            int iMopub7 = c5257lBilling3.mopub(3) + 1;
                            int iMopub8 = c5257lBilling3.mopub(3) + 1;
                            if (iMopub7 != 1 || iMopub8 != 1) {
                                throw C17655l.crashlytics("Multiple audio presentations or assets not supported");
                            }
                            int i19 = iMopub5 + 1;
                            int iMopub9 = c5257lBilling3.mopub(i19);
                            int i20 = 0;
                            while (i20 < i19) {
                                if (((iMopub9 >> i20) & 1) == 1) {
                                    c5257lBilling3.metrica(i18);
                                }
                                i20++;
                                i18 = 8;
                            }
                            if (c5257lBilling3.billing()) {
                                c5257lBilling3.metrica(2);
                                int iMopub10 = (c5257lBilling3.mopub(2) + 1) << 2;
                                int iMopub11 = c5257lBilling3.mopub(2) + 1;
                                for (int i21 = 0; i21 < iMopub11; i21++) {
                                    c5257lBilling3.metrica(iMopub10);
                                }
                            }
                        } else {
                            iMopub = -1;
                            iMopub2 = 0;
                        }
                        c5257lBilling3.metrica(i3);
                        c5257lBilling3.metrica(12);
                        if (zBilling) {
                            if (c5257lBilling3.billing()) {
                                c5257lBilling3.metrica(4);
                            }
                            if (c5257lBilling3.billing()) {
                                c5257lBilling3.metrica(24);
                            }
                            if (c5257lBilling3.billing()) {
                                c5257lBilling3.startapp(c5257lBilling3.mopub(10) + 1);
                            }
                            c5257lBilling3.metrica(5);
                            i5 = AbstractC0441l.amazon[c5257lBilling3.mopub(4)];
                            iMopub3 = c5257lBilling3.mopub(8) + 1;
                        } else {
                            iMopub3 = -1;
                            i5 = -2147483647;
                        }
                        if (zBilling) {
                            if (iMopub == 0) {
                                i6 = 32000;
                            } else if (iMopub == 1) {
                                i6 = 44100;
                            } else {
                                if (iMopub != 2) {
                                    throw C17655l.yandex(null, "Unsupported reference clock code in DTS HD header: " + iMopub);
                                }
                                i6 = 48000;
                            }
                            String str2 = AbstractC15323l.yandex;
                            jM3970import = AbstractC15323l.m3970import(iMopub2, 1000000L, i6, RoundingMode.DOWN);
                        } else {
                            jM3970import = -9223372036854775807L;
                        }
                        loadAd(new Cimport(iMopub3, i5, iMopub6, jM3970import, "audio/vnd.dts.hd;profile=lbr"));
                        this.remoteconfig = iMopub6;
                        this.firebase = jM3970import == -9223372036854775807L ? 0L : jM3970import;
                        c13143l2.m3562for(0);
                        this.mopub.purchase(this.metrica, c13143l2);
                        this.admob = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (yandex(c13143l, c13143l2.yandex, 6)) {
                        C5257l c5257lBilling4 = AbstractC0441l.billing(c13143l2.yandex);
                        c5257lBilling4.metrica(32);
                        int iMopub12 = AbstractC0441l.mopub(c5257lBilling4, AbstractC0441l.subs) + 1;
                        this.startapp = iMopub12;
                        int i22 = this.subs;
                        if (i22 > iMopub12) {
                            int i23 = i22 - iMopub12;
                            this.subs = i22 - i23;
                            c13143l.m3562for(c13143l.loadAd - i23);
                        }
                        this.admob = 5;
                    }
                    break;
                case 5:
                    if (yandex(c13143l, c13143l2.yandex, this.startapp)) {
                        byte[] bArr3 = c13143l2.yandex;
                        C5257l c5257lBilling5 = AbstractC0441l.billing(bArr3);
                        int i24 = c5257lBilling5.mopub(32) == 1078008818 ? 1 : 0;
                        int iMopub13 = AbstractC0441l.mopub(c5257lBilling5, AbstractC0441l.purchase);
                        int i25 = iMopub13 + 1;
                        if (i24 == 0) {
                            jM3970import2 = -9223372036854775807L;
                            i7 = -2147483647;
                        } else {
                            if (!c5257lBilling5.billing()) {
                                throw C17655l.crashlytics("Only supports full channel mask-based audio presentation");
                            }
                            int i26 = iMopub13 - 1;
                            int i27 = ((bArr3[i26] << 8) & 65535) | (bArr3[iMopub13] & 255);
                            String str3 = AbstractC15323l.yandex;
                            int i28 = 65535;
                            for (int i29 = 0; i29 < i26; i29++) {
                                byte b4 = bArr3[i29];
                                int[] iArr = AbstractC15323l.firebase;
                                int i30 = (iArr[(((b4 & 255) >> 4) ^ ((i28 >> 12) & 255)) & 255] ^ ((i28 << 4) & 65535)) & 65535;
                                i28 = (iArr[((b4 & 15) ^ ((i30 >> 12) & 255)) & 255] ^ ((i30 << 4) & 65535)) & 65535;
                            }
                            if (i27 != i28) {
                                throw C17655l.yandex(null, "CRC check failed");
                            }
                            int iMopub14 = c5257lBilling5.mopub(2);
                            if (iMopub14 != 0) {
                                if (iMopub14 == 1) {
                                    i9 = 480;
                                } else {
                                    if (iMopub14 != 2) {
                                        throw C17655l.yandex(null, "Unsupported base duration index in DTS UHD header: " + iMopub14);
                                    }
                                    i9 = 384;
                                }
                                i8 = 3;
                            } else {
                                i8 = 3;
                                i9 = AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            }
                            int iMopub15 = (c5257lBilling5.mopub(i8) + 1) * i9;
                            int iMopub16 = c5257lBilling5.mopub(2);
                            if (iMopub16 == 0) {
                                i10 = 32000;
                            } else if (iMopub16 == 1) {
                                i10 = 44100;
                            } else {
                                if (iMopub16 != 2) {
                                    throw C17655l.yandex(null, "Unsupported clock rate index in DTS UHD header: " + iMopub16);
                                }
                                i10 = 48000;
                            }
                            if (c5257lBilling5.billing()) {
                                c5257lBilling5.metrica(36);
                            }
                            int iMopub17 = i10 * (1 << c5257lBilling5.mopub(2));
                            jM3970import2 = AbstractC15323l.m3970import(iMopub15, 1000000L, i10, RoundingMode.DOWN);
                            i7 = iMopub17;
                        }
                        int iMopub18 = 0;
                        for (int i31 = 0; i31 < i24; i31++) {
                            iMopub18 += AbstractC0441l.mopub(c5257lBilling5, AbstractC0441l.billing);
                        }
                        AtomicInteger atomicInteger = this.loadAd;
                        if (i24 != 0) {
                            atomicInteger.set(AbstractC0441l.mopub(c5257lBilling5, AbstractC0441l.mopub));
                        }
                        int iMopub19 = iMopub18 + (atomicInteger.get() != 0 ? AbstractC0441l.mopub(c5257lBilling5, AbstractC0441l.admob) : 0) + i25;
                        Cimport cimport = new Cimport(2, i7, iMopub19, jM3970import2, "audio/vnd.dts.uhd;profile=p2");
                        if (this.vip == 3) {
                            loadAd(cimport);
                        }
                        this.remoteconfig = iMopub19;
                        this.firebase = jM3970import2 == -9223372036854775807L ? 0L : jM3970import2;
                        c13143l2.m3562for(0);
                        this.mopub.purchase(this.startapp, c13143l2);
                        this.admob = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c13143l.yandex(), this.remoteconfig - this.subs);
                    this.mopub.purchase(iMin, c13143l);
                    int i32 = this.subs + iMin;
                    this.subs = i32;
                    if (i32 == this.remoteconfig) {
                        AbstractC12442l.subscription(this.adcel != -9223372036854775807L);
                        this.mopub.yandex(this.adcel, this.vip == 4 ? 0 : 1, this.remoteconfig, 0, null);
                        this.adcel += this.firebase;
                        this.admob = 0;
                    }
                    break;
                default:
                    C18073l.admob();
                    return;
            }
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        this.adcel = j;
    }

    public final boolean yandex(C13143l c13143l, byte[] bArr, int i) {
        int iMin = Math.min(c13143l.yandex(), i - this.subs);
        c13143l.firebase(this.subs, iMin, bArr);
        int i2 = this.subs + iMin;
        this.subs = i2;
        return i2 == i;
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
    }
}
