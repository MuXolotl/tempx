package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageReader;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: lؙؙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6159l {
    public static final C15578l yandex = new C15578l(1752947294, false, new C8337l(24));
    public static final C15578l loadAd = new C15578l(1238711670, false, new C11813l(12));
    public static final C15578l crashlytics = new C15578l(-1975174163, false, new C11813l(13));
    public static final C15578l amazon = new C15578l(1761809070, false, new C11813l(14));

    public static final int amazon(InterfaceC5389l interfaceC5389l, int i) {
        Object obj;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        C10861l c10861l = (C10861l) interfaceC5389l;
        Object objCrashlytics = c10861l.crashlytics(key);
        Object obj2 = {0};
        if (objCrashlytics != null) {
            obj2 = objCrashlytics;
        }
        if (AbstractC8669l.tapsense((int[]) obj2, i)) {
            return i;
        }
        int[] iArr = {0};
        Object objCrashlytics2 = c10861l.crashlytics(key);
        if (objCrashlytics2 != null) {
            obj = iArr;
            obj = objCrashlytics2;
        }
        obj = iArr;
        return AbstractC8669l.tapsense((int[]) obj, 1) ? 1 : 0;
    }

    public static int billing(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return purchase(b, bArr[i]);
        }
        if (i3 != 2) {
            C11586l.yandex();
            return 0;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static final C10514l crashlytics(InterfaceC5389l interfaceC5389l) {
        int i = 0;
        Object objCrashlytics = ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        Object obj = {0};
        if (objCrashlytics != null) {
            obj = objCrashlytics;
        }
        return new C10514l(i, (int[]) obj);
    }

    public static AbstractC8831l loadAd(C2756l c2756l) throws IOException {
        C18547l c18547l;
        Object objInmobi;
        C2436l c2436l = null;
        cthrowPremium = null;
        Cthrow cthrowPremium = null;
        cthrowPremium = null;
        Cthrow cthrowPremium2 = null;
        C11344l c11344l = null;
        if (c2756l == null) {
            C8339l.metrica("keyInfo array null");
            return null;
        }
        advert advertVar = c2756l.f5963l;
        C10198l c10198l = c2756l.f5961l;
        Cfor cfor = c10198l.f20787l;
        applovin applovinVar = c10198l.f20786l;
        if (cfor.ad(InterfaceC13726l.yandex)) {
            return new C10075l(AbstractC3983l.purchase(C18507l.vip(applovinVar)), Cthrow.premium(c2756l.ads()).f36593l);
        }
        if (cfor.ad(InterfaceC13726l.loadAd)) {
            byte[] bArr = Cthrow.premium(c2756l.ads()).f36593l;
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            for (int i = 0; i != length; i++) {
                int i2 = i * 2;
                sArr[i] = (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
            }
            return new C11529l(sArr);
        }
        if (cfor.ad(InterfaceC0543l.f1892l)) {
            Cthrow cthrowPremium3 = (C11327l) c2756l.metrica();
            byte[] bArr2 = cthrowPremium3.f36593l;
            if (bArr2.length != 64) {
                if (!AbstractC3983l.loadAd(bArr2) && bArr2[0] == 4) {
                    cthrowPremium = Cthrow.premium(bArr2);
                }
                if (cthrowPremium != null) {
                    cthrowPremium3 = Cthrow.premium(cthrowPremium);
                }
            }
            byte[] bArr3 = cthrowPremium3.f36593l;
            if (advertVar == null) {
                return C12529l.loadAd(AbstractC14024l.vip(4, bArr3.length, bArr3));
            }
            byte[] bArrInmobi = advertVar.inmobi();
            C12529l c12529lLoadAd = C12529l.loadAd(AbstractC14024l.vip(4, bArr3.length, bArr3));
            C15082l.yandex(bArrInmobi);
            c12529lLoadAd.getClass();
            return c12529lLoadAd;
        }
        if (cfor.m195strictfp(InterfaceC2522l.isPro) || cfor.m195strictfp(InterfaceC2522l.f5321class)) {
            C18535l c18535l = (C18535l) AbstractC3983l.startapp.get(cfor);
            Ccase ccaseAds = c2756l.ads();
            if (!(ccaseAds instanceof Cclass)) {
                return new C7400l(c18535l, Cthrow.premium(ccaseAds).f36593l);
            }
            Cclass cclassInmobi = Cclass.inmobi(ccaseAds);
            C4557l c4557l = new C4557l();
            int iM4585strictfp = Cstrictfp.premium(cclassInmobi.mo173throws(0)).m4585strictfp();
            c4557l.f9226l = iM4585strictfp;
            if (iM4585strictfp != 0) {
                C8339l.metrica("unrecognized version");
                return null;
            }
            c4557l.f9225l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l);
            c4557l.f9224l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi.mo173throws(2)).f36593l);
            if (cclassInmobi.size() == 4) {
                applovin applovinVarMo173throws = cclassInmobi.mo173throws(3);
                if (applovinVarMo173throws instanceof C2436l) {
                    c2436l = (C2436l) applovinVarMo173throws;
                } else if (applovinVarMo173throws != null) {
                    Cclass cclassInmobi2 = Cclass.inmobi(applovinVarMo173throws);
                    c2436l = new C2436l();
                    c2436l.f5211l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi2.mo173throws(0)).f36593l);
                    c2436l.f5210l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi2.mo173throws(1)).f36593l);
                }
                c4557l.f9227l = c2436l;
            }
            C2436l c2436l2 = c4557l.f9227l;
            return new C7400l(c18535l, AbstractC14024l.crashlytics(c4557l.f9225l), AbstractC14024l.crashlytics(c4557l.f9224l), AbstractC14024l.crashlytics(c2436l2.f5211l), AbstractC14024l.crashlytics(c2436l2.f5210l));
        }
        HashMap map = AbstractC3983l.f8181private;
        if (map.containsKey(cfor)) {
            C7951l c7951l = (C7951l) map.get(cfor);
            Cthrow cthrowMetrica = c2756l.metrica();
            int iPro = c7951l.yandex.pro() * 4;
            Cthrow cthrowPremium4 = (C11327l) cthrowMetrica;
            byte[] bArr4 = cthrowPremium4.f36593l;
            if (bArr4.length != iPro) {
                if (!AbstractC3983l.loadAd(bArr4) && bArr4[0] == 4) {
                    cthrowPremium2 = Cthrow.premium(bArr4);
                }
                if (cthrowPremium2 != null) {
                    cthrowPremium4 = Cthrow.premium(cthrowPremium2);
                }
            }
            return new C2250l(c7951l, cthrowPremium4.f36593l);
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5496this)) {
            return new C18116l((C17615l) AbstractC3983l.admob.get(cfor), Cthrow.premium(c2756l.ads()).f36593l);
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5404l)) {
            Ccase ccaseAds2 = c2756l.ads();
            if (ccaseAds2 != null) {
                Cclass cclassInmobi3 = Cclass.inmobi(ccaseAds2);
                C11344l c11344l2 = new C11344l();
                int iM4585strictfp2 = Cstrictfp.premium(cclassInmobi3.mo173throws(0)).m4585strictfp();
                c11344l2.f22881l = iM4585strictfp2;
                if (iM4585strictfp2 != 0) {
                    C8339l.metrica("unrecognized version");
                    return null;
                }
                c11344l2.f22880l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi3.mo173throws(1)).f36593l);
                c11344l2.f22878l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi3.mo173throws(2)).f36593l);
                c11344l2.f22883l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi3.mo173throws(3)).f36593l);
                c11344l2.f22882l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi3.mo173throws(4)).f36593l);
                c11344l2.f22884l = AbstractC14024l.crashlytics(Cthrow.premium(cclassInmobi3.mo173throws(5)).f36593l);
                if (cclassInmobi3.size() == 7) {
                    c11344l2.f22879l = C3967l.vip(cclassInmobi3.mo173throws(6));
                }
                c11344l = c11344l2;
            }
            return new C18465l((C6801l) AbstractC3983l.vip.get(cfor), AbstractC14024l.crashlytics(c11344l.f22880l), AbstractC14024l.crashlytics(c11344l.f22878l), AbstractC14024l.crashlytics(c11344l.f22883l), AbstractC14024l.crashlytics(c11344l.f22882l), AbstractC14024l.crashlytics(c11344l.f22884l));
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5479l)) {
            byte[] bArr5 = Cthrow.premium(c2756l.ads()).f36593l;
            C15606l c15606l = new C15606l((C10512l) AbstractC3983l.isPro.get(cfor), true);
            c15606l.f30459l = AbstractC14024l.crashlytics(bArr5);
            return c15606l;
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5396l)) {
            byte[] bArr6 = Cthrow.premium(c2756l.ads()).f36593l;
            C2677l c2677l = new C2677l((C15401l) AbstractC3983l.smaato.get(cfor), true);
            c2677l.f5812l = AbstractC14024l.crashlytics(bArr6);
            return c2677l;
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5415l)) {
            return new C9779l((C11258l) AbstractC3983l.ads.get(cfor), Cthrow.premium(c2756l.ads()).f36593l);
        }
        if (cfor.ad(InterfaceC8134l.f16958l) || cfor.ad(InterfaceC8134l.f16977l) || cfor.ad(InterfaceC8134l.f16968l)) {
            C11327l c11327l = (C11327l) c2756l.metrica();
            byte[] bArr7 = c11327l.f36593l;
            Object objInmobi2 = c11327l;
            if (bArr7.length != 64) {
                Ccase ccaseCrashlytics = AbstractC3983l.crashlytics(bArr7);
                if (ccaseCrashlytics instanceof Cthrow) {
                    objInmobi2 = Cthrow.premium(ccaseCrashlytics);
                } else if (ccaseCrashlytics instanceof Cclass) {
                    objInmobi2 = c11327l;
                    objInmobi2 = Cclass.inmobi(ccaseCrashlytics);
                }
            }
            objInmobi2 = c11327l;
            C8719l c8719l = (C8719l) AbstractC3983l.f8183synchronized.get(cfor);
            if (advertVar != null) {
                try {
                    Ccase ccaseAdvert = Ccase.advert(advertVar.inmobi());
                    if (ccaseAdvert instanceof Cclass) {
                        Cclass cclassInmobi4 = Cclass.inmobi(ccaseAdvert);
                        c18547l = new C18547l(c8719l, Cthrow.premium(cclassInmobi4.mo173throws(0)).f36593l, Cthrow.premium(cclassInmobi4.mo173throws(1)).f36593l);
                    } else {
                        c18547l = new C18547l(c8719l, Cthrow.premium(ccaseAdvert).f36593l);
                    }
                } catch (Exception unused) {
                    c18547l = new C18547l(c8719l, advertVar.inmobi());
                }
            } else {
                c18547l = null;
            }
            if (objInmobi2 instanceof Cthrow) {
                return new C16951l(c8719l, ((Cthrow) objInmobi2).f36593l, c18547l);
            }
            if (!(objInmobi2 instanceof Cclass)) {
                C8339l.metrica(AbstractC0653l.ads(new StringBuilder("invalid "), c8719l.f17939l, " private key"));
                return null;
            }
            Cclass cclass = (Cclass) objInmobi2;
            byte[] bArr8 = Cthrow.premium(cclass.mo173throws(0)).f36593l;
            byte[] bArr9 = Cthrow.premium(cclass.mo173throws(1)).f36593l;
            C16951l c16951l = new C16951l(c8719l, bArr8, c18547l);
            if (AbstractC14024l.smaato(c16951l.getEncoded(), bArr9)) {
                return c16951l;
            }
            C8339l.metrica(AbstractC0653l.ads(new StringBuilder("inconsistent "), c8719l.f17939l, " private key"));
            return null;
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5421l)) {
            Cclass cclassInmobi5 = Cclass.inmobi(c2756l.ads());
            return new C7651l((C9818l) AbstractC3983l.license.get(cfor), Cthrow.premium(cclassInmobi5.mo173throws(0)).f36593l, Cthrow.premium(cclassInmobi5.mo173throws(1)).f36593l, Cthrow.premium(cclassInmobi5.mo173throws(2)).f36593l, Cthrow.premium(cclassInmobi5.mo173throws(3)).f36593l);
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5481l)) {
            Cclass cclassInmobi6 = Cclass.inmobi(c2756l.ads());
            return new C3190l((C7684l) AbstractC3983l.ad.get(cfor), Cthrow.premium(cclassInmobi6.mo173throws(0)).f36593l, Cthrow.premium(cclassInmobi6.mo173throws(1)).f36593l, Cthrow.premium(cclassInmobi6.mo173throws(2)).f36593l, Cthrow.premium(cclassInmobi6.mo173throws(3)).f36593l, Cthrow.premium(cclassInmobi6.mo173throws(4)).f36593l);
        }
        HashMap map2 = AbstractC3983l.f8186volatile;
        if (map2.containsKey(cfor)) {
            C11327l c11327l2 = (C11327l) c2756l.metrica();
            byte[] bArr10 = c11327l2.f36593l;
            if (bArr10.length != 32) {
                Ccase ccaseCrashlytics2 = AbstractC3983l.crashlytics(bArr10);
                if (ccaseCrashlytics2 instanceof Cthrow) {
                    objInmobi = c11327l2;
                    objInmobi = Cthrow.premium(ccaseCrashlytics2);
                } else if (ccaseCrashlytics2 instanceof Cclass) {
                    objInmobi = c11327l2;
                    objInmobi = c11327l2;
                    objInmobi = Cclass.inmobi(ccaseCrashlytics2);
                }
            }
            objInmobi = c11327l2;
            objInmobi = c11327l2;
            objInmobi = c11327l2;
            C11196l c11196l = (C11196l) map2.get(cfor);
            C3427l c3427lLoadAd = advertVar != null ? C7584l.loadAd(c11196l, advertVar) : null;
            if (objInmobi instanceof Cthrow) {
                return new C15739l(c11196l, ((Cthrow) objInmobi).f36593l, c3427lLoadAd);
            }
            if (!(objInmobi instanceof Cclass)) {
                C8339l.metrica(AbstractC0653l.ads(new StringBuilder("invalid "), c11196l.loadAd, " private key"));
                return null;
            }
            Cclass cclass2 = (Cclass) objInmobi;
            byte[] bArr11 = Cthrow.premium(cclass2.mo173throws(0)).f36593l;
            byte[] bArr12 = Cthrow.premium(cclass2.mo173throws(1)).f36593l;
            C15739l c15739l = new C15739l(c11196l, bArr11, c3427lLoadAd);
            if (AbstractC14024l.smaato(c15739l.getEncoded(), bArr12)) {
                return c15739l;
            }
            C8339l.metrica(AbstractC0653l.ads(new StringBuilder("inconsistent "), c11196l.loadAd, " private key"));
            return null;
        }
        if (cfor.ad(InterfaceC2522l.f5453l) || cfor.ad(InterfaceC2522l.f5455l) || cfor.ad(InterfaceC2522l.f5346l)) {
            Ccase ccaseAds3 = c2756l.ads();
            C18260l c18260l = (C18260l) AbstractC3983l.isVip.get(cfor);
            if (!(ccaseAds3 instanceof Cclass)) {
                if (ccaseAds3 instanceof C11327l) {
                    byte[] bArr13 = Cthrow.premium(ccaseAds3).f36593l;
                    return advertVar != null ? new C18301l(c18260l, bArr13, C7584l.yandex(c18260l, advertVar)) : new C18301l(c18260l, bArr13, null);
                }
                C18262l.metrica("not supported");
                return null;
            }
            Cclass cclassInmobi7 = Cclass.inmobi(ccaseAds3);
            int iM4585strictfp3 = Cstrictfp.premium(cclassInmobi7.mo173throws(0)).m4585strictfp();
            if (iM4585strictfp3 != 0) {
                C18262l.metrica(AbstractC0653l.vip(iM4585strictfp3, "unknown private key version: "));
                return null;
            }
            if (advertVar != null) {
                return new C18301l(c18260l, advert.appmetrica(cclassInmobi7.mo173throws(1)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(2)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(3)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(4)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(5)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(6)).inmobi(), AbstractC14024l.crashlytics(C7584l.yandex(c18260l, advertVar).f26696l));
            }
            return new C18301l(c18260l, advert.appmetrica(cclassInmobi7.mo173throws(1)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(2)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(3)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(4)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(5)).inmobi(), advert.appmetrica(cclassInmobi7.mo173throws(6)).inmobi(), null);
        }
        if (cfor.ad(InterfaceC2522l.f5439l) || cfor.ad(InterfaceC2522l.f5343l)) {
            C6355l c6355lVip = C6355l.vip(c2756l.ads());
            return new C5354l((C1738l) AbstractC3983l.tapsense.get(cfor), AbstractC14024l.crashlytics(c6355lVip.f13319l), AbstractC14024l.crashlytics(c6355lVip.f13318l), AbstractC14024l.crashlytics(c6355lVip.f13322l), c6355lVip.f13321l.f27763l);
        }
        if (cfor.ad(InterfaceC2522l.f5464l) || cfor.ad(InterfaceC2522l.f5437l)) {
            C6355l c6355lVip2 = C6355l.vip(c2756l.ads());
            return new C5354l((C1738l) AbstractC3983l.tapsense.get(cfor), AbstractC14024l.crashlytics(c6355lVip2.f13319l), AbstractC14024l.crashlytics(c6355lVip2.f13318l), AbstractC14024l.crashlytics(c6355lVip2.f13322l), c6355lVip2.f13321l.f27763l);
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5371l)) {
            byte[] bArr14 = Cthrow.premium(c2756l.ads()).f36593l;
            C13523l c13523l = (C13523l) AbstractC3983l.premium.get(cfor);
            int i3 = c13523l.f26545l;
            int i4 = c13523l.f26545l;
            byte[] bArrVip = AbstractC14024l.vip(0, (i3 + 7) / 8, bArr14);
            byte[] bArrVip2 = AbstractC14024l.vip((i4 + 7) / 8, ((i4 + 7) / 8) * 2, bArr14);
            byte[] bArrVip3 = AbstractC14024l.vip(((i4 + 7) / 8) * 2, bArr14.length, bArr14);
            C12344l c12344l = new C12344l(c13523l, true);
            c12344l.f24438l = AbstractC14024l.crashlytics(bArrVip);
            c12344l.f24440l = AbstractC14024l.crashlytics(bArrVip2);
            c12344l.f24439l = AbstractC14024l.crashlytics(bArrVip3);
            return c12344l;
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5467l)) {
            return new C10002l((C17145l) AbstractC3983l.appmetrica.get(cfor), Cthrow.premium(c2756l.ads()).f36593l);
        }
        if (cfor.m195strictfp(InterfaceC2522l.f5441l)) {
            return new C12680l((C9566l) AbstractC3983l.f8185throws.get(cfor), Cthrow.premium(c2756l.ads()).f36593l);
        }
        if (cfor.ad(InterfaceC13726l.crashlytics)) {
            C12115l c12115lVip = C12115l.vip(applovinVar);
            Cfor cfor2 = c12115lVip.f24092l.f20787l;
            Ccase ccaseAds4 = c2756l.ads();
            C4438l c4438l = ccaseAds4 != null ? new C4438l(Cclass.inmobi(ccaseAds4)) : null;
            try {
                C5908l c5908l = new C5908l(new C15980l(c12115lVip.f24093l, AbstractC3983l.yandex(cfor2)));
                int i5 = c4438l.f9035l;
                byte[] bArr15 = c4438l.f9034l;
                c5908l.f12456l = i5;
                c5908l.f12452l = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c4438l.f9032l));
                c5908l.f12458l = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c4438l.f9038l));
                c5908l.f12459l = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c4438l.f9037l));
                c5908l.f12453l = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c4438l.f9039l));
                if (c4438l.f9036l != 0) {
                    c5908l.f12455l = c4438l.f9033l;
                }
                if (AbstractC14024l.crashlytics(bArr15) != null) {
                    C0391l c0391l = (C0391l) AbstractC4047l.billing(AbstractC14024l.crashlytics(bArr15), C0391l.class);
                    c0391l.getClass();
                    c5908l.f12454l = new C0391l(c0391l, cfor2);
                }
                if (((byte[]) c5908l.f12459l) == null || ((byte[]) c5908l.f12452l) == null) {
                    throw new IllegalStateException("publicSeed or secretKeySeed is null");
                }
                return new C5745l(c5908l);
            } catch (ClassNotFoundException e) {
                C11467l.smaato(e.getMessage(), "ClassNotFoundException processing BDS state: ");
                return null;
            }
        }
        if (!cfor.ad(InterfaceC13726l.amazon)) {
            if (cfor.m195strictfp(InterfaceC2522l.f5355l)) {
                return new C6818l((C15183l) AbstractC3983l.f8178for.get(cfor), Cthrow.premium(c2756l.ads()).f36593l);
            }
            if (cfor.m195strictfp(InterfaceC2522l.f5405l)) {
                return new C5200l((C3125l) AbstractC3983l.f8175catch.get(cfor), Cthrow.premium(c2756l.ads()).f36593l);
            }
            if (cfor.m195strictfp(InterfaceC2522l.f5444l)) {
                return new C5027l((C0326l) AbstractC3983l.f8174case.get(cfor), Cthrow.premium(c2756l.ads()).f36593l);
            }
            C18073l.license("algorithm identifier in private key not recognised");
            return null;
        }
        C13700l c13700lVip = C13700l.vip(applovinVar);
        Cfor cfor3 = c13700lVip.f26757l.f20787l;
        try {
            Ccase ccaseAds5 = c2756l.ads();
            C15044l c15044l = ccaseAds5 != null ? new C15044l(Cclass.inmobi(ccaseAds5)) : null;
            int i6 = c13700lVip.f26755l;
            C12662l c12662l = new C12662l(new C15509l(i6, c13700lVip.f26754l, AbstractC3983l.yandex(cfor3)));
            long j = c15044l.f29566l;
            byte[] bArr16 = c15044l.f29565l;
            c12662l.loadAd = j;
            c12662l.amazon = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c15044l.f29569l));
            c12662l.purchase = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c15044l.f29568l));
            c12662l.billing = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c15044l.f29570l));
            c12662l.mopub = AbstractC4047l.crashlytics(AbstractC14024l.crashlytics(c15044l.f29564l));
            if (c15044l.f29567l != 0) {
                c12662l.crashlytics = c15044l.f29563l;
            }
            if (AbstractC14024l.crashlytics(bArr16) != null) {
                C0497l c0497lYandex = ((C0497l) AbstractC4047l.billing(AbstractC14024l.crashlytics(bArr16), C0497l.class)).yandex(cfor3);
                if (c0497lYandex.f1805l == 0) {
                    c12662l.admob = new C0497l(c0497lYandex, (1 << i6) - 1);
                } else {
                    c12662l.admob = c0497lYandex;
                }
            }
            return new C3910l(c12662l);
        } catch (ClassNotFoundException e2) {
            C11467l.smaato(e2.getMessage(), "ClassNotFoundException processing BDS state: ");
            return null;
        }
    }

    public static int mopub(int i, int i2, byte[] bArr) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return billing(i3, i2, bArr);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return billing(i3, i2, bArr);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static int purchase(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static C8634l yandex(int i, int i2, int i3, int i4) {
        return new C8634l(ImageReader.newInstance(i, i2, i3, i4));
    }
}
