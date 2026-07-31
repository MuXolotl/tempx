package defpackage;

import android.media.MediaRoute2Info;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lٗٔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17132l implements InterfaceC5515l, InterfaceC15244l, InterfaceC15372l, InterfaceC12888l, InterfaceC6351l, InterfaceC15535l, InterfaceC12365l, InterfaceC9500l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33315l;

    public /* synthetic */ C17132l(int i) {
        this.f33315l = i;
    }

    public static /* synthetic */ void adcel(String str, Object obj, Object obj2, Object obj3) {
        throw new C3150l(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void firebase() {
        throw new C6451l(10);
    }

    public static /* bridge */ /* synthetic */ Path isPro(Object obj) {
        return (Path) obj;
    }

    public static /* synthetic */ void metrica(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void smaato(int i, Object obj, String str) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void startapp(String str) throws InvalidParameterSpecException {
        throw new InvalidParameterSpecException(str);
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info subs(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // defpackage.InterfaceC15372l
    public Object admob(AbstractC6968l abstractC6968l) {
        switch (this.f33315l) {
            case 5:
                C0624l c0624l = (C0624l) abstractC6968l;
                C2782l c2782l = C2782l.f6068l;
                C11644l c11644l = c0624l.admob;
                C0624l.isPro(c11644l, c2782l);
                InterfaceC10135l interfaceC10135l = (InterfaceC10135l) ((C7912l) C16365l.amazon.yandex(InterfaceC10135l.class, (String) c11644l.f23358l)).yandex((AbstractC15257l) c11644l.f23357l);
                C9358l c9358l = (C9358l) c11644l.f23360l;
                return new C15105l(interfaceC10135l, AbstractC15901l.smaato(c9358l), AbstractC15901l.billing(c9358l, (Integer) c0624l.admob.f23362l).loadAd());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C5523l c5523l = (C5523l) abstractC6968l;
                EnumC1618l enumC1618l = (EnumC1618l) C17041l.mopub.m1425native(c5523l.admob.admob.yandex);
                byte[] bArrBilling = AbstractC17185l.billing((BigInteger) c5523l.subs.f11181l);
                ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) C12437l.billing.yandex.appmetrica("EC")).generatePrivate(new ECPrivateKeySpec(AbstractC17185l.loadAd(bArrBilling), C17423l.mopub(enumC1618l)));
                byte[] bArrLoadAd = new byte[0];
                C5416l c5416l = c5523l.admob.admob;
                C0346l c0346l = c5416l.billing;
                if (c0346l != null) {
                    bArrLoadAd = c0346l.loadAd();
                }
                return new C16294l(eCPrivateKey, bArrLoadAd, C17041l.loadAd(c5416l.loadAd), (EnumC5521l) C17041l.admob.m1425native(c5416l.crashlytics), AbstractC13457l.crashlytics(c5416l), c5523l.subs().subs().loadAd());
            default:
                C5454l c5454l = (C5454l) abstractC6968l;
                EnumC1618l enumC1618l2 = (EnumC1618l) C17041l.mopub.m1425native(c5454l.admob.yandex);
                ECPoint eCPoint = c5454l.subs;
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
                ECParameterSpec eCParameterSpecMopub = C17423l.mopub(enumC1618l2);
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                AbstractC12312l.loadAd(eCPoint2, eCParameterSpecMopub.getCurve());
                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) C12437l.billing.yandex.appmetrica("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, eCParameterSpecMopub));
                byte[] bArrLoadAd2 = new byte[0];
                C5416l c5416l2 = c5454l.admob;
                C0346l c0346l2 = c5416l2.billing;
                if (c0346l2 != null) {
                    bArrLoadAd2 = c0346l2.loadAd();
                }
                return new C17041l(eCPublicKey, bArrLoadAd2, C17041l.loadAd(c5416l2.loadAd), (EnumC5521l) C17041l.admob.m1425native(c5416l2.crashlytics), AbstractC13457l.crashlytics(c5416l2), c5454l.firebase.loadAd());
        }
    }

    @Override // defpackage.InterfaceC6351l
    public C12418l amazon(AbstractC3302l abstractC3302l) {
        C5416l c5416l = (C5416l) abstractC3302l;
        C9358l c9358lCrashlytics = AbstractC15097l.crashlytics(c5416l.amazon);
        C9219l c9219lPremium = C5933l.premium();
        C9493l c9493lAmazon = AbstractC15097l.amazon(c5416l);
        c9219lPremium.purchase();
        C5933l.isVip((C5933l) c9219lPremium.f19242l, c9493lAmazon);
        return C12418l.metrica("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", c9358lCrashlytics, ((C5933l) c9219lPremium.yandex()).billing());
    }

    @Override // defpackage.InterfaceC15535l
    public AbstractC3302l billing(C12418l c12418l) throws GeneralSecurityException {
        String str = (String) c12418l.f24518l;
        if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            return AbstractC15097l.yandex((C9358l) c12418l.f24521l, C5933l.applovin((AbstractC15257l) c12418l.f24519l, C7597l.yandex()).signatures());
        } catch (C2297l e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) {
        switch (this.f33315l) {
            case 22:
                C5454l c5454l = (C5454l) abstractC6968l;
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", AbstractC15097l.purchase(c5454l).billing(), C18176l.f35612l, AbstractC15097l.crashlytics(c5454l.admob.amazon), c5454l.smaato);
            default:
                C5523l c5523l = (C5523l) abstractC6968l;
                C7585l c7585lM3133throws = C11559l.m3133throws();
                c7585lM3133throws.purchase();
                C11559l.premium((C11559l) c7585lM3133throws.f19242l);
                C0413l c0413lPurchase = AbstractC15097l.purchase(c5523l.admob);
                c7585lM3133throws.purchase();
                C11559l.signatures((C11559l) c7585lM3133throws.f19242l, c0413lPurchase);
                C5416l c5416l = c5523l.admob.admob;
                C15059l c15059l = c5416l.yandex;
                if (c15059l.equals(C15059l.purchase)) {
                    byte[] bArrLoadAd = ((C0346l) c5523l.isPro.f16631l).loadAd();
                    C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
                    c7585lM3133throws.purchase();
                    C11559l.isVip((C11559l) c7585lM3133throws.f19242l, c14809lMopub);
                } else {
                    byte[] bArrMopub = AbstractC17185l.mopub(AbstractC15097l.loadAd(c15059l), (BigInteger) c5523l.subs.f11181l);
                    C14809l c14809lMopub2 = AbstractC15257l.mopub(0, bArrMopub.length, bArrMopub);
                    c7585lM3133throws.purchase();
                    C11559l.isVip((C11559l) c7585lM3133throws.f19242l, c14809lMopub2);
                }
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((C11559l) c7585lM3133throws.yandex()).billing(), C18176l.f35616l, AbstractC15097l.crashlytics(c5416l.amazon), c5523l.amazon());
        }
    }

    public Object loadAd() throws GeneralSecurityException {
        HashSet hashSet = new HashSet();
        C10038l c10038lLoadAd = C16816l.loadAd();
        c10038lLoadAd.m2857protected();
        c10038lLoadAd.m2868while(16);
        c10038lLoadAd.m2841const();
        C5138l c5138l = C5138l.f11178l;
        c10038lLoadAd.f20465l = c5138l;
        hashSet.add(c10038lLoadAd.m2862switch());
        C10038l c10038lLoadAd2 = C16816l.loadAd();
        c10038lLoadAd2.m2857protected();
        c10038lLoadAd2.m2868while(32);
        c10038lLoadAd2.m2841const();
        c10038lLoadAd2.f20465l = c5138l;
        hashSet.add(c10038lLoadAd2.m2862switch());
        C1424l c1424lLoadAd = C8378l.loadAd();
        c1424lLoadAd.m933l(16);
        c1424lLoadAd.m928l(32);
        c1424lLoadAd.m930l(16);
        c1424lLoadAd.m929l(16);
        C11534l c11534l = C11534l.f23194l;
        c1424lLoadAd.f3604l = c11534l;
        C6932l c6932l = C6932l.purchase;
        c1424lLoadAd.f3606l = c6932l;
        hashSet.add(c1424lLoadAd.ad());
        C1424l c1424lLoadAd2 = C8378l.loadAd();
        c1424lLoadAd2.m933l(32);
        c1424lLoadAd2.m928l(32);
        c1424lLoadAd2.m930l(32);
        c1424lLoadAd2.m929l(16);
        c1424lLoadAd2.f3604l = c11534l;
        c1424lLoadAd2.f3606l = c6932l;
        hashSet.add(c1424lLoadAd2.ad());
        hashSet.add(new C10441l(C11534l.f23196l));
        C0458l c0458lLoadAd = C18563l.loadAd();
        c0458lLoadAd.m550for(64);
        c0458lLoadAd.f1690l = C17162l.purchase;
        hashSet.add(c0458lLoadAd.ads());
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.InterfaceC9500l
    public AbstractC6968l purchase(C11644l c11644l) throws GeneralSecurityException {
        int i = this.f33315l;
        C15059l c15059l = C15059l.purchase;
        switch (i) {
            case 23:
                String str = (String) c11644l.f23358l;
                Integer num = (Integer) c11644l.f23362l;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", (String) c11644l.f23358l));
                    return null;
                }
                try {
                    C0413l c0413lM516volatile = C0413l.m516volatile((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c0413lM516volatile.m519throws() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C5416l c5416lYandex = AbstractC15097l.yandex((C9358l) c11644l.f23360l, c0413lM516volatile.inmobi());
                    if (!c5416lYandex.yandex.equals(c15059l)) {
                        return C5454l.firebase(c5416lYandex, new ECPoint(AbstractC17185l.loadAd(c0413lM516volatile.m517package().firebase()), AbstractC17185l.loadAd(c0413lM516volatile.m518synchronized().firebase())), num);
                    }
                    if (c0413lM516volatile.m518synchronized().size() == 0) {
                        return C5454l.isPro(c5416lYandex, C0346l.yandex(c0413lM516volatile.m517package().firebase()), num);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (IllegalArgumentException | C2297l unused) {
                    C18262l.ads("Parsing EcdsaPublicKey failed");
                    return null;
                }
            default:
                String str2 = (String) c11644l.f23358l;
                Integer num2 = (Integer) c11644l.f23362l;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", (String) c11644l.f23358l));
                    return null;
                }
                try {
                    C11559l c11559lM3131package = C11559l.m3131package((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c11559lM3131package.inmobi() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C0413l c0413lAppmetrica = c11559lM3131package.appmetrica();
                    if (c0413lAppmetrica.m519throws() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C5416l c5416lYandex2 = AbstractC15097l.yandex((C9358l) c11644l.f23360l, c0413lAppmetrica.inmobi());
                    if (c5416lYandex2.yandex.equals(c15059l)) {
                        return C5523l.firebase(C5454l.isPro(c5416lYandex2, C0346l.yandex(c0413lAppmetrica.m517package().firebase()), num2), new C7972l(24, C0346l.yandex(c11559lM3131package.applovin().firebase())));
                    }
                    return C5523l.smaato(C5454l.firebase(c5416lYandex2, new ECPoint(AbstractC17185l.loadAd(c0413lAppmetrica.m517package().firebase()), AbstractC17185l.loadAd(c0413lAppmetrica.m518synchronized().firebase())), num2), new C5138l(27, AbstractC17185l.loadAd(c11559lM3131package.applovin().firebase())));
                } catch (IllegalArgumentException | C2297l unused2) {
                    C18262l.ads("Parsing EcdsaPrivateKey failed");
                    return null;
                }
        }
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        Set setM3178l = c11644l.m3178l(C4662l.class);
        C14965l c14965l = C14965l.f29440l;
        if (c14965l == null) {
            synchronized (C14965l.class) {
                try {
                    c14965l = C14965l.f29440l;
                    if (c14965l == null) {
                        c14965l = new C14965l(0);
                        C14965l.f29440l = c14965l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new C8404l(setM3178l, c14965l);
    }

    @Override // defpackage.InterfaceC5515l
    public Constructor yandex() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC14833l.class).getConstructor(null);
    }

    @Override // defpackage.InterfaceC12888l
    public void release() {
    }
}
