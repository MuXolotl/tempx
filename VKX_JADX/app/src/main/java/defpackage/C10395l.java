package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: lَْٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10395l implements InterfaceC17094l {
    public static final float[] smaato = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public String admob;
    public final C5361l amazon;
    public C16700l billing;
    public final boolean[] crashlytics = new boolean[4];
    public long firebase;
    public boolean isPro;
    public final C13143l loadAd;
    public long mopub;
    public final C5453l purchase;
    public InterfaceC8979l subs;
    public final C3250l yandex;

    public C10395l(C3250l c3250l) {
        this.yandex = c3250l;
        C5361l c5361l = new C5361l();
        c5361l.purchase = new byte[128];
        this.amazon = c5361l;
        this.firebase = -9223372036854775807L;
        this.purchase = new C5453l(178);
        this.loadAd = new C13143l();
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
        this.billing.getClass();
        if (z) {
            this.billing.loadAd(0, this.mopub, this.isPro);
            C16700l c16700l = this.billing;
            c16700l.loadAd = false;
            c16700l.crashlytics = false;
            c16700l.amazon = false;
            c16700l.purchase = -1;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        AbstractC16763l.purchase(this.crashlytics);
        C5361l c5361l = this.amazon;
        c5361l.yandex = false;
        c5361l.crashlytics = 0;
        c5361l.loadAd = 0;
        C16700l c16700l = this.billing;
        if (c16700l != null) {
            c16700l.loadAd = false;
            c16700l.crashlytics = false;
            c16700l.amazon = false;
            c16700l.purchase = -1;
        }
        C5453l c5453l = this.purchase;
        if (c5453l != null) {
            c5453l.billing();
        }
        this.mopub = 0L;
        this.firebase = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        cstatic.yandex();
        cstatic.amazon();
        this.admob = (String) cstatic.purchase;
        cstatic.amazon();
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(cstatic.crashlytics, 2);
        this.subs = interfaceC8979lStartapp;
        this.billing = new C16700l(interfaceC8979lStartapp);
        this.yandex.loadAd(interfaceC2053l, cstatic);
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0234  */
    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.billing.getClass();
        this.subs.getClass();
        int i5 = c13143l.loadAd;
        int i6 = c13143l.crashlytics;
        byte[] bArr = c13143l.yandex;
        this.mopub += (long) c13143l.yandex();
        this.subs.purchase(c13143l.yandex(), c13143l);
        while (true) {
            int iAdmob = AbstractC16763l.admob(bArr, i5, i6, this.crashlytics);
            C5361l c5361l = this.amazon;
            C5453l c5453l = this.purchase;
            if (iAdmob == i6) {
                if (!this.isPro) {
                    c5361l.yandex(i5, i6, bArr);
                }
                this.billing.yandex(i5, i6, bArr);
                if (c5453l != null) {
                    c5453l.yandex(i5, i6, bArr);
                    return;
                }
                return;
            }
            int i7 = iAdmob + 3;
            byte b = c13143l.yandex[i7];
            int i8 = b & 255;
            int i9 = iAdmob - i5;
            if (this.isPro) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    c5361l.yandex(i5, iAdmob, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = c5361l.loadAd;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            AbstractC6427l.vip("H263Reader", "Unexpected start code value");
                            c5361l.yandex = false;
                            c5361l.crashlytics = 0;
                            c5361l.loadAd = 0;
                        } else {
                            c5361l.loadAd = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                C18073l.admob();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                c5361l.crashlytics -= i10;
                                c5361l.yandex = false;
                                InterfaceC8979l interfaceC8979l = this.subs;
                                int i12 = c5361l.amazon;
                                String str = this.admob;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(c5361l.purchase, c5361l.crashlytics);
                                C5257l c5257l = new C5257l(bArrCopyOf, bArrCopyOf.length);
                                c5257l.startapp(i12);
                                c5257l.startapp(4);
                                c5257l.vip();
                                c5257l.metrica(8);
                                if (c5257l.billing()) {
                                    c5257l.metrica(4);
                                    c5257l.metrica(3);
                                }
                                int iMopub = c5257l.mopub(4);
                                if (iMopub == 15) {
                                    int iMopub2 = c5257l.mopub(8);
                                    int iMopub3 = c5257l.mopub(8);
                                    if (iMopub3 == 0) {
                                        AbstractC6427l.vip("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iMopub2 / iMopub3;
                                    }
                                } else if (iMopub < 7) {
                                    f = smaato[iMopub];
                                } else {
                                    AbstractC6427l.vip("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (c5257l.billing()) {
                                    c5257l.metrica(2);
                                    c5257l.metrica(1);
                                    if (c5257l.billing()) {
                                        c5257l.metrica(15);
                                        c5257l.vip();
                                        c5257l.metrica(15);
                                        c5257l.vip();
                                        c5257l.metrica(15);
                                        c5257l.vip();
                                        c5257l.metrica(3);
                                        c5257l.metrica(11);
                                        c5257l.vip();
                                        c5257l.metrica(15);
                                        c5257l.vip();
                                    }
                                }
                                if (c5257l.mopub(2) != 0) {
                                    AbstractC6427l.vip("H263Reader", "Unhandled video object layer shape");
                                }
                                c5257l.vip();
                                int iMopub4 = c5257l.mopub(16);
                                c5257l.vip();
                                if (c5257l.billing()) {
                                    if (iMopub4 == 0) {
                                        AbstractC6427l.vip("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i13 = 0;
                                        for (int i14 = iMopub4 - 1; i14 > 0; i14 >>= 1) {
                                            i13++;
                                        }
                                        c5257l.metrica(i13);
                                    }
                                }
                                c5257l.vip();
                                int iMopub5 = c5257l.mopub(13);
                                c5257l.vip();
                                int iMopub6 = c5257l.mopub(13);
                                c5257l.vip();
                                c5257l.vip();
                                C12984l c12984l = new C12984l();
                                c12984l.yandex = str;
                                c12984l.remoteconfig = AbstractC3825l.vip("video/mp2t");
                                c12984l.vip = AbstractC3825l.vip("video/mp4v-es");
                                c12984l.Signature = iMopub5;
                                c12984l.license = iMopub6;
                                c12984l.signatures = f;
                                c12984l.adcel = Collections.singletonList(bArrCopyOf);
                                AbstractC9029l.license(c12984l, interfaceC8979l);
                                this.isPro = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            AbstractC6427l.vip("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            c5361l.yandex = false;
                            c5361l.crashlytics = 0;
                            c5361l.loadAd = 0;
                        } else {
                            i4 = 0;
                            c5361l.amazon = c5361l.crashlytics;
                            c5361l.loadAd = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            AbstractC6427l.vip("H263Reader", "Unexpected start code value");
                            c5361l.yandex = false;
                            c5361l.crashlytics = 0;
                            c5361l.loadAd = 0;
                        } else {
                            c5361l.loadAd = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        c5361l.loadAd = 1;
                        c5361l.yandex = true;
                    }
                }
                c5361l.yandex(i4, 3, C5361l.billing);
            }
            this.billing.yandex(i5, iAdmob, bArr);
            if (c5453l == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    c5453l.yandex(i5, iAdmob, bArr);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (c5453l.amazon(i3)) {
                    int iLicense = AbstractC16763l.license(c5453l.crashlytics, (byte[]) c5453l.billing);
                    String str2 = AbstractC15323l.yandex;
                    byte[] bArr2 = (byte[]) c5453l.billing;
                    C13143l c13143l2 = this.loadAd;
                    c13143l2.m3565private(iLicense, bArr2);
                    this.yandex.yandex(this.firebase, c13143l2);
                }
                if (i8 == 178) {
                    z = true;
                    if (c13143l.yandex[iAdmob + 2] == 1) {
                        c5453l.mopub(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i15 = i - iAdmob;
            this.billing.loadAd(i15, this.mopub - ((long) i15), this.isPro);
            C16700l c16700l = this.billing;
            long j = this.firebase;
            c16700l.purchase = i8;
            c16700l.amazon = false;
            c16700l.loadAd = (i8 == 182 || i8 == 179) ? z : false;
            c16700l.crashlytics = i8 == 182 ? z : false;
            c16700l.billing = 0;
            c16700l.admob = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        this.firebase = j;
    }
}
