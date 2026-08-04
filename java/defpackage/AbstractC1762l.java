package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lَٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1762l {
    public static final C15578l yandex = new C15578l(-1035853807, false, new C10721l(17));

    public static final InterfaceC16588l amazon(AbstractC13151l abstractC13151l, InterfaceC17739l interfaceC17739l, Object obj) {
        InterfaceC16588l interfaceC16588lMopub = abstractC13151l.mopub(interfaceC17739l, obj);
        if (interfaceC16588lMopub != null) {
            return interfaceC16588lMopub;
        }
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(obj.getClass());
        InterfaceC1388l interfaceC1388lAdmob = abstractC13151l.admob();
        String strLicense = interfaceC1388lLoadAd.license();
        if (strLicense == null) {
            strLicense = String.valueOf(interfaceC1388lLoadAd);
        }
        AbstractC11784l.purchase(interfaceC1388lAdmob, strLicense);
        throw null;
    }

    public static final InterfaceC16588l crashlytics(AbstractC13151l abstractC13151l, InterfaceC14988l interfaceC14988l, String str) {
        InterfaceC16588l interfaceC16588lBilling = abstractC13151l.billing(interfaceC14988l, str);
        if (interfaceC16588lBilling != null) {
            return interfaceC16588lBilling;
        }
        AbstractC11784l.purchase(abstractC13151l.admob(), str);
        throw null;
    }

    public static byte loadAd(long j) {
        AbstractC12442l.billing(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static boolean purchase(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static Object yandex(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
