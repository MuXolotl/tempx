package defpackage;

import android.media.MediaFormat;
import android.view.DragEvent;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: lؒؖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0837l {
    public static final C15578l yandex = new C15578l(1613843517, false, new C2039l(15));
    public static final C15578l loadAd = new C15578l(265709947, false, new C2039l(17));
    public static final C15578l crashlytics = new C15578l(-277965290, false, new C4606l(17));
    public static final C15578l amazon = new C15578l(-1950876506, false, new C4606l(18));
    public static final C15578l purchase = new C15578l(-1652936519, false, new C4606l(19));
    public static final C15578l billing = new C15578l(485483866, false, new C4606l(20));
    public static final C15578l mopub = new C15578l(1669529987, false, new C4606l(21));
    public static final C15578l admob = new C15578l(-617972372, false, new C4606l(22));
    public static final C15578l subs = new C15578l(720519883, false, new C4606l(24));
    public static final C15578l isPro = new C15578l(836686952, false, new C4606l(25));
    public static final C15578l firebase = new C15578l(2059012138, false, new C4606l(23));
    public static final C15578l smaato = new C15578l(-2119788089, false, new C4606l(26));
    public static final C15578l remoteconfig = new C15578l(-897462903, false, new C4606l(27));
    public static final C15578l vip = new C15578l(-1546357882, false, new C2039l(18));
    public static final C15578l metrica = new C15578l(1130626628, false, new C2039l(19));
    public static final C15578l startapp = new C15578l(-1825848413, false, new C2039l(20));
    public static final C15578l adcel = new C15578l(-487356158, false, new C2039l(21));
    public static final C15578l ads = new C15578l(-1661211768, false, new C2039l(22));
    public static final C15578l subscription = new C15578l(-1799732444, false, new C4606l(28));
    public static final C15578l tapsense = new C15578l(-1940702299, false, new C2039l(16));
    public static final C15578l Signature = new C15578l(877252066, false, new C4606l(15));
    public static final C15578l license = new C15578l(-2079222975, false, new C4606l(16));

    public static void billing(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC0653l.vip(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static final C12876l crashlytics(C13146l c13146l, InterfaceC3588l interfaceC3588l, C14965l c14965l, boolean z, boolean z2, boolean z3) {
        C10459l c10459l = (C10459l) AbstractC0714l.loadAd(c13146l, AbstractC8450l.amazon);
        if (c10459l != null) {
            if (z) {
                C3429l c3429l = C11682l.yandex;
                C10728l c10728lLoadAd = C11682l.loadAd(c13146l, interfaceC3588l, c14965l, z3);
                if (c10728lLoadAd != null) {
                    return AbstractC12754l.yandex(c10728lLoadAd);
                }
            } else if (z2 && (c10459l.f21279l & 2) == 2) {
                C6431l c6431l = c10459l.f21282l;
                return new C12876l(interfaceC3588l.getString(c6431l.f13452l).concat(interfaceC3588l.getString(c6431l.f13456l)));
            }
        }
        return null;
    }

    public static final long loadAd(C1323l c1323l) {
        DragEvent dragEvent = c1323l.yandex;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static void purchase(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static String yandex() {
        return AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 117, 116, 104, 111, 114, 105, 122, 97, 116, 105, 111, 110});
    }
}
