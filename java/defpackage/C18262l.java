package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.spec.InvalidKeySpecException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l٘۠ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C18262l implements InterfaceC15244l, InterfaceC1953l, InterfaceC15372l, InterfaceC6351l, InterfaceC15535l, InterfaceC12365l, InterfaceC9500l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35765l;

    public /* synthetic */ C18262l(C1424l c1424l) {
        this.f35765l = 10;
    }

    public static /* synthetic */ void adcel(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void ads(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void firebase(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void isPro(Object obj, Object obj2) {
        throw new C8687l("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void metrica(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void mopub() {
        throw new C3933l("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public static /* synthetic */ void startapp(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void subs(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void vip(Object obj, String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str + obj + ((Object) "."));
    }

    @Override // defpackage.InterfaceC15372l
    public Object admob(AbstractC6968l abstractC6968l) throws GeneralSecurityException {
        int i;
        int i2 = this.f35765l;
        C15026l c15026l = C15026l.admob;
        switch (i2) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C8375l c8375l = new C8375l();
                if (AbstractC12589l.ad(2)) {
                    return c8375l;
                }
                ads("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18313l((C12785l) abstractC6968l);
            case 23:
                C11153l c11153l = (C11153l) abstractC6968l;
                C4822l c4822l = c11153l.admob;
                C11232l c11232l = c4822l.admob;
                C15026l c15026l2 = c11232l.yandex;
                if (c15026l2 == c15026l) {
                    ads("X-Wing HPKE is not supported on this Android version");
                    return null;
                }
                InterfaceC6211l interfaceC6211lAdmob = AbstractC10310l.admob(c15026l2);
                C10828l c10828lMopub = AbstractC10310l.mopub(c11232l.loadAd);
                InterfaceC3881l interfaceC3881lBilling = AbstractC10310l.billing(c11232l.crashlytics);
                C15026l c15026l3 = C15026l.mopub;
                boolean zEquals = c15026l2.equals(c15026l3);
                C15026l c15026l4 = C15026l.billing;
                C15026l c15026l5 = C15026l.purchase;
                C15026l c15026l6 = C15026l.amazon;
                if (zEquals) {
                    i = 32;
                } else if (c15026l2 == c15026l6) {
                    i = 65;
                } else if (c15026l2 == c15026l5) {
                    i = 97;
                } else {
                    if (c15026l2 != c15026l4) {
                        ads("Unrecognized or not NIST HPKE KEM identifier");
                        return null;
                    }
                    i = 133;
                }
                C15026l c15026l7 = c11232l.yandex;
                if (c15026l7.equals(c15026l3) || c15026l7 == c15026l6 || c15026l7 == c15026l5 || c15026l7 == c15026l4) {
                    return new C3876l(new C18595l(C0346l.yandex(((C0346l) c11153l.subs.f16631l).loadAd()), c4822l.subs, 28), interfaceC6211lAdmob, c10828lMopub, interfaceC3881lBilling, i, c11153l.subs().subs());
                }
                ads("Unrecognized or not NIST HPKE KEM identifier");
                return null;
            default:
                C4822l c4822l2 = (C4822l) abstractC6968l;
                C11232l c11232l2 = c4822l2.admob;
                C15026l c15026l8 = c11232l2.yandex;
                if (c15026l8 != c15026l) {
                    return new C2561l(c4822l2.subs, AbstractC10310l.admob(c15026l8), AbstractC10310l.mopub(c11232l2.loadAd), AbstractC10310l.billing(c11232l2.crashlytics), c4822l2.isPro);
                }
                ads("X-Wing HPKE is not supported on this Android version");
                return null;
        }
    }

    @Override // defpackage.InterfaceC6351l
    public C12418l amazon(AbstractC3302l abstractC3302l) {
        switch (this.f35765l) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C0485l c0485l = (C0485l) abstractC3302l;
                C9358l c9358lYandex = AbstractC12651l.yandex(c0485l.crashlytics);
                C9520l c9520lM1301throws = C3236l.m1301throws();
                C1272l c1272lInmobi = C16152l.inmobi();
                int i = c0485l.loadAd;
                c1272lInmobi.purchase();
                C16152l.signatures((C16152l) c1272lInmobi.f19242l, i);
                EnumC7004l enumC7004l = (EnumC7004l) AbstractC12651l.yandex.m1425native(c0485l.amazon);
                c1272lInmobi.purchase();
                C16152l.isVip((C16152l) c1272lInmobi.f19242l, enumC7004l);
                C16152l c16152l = (C16152l) c1272lInmobi.yandex();
                c9520lM1301throws.purchase();
                C3236l.signatures((C3236l) c9520lM1301throws.f19242l, c16152l);
                int i2 = c0485l.yandex;
                c9520lM1301throws.purchase();
                C3236l.isVip((C3236l) c9520lM1301throws.f19242l, i2);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.HmacKey", c9358lYandex, ((C3236l) c9520lM1301throws.yandex()).billing());
            default:
                C11232l c11232l = (C11232l) abstractC3302l;
                C9358l c9358lCrashlytics = AbstractC15179l.crashlytics(c11232l.amazon);
                C17597l c17597lPremium = C13043l.premium();
                C4826l c4826lAmazon = AbstractC15179l.amazon(c11232l);
                c17597lPremium.purchase();
                C13043l.isVip((C13043l) c17597lPremium.f19242l, c4826lAmazon);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.HpkePrivateKey", c9358lCrashlytics, ((C13043l) c17597lPremium.yandex()).billing());
        }
    }

    @Override // defpackage.InterfaceC15535l
    public AbstractC3302l billing(C12418l c12418l) throws GeneralSecurityException {
        switch (this.f35765l) {
            case 20:
                String str = (String) c12418l.f24518l;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    C3236l c3236lM1300package = C3236l.m1300package((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
                    if (c3236lM1300package.inmobi() != 0) {
                        throw new GeneralSecurityException(AbstractC0653l.vip(c3236lM1300package.inmobi(), "Parsing HmacParameters failed: unknown Version "));
                    }
                    C10038l c10038lLoadAd = C0485l.loadAd();
                    c10038lLoadAd.f20463l = Integer.valueOf(c3236lM1300package.applovin());
                    c10038lLoadAd.f20462l = Integer.valueOf(c3236lM1300package.appmetrica().appmetrica());
                    c10038lLoadAd.f20466l = (C10858l) AbstractC12651l.yandex.signatures(c3236lM1300package.appmetrica().applovin());
                    c10038lLoadAd.f20465l = AbstractC12651l.loadAd((C9358l) c12418l.f24521l);
                    return c10038lLoadAd.m2842continue();
                } catch (C2297l e) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
                }
            default:
                String str2 = (String) c12418l.f24518l;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    return AbstractC15179l.loadAd((C9358l) c12418l.f24521l, C13043l.applovin((AbstractC15257l) c12418l.f24519l, C7597l.yandex()).signatures());
                } catch (C2297l e2) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
                }
        }
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) {
        switch (this.f35765l) {
            case 21:
                C12785l c12785l = (C12785l) abstractC6968l;
                C0365l c0365lM1793throws = C5469l.m1793throws();
                C0485l c0485l = c12785l.admob;
                C1272l c1272lInmobi = C16152l.inmobi();
                int i = c0485l.loadAd;
                c1272lInmobi.purchase();
                C16152l.signatures((C16152l) c1272lInmobi.f19242l, i);
                EnumC7004l enumC7004l = (EnumC7004l) AbstractC12651l.yandex.m1425native(c0485l.amazon);
                c1272lInmobi.purchase();
                C16152l.isVip((C16152l) c1272lInmobi.f19242l, enumC7004l);
                C16152l c16152l = (C16152l) c1272lInmobi.yandex();
                c0365lM1793throws.purchase();
                C5469l.signatures((C5469l) c0365lM1793throws.f19242l, c16152l);
                byte[] bArrLoadAd = ((C0346l) c12785l.subs.f16631l).loadAd();
                C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
                c0365lM1793throws.purchase();
                C5469l.isVip((C5469l) c0365lM1793throws.f19242l, c14809lMopub);
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.HmacKey", ((C5469l) c0365lM1793throws.yandex()).billing(), C18176l.f35614l, AbstractC12651l.yandex(c12785l.admob.crashlytics), c12785l.firebase);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C4822l c4822l = (C4822l) abstractC6968l;
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.HpkePublicKey", AbstractC15179l.purchase(c4822l).billing(), C18176l.f35612l, AbstractC15179l.crashlytics(c4822l.admob.amazon), c4822l.firebase);
            default:
                C11153l c11153l = (C11153l) abstractC6968l;
                C12949l c12949lM4501throws = C18208l.m4501throws();
                c12949lM4501throws.purchase();
                C18208l.premium((C18208l) c12949lM4501throws.f19242l);
                C6833l c6833lPurchase = AbstractC15179l.purchase(c11153l.admob);
                c12949lM4501throws.purchase();
                C18208l.signatures((C18208l) c12949lM4501throws.f19242l, c6833lPurchase);
                byte[] bArrLoadAd2 = ((C0346l) c11153l.subs.f16631l).loadAd();
                C14809l c14809lMopub2 = AbstractC15257l.mopub(0, bArrLoadAd2.length, bArrLoadAd2);
                c12949lM4501throws.purchase();
                C18208l.isVip((C18208l) c12949lM4501throws.f19242l, c14809lMopub2);
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((C18208l) c12949lM4501throws.yandex()).billing(), C18176l.f35616l, AbstractC15179l.crashlytics(c11153l.admob.admob.amazon), c11153l.amazon());
        }
    }

    @Override // defpackage.InterfaceC9500l
    public AbstractC6968l purchase(C11644l c11644l) throws GeneralSecurityException {
        switch (this.f35765l) {
            case 22:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    C8339l.metrica("Wrong type URL in call to HmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C5469l c5469lM1791package = C5469l.m1791package((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c5469lM1791package.inmobi() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C10038l c10038lLoadAd = C0485l.loadAd();
                    c10038lLoadAd.f20463l = Integer.valueOf(c5469lM1791package.applovin().size());
                    c10038lLoadAd.f20462l = Integer.valueOf(c5469lM1791package.appmetrica().appmetrica());
                    c10038lLoadAd.f20466l = (C10858l) AbstractC12651l.yandex.signatures(c5469lM1791package.appmetrica().applovin());
                    c10038lLoadAd.f20465l = AbstractC12651l.loadAd((C9358l) c11644l.f23360l);
                    C0485l c0485lM2842continue = c10038lLoadAd.m2842continue();
                    C10111l c10111l = new C10111l(20, false);
                    c10111l.f20586l = null;
                    c10111l.f20589l = null;
                    c10111l.f20587l = c0485lM2842continue;
                    c10111l.f20586l = new C7972l(24, C0346l.yandex(c5469lM1791package.applovin().firebase()));
                    c10111l.f20589l = (Integer) c11644l.f23362l;
                    return c10111l.mopub();
                } catch (IllegalArgumentException | C2297l unused) {
                    ads("Parsing HmacKey failed");
                    return null;
                }
            default:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", (String) c11644l.f23358l));
                    return null;
                }
                try {
                    C6833l c6833lM2077synchronized = C6833l.m2077synchronized((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c6833lM2077synchronized.m2078throws() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C11232l c11232lLoadAd = AbstractC15179l.loadAd((C9358l) c11644l.f23360l, c6833lM2077synchronized.appmetrica());
                    return C4822l.isPro(c11232lLoadAd, AbstractC15179l.yandex(c11232lLoadAd.yandex, c6833lM2077synchronized.inmobi().firebase()), (Integer) c11644l.f23362l);
                } catch (C2297l unused2) {
                    ads("Parsing HpkePublicKey failed");
                    return null;
                }
        }
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        switch (this.f35765l) {
            case 0:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(c11644l);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(c11644l);
        }
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) throws IOException {
        Object obj;
        synchronized (c3823l.yandex) {
            AbstractC1051l.firebase("Task is not yet complete", c3823l.crashlytics);
            if (c3823l.amazon) {
                throw new CancellationException("Task is already canceled.");
            }
            boolean zIsInstance = IOException.class.isInstance(c3823l.billing);
            Exception exc = c3823l.billing;
            if (zIsInstance) {
                throw ((Throwable) IOException.class.cast(exc));
            }
            if (exc != null) {
                throw new C17056l(exc);
            }
            obj = c3823l.purchase;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            metrica("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            metrica("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            metrica(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        metrica("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public /* synthetic */ C18262l(int i) {
        this.f35765l = i;
    }
}
