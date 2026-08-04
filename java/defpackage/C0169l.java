package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؙؚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0169l implements InterfaceC17094l {
    public int amazon;
    public final Object billing;
    public long crashlytics;
    public boolean loadAd;
    public Object mopub;
    public int purchase;
    public final /* synthetic */ int yandex;

    public C0169l(List list) {
        this.yandex = 0;
        this.billing = list;
        this.mopub = new InterfaceC8979l[list.size()];
        this.crashlytics = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
        int i;
        switch (this.yandex) {
            case 0:
                if (this.loadAd) {
                    AbstractC12442l.subscription(this.crashlytics != -9223372036854775807L);
                    for (InterfaceC8979l interfaceC8979l : (InterfaceC8979l[]) this.mopub) {
                        interfaceC8979l.yandex(this.crashlytics, 1, this.purchase, 0, null);
                    }
                    this.loadAd = false;
                }
                break;
            default:
                ((InterfaceC8979l) this.mopub).getClass();
                if (this.loadAd && (i = this.amazon) != 0 && this.purchase == i) {
                    AbstractC12442l.subscription(this.crashlytics != -9223372036854775807L);
                    ((InterfaceC8979l) this.mopub).yandex(this.crashlytics, 1, this.amazon, 0, null);
                    this.loadAd = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        switch (this.yandex) {
            case 0:
                this.loadAd = false;
                this.crashlytics = -9223372036854775807L;
                break;
            default:
                this.loadAd = false;
                this.crashlytics = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        switch (this.yandex) {
            case 0:
                InterfaceC8979l[] interfaceC8979lArr = (InterfaceC8979l[]) this.mopub;
                for (int i = 0; i < interfaceC8979lArr.length; i++) {
                    C6493l c6493l = (C6493l) ((List) this.billing).get(i);
                    cstatic.yandex();
                    cstatic.amazon();
                    InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(cstatic.crashlytics, 3);
                    C12984l c12984l = new C12984l();
                    cstatic.amazon();
                    c12984l.yandex = (String) cstatic.purchase;
                    c12984l.remoteconfig = AbstractC3825l.vip("video/mp2t");
                    c12984l.vip = AbstractC3825l.vip("application/dvbsubs");
                    c12984l.adcel = Collections.singletonList(c6493l.loadAd);
                    c12984l.amazon = c6493l.yandex;
                    AbstractC9029l.license(c12984l, interfaceC8979lStartapp);
                    interfaceC8979lArr[i] = interfaceC8979lStartapp;
                }
                break;
            default:
                cstatic.yandex();
                cstatic.amazon();
                InterfaceC8979l interfaceC8979lStartapp2 = interfaceC2053l.startapp(cstatic.crashlytics, 5);
                this.mopub = interfaceC8979lStartapp2;
                C12984l c12984l2 = new C12984l();
                cstatic.amazon();
                c12984l2.yandex = (String) cstatic.purchase;
                c12984l2.remoteconfig = AbstractC3825l.vip("video/mp2t");
                c12984l2.vip = AbstractC3825l.vip("application/id3");
                AbstractC9029l.license(c12984l2, interfaceC8979lStartapp2);
                break;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) {
        boolean z;
        boolean z2;
        switch (this.yandex) {
            case 0:
                if (this.loadAd) {
                    if (this.amazon == 2) {
                        if (c13143l.yandex() == 0) {
                            z2 = false;
                        } else {
                            if (c13143l.signatures() != 32) {
                                this.loadAd = false;
                            }
                            this.amazon--;
                            z2 = this.loadAd;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.amazon == 1) {
                        if (c13143l.yandex() == 0) {
                            z = false;
                        } else {
                            if (c13143l.signatures() != 0) {
                                this.loadAd = false;
                            }
                            this.amazon--;
                            z = this.loadAd;
                        }
                        if (!z) {
                        }
                    }
                    int i = c13143l.loadAd;
                    int iYandex = c13143l.yandex();
                    for (InterfaceC8979l interfaceC8979l : (InterfaceC8979l[]) this.mopub) {
                        c13143l.m3562for(i);
                        interfaceC8979l.purchase(iYandex, c13143l);
                    }
                    this.purchase += iYandex;
                }
                break;
            default:
                C13143l c13143l2 = (C13143l) this.billing;
                ((InterfaceC8979l) this.mopub).getClass();
                if (this.loadAd) {
                    int iYandex2 = c13143l.yandex();
                    int i2 = this.purchase;
                    if (i2 < 10) {
                        int iMin = Math.min(iYandex2, 10 - i2);
                        System.arraycopy(c13143l.yandex, c13143l.loadAd, c13143l2.yandex, this.purchase, iMin);
                        if (this.purchase + iMin == 10) {
                            c13143l2.m3562for(0);
                            if (73 == c13143l2.signatures() && 68 == c13143l2.signatures() && 51 == c13143l2.signatures()) {
                                c13143l2.m3568throw(3);
                                this.amazon = c13143l2.isVip() + 10;
                            } else {
                                AbstractC6427l.vip("Id3Reader", "Discarding invalid ID3 tag");
                                this.loadAd = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iYandex2, this.amazon - this.purchase);
                    ((InterfaceC8979l) this.mopub).purchase(iMin2, c13143l);
                    this.purchase += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        switch (this.yandex) {
            case 0:
                if ((i & 4) != 0) {
                    this.loadAd = true;
                    this.crashlytics = j;
                    this.purchase = 0;
                    this.amazon = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.loadAd = true;
                    this.crashlytics = j;
                    this.amazon = 0;
                    this.purchase = 0;
                    break;
                }
                break;
        }
    }

    public C0169l() {
        this.yandex = 1;
        this.billing = new C13143l(10);
        this.crashlytics = -9223372036854775807L;
    }
}
