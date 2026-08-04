package defpackage;

import android.content.res.Configuration;
import android.graphics.Color;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؑؗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0130l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C9894l f1030l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C6417l f1031l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final boolean f1032l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final boolean f1033l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130l(C6417l c6417l, C9894l c9894l, int i) {
        super(false, 3);
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        c6417l = (i & 4) != 0 ? null : c6417l;
        c9894l = (i & 8) != 0 ? null : c9894l;
        this.f1033l = z;
        this.f1032l = z2;
        this.f1031l = c6417l;
        this.f1030l = c9894l;
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(1485494344);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C6417l c6417l = this.f1031l;
            boolean zBilling = c6956l.billing(c6417l);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (zBilling || objM2132native == obj) {
                objM2132native = c6417l != null ? AbstractC6145l.yandex(c6417l.purchase) : null;
                c6956l.m2147try(objM2132native);
            }
            C9894l c9894l = (C9894l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.smaato(Boolean.valueOf(c9894l != null || this.f1033l));
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
            boolean zBooleanValue = ((Boolean) interfaceC8714l.getValue()).booleanValue();
            C9894l c9894l2 = this.f1030l;
            if (zBooleanValue && c9894l != null) {
                c9894l2 = c9894l;
            }
            AbstractC3274l.yandex(null, null, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(28690829, new C2104l(this, c9894l2, c9894l, interfaceC8714l, 17), c6956l), c6956l, 12582912, 123);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(this, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0200  */
    /* JADX WARN: Code duplicated, block: B:123:0x0202  */
    /* JADX WARN: Code duplicated, block: B:126:0x0207  */
    /* JADX WARN: Code duplicated, block: B:127:0x0209  */
    /* JADX WARN: Code duplicated, block: B:131:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0215  */
    /* JADX WARN: Code duplicated, block: B:135:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x022c  */
    /* JADX WARN: Code duplicated, block: B:137:0x023c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:143:0x025e  */
    /* JADX WARN: Code duplicated, block: B:145:0x026d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0283  */
    public final void pro(InterfaceC17242l interfaceC17242l, C6417l c6417l, C9894l c9894l, boolean z, boolean z2, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        C9735l c9735l;
        C3020l c3020l;
        Object c9735l2;
        C3020l c3020l2;
        C13863l c13863l;
        Object c9735l3;
        long jLoadAd;
        C13863l c13863l2;
        long jLoadAd2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objM2132native;
        boolean z6;
        long j;
        long j2;
        c6956l.m2133new(-1045445600);
        int i2 = i | 6 | (c6956l.admob(c6417l) ? 32 : 16) | (c6956l.billing(c9894l) ? 256 : 128) | (c6956l.mopub(z) ? 2048 : 1024) | (c6956l.mopub(z2) ? 16384 : 8192);
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zBilling = c6956l.billing((Configuration) c6956l.isPro(AbstractC1242l.yandex));
            Object objM2132native2 = c6956l.m2132native();
            C13863l c13863l3 = C1867l.yandex;
            if (zBilling || objM2132native2 == c13863l3) {
                if (AbstractC11173l.crashlytics()) {
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    objM2132native2 = new C3020l(vKXApplication);
                } else {
                    objM2132native2 = null;
                }
                c6956l.m2147try(objM2132native2);
            }
            C3020l c3020l3 = (C3020l) objM2132native2;
            int i3 = i2 & 7168;
            boolean zBilling2 = (i3 == 2048) | c6956l.billing(c6417l);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling2 || objM2132native3 == c13863l3) {
                if (z && AbstractC11173l.crashlytics()) {
                    c9735l = new C9735l(AbstractC12953l.loadAd(c3020l3.yandex(7)));
                } else {
                    if (c6417l != null) {
                        c9735l = new C9735l(AbstractC12953l.loadAd(Color.parseColor((String) c6417l.billing.get("@windowBackground"))));
                    } else {
                        objM2132native3 = null;
                    }
                    c6956l.m2147try(objM2132native3);
                }
                objM2132native3 = c9735l;
                c6956l.m2147try(objM2132native3);
            }
            C9735l c9735l4 = (C9735l) objM2132native3;
            boolean zBilling3 = (i3 == 2048) | c6956l.billing(c6417l);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling3 || objM2132native4 == c13863l3) {
                if (z && AbstractC11173l.crashlytics()) {
                    c3020l = c3020l3;
                    c9735l2 = new C9735l(AbstractC12953l.loadAd(c3020l3.loadAd(0.11f)));
                } else {
                    c3020l = c3020l3;
                    c9735l2 = c6417l != null ? new C9735l(AbstractC12953l.loadAd(Color.parseColor((String) c6417l.billing.get("bg_primary")))) : null;
                }
                c6956l.m2147try(c9735l2);
            } else {
                c3020l = c3020l3;
                c9735l2 = objM2132native4;
            }
            C9735l c9735l5 = (C9735l) c9735l2;
            boolean zBilling4 = (i3 == 2048) | c6956l.billing(c6417l);
            Object objM2132native5 = c6956l.m2132native();
            if (zBilling4 || objM2132native5 == c13863l3) {
                if (z && AbstractC11173l.crashlytics()) {
                    c3020l2 = c3020l;
                    c13863l = c13863l3;
                    c9735l3 = new C9735l(AbstractC12953l.loadAd(c3020l2.yandex(8)));
                } else {
                    c3020l2 = c3020l;
                    c13863l = c13863l3;
                    if (c6417l != null) {
                        String str = (String) c6417l.billing.get("text_primary");
                        if (str != null) {
                            jLoadAd = AbstractC12953l.loadAd(Color.parseColor(str));
                        } else {
                            jLoadAd = c6417l.amazon ? C9735l.loadAd : C9735l.purchase;
                        }
                        c9735l3 = new C9735l(jLoadAd);
                    } else {
                        c9735l3 = null;
                    }
                }
                c6956l.m2147try(c9735l3);
            } else {
                c9735l3 = objM2132native5;
                c3020l2 = c3020l;
                c13863l = c13863l3;
            }
            C9735l c9735l6 = (C9735l) c9735l3;
            boolean zBilling5 = (i3 == 2048) | c6956l.billing(c6417l);
            Object objM2132native6 = c6956l.m2132native();
            if (zBilling5) {
                c13863l2 = c13863l;
            } else {
                c13863l2 = c13863l;
                if (objM2132native6 == c13863l2) {
                }
                C9735l c9735l7 = (C9735l) objM2132native6;
                if ((57344 & i2) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i2 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | z3;
                objM2132native = c6956l.m2132native();
                if (z5 || objM2132native == c13863l2) {
                    if (!z2 && AbstractC11173l.crashlytics()) {
                        objM2132native = new C9735l(AbstractC12953l.loadAd(c3020l2.yandex(1)));
                    } else if (c9894l != null) {
                        objM2132native = new C9735l(AbstractC12953l.loadAd(Color.parseColor(c9894l.crashlytics)));
                    } else {
                        objM2132native = null;
                    }
                    c6956l.m2147try(objM2132native);
                }
                C9735l c9735l8 = (C9735l) objM2132native;
                if (c9735l6 == null) {
                    c6956l.m2123default(349224009);
                    j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                    z6 = false;
                    c6956l.startapp(false);
                } else {
                    z6 = false;
                    c6956l.m2123default(349221529);
                    c6956l.startapp(false);
                    j = c9735l6.yandex;
                }
                long j3 = j;
                if (c9735l4 == null) {
                    c6956l.m2123default(349227687);
                    j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                    c6956l.startapp(z6);
                } else {
                    c6956l.m2123default(349225486);
                    c6956l.startapp(z6);
                    j2 = c9735l4.yandex;
                }
                C12654l c12654lYandex = AbstractC13880l.yandex(j2, j3, 0L, 0L, c6956l, 0, 12);
                C15578l c15578lAmazon = AbstractC14566l.amazon(-1897186030, new C11223l(c9735l5, c9735l8, c9735l6, c9735l7, 21), c6956l);
                C4346l c4346l = C4346l.f8873l;
                AbstractC3383l.yandex(c4346l, null, c12654lYandex, null, null, c15578lAmazon, c6956l, 196614, 26);
                interfaceC17242l2 = c4346l;
            }
            if (z && AbstractC11173l.crashlytics()) {
                objM2132native6 = new C9735l(AbstractC12953l.loadAd(c3020l2.yandex(10)));
            } else if (c6417l != null) {
                String str2 = (String) c6417l.billing.get("text_secondary");
                if (str2 != null) {
                    jLoadAd2 = AbstractC12953l.loadAd(Color.parseColor(str2));
                } else {
                    jLoadAd2 = c6417l.amazon ? AbstractC12953l.loadAd(Color.parseColor("#a0000000")) : AbstractC12953l.loadAd(Color.parseColor("#b3ffffff"));
                }
                objM2132native6 = new C9735l(jLoadAd2);
            } else {
                objM2132native6 = null;
            }
            c6956l.m2147try(objM2132native6);
            C9735l c9735l9 = (C9735l) objM2132native6;
            if ((57344 & i2) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | z3;
            objM2132native = c6956l.m2132native();
            if (z5) {
                if (!z2) {
                    if (c9894l != null) {
                        objM2132native = new C9735l(AbstractC12953l.loadAd(Color.parseColor(c9894l.crashlytics)));
                    } else {
                        objM2132native = null;
                    }
                } else if (c9894l != null) {
                    objM2132native = new C9735l(AbstractC12953l.loadAd(Color.parseColor(c9894l.crashlytics)));
                } else {
                    objM2132native = null;
                }
                c6956l.m2147try(objM2132native);
            } else {
                if (!z2) {
                    if (c9894l != null) {
                        objM2132native = new C9735l(AbstractC12953l.loadAd(Color.parseColor(c9894l.crashlytics)));
                    } else {
                        objM2132native = null;
                    }
                } else if (c9894l != null) {
                    objM2132native = new C9735l(AbstractC12953l.loadAd(Color.parseColor(c9894l.crashlytics)));
                } else {
                    objM2132native = null;
                }
                c6956l.m2147try(objM2132native);
            }
            C9735l c9735l10 = (C9735l) objM2132native;
            if (c9735l6 == null) {
                c6956l.m2123default(349224009);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                z6 = false;
                c6956l.startapp(false);
            } else {
                z6 = false;
                c6956l.m2123default(349221529);
                c6956l.startapp(false);
                j = c9735l6.yandex;
            }
            long j4 = j;
            if (c9735l4 == null) {
                c6956l.m2123default(349227687);
                j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                c6956l.startapp(z6);
            } else {
                c6956l.m2123default(349225486);
                c6956l.startapp(z6);
                j2 = c9735l4.yandex;
            }
            C12654l c12654lYandex2 = AbstractC13880l.yandex(j2, j4, 0L, 0L, c6956l, 0, 12);
            C15578l c15578lAmazon2 = AbstractC14566l.amazon(-1897186030, new C11223l(c9735l5, c9735l10, c9735l6, c9735l9, 21), c6956l);
            C4346l c4346l2 = C4346l.f8873l;
            AbstractC3383l.yandex(c4346l2, null, c12654lYandex2, null, null, c15578lAmazon2, c6956l, 196614, 26);
            interfaceC17242l2 = c4346l2;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15772l(this, interfaceC17242l2, c6417l, c9894l, z, z2, i);
        }
    }
}
