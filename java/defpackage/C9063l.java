package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٌۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9063l implements InterfaceC14833l {
    public C7417l admob;
    public InterfaceC8979l billing;
    public int firebase;
    public int isPro;
    public InterfaceC2053l purchase;
    public int remoteconfig;
    public C16269l smaato;
    public C5478l subs;
    public long vip;
    public final byte[] yandex = new byte[42];
    public final C13143l loadAd = new C13143l(new byte[32768], 0);
    public final boolean crashlytics = false;
    public final C1014l amazon = new C1014l(0);
    public int mopub = 0;

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        if (j == 0) {
            this.mopub = 0;
        } else {
            C16269l c16269l = this.smaato;
            if (c16269l != null) {
                c16269l.amazon(j2);
            }
        }
        this.vip = j2 != 0 ? -1L : 0L;
        this.remoteconfig = 0;
        this.loadAd.m3563native(0);
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.purchase = interfaceC2053l;
        this.billing = interfaceC2053l.startapp(0, 1);
        interfaceC2053l.firebase();
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        C7417l c7417lPro = new C7026l(10).pro(interfaceC10430l, C12516l.firebase, 0);
        if (c7417lPro != null) {
            int length = c7417lPro.yandex.length;
        }
        C13143l c13143l = new C13143l(4);
        ((C11826l) interfaceC10430l).billing(c13143l.yandex, 0, 4, false);
        return c13143l.applovin() == 1716281667;
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        C5478l c5478l;
        InterfaceC12703l c9828l;
        long j;
        long j2;
        boolean zLoadAd;
        int i = this.mopub;
        C7417l c7417l = null;
        boolean z = true;
        int i2 = 0;
        if (i == 0) {
            interfaceC10430l.smaato();
            long jMopub = interfaceC10430l.mopub();
            C7417l c7417lPro = new C7026l(10).pro(interfaceC10430l, !this.crashlytics ? null : C12516l.firebase, 0);
            if (c7417lPro != null && c7417lPro.yandex.length != 0) {
                c7417l = c7417lPro;
            }
            interfaceC10430l.remoteconfig((int) (interfaceC10430l.mopub() - jMopub));
            this.admob = c7417l;
            this.mopub = 1;
            return 0;
        }
        byte[] bArr = this.yandex;
        if (i == 1) {
            interfaceC10430l.yandex(0, bArr.length, bArr);
            interfaceC10430l.smaato();
            this.mopub = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i == 2) {
            C13143l c13143l = new C13143l(4);
            interfaceC10430l.readFully(c13143l.yandex, 0, 4);
            if (c13143l.applovin() != 1716281667) {
                throw C17655l.yandex(null, "Failed to read FLAC stream marker.");
            }
            this.mopub = 3;
            return 0;
        }
        int i5 = 7;
        int i6 = 6;
        if (i == 3) {
            int i7 = 0;
            C5478l c5478l2 = this.subs;
            boolean z2 = false;
            while (!z2) {
                interfaceC10430l.smaato();
                byte[] bArr2 = new byte[i3];
                C5257l c5257l = new C5257l(bArr2, i3);
                int i8 = i7;
                interfaceC10430l.yandex(i8, i3, bArr2);
                boolean zBilling = c5257l.billing();
                int iMopub = c5257l.mopub(i5);
                int iMopub2 = c5257l.mopub(24) + i3;
                if (iMopub == 0) {
                    byte[] bArr3 = new byte[38];
                    interfaceC10430l.readFully(bArr3, i8, 38);
                    c5478l2 = new C5478l(bArr3, i3);
                } else {
                    if (c5478l2 == null) {
                        C11983l.crashlytics();
                        return 0;
                    }
                    C7417l c7417l2 = c5478l2.smaato;
                    if (iMopub == i4) {
                        C13143l c13143l2 = new C13143l(iMopub2);
                        interfaceC10430l.readFully(c13143l2.yandex, i8, iMopub2);
                        c5478l2 = new C5478l(c5478l2.yandex, c5478l2.loadAd, c5478l2.crashlytics, c5478l2.amazon, c5478l2.purchase, c5478l2.mopub, c5478l2.admob, c5478l2.isPro, AbstractC13273l.crashlytics(c13143l2), c5478l2.smaato);
                    } else {
                        if (iMopub == i3) {
                            C13143l c13143l3 = new C13143l(iMopub2);
                            interfaceC10430l.readFully(c13143l3.yandex, 0, iMopub2);
                            c13143l3.m3568throw(i3);
                            C7417l c7417lBilling = AbstractC6968l.billing(Arrays.asList(AbstractC6968l.mopub(c13143l3, false, false).f23023l));
                            if (c7417l2 != null) {
                                c7417lBilling = c7417l2.loadAd(c7417lBilling);
                            }
                            c5478l = new C5478l(c5478l2.yandex, c5478l2.loadAd, c5478l2.crashlytics, c5478l2.amazon, c5478l2.purchase, c5478l2.mopub, c5478l2.admob, c5478l2.isPro, c5478l2.firebase, c7417lBilling);
                        } else if (iMopub == i6) {
                            C13143l c13143l4 = new C13143l(iMopub2);
                            interfaceC10430l.readFully(c13143l4.yandex, 0, iMopub2);
                            c13143l4.m3568throw(4);
                            C7417l c7417l3 = new C7417l(AbstractC1186l.isVip(C8694l.amazon(c13143l4)));
                            if (c7417l2 != null) {
                                c7417l3 = c7417l2.loadAd(c7417l3);
                            }
                            c5478l = new C5478l(c5478l2.yandex, c5478l2.loadAd, c5478l2.crashlytics, c5478l2.amazon, c5478l2.purchase, c5478l2.mopub, c5478l2.admob, c5478l2.isPro, c5478l2.firebase, c7417l3);
                        } else {
                            interfaceC10430l.remoteconfig(iMopub2);
                        }
                        c5478l2 = c5478l;
                    }
                }
                String str = AbstractC15323l.yandex;
                this.subs = c5478l2;
                z2 = zBilling;
                i3 = 4;
                i4 = 3;
                i5 = 7;
                i6 = 6;
                i7 = 0;
            }
            this.subs.getClass();
            this.isPro = Math.max(this.subs.crashlytics, 6);
            C5978l c5978lCrashlytics = this.subs.crashlytics(bArr, this.admob);
            InterfaceC8979l interfaceC8979l = this.billing;
            C12984l c12984lYandex = c5978lCrashlytics.yandex();
            c12984lYandex.remoteconfig = AbstractC3825l.vip("audio/flac");
            AbstractC9029l.license(c12984lYandex, interfaceC8979l);
            this.billing.amazon(this.subs.loadAd());
            this.mopub = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            interfaceC10430l.smaato();
            C13143l c13143l5 = new C13143l(2);
            interfaceC10430l.yandex(0, 2, c13143l5.yandex);
            int iM3567synchronized = c13143l5.m3567synchronized();
            if ((iM3567synchronized >> 2) != 16382) {
                interfaceC10430l.smaato();
                throw C17655l.yandex(null, "First frame does not start with sync code.");
            }
            interfaceC10430l.smaato();
            this.firebase = iM3567synchronized;
            InterfaceC2053l interfaceC2053l = this.purchase;
            String str2 = AbstractC15323l.yandex;
            long position = interfaceC10430l.getPosition();
            long length = interfaceC10430l.getLength();
            this.subs.getClass();
            C5478l c5478l3 = this.subs;
            C18595l c18595l = c5478l3.firebase;
            if (c18595l != null && ((long[]) c18595l.f36317l).length > 0) {
                c9828l = new C9828l(c5478l3, position, 1);
                i2 = 0;
            } else if (length == -1 || c5478l3.isPro <= 0) {
                i2 = 0;
                c9828l = new C9828l(c5478l3.loadAd());
            } else {
                int i9 = this.firebase;
                int i10 = c5478l3.crashlytics;
                C6536l c6536l = new C6536l(0, c5478l3);
                C13698l c13698l = new C13698l(c5478l3, i9);
                long jLoadAd = c5478l3.loadAd();
                long j4 = c5478l3.isPro;
                int i11 = c5478l3.amazon;
                if (i11 > 0) {
                    j = ((((long) i11) + ((long) i10)) / 2) + 1;
                } else {
                    int i12 = c5478l3.yandex;
                    j = 64 + (((((i12 != c5478l3.loadAd || i12 <= 0) ? 4096L : i12) * ((long) c5478l3.mopub)) * ((long) c5478l3.admob)) / 8);
                }
                C16269l c16269l = new C16269l(c6536l, c13698l, jLoadAd, j4, position, length, j, Math.max(6, i10));
                this.smaato = c16269l;
                c9828l = c16269l.yandex;
            }
            interfaceC2053l.tapsense(c9828l);
            this.mopub = 5;
            return i2;
        }
        if (i != 5) {
            C18073l.admob();
            return 0;
        }
        this.billing.getClass();
        this.subs.getClass();
        C16269l c16269l2 = this.smaato;
        if (c16269l2 != null && c16269l2.crashlytics != null) {
            return c16269l2.loadAd(interfaceC10430l, c1014l);
        }
        if (this.vip == -1) {
            C5478l c5478l4 = this.subs;
            interfaceC10430l.smaato();
            interfaceC10430l.admob(1);
            byte[] bArr4 = new byte[1];
            interfaceC10430l.yandex(0, 1, bArr4);
            boolean z3 = (bArr4[0] & 1) == 1;
            interfaceC10430l.admob(2);
            i5 = z3 ? 7 : 6;
            C13143l c13143l6 = new C13143l(i5);
            byte[] bArr5 = c13143l6.yandex;
            int i13 = 0;
            while (i13 < i5) {
                int iAmazon = interfaceC10430l.amazon(i13, i5 - i13, bArr5);
                if (iAmazon == -1) {
                    break;
                }
                i13 += iAmazon;
            }
            c13143l6.m3561extends(i13);
            interfaceC10430l.smaato();
            try {
                long jM3566strictfp = c13143l6.m3566strictfp();
                if (!z3) {
                    jM3566strictfp *= (long) c5478l4.loadAd;
                }
                long j5 = c5478l4.isPro;
                if (j5 == 0 || jM3566strictfp <= j5) {
                    j3 = jM3566strictfp;
                } else {
                    z = false;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z) {
                throw C17655l.yandex(null, null);
            }
            this.vip = j3;
        } else {
            C13143l c13143l7 = this.loadAd;
            int i14 = c13143l7.crashlytics;
            if (i14 < 32768) {
                int i15 = interfaceC10430l.read(c13143l7.yandex, i14, 32768 - i14);
                z = i15 == -1;
                if (!z) {
                    c13143l7.m3561extends(i14 + i15);
                } else if (c13143l7.yandex() == 0) {
                    long j6 = this.vip * 1000000;
                    C5478l c5478l5 = this.subs;
                    String str3 = AbstractC15323l.yandex;
                    this.billing.yandex(j6 / ((long) c5478l5.purchase), 1, this.remoteconfig, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i16 = c13143l7.loadAd;
            int i17 = this.remoteconfig;
            int i18 = this.isPro;
            if (i17 < i18) {
                c13143l7.m3568throw(Math.min(i18 - i17, c13143l7.yandex()));
            }
            this.subs.getClass();
            int i19 = c13143l7.loadAd;
            while (true) {
                int i20 = c13143l7.crashlytics - 16;
                C1014l c1014l2 = this.amazon;
                if (i19 > i20) {
                    if (z) {
                        while (true) {
                            int i21 = c13143l7.crashlytics;
                            if (i19 <= i21 - this.isPro) {
                                c13143l7.m3562for(i19);
                                try {
                                    zLoadAd = AbstractC15439l.loadAd(c13143l7, this.subs, this.firebase, c1014l2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zLoadAd = false;
                                }
                                if (c13143l7.loadAd > c13143l7.crashlytics) {
                                    zLoadAd = false;
                                }
                                if (zLoadAd) {
                                    c13143l7.m3562for(i19);
                                    j2 = c1014l2.f2761l;
                                    break;
                                }
                                i19++;
                            } else {
                                c13143l7.m3562for(i21);
                            }
                        }
                    } else {
                        c13143l7.m3562for(i19);
                    }
                    j2 = -1;
                    break;
                }
                c13143l7.m3562for(i19);
                if (AbstractC15439l.loadAd(c13143l7, this.subs, this.firebase, c1014l2)) {
                    c13143l7.m3562for(i19);
                    j2 = c1014l2.f2761l;
                    break;
                }
                i19++;
            }
            int i22 = c13143l7.loadAd - i16;
            c13143l7.m3562for(i16);
            this.billing.purchase(i22, c13143l7);
            int i23 = this.remoteconfig + i22;
            this.remoteconfig = i23;
            if (j2 != -1) {
                long j7 = this.vip * 1000000;
                C5478l c5478l6 = this.subs;
                String str4 = AbstractC15323l.yandex;
                this.billing.yandex(j7 / ((long) c5478l6.purchase), 1, i23, 0, null);
                this.remoteconfig = 0;
                this.vip = j2;
            }
            int length2 = c13143l7.yandex.length - c13143l7.crashlytics;
            if (c13143l7.yandex() < 16 && length2 < 16) {
                int iYandex = c13143l7.yandex();
                byte[] bArr6 = c13143l7.yandex;
                System.arraycopy(bArr6, c13143l7.loadAd, bArr6, 0, iYandex);
                c13143l7.m3562for(0);
                c13143l7.m3561extends(iYandex);
            }
        }
        return 0;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
