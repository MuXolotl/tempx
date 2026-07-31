package defpackage;

import android.view.autofill.AutofillValue;
import androidx.car.app.navigation.model.Maneuver;
import java.security.GeneralSecurityException;
import java.util.Map;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: lٓۘۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14377l implements InterfaceC15372l, InterfaceC6351l, InterfaceC15535l, InterfaceC12365l, InterfaceC9500l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28119l;

    public /* synthetic */ C14377l(int i) {
        this.f28119l = i;
    }

    public static /* bridge */ /* synthetic */ AutofillValue mopub(Object obj) {
        return (AutofillValue) obj;
    }

    @Override // defpackage.InterfaceC15372l
    public Object admob(AbstractC6968l abstractC6968l) throws GeneralSecurityException {
        switch (this.f28119l) {
            case 0:
                return C9610l.crashlytics((C1778l) abstractC6968l);
            case 5:
                C14917l c14917l = (C14917l) abstractC6968l;
                C17548l c17548l = C13942l.purchase;
                if (!AbstractC12589l.pro(1)) {
                    C18262l.ads("Can not use AES-EAX in FIPS-mode.");
                    return null;
                }
                C3281l c3281l = c14917l.admob;
                if (c3281l.crashlytics == 16) {
                    return new C13942l(((C0346l) c14917l.subs.f16631l).loadAd(), c3281l.loadAd, c14917l.isPro.loadAd());
                }
                throw new GeneralSecurityException(AbstractC0653l.vip(c3281l.crashlytics, "AesEaxJce only supports 16 byte tag size, not "));
            case 10:
                C18441l c18441l = (C18441l) abstractC6968l;
                C16816l c16816l = c18441l.admob;
                int i = c16816l.loadAd;
                int i2 = c16816l.crashlytics;
                if (i != 12) {
                    throw new GeneralSecurityException(AbstractC0653l.vip(c16816l.loadAd, "Expected IV Size 12, got "));
                }
                if (i2 == 16) {
                    return new C1918l(((C0346l) c18441l.subs.f16631l).loadAd(), c18441l.isPro);
                }
                throw new GeneralSecurityException(AbstractC0653l.vip(i2, "Expected tag Size 16, got "));
            case 16:
                C11716l c11716l = (C11716l) abstractC6968l;
                C17548l c17548l2 = AbstractC4204l.yandex;
                C14377l c14377l = new C14377l(15);
                byte[] bArr = C10578l.amazon;
                if (C10578l.crashlytics(c14377l.yandex())) {
                    return new C10578l(((C0346l) c11716l.subs.f16631l).loadAd(), c11716l.isPro.loadAd(), c14377l);
                }
                C8339l.smaato("Cipher does not implement AES GCM SIV.");
                return null;
            default:
                C5925l c5925l = (C5925l) abstractC6968l;
                AbstractC2544l.yandex(c5925l.admob);
                return new C6976l(((C0346l) c5925l.subs.f16631l).loadAd(), c5925l.isPro);
        }
    }

    @Override // defpackage.InterfaceC6351l
    public C12418l amazon(AbstractC3302l abstractC3302l) throws GeneralSecurityException {
        switch (this.f28119l) {
            case 1:
                C8378l c8378l = (C8378l) abstractC3302l;
                C9358l c9358lAdmob = C9552l.admob(c8378l.purchase);
                C7553l c7553lAppmetrica = C3181l.appmetrica();
                C7029l c7029lInmobi = C9104l.inmobi();
                C15994l c15994lApplovin = C15586l.applovin();
                int i = c8378l.crashlytics;
                c15994lApplovin.purchase();
                C15586l.isVip((C15586l) c15994lApplovin.f19242l, i);
                C15586l c15586l = (C15586l) c15994lApplovin.yandex();
                c7029lInmobi.purchase();
                C9104l.signatures((C9104l) c7029lInmobi.f19242l, c15586l);
                int i2 = c8378l.yandex;
                c7029lInmobi.purchase();
                C9104l.isVip((C9104l) c7029lInmobi.f19242l, i2);
                C9104l c9104l = (C9104l) c7029lInmobi.yandex();
                c7553lAppmetrica.purchase();
                C3181l.isVip((C3181l) c7553lAppmetrica.f19242l, c9104l);
                C9520l c9520lM1301throws = C3236l.m1301throws();
                C16152l c16152lAmazon = C9552l.amazon(c8378l);
                c9520lM1301throws.purchase();
                C3236l.signatures((C3236l) c9520lM1301throws.f19242l, c16152lAmazon);
                int i3 = c8378l.loadAd;
                c9520lM1301throws.purchase();
                C3236l.isVip((C3236l) c9520lM1301throws.f19242l, i3);
                C3236l c3236l = (C3236l) c9520lM1301throws.yandex();
                c7553lAppmetrica.purchase();
                C3181l.signatures((C3181l) c7553lAppmetrica.f19242l, c3236l);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", c9358lAdmob, ((C3181l) c7553lAppmetrica.yandex()).billing());
            case 6:
                C3281l c3281l = (C3281l) abstractC3302l;
                C9358l c9358lAdmob2 = AbstractC16181l.admob(c3281l.amazon);
                C6685l c6685lAppmetrica = C2744l.appmetrica();
                C12173l c12173lCrashlytics = AbstractC16181l.crashlytics(c3281l);
                c6685lAppmetrica.purchase();
                C2744l.signatures((C2744l) c6685lAppmetrica.f19242l, c12173lCrashlytics);
                int i4 = c3281l.yandex;
                c6685lAppmetrica.purchase();
                C2744l.isVip((C2744l) c6685lAppmetrica.f19242l, i4);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.AesEaxKey", c9358lAdmob2, ((C2744l) c6685lAppmetrica.yandex()).billing());
            case 11:
                C16816l c16816l = (C16816l) abstractC3302l;
                AbstractC6660l.smaato(c16816l);
                C9358l c9358lIsPro = AbstractC6660l.isPro(c16816l.amazon);
                C4931l c4931lApplovin = C8191l.applovin();
                int i5 = c16816l.yandex;
                c4931lApplovin.purchase();
                C8191l.isVip((C8191l) c4931lApplovin.f19242l, i5);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.AesGcmKey", c9358lIsPro, ((C8191l) c4931lApplovin.yandex()).billing());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C2385l c2385l = (C2385l) abstractC3302l;
                C9358l c9358lFirebase = AbstractC3105l.firebase(c2385l.loadAd);
                C3044l c3044lApplovin = C9105l.applovin();
                int i6 = c2385l.yandex;
                c3044lApplovin.purchase();
                C9105l.isVip((C9105l) c3044lApplovin.f19242l, i6);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.AesGcmSivKey", c9358lFirebase, ((C9105l) c3044lApplovin.yandex()).billing());
            default:
                C18563l c18563l = (C18563l) abstractC3302l;
                C17162l c17162l = c18563l.loadAd;
                Map map = AbstractC13234l.purchase;
                if (!map.containsKey(c17162l)) {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c17162l)));
                }
                C9358l c9358l = (C9358l) map.get(c17162l);
                C16425l c16425lApplovin = C0313l.applovin();
                int i7 = c18563l.yandex;
                c16425lApplovin.purchase();
                C0313l.isVip((C0313l) c16425lApplovin.f19242l, i7);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.AesSivKey", c9358l, ((C0313l) c16425lApplovin.yandex()).billing());
        }
    }

    @Override // defpackage.InterfaceC15535l
    public AbstractC3302l billing(C12418l c12418l) throws GeneralSecurityException {
        switch (this.f28119l) {
            case 2:
                String str = (String) c12418l.f24518l;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    C3181l c3181lInmobi = C3181l.inmobi((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
                    if (c3181lInmobi.applovin().inmobi() != 0) {
                        C18262l.ads("Only version 0 keys are accepted");
                        return null;
                    }
                    C1424l c1424lLoadAd = C8378l.loadAd();
                    c1424lLoadAd.m933l(c3181lInmobi.premium().applovin());
                    c1424lLoadAd.m928l(c3181lInmobi.applovin().applovin());
                    c1424lLoadAd.m929l(c3181lInmobi.premium().appmetrica().premium());
                    c1424lLoadAd.m930l(c3181lInmobi.applovin().appmetrica().appmetrica());
                    c1424lLoadAd.f3604l = C9552l.mopub(c3181lInmobi.applovin().appmetrica().applovin());
                    c1424lLoadAd.f3606l = C9552l.subs((C9358l) c12418l.f24521l);
                    return c1424lLoadAd.ad();
                } catch (C2297l e) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
                }
            case 7:
                String str2 = (String) c12418l.f24518l;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    C2744l c2744lInmobi = C2744l.inmobi((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
                    C12014l c12014lLoadAd = C3281l.loadAd();
                    c12014lLoadAd.m3298class(c2744lInmobi.premium());
                    c12014lLoadAd.m3299continue(c2744lInmobi.applovin().premium());
                    c12014lLoadAd.m3303interface();
                    c12014lLoadAd.f23943l = AbstractC16181l.subs((C9358l) c12418l.f24521l);
                    return c12014lLoadAd.subs();
                } catch (C2297l e2) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
                }
            case 12:
                String str3 = (String) c12418l.f24518l;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", str3));
                    return null;
                }
                try {
                    C8191l c8191lAppmetrica = C8191l.appmetrica((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
                    if (c8191lAppmetrica.premium() != 0) {
                        C18262l.ads("Only version 0 parameters are accepted");
                        return null;
                    }
                    C10038l c10038lLoadAd = C16816l.loadAd();
                    c10038lLoadAd.m2868while(c8191lAppmetrica.signatures());
                    c10038lLoadAd.m2857protected();
                    c10038lLoadAd.m2841const();
                    c10038lLoadAd.f20465l = AbstractC6660l.firebase((C9358l) c12418l.f24521l);
                    return c10038lLoadAd.m2862switch();
                } catch (C2297l e3) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e3);
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                String str4 = (String) c12418l.f24518l;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", str4));
                    return null;
                }
                try {
                    C9105l c9105lAppmetrica = C9105l.appmetrica((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
                    if (c9105lAppmetrica.premium() != 0) {
                        C18262l.ads("Only version 0 parameters are accepted");
                        return null;
                    }
                    C10023l c10023lLoadAd = C2385l.loadAd();
                    c10023lLoadAd.m2830private(c9105lAppmetrica.signatures());
                    c10023lLoadAd.f20418l = AbstractC3105l.remoteconfig((C9358l) c12418l.f24521l);
                    return c10023lLoadAd.metrica();
                } catch (C2297l e4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e4);
                }
            default:
                String str5 = (String) c12418l.f24518l;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to AesSivParameters.parseParameters: ", str5));
                    return null;
                }
                try {
                    C0313l c0313lAppmetrica = C0313l.appmetrica((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
                    if (c0313lAppmetrica.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C0458l c0458lLoadAd = C18563l.loadAd();
                    c0458lLoadAd.m550for(c0313lAppmetrica.signatures());
                    c0458lLoadAd.f1690l = AbstractC13234l.yandex((C9358l) c12418l.f24521l);
                    return c0458lLoadAd.ads();
                } catch (C2297l e5) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e5);
                }
        }
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) throws GeneralSecurityException {
        switch (this.f28119l) {
            case 3:
                C1778l c1778l = (C1778l) abstractC6968l;
                C5237l c5237lInmobi = C4321l.inmobi();
                C13889l c13889lM4189throws = C16626l.m4189throws();
                C15994l c15994lApplovin = C15586l.applovin();
                int i = c1778l.admob.crashlytics;
                c15994lApplovin.purchase();
                C15586l.isVip((C15586l) c15994lApplovin.f19242l, i);
                C15586l c15586l = (C15586l) c15994lApplovin.yandex();
                c13889lM4189throws.purchase();
                C16626l.signatures((C16626l) c13889lM4189throws.f19242l, c15586l);
                byte[] bArrLoadAd = ((C0346l) c1778l.subs.f16631l).loadAd();
                C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
                c13889lM4189throws.purchase();
                C16626l.isVip((C16626l) c13889lM4189throws.f19242l, c14809lMopub);
                C16626l c16626l = (C16626l) c13889lM4189throws.yandex();
                c5237lInmobi.purchase();
                C4321l.isVip((C4321l) c5237lInmobi.f19242l, c16626l);
                C0365l c0365lM1793throws = C5469l.m1793throws();
                C8378l c8378l = c1778l.admob;
                C16152l c16152lAmazon = C9552l.amazon(c8378l);
                c0365lM1793throws.purchase();
                C5469l.signatures((C5469l) c0365lM1793throws.f19242l, c16152lAmazon);
                byte[] bArrLoadAd2 = ((C0346l) c1778l.isPro.f16631l).loadAd();
                C14809l c14809lMopub2 = AbstractC15257l.mopub(0, bArrLoadAd2.length, bArrLoadAd2);
                c0365lM1793throws.purchase();
                C5469l.isVip((C5469l) c0365lM1793throws.f19242l, c14809lMopub2);
                C5469l c5469l = (C5469l) c0365lM1793throws.yandex();
                c5237lInmobi.purchase();
                C4321l.signatures((C4321l) c5237lInmobi.f19242l, c5469l);
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C4321l) c5237lInmobi.yandex()).billing(), C18176l.f35614l, C9552l.admob(c8378l.purchase), c1778l.smaato);
            case 8:
                C14917l c14917l = (C14917l) abstractC6968l;
                C18665l c18665lInmobi = C3462l.inmobi();
                C12173l c12173lCrashlytics = AbstractC16181l.crashlytics(c14917l.admob);
                c18665lInmobi.purchase();
                C3462l.signatures((C3462l) c18665lInmobi.f19242l, c12173lCrashlytics);
                byte[] bArrLoadAd3 = ((C0346l) c14917l.subs.f16631l).loadAd();
                C14809l c14809lMopub3 = AbstractC15257l.mopub(0, bArrLoadAd3.length, bArrLoadAd3);
                c18665lInmobi.purchase();
                C3462l.isVip((C3462l) c18665lInmobi.f19242l, c14809lMopub3);
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C3462l) c18665lInmobi.yandex()).billing(), C18176l.f35614l, AbstractC16181l.admob(c14917l.admob.amazon), c14917l.firebase);
            case 13:
                C18441l c18441l = (C18441l) abstractC6968l;
                AbstractC6660l.smaato(c18441l.admob);
                C9325l c9325lApplovin = C11930l.applovin();
                byte[] bArrLoadAd4 = ((C0346l) c18441l.subs.f16631l).loadAd();
                C14809l c14809lMopub4 = AbstractC15257l.mopub(0, bArrLoadAd4.length, bArrLoadAd4);
                c9325lApplovin.purchase();
                C11930l.isVip((C11930l) c9325lApplovin.f19242l, c14809lMopub4);
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C11930l) c9325lApplovin.yandex()).billing(), C18176l.f35614l, AbstractC6660l.isPro(c18441l.admob.amazon), c18441l.firebase);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C11716l c11716l = (C11716l) abstractC6968l;
                C1175l c1175lApplovin = C6937l.applovin();
                byte[] bArrLoadAd5 = ((C0346l) c11716l.subs.f16631l).loadAd();
                C14809l c14809lMopub5 = AbstractC15257l.mopub(0, bArrLoadAd5.length, bArrLoadAd5);
                c1175lApplovin.purchase();
                C6937l.isVip((C6937l) c1175lApplovin.f19242l, c14809lMopub5);
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C6937l) c1175lApplovin.yandex()).billing(), C18176l.f35614l, AbstractC3105l.firebase(c11716l.admob.loadAd), c11716l.firebase);
            default:
                C5925l c5925l = (C5925l) abstractC6968l;
                C6510l c6510lApplovin = C14647l.applovin();
                byte[] bArrLoadAd6 = ((C0346l) c5925l.subs.f16631l).loadAd();
                C14809l c14809lMopub6 = AbstractC15257l.mopub(0, bArrLoadAd6.length, bArrLoadAd6);
                c6510lApplovin.purchase();
                C14647l.isVip((C14647l) c6510lApplovin.f19242l, c14809lMopub6);
                C14809l c14809lBilling = ((C14647l) c6510lApplovin.yandex()).billing();
                C18176l c18176l = C18176l.f35614l;
                C17162l c17162l = c5925l.admob.loadAd;
                Map map = AbstractC13234l.purchase;
                if (map.containsKey(c17162l)) {
                    return C11644l.m3137l("type.googleapis.com/google.crypto.tink.AesSivKey", c14809lBilling, c18176l, (C9358l) map.get(c17162l), c5925l.firebase);
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c17162l)));
        }
    }

    @Override // defpackage.InterfaceC9500l
    public AbstractC6968l purchase(C11644l c11644l) throws GeneralSecurityException {
        int i = 5;
        boolean z = false;
        int i2 = 24;
        switch (this.f28119l) {
            case 4:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    C8339l.metrica("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C4321l c4321lM1526throws = C4321l.m1526throws((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c4321lM1526throws.appmetrica() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (c4321lM1526throws.premium().inmobi() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (c4321lM1526throws.applovin().inmobi() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    C1424l c1424lLoadAd = C8378l.loadAd();
                    c1424lLoadAd.m933l(c4321lM1526throws.premium().applovin().size());
                    c1424lLoadAd.m928l(c4321lM1526throws.applovin().applovin().size());
                    c1424lLoadAd.m929l(c4321lM1526throws.premium().appmetrica().premium());
                    c1424lLoadAd.m930l(c4321lM1526throws.applovin().appmetrica().appmetrica());
                    c1424lLoadAd.f3604l = C9552l.mopub(c4321lM1526throws.applovin().appmetrica().applovin());
                    c1424lLoadAd.f3606l = C9552l.subs((C9358l) c11644l.f23360l);
                    C8378l c8378lAd = c1424lLoadAd.ad();
                    C10038l c10038l = new C10038l(3, z);
                    c10038l.f20462l = null;
                    c10038l.f20466l = null;
                    c10038l.f20465l = null;
                    c10038l.f20463l = c8378lAd;
                    c10038l.f20462l = new C7972l(i2, C0346l.yandex(c4321lM1526throws.premium().applovin().firebase()));
                    c10038l.f20466l = new C7972l(i2, C0346l.yandex(c4321lM1526throws.applovin().applovin().firebase()));
                    c10038l.f20465l = (Integer) c11644l.f23362l;
                    return c10038l.m2838case();
                } catch (C2297l unused) {
                    C18262l.ads("Parsing AesCtrHmacAeadKey failed");
                    return null;
                }
            case 9:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    C8339l.metrica("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C3462l c3462lM1345throws = C3462l.m1345throws((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c3462lM1345throws.appmetrica() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C12014l c12014lLoadAd = C3281l.loadAd();
                    c12014lLoadAd.m3298class(c3462lM1345throws.premium().size());
                    c12014lLoadAd.m3299continue(c3462lM1345throws.applovin().premium());
                    c12014lLoadAd.m3303interface();
                    c12014lLoadAd.f23943l = AbstractC16181l.subs((C9358l) c11644l.f23360l);
                    C3281l c3281lSubs = c12014lLoadAd.subs();
                    C18449l c18449l = new C18449l(4, z);
                    c18449l.f36009l = null;
                    c18449l.f36012l = null;
                    c18449l.f36010l = c3281lSubs;
                    c18449l.f36009l = new C7972l(i2, C0346l.yandex(c3462lM1345throws.premium().firebase()));
                    c18449l.f36012l = (Integer) c11644l.f23362l;
                    return c18449l.ad();
                } catch (C2297l unused2) {
                    C18262l.ads("Parsing AesEaxKey failed");
                    return null;
                }
            case 14:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    C8339l.metrica("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C11930l c11930lAppmetrica = C11930l.appmetrica((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c11930lAppmetrica.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C10038l c10038lLoadAd = C16816l.loadAd();
                    c10038lLoadAd.m2868while(c11930lAppmetrica.signatures().size());
                    c10038lLoadAd.m2857protected();
                    c10038lLoadAd.m2841const();
                    c10038lLoadAd.f20465l = AbstractC6660l.firebase((C9358l) c11644l.f23360l);
                    C16816l c16816lM2862switch = c10038lLoadAd.m2862switch();
                    C0554l c0554l = new C0554l();
                    c0554l.f1957l = null;
                    c0554l.f1956l = null;
                    c0554l.f1958l = c16816lM2862switch;
                    c0554l.f1957l = new C7972l(i2, C0346l.yandex(c11930lAppmetrica.signatures().firebase()));
                    c0554l.f1956l = (Integer) c11644l.f23362l;
                    return c0554l.tapsense();
                } catch (C2297l unused3) {
                    C18262l.ads("Parsing AesGcmKey failed");
                    return null;
                }
            case 20:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    C8339l.metrica("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C6937l c6937lAppmetrica = C6937l.appmetrica((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c6937lAppmetrica.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C10023l c10023lLoadAd = C2385l.loadAd();
                    c10023lLoadAd.m2830private(c6937lAppmetrica.signatures().size());
                    c10023lLoadAd.f20418l = AbstractC3105l.remoteconfig((C9358l) c11644l.f23360l);
                    C2385l c2385lMetrica = c10023lLoadAd.metrica();
                    C10111l c10111l = new C10111l(i, z);
                    c10111l.f20586l = null;
                    c10111l.f20589l = null;
                    c10111l.f20587l = c2385lMetrica;
                    c10111l.f20586l = new C7972l(i2, C0346l.yandex(c6937lAppmetrica.signatures().firebase()));
                    c10111l.f20589l = (Integer) c11644l.f23362l;
                    return c10111l.crashlytics();
                } catch (C2297l unused4) {
                    C18262l.ads("Parsing AesGcmSivKey failed");
                    return null;
                }
            default:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    C8339l.metrica("Wrong type URL in call to AesSivParameters.parseParameters");
                    return null;
                }
                try {
                    C14647l c14647lAppmetrica = C14647l.appmetrica((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c14647lAppmetrica.premium() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C0458l c0458lLoadAd = C18563l.loadAd();
                    c0458lLoadAd.m550for(c14647lAppmetrica.signatures().size());
                    c0458lLoadAd.f1690l = AbstractC13234l.yandex((C9358l) c11644l.f23360l);
                    C18563l c18563lAds = c0458lLoadAd.ads();
                    C18449l c18449l2 = new C18449l(i, z);
                    c18449l2.f36009l = null;
                    c18449l2.f36012l = null;
                    c18449l2.f36010l = c18563lAds;
                    c18449l2.f36009l = new C7972l(i2, C0346l.yandex(c14647lAppmetrica.signatures().firebase()));
                    c18449l2.f36012l = (Integer) c11644l.f23362l;
                    return c18449l2.advert();
                } catch (C2297l unused5) {
                    C18262l.ads("Parsing AesSivKey failed");
                    return null;
                }
        }
    }

    public Cipher yandex() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) AbstractC4204l.yandex.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }
}
