package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem;

/* JADX INFO: renamed from: lُۥؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11467l implements InterfaceC9500l, InterfaceC15372l, InterfaceC15129l, InterfaceC0015l, InterfaceC14382l, InterfaceC6351l, InterfaceC15535l, InterfaceC12365l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23053l;

    public /* synthetic */ C11467l(int i) {
        this.f23053l = i;
    }

    public static /* synthetic */ void Signature(Object obj, String str) {
        throw new C3150l(str + obj);
    }

    public static /* synthetic */ void adcel(Object obj, Object obj2, String str) {
        throw new C6451l(str + obj + ((Object) " at path ") + obj2, 9, (byte) 0);
    }

    public static /* synthetic */ void ads(Object obj, String str) {
        throw new C3150l(str + obj);
    }

    public static /* synthetic */ void firebase(Object obj, Object obj2, String str) {
        throw new C6451l(str + obj + ((Object) " at path ") + obj2, 8, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isPro(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void license(String str) {
        throw new InvalidParameterException(str);
    }

    public static /* synthetic */ void metrica(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void pro(Object obj, String str) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(str + obj);
    }

    public static /* synthetic */ void remoteconfig(String str) throws C10352l {
        throw new C10352l(str);
    }

    public static /* synthetic */ void smaato(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void startapp(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void subs(int i, int i2, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void subscription(String str) {
        throw new C6451l(str, 8, (byte) 0);
    }

    public static /* synthetic */ void tapsense(Throwable th) {
        throw new C6451l(15, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void vip(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    @Override // defpackage.InterfaceC15372l
    public Object admob(AbstractC6968l abstractC6968l) throws GeneralSecurityException {
        switch (this.f23053l) {
            case 5:
                C0624l c0624l = (C0624l) abstractC6968l;
                C2782l c2782l = C2782l.f6068l;
                C11644l c11644l = c0624l.admob;
                C0624l.isPro(c11644l, c2782l);
                return new C7792l((InterfaceC11416l) ((C7912l) C16365l.amazon.yandex(InterfaceC11416l.class, (String) c11644l.f23358l)).yandex((AbstractC15257l) c11644l.f23357l), AbstractC15901l.billing((C9358l) c11644l.f23360l, (Integer) c0624l.admob.f23362l).loadAd());
            case 6:
                C0624l c0624l2 = (C0624l) abstractC6968l;
                C2782l c2782l2 = C2782l.f6068l;
                C11644l c11644l2 = c0624l2.admob;
                C0624l.isPro(c11644l2, c2782l2);
                return new C1259l((InterfaceC10634l) ((C7912l) C16365l.amazon.yandex(InterfaceC10634l.class, (String) c11644l2.f23358l)).yandex((AbstractC15257l) c11644l2.f23357l), AbstractC15901l.billing((C9358l) c11644l2.f23360l, (Integer) c0624l2.admob.f23362l).loadAd());
            case 22:
                C14993l c14993l = (C14993l) abstractC6968l;
                return new C1918l(AbstractC6243l.yandex(c14993l.admob.yandex).loadAd(c14993l.admob.yandex), c14993l.subs.loadAd());
            default:
                C8166l c8166l = (C8166l) abstractC6968l;
                C6762l c6762l = c8166l.admob;
                String str = c6762l.loadAd;
                AbstractC1440l abstractC1440l = c6762l.amazon;
                C8904l c8904lLoadAd = AbstractC6243l.yandex(str).loadAd(str);
                byte[] bArr = C5356l.amazon;
                try {
                    return new C1918l(new C5356l(C13608l.m3651strictfp(AbstractC2130l.mopub(abstractC1440l), C7597l.yandex()), c8904lLoadAd), c8166l.subs.loadAd());
                } catch (C2297l e) {
                    throw new GeneralSecurityException(e);
                }
        }
    }

    @Override // defpackage.InterfaceC6351l
    public C12418l amazon(AbstractC3302l abstractC3302l) throws GeneralSecurityException {
        C9358l c9358l;
        switch (this.f23053l) {
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C10257l c10257l = (C10257l) abstractC3302l;
                C9358l c9358lRemoteconfig = AbstractC16655l.remoteconfig(c10257l.loadAd);
                C5692l c5692lApplovin = C13011l.applovin();
                String str = c10257l.yandex;
                c5692lApplovin.purchase();
                C13011l.isVip((C13011l) c5692lApplovin.f19242l, str);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.KmsAeadKey", c9358lRemoteconfig, ((C13011l) c5692lApplovin.yandex()).billing());
            default:
                C6762l c6762l = (C6762l) abstractC3302l;
                C17927l c17927l = c6762l.yandex;
                if (C17927l.billing == c17927l) {
                    c9358l = C9358l.crashlytics;
                } else {
                    if (C17927l.mopub != c17927l) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c17927l)));
                    }
                    c9358l = C9358l.purchase;
                }
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", c9358l, AbstractC12832l.admob(c6762l).billing());
        }
    }

    @Override // defpackage.InterfaceC0015l
    /* JADX INFO: renamed from: apply */
    public String mo2021apply(Object obj) {
        return (String) C14419l.f28229l.get((ItunesSearch$ItunesItem) obj);
    }

    @Override // defpackage.InterfaceC15535l
    public AbstractC3302l billing(C12418l c12418l) throws GeneralSecurityException {
        C11534l c11534l;
        String str = (String) c12418l.f24518l;
        if (!str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            String strPremium = C13011l.appmetrica((AbstractC15257l) c12418l.f24519l, C7597l.yandex()).premium();
            C9358l c9358l = (C9358l) c12418l.f24521l;
            if (c9358l == C9358l.crashlytics) {
                c11534l = C11534l.f23192l;
            } else {
                if (c9358l != C9358l.purchase) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
                }
                c11534l = C11534l.f23197l;
            }
            return new C10257l(strPremium, c11534l);
        } catch (C2297l e) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) {
        C14993l c14993l = (C14993l) abstractC6968l;
        C15057l c15057lApplovin = C12053l.applovin();
        C5692l c5692lApplovin = C13011l.applovin();
        String str = c14993l.admob.yandex;
        c5692lApplovin.purchase();
        C13011l.isVip((C13011l) c5692lApplovin.f19242l, str);
        C13011l c13011l = (C13011l) c5692lApplovin.yandex();
        c15057lApplovin.purchase();
        C12053l.isVip((C12053l) c15057lApplovin.f19242l, c13011l);
        return C11644l.m3137l("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C12053l) c15057lApplovin.yandex()).billing(), C18176l.f35613l, AbstractC16655l.remoteconfig(c14993l.admob.loadAd), c14993l.isPro);
    }

    @Override // defpackage.InterfaceC15129l
    public boolean loadAd(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.InterfaceC9500l
    public AbstractC6968l purchase(C11644l c11644l) throws GeneralSecurityException {
        C11534l c11534l;
        switch (this.f23053l) {
            case 0:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", (String) c11644l.f23358l));
                    return null;
                }
                try {
                    C18208l c18208lM4499package = C18208l.m4499package((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c18208lM4499package.inmobi() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C6833l c6833lAppmetrica = c18208lM4499package.appmetrica();
                    if (c6833lAppmetrica.m2078throws() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C11232l c11232lLoadAd = AbstractC15179l.loadAd((C9358l) c11644l.f23360l, c6833lAppmetrica.appmetrica());
                    C15026l c15026l = c11232lLoadAd.yandex;
                    return C11153l.firebase(C4822l.isPro(c11232lLoadAd, AbstractC15179l.yandex(c15026l, c6833lAppmetrica.inmobi().firebase()), (Integer) c11644l.f23362l), new C7972l(24, C0346l.yandex(AbstractC17185l.mopub(AbstractC2383l.yandex(c15026l), AbstractC17185l.loadAd(c18208lM4499package.applovin().firebase())))));
                } catch (C2297l unused) {
                    C18262l.ads("Parsing HpkePrivateKey failed");
                    return null;
                }
            default:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    C8339l.metrica("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C12053l c12053lAppmetrica = C12053l.appmetrica((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c12053lAppmetrica.premium() != 0) {
                        throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(c12053lAppmetrica)));
                    }
                    String strPremium = c12053lAppmetrica.signatures().premium();
                    C9358l c9358l = (C9358l) c11644l.f23360l;
                    if (c9358l == C9358l.crashlytics) {
                        c11534l = C11534l.f23192l;
                    } else {
                        if (c9358l != C9358l.purchase) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
                        }
                        c11534l = C11534l.f23197l;
                    }
                    return C14993l.isPro(new C10257l(strPremium, c11534l), (Integer) c11644l.f23362l);
                } catch (C2297l e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
        }
    }

    @Override // defpackage.InterfaceC14382l
    public boolean yandex() {
        return false;
    }
}
