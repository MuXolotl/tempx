package defpackage;

import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: lُؐٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10754l implements InterfaceC6384l, InterfaceC16004l, InterfaceC15372l, InterfaceC6351l, InterfaceC15535l, InterfaceC12365l, InterfaceC9500l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21787l;

    public /* synthetic */ C10754l(int i) {
        this.f21787l = i;
    }

    public static /* synthetic */ void Signature(Object obj) {
        throw new RuntimeException(obj.toString());
    }

    public static /* synthetic */ void ad(String str) {
        throw new C10314l(str);
    }

    public static /* synthetic */ void adcel(Object obj, String str) throws CertificateParsingException {
        throw new CertificateParsingException(str + obj);
    }

    public static /* synthetic */ void ads(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isPro(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void license(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void metrica(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void pro(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void remoteconfig(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void smaato(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void startapp(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void subscription(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void tapsense(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.InterfaceC15372l
    public Object admob(AbstractC6968l abstractC6968l) throws GeneralSecurityException {
        switch (this.f21787l) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C2846l c2846l = (C2846l) abstractC6968l;
                int i = c2846l.admob.loadAd;
                if (i >= 8 && i <= 12) {
                    return new C7216l(((C0346l) c2846l.subs.f16631l).loadAd(), c2846l.isPro, c2846l.admob.loadAd);
                }
                C18262l.ads("invalid salt size");
                return null;
            default:
                C11041l c11041l = (C11041l) abstractC6968l;
                try {
                    C2254l.crashlytics();
                    return new C15088l(((C0346l) c11041l.subs.f16631l).loadAd(), c11041l.isPro.loadAd(), C2254l.crashlytics().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C1918l(((C0346l) c11041l.subs.f16631l).loadAd(), 4, c11041l.isPro.loadAd());
                }
        }
    }

    @Override // defpackage.InterfaceC6351l
    public C12418l amazon(AbstractC3302l abstractC3302l) {
        switch (this.f21787l) {
            case 20:
                C13618l c13618l = (C13618l) abstractC3302l;
                C9358l c9358lSmaato = AbstractC3308l.smaato(c13618l.yandex);
                C7952l c7952lApplovin = C8438l.applovin();
                C10591l c10591lApplovin = C2596l.applovin();
                int i = c13618l.loadAd;
                c10591lApplovin.purchase();
                C2596l.isVip((C2596l) c10591lApplovin.f19242l, i);
                C2596l c2596l = (C2596l) c10591lApplovin.yandex();
                c7952lApplovin.purchase();
                C8438l.isVip((C8438l) c7952lApplovin.f19242l, c2596l);
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.XAesGcmKey", c9358lSmaato, ((C8438l) c7952lApplovin.yandex()).billing());
            default:
                return C12418l.metrica("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", AbstractC8532l.isPro(((C10441l) abstractC3302l).yandex), C1529l.isVip().billing());
        }
    }

    @Override // defpackage.InterfaceC16004l
    /* JADX INFO: renamed from: apply */
    public Object mo1368apply(Object obj) {
        C13152l c13152l;
        long j;
        long jLoadAd;
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            C7242l c7242l = (C7242l) it.next();
            List list2 = c7242l.adcel;
            EnumC9176l enumC9176l = c7242l.loadAd;
            C4279l c4279l = !list2.isEmpty() ? (C4279l) list2.get(0) : C4279l.loadAd;
            UUID uuidFromString = UUID.fromString(c7242l.yandex);
            HashSet hashSet = new HashSet(c7242l.startapp);
            C4279l c4279l2 = c7242l.crashlytics;
            int i = c7242l.admob;
            int i2 = c7242l.remoteconfig;
            C13152l c13152l2 = c7242l.mopub;
            long j2 = c7242l.amazon;
            ArrayList arrayList2 = arrayList;
            long j3 = c7242l.purchase;
            C1364l c1364l = j3 != 0 ? new C1364l(j3, c7242l.billing) : null;
            EnumC9176l enumC9176l2 = EnumC9176l.f18878l;
            if (enumC9176l == enumC9176l2) {
                C10754l c10754l = C7718l.isVip;
                j = j2;
                c13152l = c13152l2;
                jLoadAd = AbstractC15096l.loadAd(enumC9176l == enumC9176l2 && i > 0, i, c7242l.subs, c7242l.isPro, c7242l.firebase, c7242l.smaato, j3 != 0, j, c7242l.billing, j3, c7242l.vip);
            } else {
                i2 = i2;
                c13152l = c13152l2;
                j = j2;
                i = i;
                jLoadAd = Long.MAX_VALUE;
            }
            arrayList2.add(new C4365l(uuidFromString, enumC9176l, hashSet, c4279l2, c4279l, i, i2, c13152l, j, c1364l, jLoadAd, c7242l.metrica));
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC15535l
    public AbstractC3302l billing(C12418l c12418l) throws GeneralSecurityException {
        C1693l c1693l;
        switch (this.f21787l) {
            case 21:
                String str = (String) c12418l.f24518l;
                if (!str.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    C8438l c8438lAppmetrica = C8438l.appmetrica((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
                    if (c8438lAppmetrica.premium() != 0) {
                        C18262l.ads("Only version 0 parameters are accepted");
                        return null;
                    }
                    C9358l c9358l = (C9358l) c12418l.f24521l;
                    if (c9358l == C9358l.crashlytics) {
                        c1693l = C1693l.f4071l;
                    } else {
                        if (c9358l != C9358l.purchase) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
                        }
                        c1693l = C1693l.f4076l;
                    }
                    return C13618l.loadAd(c1693l, c8438lAppmetrica.signatures().premium());
                } catch (C2297l e) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
                }
            default:
                String str2 = (String) c12418l.f24518l;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    if (C1529l.premium((AbstractC15257l) c12418l.f24519l, C7597l.yandex()).signatures() == 0) {
                        return new C10441l(AbstractC8532l.firebase((C9358l) c12418l.f24521l));
                    }
                    C18262l.ads("Only version 0 parameters are accepted");
                    return null;
                } catch (C2297l e2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
                }
        }
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) {
        switch (this.f21787l) {
            case 22:
                C2846l c2846l = (C2846l) abstractC6968l;
                C11005l c11005lInmobi = C1107l.inmobi();
                byte[] bArrLoadAd = ((C0346l) c2846l.subs.f16631l).loadAd();
                C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
                c11005lInmobi.purchase();
                C1107l.isVip((C1107l) c11005lInmobi.f19242l, c14809lMopub);
                C10591l c10591lApplovin = C2596l.applovin();
                C13618l c13618l = c2846l.admob;
                int i = c13618l.loadAd;
                c10591lApplovin.purchase();
                C2596l.isVip((C2596l) c10591lApplovin.f19242l, i);
                C2596l c2596l = (C2596l) c10591lApplovin.yandex();
                c11005lInmobi.purchase();
                C1107l.signatures((C1107l) c11005lInmobi.f19242l, c2596l);
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((C1107l) c11005lInmobi.yandex()).billing(), C18176l.f35614l, AbstractC3308l.smaato(c13618l.yandex), c2846l.firebase);
            default:
                C11041l c11041l = (C11041l) abstractC6968l;
                C7451l c7451lApplovin = C2968l.applovin();
                byte[] bArrLoadAd2 = ((C0346l) c11041l.subs.f16631l).loadAd();
                C14809l c14809lMopub2 = AbstractC15257l.mopub(0, bArrLoadAd2.length, bArrLoadAd2);
                c7451lApplovin.purchase();
                C2968l.isVip((C2968l) c7451lApplovin.f19242l, c14809lMopub2);
                return C11644l.m3137l("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((C2968l) c7451lApplovin.yandex()).billing(), C18176l.f35614l, AbstractC8532l.isPro(c11041l.admob.yandex), c11041l.firebase);
        }
    }

    @Override // defpackage.InterfaceC9500l
    public AbstractC6968l purchase(C11644l c11644l) throws GeneralSecurityException {
        C1693l c1693l;
        int i = 24;
        switch (this.f21787l) {
            case 23:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    C8339l.metrica("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C1107l c1107lM816throws = C1107l.m816throws((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c1107lM816throws.appmetrica() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (c1107lM816throws.premium().size() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    C9358l c9358l = (C9358l) c11644l.f23360l;
                    if (c9358l == C9358l.crashlytics) {
                        c1693l = C1693l.f4071l;
                    } else {
                        if (c9358l != C9358l.purchase) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
                        }
                        c1693l = C1693l.f4076l;
                    }
                    return C2846l.isPro(C13618l.loadAd(c1693l, c1107lM816throws.applovin().premium()), new C7972l(i, C0346l.yandex(c1107lM816throws.premium().firebase())), (Integer) c11644l.f23362l);
                } catch (C2297l unused) {
                    C18262l.ads("Parsing XAesGcmKey failed");
                    return null;
                }
            default:
                if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    C8339l.metrica("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C2968l c2968lAppmetrica = C2968l.appmetrica((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
                    if (c2968lAppmetrica.premium() == 0) {
                        return C11041l.isPro(AbstractC8532l.firebase((C9358l) c11644l.f23360l), new C7972l(i, C0346l.yandex(c2968lAppmetrica.signatures().firebase())), (Integer) c11644l.f23362l);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C2297l unused2) {
                    C18262l.ads("Parsing XChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }

    @Override // defpackage.InterfaceC6384l
    public InterfaceC14833l[] vip(Uri uri, Map map) {
        return new C15843l[]{new C15843l(0)};
    }

    @Override // defpackage.InterfaceC6384l
    public InterfaceC6384l firebase(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC6384l
    public InterfaceC6384l loadAd(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC6384l
    public InterfaceC6384l yandex(C8565l c8565l) {
        return this;
    }
}
