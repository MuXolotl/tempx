package defpackage;

import java.io.Serializable;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: lٕٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15788l {
    public static final C15578l yandex = new C15578l(-708670039, false, new C13982l(26));
    public static final C15578l loadAd = new C15578l(-1894194520, false, new C13982l(27));
    public static final C15578l crashlytics = new C15578l(96626318, false, new C13982l(28));
    public static final C15578l amazon = new C15578l(1729524047, false, new C13982l(29));
    public static final C15578l purchase = new C15578l(-996645297, false, new C2464l(6));
    public static final C15578l billing = new C15578l(1509045451, false, new C2464l(7));
    public static final C15578l mopub = new C15578l(953263671, false, new C2464l(8));
    public static final C15578l admob = new C15578l(-1220209853, false, new C2464l(9));
    public static final C15578l subs = new C15578l(-1473050393, false, new C5142l(0));

    public static final C9959l amazon(C2312l c2312l, InterfaceC1388l interfaceC1388l) {
        return new C9959l(interfaceC1388l, c2312l.yandex.yandex, new C8753l(interfaceC1388l, c2312l), new C8753l(c2312l, interfaceC1388l));
    }

    public static final void crashlytics(CharsetEncoder charsetEncoder, C18476l c18476l, CharSequence charSequence, int i, int i2) {
        if (i >= i2) {
            return;
        }
        do {
            byte[] bArrLoadAd = AbstractC17082l.loadAd(charsetEncoder, charSequence, i, i2);
            c18476l.write(bArrLoadAd, 0, bArrLoadAd.length);
            int length = bArrLoadAd.length;
            if (length < 0) {
                C8339l.smaato("Check failed.");
                return;
            }
            i += length;
        } while (i < i2);
    }

    public static final String loadAd(CharsetDecoder charsetDecoder, InterfaceC14189l interfaceC14189l) {
        StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, interfaceC14189l.crashlytics().f36079l));
        if (AbstractC8576l.yandex(charsetDecoder.charset(), AbstractC9050l.yandex)) {
            sb.append((CharSequence) AbstractC17291l.mopub(interfaceC14189l));
        } else {
            long j = interfaceC14189l.crashlytics().f36079l;
            sb.append((CharSequence) new String(AbstractC10733l.subs(interfaceC14189l, -1), charsetDecoder.charset()));
        }
        return sb.toString();
    }

    public static InterfaceC11766l purchase(InterfaceC11766l interfaceC11766l) {
        if ((interfaceC11766l instanceof C11448l) || (interfaceC11766l instanceof C6502l)) {
            return interfaceC11766l;
        }
        return interfaceC11766l instanceof Serializable ? new C6502l(interfaceC11766l) : new C11448l(interfaceC11766l);
    }

    public static final InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l, float f) {
        return f == 1.0f ? interfaceC17242l : AbstractC7477l.crashlytics(interfaceC17242l, 0.0f, 0.0f, f, 0.0f, 0.0f, null, true, 1044475);
    }
}
