package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.EOFException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.List;

/* JADX INFO: renamed from: lؚؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3010l implements InterfaceC15372l, InterfaceC6351l, InterfaceC15535l, InterfaceC12365l, InterfaceC9500l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6528l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3010l f6525l = new C3010l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C3010l f6524l = new C3010l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C3010l f6527l = new C3010l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C3010l f6526l = new C3010l(3);

    public /* synthetic */ C3010l(int i) {
        this.f6528l = i;
    }

    public static /* synthetic */ void firebase(Object obj, String str) throws Cthrows {
        throw new Cthrows(str + obj);
    }

    public static /* synthetic */ void isPro(int i, int i2, Object obj, String str) throws IOException {
        throw new IOException(str + i + obj + i2);
    }

    public static /* synthetic */ void mopub() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void subs(int i, int i2) throws EOFException {
        throw new EOFException("DEF length " + i + ((Object) " object truncated by ") + i2);
    }

    @Override // defpackage.InterfaceC15372l
    public Object admob(AbstractC6968l abstractC6968l) throws GeneralSecurityException {
        switch (this.f6528l) {
            case 23:
                C0624l c0624l = (C0624l) abstractC6968l;
                C2782l c2782l = C2782l.f6068l;
                C11644l c11644l = c0624l.admob;
                C0624l.isPro(c11644l, c2782l);
                return new C1918l((InterfaceC13883l) ((C7912l) C16365l.amazon.yandex(InterfaceC13883l.class, (String) c11644l.f23358l)).yandex((AbstractC15257l) c11644l.f23357l), AbstractC15901l.billing((C9358l) c11644l.f23360l, (Integer) c0624l.admob.f23362l).loadAd());
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C6533l c6533l = (C6533l) abstractC6968l;
                if (c6533l.admob.yandex != 32) {
                    C18262l.ads("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                if (!AbstractC12589l.pro(1)) {
                    C18262l.ads("Cannot use AES-CMAC in FIPS-mode.");
                    return null;
                }
                Provider providerMopub = AbstractC17764l.mopub();
                if (providerMopub != null) {
                    try {
                        return C8375l.yandex(c6533l, providerMopub);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                return new C8375l();
            default:
                C6533l c6533l2 = (C6533l) abstractC6968l;
                if (c6533l2.admob.yandex == 32) {
                    return new C18313l(c6533l2);
                }
                C18262l.ads("AesCmacKey size wrong, must be 32 bytes");
                return null;
        }
    }

    @Override // defpackage.InterfaceC6351l
    public C12418l amazon(AbstractC3302l abstractC3302l) {
        C6023l c6023l = (C6023l) abstractC3302l;
        C9358l c9358lIsPro = AbstractC3483l.isPro(c6023l.crashlytics);
        C3574l c3574lAppmetrica = C16512l.appmetrica();
        C11087l c11087lApplovin = C14150l.applovin();
        int i = c6023l.loadAd;
        c11087lApplovin.purchase();
        C14150l.isVip((C14150l) c11087lApplovin.f19242l, i);
        C14150l c14150l = (C14150l) c11087lApplovin.yandex();
        c3574lAppmetrica.purchase();
        C16512l.signatures((C16512l) c3574lAppmetrica.f19242l, c14150l);
        int i2 = c6023l.yandex;
        c3574lAppmetrica.purchase();
        C16512l.isVip((C16512l) c3574lAppmetrica.f19242l, i2);
        return C12418l.metrica("type.googleapis.com/google.crypto.tink.AesCmacKey", c9358lIsPro, ((C16512l) c3574lAppmetrica.yandex()).billing());
    }

    @Override // defpackage.InterfaceC15535l
    public AbstractC3302l billing(C12418l c12418l) throws GeneralSecurityException {
        String str = (String) c12418l.f24518l;
        if (!str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            C16512l c16512lInmobi = C16512l.inmobi((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
            C10111l c10111lLoadAd = C6023l.loadAd();
            c10111lLoadAd.m2882private(c16512lInmobi.premium());
            c10111lLoadAd.m2879extends(c16512lInmobi.applovin().premium());
            c10111lLoadAd.f20589l = AbstractC3483l.firebase((C9358l) c12418l.f24521l);
            return c10111lLoadAd.loadAd();
        } catch (C2297l e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) {
        C6533l c6533l = (C6533l) abstractC6968l;
        C17737l c17737lInmobi = C14803l.inmobi();
        C6023l c6023l = c6533l.admob;
        C11087l c11087lApplovin = C14150l.applovin();
        int i = c6023l.loadAd;
        c11087lApplovin.purchase();
        C14150l.isVip((C14150l) c11087lApplovin.f19242l, i);
        C14150l c14150l = (C14150l) c11087lApplovin.yandex();
        c17737lInmobi.purchase();
        C14803l.signatures((C14803l) c17737lInmobi.f19242l, c14150l);
        byte[] bArrLoadAd = ((C0346l) c6533l.subs.f16631l).loadAd();
        C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
        c17737lInmobi.purchase();
        C14803l.isVip((C14803l) c17737lInmobi.f19242l, c14809lMopub);
        return C11644l.m3137l("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C14803l) c17737lInmobi.yandex()).billing(), C18176l.f35614l, AbstractC3483l.isPro(c6533l.admob.crashlytics), c6533l.firebase);
    }

    @Override // defpackage.InterfaceC9500l
    public AbstractC6968l purchase(C11644l c11644l) throws GeneralSecurityException {
        if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            C8339l.metrica("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
            return null;
        }
        try {
            C14803l c14803lM3894throws = C14803l.m3894throws((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
            if (c14803lM3894throws.appmetrica() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C10111l c10111lLoadAd = C6023l.loadAd();
            c10111lLoadAd.m2882private(c14803lM3894throws.premium().size());
            c10111lLoadAd.m2879extends(c14803lM3894throws.applovin().premium());
            c10111lLoadAd.f20589l = AbstractC3483l.firebase((C9358l) c11644l.f23360l);
            C6023l c6023lLoadAd = c10111lLoadAd.loadAd();
            C0554l c0554l = new C0554l();
            c0554l.f1957l = null;
            c0554l.f1956l = null;
            c0554l.f1958l = c6023lLoadAd;
            c0554l.f1957l = new C7972l(24, C0346l.yandex(c14803lM3894throws.premium().firebase()));
            c0554l.f1956l = (Integer) c11644l.f23362l;
            return c0554l.subscription();
        } catch (IllegalArgumentException | C2297l unused) {
            C18262l.ads("Parsing AesCmacKey failed");
            return null;
        }
    }

    public List yandex(String str, boolean z, boolean z2) {
        return AbstractC4727l.purchase(str, z, z2);
    }
}
