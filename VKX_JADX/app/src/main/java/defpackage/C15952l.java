package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lٕۜٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15952l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31325l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C15952l f31322l = new C15952l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C15952l f31321l = new C15952l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C15952l f31324l = new C15952l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C15952l f31323l = new C15952l(3);

    public /* synthetic */ C15952l(int i) {
        this.f31325l = i;
    }

    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        switch (this.f31325l) {
            case 0:
                Context context = (Context) obj;
                String strLoadAd = AbstractC14196l.loadAd;
                if (strLoadAd == null) {
                    synchronized (AbstractC14196l.class) {
                        try {
                            strLoadAd = AbstractC14196l.loadAd;
                            if (strLoadAd == null) {
                                strLoadAd = AbstractC8554l.loadAd(context, "com.google.android.gms.measurement");
                                AbstractC14196l.loadAd = strLoadAd;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return strLoadAd;
            case 1:
                C5321l c5321l = C10316l.subs;
                return "";
            case 2:
                C12043l c12043l = (C12043l) obj;
                C2115l c2115lIsVip = C15643l.isVip();
                if (c12043l == null) {
                    return (C15643l) c2115lIsVip.amazon();
                }
                for (C4281l c4281l : c12043l.ad()) {
                    C13679l c13679lIsVip = C10725l.isVip();
                    String strTapsense = c4281l.tapsense();
                    c13679lIsVip.loadAd();
                    ((C10725l) c13679lIsVip.f20498l).signatures(strTapsense);
                    int iM1521synchronized = c4281l.m1521synchronized();
                    int i = iM1521synchronized - 1;
                    if (iM1521synchronized == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jSignature = c4281l.Signature();
                        c13679lIsVip.loadAd();
                        ((C10725l) c13679lIsVip.f20498l).premium(jSignature);
                    } else if (i == 1) {
                        boolean zLicense = c4281l.license();
                        c13679lIsVip.loadAd();
                        ((C10725l) c13679lIsVip.f20498l).applovin(zLicense);
                    } else if (i == 2) {
                        double dPro = c4281l.pro();
                        c13679lIsVip.loadAd();
                        ((C10725l) c13679lIsVip.f20498l).appmetrica(dPro);
                    } else if (i == 3) {
                        String strAd = c4281l.ad();
                        c13679lIsVip.loadAd();
                        ((C10725l) c13679lIsVip.f20498l).inmobi(strAd);
                    } else {
                        if (i != 4) {
                            C8339l.smaato("No known flag type");
                            return null;
                        }
                        AbstractC15619l abstractC15619lAdvert = c4281l.advert();
                        c13679lIsVip.loadAd();
                        ((C10725l) c13679lIsVip.f20498l).m2969throws(abstractC15619lAdvert);
                    }
                    C10725l c10725l = (C10725l) c13679lIsVip.amazon();
                    c2115lIsVip.loadAd();
                    ((C15643l) c2115lIsVip.f20498l).m4098throws(c10725l);
                }
                String strPro = c12043l.pro();
                c2115lIsVip.loadAd();
                ((C15643l) c2115lIsVip.f20498l).appmetrica(strPro);
                String strTapsense2 = c12043l.tapsense();
                c2115lIsVip.loadAd();
                ((C15643l) c2115lIsVip.f20498l).premium(strTapsense2);
                long jAdvert = c12043l.advert();
                c2115lIsVip.loadAd();
                ((C15643l) c2115lIsVip.f20498l).inmobi(jAdvert);
                if (c12043l.Signature()) {
                    AbstractC15619l abstractC15619lLicense = c12043l.license();
                    c2115lIsVip.loadAd();
                    ((C15643l) c2115lIsVip.f20498l).applovin(abstractC15619lLicense);
                }
                return (C15643l) c2115lIsVip.amazon();
            default:
                C9303l c9303l = (C9303l) obj;
                if (c9303l.f19114l != 29514) {
                    throw c9303l;
                }
                C6253l c6253lPro = C0701l.pro();
                C6283l c6283lM3936package = C15138l.m3936package();
                long jCurrentTimeMillis = System.currentTimeMillis();
                c6283lM3936package.loadAd();
                ((C15138l) c6283lM3936package.f20498l).m3938strictfp(jCurrentTimeMillis);
                c6253lPro.loadAd();
                ((C0701l) c6253lPro.f20498l).ad((C15138l) c6283lM3936package.amazon());
                return (C0701l) c6253lPro.amazon();
        }
    }
}
