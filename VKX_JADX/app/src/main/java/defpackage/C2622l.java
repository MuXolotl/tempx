package defpackage;

import java.util.Collections;

/* JADX INFO: renamed from: lؔٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2622l implements InterfaceC17094l {
    public int Signature;
    public boolean adcel;
    public int admob;
    public long ads;
    public final C5257l amazon;
    public String billing;
    public final C13143l crashlytics;
    public int firebase;
    public int isPro;
    public String license;
    public final int loadAd;
    public int metrica;
    public C5978l mopub;
    public InterfaceC8979l purchase;
    public boolean remoteconfig;
    public long smaato;
    public int startapp;
    public int subs;
    public int subscription;
    public long tapsense;
    public int vip;
    public final String yandex;

    public C2622l(String str, int i) {
        this.yandex = str;
        this.loadAd = i;
        C13143l c13143l = new C13143l(1024);
        this.crashlytics = c13143l;
        byte[] bArr = c13143l.yandex;
        this.amazon = new C5257l(bArr, bArr.length);
        this.smaato = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        this.admob = 0;
        this.smaato = -9223372036854775807L;
        this.remoteconfig = false;
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        cstatic.yandex();
        cstatic.amazon();
        this.purchase = interfaceC2053l.startapp(cstatic.crashlytics, 1);
        cstatic.amazon();
        this.billing = (String) cstatic.purchase;
    }

    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) throws C17655l {
        int iMopub;
        boolean zBilling;
        this.purchase.getClass();
        while (c13143l.yandex() > 0) {
            int i = this.admob;
            if (i != 0) {
                if (i != 1) {
                    C13143l c13143l2 = this.crashlytics;
                    C5257l c5257l = this.amazon;
                    if (i == 2) {
                        int iSignatures = ((this.firebase & (-225)) << 8) | c13143l.signatures();
                        this.isPro = iSignatures;
                        if (iSignatures > c13143l2.yandex.length) {
                            c13143l2.m3563native(iSignatures);
                            byte[] bArr = c13143l2.yandex;
                            c5257l.getClass();
                            c5257l.firebase(bArr.length, bArr);
                        }
                        this.subs = 0;
                        this.admob = 3;
                    } else {
                        if (i != 3) {
                            C18073l.admob();
                            return;
                        }
                        int iMin = Math.min(c13143l.yandex(), this.isPro - this.subs);
                        c13143l.firebase(this.subs, iMin, c5257l.loadAd);
                        int i2 = this.subs + iMin;
                        this.subs = i2;
                        if (i2 == this.isPro) {
                            c5257l.remoteconfig(0);
                            if (c5257l.billing()) {
                                if (this.remoteconfig) {
                                }
                                this.admob = 0;
                            } else {
                                this.remoteconfig = true;
                                int iMopub2 = c5257l.mopub(1);
                                int iMopub3 = iMopub2 == 1 ? c5257l.mopub(1) : 0;
                                this.vip = iMopub3;
                                if (iMopub3 != 0) {
                                    throw C17655l.yandex(null, null);
                                }
                                if (iMopub2 == 1) {
                                    c5257l.mopub((c5257l.mopub(2) + 1) * 8);
                                }
                                if (!c5257l.billing()) {
                                    throw C17655l.yandex(null, null);
                                }
                                this.metrica = c5257l.mopub(6);
                                int iMopub4 = c5257l.mopub(4);
                                int iMopub5 = c5257l.mopub(3);
                                if (iMopub4 != 0 || iMopub5 != 0) {
                                    throw C17655l.yandex(null, null);
                                }
                                if (iMopub2 == 0) {
                                    int iPurchase = c5257l.purchase();
                                    int iLoadAd = c5257l.loadAd();
                                    Cimport cimportAdmob = AbstractC3234l.admob(c5257l, true);
                                    this.license = cimportAdmob.yandex;
                                    this.subscription = cimportAdmob.loadAd;
                                    this.Signature = cimportAdmob.crashlytics;
                                    int iLoadAd2 = iLoadAd - c5257l.loadAd();
                                    c5257l.remoteconfig(iPurchase);
                                    byte[] bArr2 = new byte[(iLoadAd2 + 7) / 8];
                                    c5257l.admob(iLoadAd2, bArr2);
                                    C12984l c12984l = new C12984l();
                                    c12984l.yandex = this.billing;
                                    c12984l.remoteconfig = AbstractC3825l.vip("video/mp2t");
                                    c12984l.vip = AbstractC3825l.vip("audio/mp4a-latm");
                                    c12984l.isPro = this.license;
                                    c12984l.f25447throws = this.Signature;
                                    c12984l.f25442package = this.subscription;
                                    c12984l.adcel = Collections.singletonList(bArr2);
                                    c12984l.amazon = this.yandex;
                                    c12984l.billing = this.loadAd;
                                    C5978l c5978l = new C5978l(c12984l);
                                    if (!c5978l.equals(this.mopub)) {
                                        this.mopub = c5978l;
                                        this.tapsense = 1024000000 / ((long) c5978l.f12622synchronized);
                                        this.purchase.mopub(c5978l);
                                    }
                                } else {
                                    int iMopub6 = c5257l.mopub((c5257l.mopub(2) + 1) * 8);
                                    int iLoadAd3 = c5257l.loadAd();
                                    Cimport cimportAdmob2 = AbstractC3234l.admob(c5257l, true);
                                    this.license = cimportAdmob2.yandex;
                                    this.subscription = cimportAdmob2.loadAd;
                                    this.Signature = cimportAdmob2.crashlytics;
                                    c5257l.metrica(iMopub6 - (iLoadAd3 - c5257l.loadAd()));
                                }
                                int iMopub7 = c5257l.mopub(3);
                                this.startapp = iMopub7;
                                if (iMopub7 == 0) {
                                    c5257l.metrica(8);
                                } else if (iMopub7 == 1) {
                                    c5257l.metrica(9);
                                } else if (iMopub7 == 3 || iMopub7 == 4 || iMopub7 == 5) {
                                    c5257l.metrica(6);
                                } else {
                                    if (iMopub7 != 6 && iMopub7 != 7) {
                                        C18073l.admob();
                                        return;
                                    }
                                    c5257l.metrica(1);
                                }
                                boolean zBilling2 = c5257l.billing();
                                this.adcel = zBilling2;
                                this.ads = 0L;
                                if (zBilling2) {
                                    if (iMopub2 == 1) {
                                        this.ads = c5257l.mopub((c5257l.mopub(2) + 1) * 8);
                                    } else {
                                        do {
                                            zBilling = c5257l.billing();
                                            this.ads = (this.ads << 8) + ((long) c5257l.mopub(8));
                                        } while (zBilling);
                                    }
                                }
                                if (c5257l.billing()) {
                                    c5257l.metrica(8);
                                }
                            }
                            if (this.vip != 0) {
                                throw C17655l.yandex(null, null);
                            }
                            if (this.metrica != 0) {
                                throw C17655l.yandex(null, null);
                            }
                            if (this.startapp != 0) {
                                throw C17655l.yandex(null, null);
                            }
                            int i3 = 0;
                            do {
                                iMopub = c5257l.mopub(8);
                                i3 += iMopub;
                            } while (iMopub == 255);
                            int iPurchase2 = c5257l.purchase();
                            if ((iPurchase2 & 7) == 0) {
                                c13143l2.m3562for(iPurchase2 >> 3);
                            } else {
                                c5257l.admob(i3 * 8, c13143l2.yandex);
                                c13143l2.m3562for(0);
                            }
                            this.purchase.purchase(i3, c13143l2);
                            AbstractC12442l.subscription(this.smaato != -9223372036854775807L);
                            this.purchase.yandex(this.smaato, 1, i3, 0, null);
                            this.smaato += this.tapsense;
                            if (this.adcel) {
                                c5257l.metrica((int) this.ads);
                            }
                            this.admob = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iSignatures2 = c13143l.signatures();
                    if ((iSignatures2 & 224) == 224) {
                        this.firebase = iSignatures2;
                        this.admob = 2;
                    } else if (iSignatures2 != 86) {
                        this.admob = 0;
                    }
                }
            } else if (c13143l.signatures() == 86) {
                this.admob = 1;
            }
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        this.smaato = j;
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
    }
}
