package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* JADX INFO: renamed from: lؙؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0882l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C0882l(int i) {
        this.yandex = i;
    }

    public final AbstractC6968l yandex(AbstractC3302l abstractC3302l, Integer num) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        EnumC1618l enumC1618l;
        C0346l c0346lYandex;
        C7972l c7972l;
        int i = 5;
        boolean z = false;
        switch (this.yandex) {
            case 0:
                C6023l c6023l = (C6023l) abstractC3302l;
                int i2 = c6023l.yandex;
                if (i2 != 32) {
                    C18262l.ads("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                C0554l c0554l = new C0554l();
                c0554l.f1957l = null;
                c0554l.f1956l = null;
                c0554l.f1958l = c6023l;
                c0554l.f1957l = C7972l.m2217static(i2);
                c0554l.f1956l = num;
                return c0554l.subscription();
            case 1:
                C8378l c8378l = (C8378l) abstractC3302l;
                int i3 = c8378l.yandex;
                if (i3 != 16 && i3 != 32) {
                    C18262l.ads("AES key size must be 16 or 32 bytes");
                    return null;
                }
                C10038l c10038l = new C10038l(3, z);
                c10038l.f20462l = null;
                c10038l.f20466l = null;
                c10038l.f20463l = c8378l;
                c10038l.f20465l = num;
                c10038l.f20462l = C7972l.m2217static(i3);
                c10038l.f20466l = C7972l.m2217static(c8378l.loadAd);
                return c10038l.m2838case();
            case 2:
                C3281l c3281l = (C3281l) abstractC3302l;
                int i4 = c3281l.yandex;
                if (i4 == 24) {
                    C18262l.ads("192 bit AES EAX Parameters are not valid");
                    return null;
                }
                C18449l c18449l = new C18449l(4, z);
                c18449l.f36009l = null;
                c18449l.f36010l = c3281l;
                c18449l.f36012l = num;
                c18449l.f36009l = C7972l.m2217static(i4);
                return c18449l.ad();
            case 3:
                C16816l c16816l = (C16816l) abstractC3302l;
                int i5 = c16816l.yandex;
                if (i5 == 24) {
                    C18262l.ads("192 bit AES GCM Parameters are not valid");
                    return null;
                }
                C0554l c0554l2 = new C0554l();
                c0554l2.f1957l = null;
                c0554l2.f1958l = c16816l;
                c0554l2.f1956l = num;
                c0554l2.f1957l = C7972l.m2217static(i5);
                return c0554l2.tapsense();
            case 4:
                C2385l c2385l = (C2385l) abstractC3302l;
                C10111l c10111l = new C10111l(i, z);
                c10111l.f20586l = null;
                c10111l.f20587l = c2385l;
                c10111l.f20589l = num;
                c10111l.f20586l = C7972l.m2217static(c2385l.yandex);
                return c10111l.crashlytics();
            case 5:
                C18563l c18563l = (C18563l) abstractC3302l;
                AbstractC2544l.yandex(c18563l);
                C18449l c18449l2 = new C18449l(i, z);
                c18449l2.f36009l = null;
                c18449l2.f36010l = c18563l;
                c18449l2.f36012l = num;
                c18449l2.f36009l = C7972l.m2217static(c18563l.yandex);
                return c18449l2.advert();
            case 6:
                return C5690l.isPro(((C15840l) abstractC3302l).yandex, C7972l.m2217static(32), num);
            case 7:
                C5416l c5416l = (C5416l) abstractC3302l;
                C15059l c15059l = c5416l.yandex;
                if (c15059l == C15059l.loadAd) {
                    eCParameterSpec = AbstractC12312l.yandex;
                } else if (c15059l == C15059l.crashlytics) {
                    eCParameterSpec = AbstractC12312l.loadAd;
                } else {
                    if (c15059l != C15059l.amazon) {
                        throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(c15059l)));
                    }
                    eCParameterSpec = AbstractC12312l.crashlytics;
                }
                KeyPair keyPairBilling = C17423l.billing(eCParameterSpec);
                return C5523l.smaato(C5454l.firebase(c5416l, ((ECPublicKey) keyPairBilling.getPublic()).getW(), num), new C5138l(27, ((ECPrivateKey) keyPairBilling.getPrivate()).getS()));
            case 8:
                C0485l c0485l = (C0485l) abstractC3302l;
                C10111l c10111l2 = new C10111l(20, z);
                c10111l2.f20586l = null;
                c10111l2.f20589l = null;
                c10111l2.f20587l = c0485l;
                c10111l2.f20586l = C7972l.m2217static(c0485l.yandex);
                c10111l2.f20589l = num;
                return c10111l2.mopub();
            case 9:
                C11232l c11232l = (C11232l) abstractC3302l;
                C15026l c15026l = c11232l.yandex;
                if (c15026l.equals(C15026l.mopub)) {
                    byte[] bArrPurchase = AbstractC10478l.purchase();
                    c7972l = new C7972l(24, C0346l.yandex(bArrPurchase));
                    c0346lYandex = C0346l.yandex(AbstractC10478l.mopub(bArrPurchase));
                } else {
                    C15026l c15026l2 = C15026l.billing;
                    C15026l c15026l3 = C15026l.purchase;
                    C15026l c15026l4 = C15026l.amazon;
                    if (c15026l != c15026l4 && c15026l != c15026l3 && c15026l != c15026l2) {
                        if (c15026l != C15026l.admob) {
                            C18262l.ads("Unknown KEM ID");
                            return null;
                        }
                        Provider providerMopub = AbstractC17764l.mopub();
                        if (providerMopub == null) {
                            C18262l.ads("Can't generate X-Wing key as Conscrypt is not available");
                            return null;
                        }
                        try {
                            if (KeyFactory.getInstance("XWING", providerMopub).getKeySpec(KeyPairGenerator.getInstance("XWING", providerMopub).generateKeyPair().getPublic(), AbstractC16494l.class) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            throw new GeneralSecurityException("Can't generate X-Wing key", e);
                        }
                    }
                    byte[] bArr = AbstractC2383l.yandex;
                    if (c15026l == c15026l4) {
                        enumC1618l = EnumC1618l.f3954l;
                    } else if (c15026l == c15026l3) {
                        enumC1618l = EnumC1618l.f3953l;
                    } else {
                        if (c15026l != c15026l2) {
                            C18262l.ads("Unrecognized NIST HPKE KEM identifier");
                            return null;
                        }
                        enumC1618l = EnumC1618l.f3952l;
                    }
                    KeyPair keyPairBilling2 = C17423l.billing(C17423l.mopub(enumC1618l));
                    c0346lYandex = C0346l.yandex(C17423l.isPro(C17423l.mopub(enumC1618l).getCurve(), EnumC5521l.f11790l, ((ECPublicKey) keyPairBilling2.getPublic()).getW()));
                    c7972l = new C7972l(24, C0346l.yandex(AbstractC17185l.mopub(AbstractC2383l.yandex(c15026l), ((ECPrivateKey) keyPairBilling2.getPrivate()).getS())));
                }
                return C11153l.firebase(C4822l.isPro(c11232l, c0346lYandex, num), c7972l);
            case 10:
                return C14993l.isPro((C10257l) abstractC3302l, num);
            case 11:
                return C8166l.isPro((C6762l) abstractC3302l, num);
            case 12:
                C12418l c12418l = ((C6457l) abstractC3302l).yandex;
                C16365l c16365l = C16365l.amazon;
                String str = (String) c12418l.f24518l;
                InterfaceC18729l interfaceC18729lLoadAd = c16365l.loadAd(str);
                if (!((Boolean) c16365l.loadAd.get(str)).booleanValue()) {
                    C18262l.ads("Creating new keys is not allowed.");
                    return null;
                }
                C12418l c12418lMetrica = C12418l.metrica(((C7912l) interfaceC18729lLoadAd).yandex, C9358l.purchase, (AbstractC15257l) c12418l.f24519l);
                C5535l c5535l = C5535l.loadAd;
                AbstractC6968l abstractC6968lLoadAd = C13002l.loadAd.loadAd(c5535l.loadAd(c12418lMetrica), null);
                C2782l c2782l = C2782l.f6068l;
                C11644l c11644lMopub = c5535l.mopub(abstractC6968lLoadAd);
                C7341l c7341lM739package = C0874l.m739package();
                String str2 = (String) c11644lMopub.f23358l;
                c7341lM739package.purchase();
                C0874l.signatures((C0874l) c7341lM739package.f19242l, str2);
                AbstractC15257l abstractC15257l = (AbstractC15257l) c11644lMopub.f23357l;
                c7341lM739package.purchase();
                C0874l.premium((C0874l) c7341lM739package.f19242l, abstractC15257l);
                EnumC17341l enumC17341lFirebase = AbstractC15901l.firebase((C18176l) c11644lMopub.f23361l);
                c7341lM739package.purchase();
                C0874l.isVip((C0874l) c7341lM739package.f19242l, enumC17341lFirebase);
                C0874l c0874l = (C0874l) c7341lM739package.yandex();
                return new C0624l(C11644l.m3137l(c0874l.inmobi(), c0874l.m740throws(), AbstractC15901l.crashlytics(c0874l.appmetrica()), (C9358l) c12418l.f24521l, num), c2782l);
            case 13:
                return C2846l.isPro((C13618l) abstractC3302l, C7972l.m2217static(32), num);
            default:
                return C11041l.isPro(((C10441l) abstractC3302l).yandex, C7972l.m2217static(32), num);
        }
    }
}
