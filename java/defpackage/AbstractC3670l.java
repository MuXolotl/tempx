package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؕۜۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3670l {
    public static final C15578l yandex = new C15578l(-1418460802, false, new C7614l(10));
    public static final C15578l loadAd = new C15578l(-2128356513, false, new C7614l(11));

    public static final boolean amazon(C17289l c17289l) {
        String str = c17289l.f33556l;
        return str.equals("https") || str.equals("wss");
    }

    public static final String billing(InterfaceC18035l interfaceC18035l) {
        return AbstractC16901l.m4210case(AbstractC8576l.adcel(0, interfaceC18035l.mopub()), ", ", interfaceC18035l.yandex() + '(', ")", new C8250l(21, interfaceC18035l), 24);
    }

    public static final int crashlytics(InterfaceC18035l interfaceC18035l, InterfaceC18035l[] interfaceC18035lArr) {
        int iHashCode = (interfaceC18035l.yandex().hashCode() * 31) + Arrays.hashCode(interfaceC18035lArr);
        int iMopub = interfaceC18035l.mopub();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMopub > 0)) {
                break;
            }
            int i2 = iMopub - 1;
            int i3 = i * 31;
            String strYandex = interfaceC18035l.isPro(interfaceC18035l.mopub() - iMopub).yandex();
            if (strYandex != null) {
                iHashCode2 = strYandex.hashCode();
            }
            i = i3 + iHashCode2;
            iMopub = i2;
        }
        int iMopub2 = interfaceC18035l.mopub();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMopub2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMopub2 - 1;
            int i5 = iHashCode3 * 31;
            AbstractC2021l abstractC2021lBilling = interfaceC18035l.isPro(interfaceC18035l.mopub() - iMopub2).billing();
            iHashCode3 = i5 + (abstractC2021lBilling != null ? abstractC2021lBilling.hashCode() : 0);
            iMopub2 = i4;
        }
    }

    public static C3844l loadAd(String str) {
        C3844l c3844l = new C3844l(str.getBytes(AbstractC9050l.yandex));
        c3844l.f7951l = str;
        return c3844l;
    }

    public static final boolean purchase(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static C3844l yandex(String str) {
        if (str.length() % 2 != 0) {
            C10754l.metrica("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC18648l.yandex(str.charAt(i2 + 1)) + (AbstractC18648l.yandex(str.charAt(i2)) << 4));
        }
        return new C3844l(bArr);
    }
}
