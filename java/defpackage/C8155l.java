package defpackage;

import java.util.Collections;

/* JADX INFO: renamed from: lًٝۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8155l implements InterfaceC17094l {
    public C12562l amazon;
    public InterfaceC8979l crashlytics;
    public String loadAd;
    public boolean purchase;
    public long smaato;
    public final C3250l yandex;
    public final boolean[] billing = new boolean[3];
    public final C5453l mopub = new C5453l(32);
    public final C5453l admob = new C5453l(33);
    public final C5453l subs = new C5453l(34);
    public final C5453l isPro = new C5453l(39);
    public final C5453l firebase = new C5453l(40);
    public long remoteconfig = -9223372036854775807L;
    public final C13143l vip = new C13143l();

    public C8155l(C3250l c3250l) {
        this.yandex = c3250l;
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
        this.crashlytics.getClass();
        String str = AbstractC15323l.yandex;
        if (z) {
            this.yandex.amazon.subs(0);
            yandex(0, 0, this.smaato, this.remoteconfig);
            crashlytics(0, 48, this.smaato, this.remoteconfig);
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        this.smaato = 0L;
        this.remoteconfig = -9223372036854775807L;
        AbstractC16763l.purchase(this.billing);
        this.mopub.billing();
        this.admob.billing();
        this.subs.billing();
        this.isPro.billing();
        this.firebase.billing();
        this.yandex.amazon.subs(0);
        C12562l c12562l = this.amazon;
        if (c12562l != null) {
            c12562l.billing = false;
            c12562l.mopub = false;
            c12562l.admob = false;
            c12562l.subs = false;
            c12562l.isPro = false;
        }
    }

    public final void crashlytics(int i, int i2, long j, long j2) {
        C12562l c12562l = this.amazon;
        boolean z = this.purchase;
        c12562l.mopub = false;
        c12562l.admob = false;
        c12562l.purchase = j2;
        c12562l.amazon = 0;
        c12562l.loadAd = j;
        if (i2 >= 32 && i2 != 40) {
            if (c12562l.subs && !c12562l.isPro) {
                if (z) {
                    c12562l.yandex(i);
                }
                c12562l.subs = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                c12562l.admob = !c12562l.isPro;
                c12562l.isPro = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        c12562l.crashlytics = z2;
        c12562l.billing = z2 || i2 <= 9;
        if (!this.purchase) {
            this.mopub.mopub(i2);
            this.admob.mopub(i2);
            this.subs.mopub(i2);
        }
        this.isPro.mopub(i2);
        this.firebase.mopub(i2);
    }

    public final void loadAd(int i, int i2, byte[] bArr) {
        C12562l c12562l = this.amazon;
        if (c12562l.billing) {
            int i3 = c12562l.amazon;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                c12562l.mopub = (bArr[i4] & 128) != 0;
                c12562l.billing = false;
            } else {
                c12562l.amazon = (i2 - i) + i3;
            }
        }
        if (!this.purchase) {
            this.mopub.yandex(i, i2, bArr);
            this.admob.yandex(i, i2, bArr);
            this.subs.yandex(i, i2, bArr);
        }
        this.isPro.yandex(i, i2, bArr);
        this.firebase.yandex(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        cstatic.yandex();
        cstatic.amazon();
        this.loadAd = (String) cstatic.purchase;
        cstatic.amazon();
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(cstatic.crashlytics, 2);
        this.crashlytics = interfaceC8979lStartapp;
        this.amazon = new C12562l(interfaceC8979lStartapp);
        this.yandex.loadAd(interfaceC2053l, cstatic);
    }

    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) {
        int i;
        this.crashlytics.getClass();
        String str = AbstractC15323l.yandex;
        while (c13143l.yandex() > 0) {
            int i2 = c13143l.loadAd;
            int i3 = c13143l.crashlytics;
            byte[] bArr = c13143l.yandex;
            this.smaato += (long) c13143l.yandex();
            this.crashlytics.purchase(c13143l.yandex(), c13143l);
            while (i2 < i3) {
                int iAdmob = AbstractC16763l.admob(bArr, i2, i3, this.billing);
                if (iAdmob == i3) {
                    loadAd(i2, i3, bArr);
                    return;
                }
                int i4 = (bArr[iAdmob + 3] & 126) >> 1;
                if (iAdmob <= 0 || bArr[iAdmob - 1] != 0) {
                    i = 3;
                } else {
                    iAdmob--;
                    i = 4;
                }
                int i5 = iAdmob;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    loadAd(i2, i5, bArr);
                }
                int i8 = i3 - i5;
                long j = this.smaato - ((long) i8);
                yandex(i8, i7 < 0 ? -i7 : 0, j, this.remoteconfig);
                crashlytics(i8, i4, j, this.remoteconfig);
                i2 = i5 + i6;
            }
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        this.remoteconfig = j;
    }

    public final void yandex(int i, int i2, long j, long j2) {
        C1080l c1080l = this.yandex.amazon;
        C12562l c12562l = this.amazon;
        boolean z = this.purchase;
        if (c12562l.isPro && c12562l.mopub) {
            c12562l.remoteconfig = c12562l.crashlytics;
            c12562l.isPro = false;
        } else if (c12562l.admob || c12562l.mopub) {
            if (z && c12562l.subs) {
                c12562l.yandex(i + ((int) (j - c12562l.loadAd)));
            }
            c12562l.firebase = c12562l.loadAd;
            c12562l.smaato = c12562l.purchase;
            c12562l.remoteconfig = c12562l.crashlytics;
            c12562l.subs = true;
        }
        if (!this.purchase) {
            C5453l c5453l = this.mopub;
            c5453l.amazon(i2);
            C5453l c5453l2 = this.admob;
            c5453l2.amazon(i2);
            C5453l c5453l3 = this.subs;
            c5453l3.amazon(i2);
            if (c5453l.purchase && c5453l2.purchase && c5453l3.purchase) {
                String str = this.loadAd;
                int i3 = c5453l.crashlytics;
                byte[] bArr = new byte[c5453l2.crashlytics + i3 + c5453l3.crashlytics];
                System.arraycopy((byte[]) c5453l.billing, 0, bArr, 0, i3);
                System.arraycopy((byte[]) c5453l2.billing, 0, bArr, c5453l.crashlytics, c5453l2.crashlytics);
                System.arraycopy((byte[]) c5453l3.billing, 0, bArr, c5453l.crashlytics + c5453l2.crashlytics, c5453l3.crashlytics);
                C11849l c11849lAds = AbstractC16763l.ads((byte[]) c5453l2.billing, 3, c5453l2.crashlytics, null);
                C18741l c18741l = c11849lAds.loadAd;
                String strYandex = c18741l != null ? AbstractC14501l.yandex(c18741l.yandex, c18741l.loadAd, c18741l.crashlytics, c18741l.amazon, c18741l.purchase, c18741l.billing) : null;
                C12984l c12984l = new C12984l();
                c12984l.yandex = str;
                c12984l.remoteconfig = AbstractC3825l.vip("video/mp2t");
                c12984l.vip = AbstractC3825l.vip("video/hevc");
                c12984l.isPro = strYandex;
                c12984l.Signature = c11849lAds.purchase;
                c12984l.license = c11849lAds.billing;
                c12984l.pro = c11849lAds.mopub;
                c12984l.ad = c11849lAds.admob;
                c12984l.appmetrica = new C1591l(c11849lAds.firebase, c11849lAds.smaato, c11849lAds.remoteconfig, null, c11849lAds.crashlytics + 8, c11849lAds.amazon + 8);
                c12984l.signatures = c11849lAds.subs;
                c12984l.startapp = c11849lAds.isPro;
                c12984l.inmobi = c11849lAds.yandex + 1;
                c12984l.adcel = Collections.singletonList(bArr);
                C5978l c5978l = new C5978l(c12984l);
                this.crashlytics.mopub(c5978l);
                int i4 = c5978l.adcel;
                AbstractC12442l.subscription(i4 != -1);
                c1080l.m801throw(i4);
                this.purchase = true;
            }
        }
        C5453l c5453l4 = this.isPro;
        boolean zAmazon = c5453l4.amazon(i2);
        C13143l c13143l = this.vip;
        if (zAmazon) {
            c13143l.m3565private(AbstractC16763l.license(c5453l4.crashlytics, (byte[]) c5453l4.billing), (byte[]) c5453l4.billing);
            c13143l.m3568throw(5);
            c1080l.amazon(j2, c13143l);
        }
        C5453l c5453l5 = this.firebase;
        if (c5453l5.amazon(i2)) {
            c13143l.m3565private(AbstractC16763l.license(c5453l5.crashlytics, (byte[]) c5453l5.billing), (byte[]) c5453l5.billing);
            c13143l.m3568throw(5);
            c1080l.amazon(j2, c13143l);
        }
    }
}
