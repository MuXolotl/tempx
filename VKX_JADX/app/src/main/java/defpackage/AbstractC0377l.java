package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: renamed from: lًؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0377l {
    public static final C15578l yandex = new C15578l(-460802993, false, new C2834l(23));
    public static final C15578l loadAd = new C15578l(-872513748, false, new C2834l(24));
    public static final C15578l crashlytics = new C15578l(421905099, false, new C2834l(25));
    public static final C15578l amazon = new C15578l(-495423624, false, new C2834l(26));
    public static final C15578l purchase = new C15578l(-1012467947, false, new C2834l(27));
    public static final C15578l billing = new C15578l(1678495476, false, new C2834l(28));
    public static final C15578l mopub = new C15578l(1643284633, false, new C11112l(12));

    public static int admob(String str) {
        try {
            Map map = ResourceProvider.yandex;
            Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
            if (num != null) {
                return num.intValue();
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return 0;
    }

    public static void amazon(C0639l c0639l, C5065l c5065l, C0327l c0327l, InterfaceC18212l interfaceC18212l, C12983l c12983l, boolean z, InterfaceC4005l interfaceC4005l) {
        C8896l c8896lLoadAd;
        if (z) {
            int iAdmob = interfaceC4005l.admob(C12814l.billing(c0639l.loadAd));
            String str = AbstractC3618l.yandex;
            if (iAdmob < c0327l.yandex.yandex.f7563l.length()) {
                c8896lLoadAd = c0327l.loadAd(iAdmob);
            } else {
                c8896lLoadAd = iAdmob != 0 ? c0327l.loadAd(iAdmob - 1) : new C8896l(0.0f, 0.0f, 1.0f, (int) (AbstractC3618l.yandex(c5065l.loadAd, c5065l.mopub, c5065l.admob) & 4294967295L));
            }
            float f = c8896lLoadAd.loadAd;
            float f2 = c8896lLoadAd.yandex;
            long jMo2591strictfp = interfaceC18212l.mo2591strictfp((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            C8896l c8896lIsPro = AbstractC7470l.isPro((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo2591strictfp & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo2591strictfp >> 32)))) << 32), (((long) Float.floatToRawIntBits(c8896lLoadAd.crashlytics - f2)) << 32) | (((long) Float.floatToRawIntBits(c8896lLoadAd.amazon - f)) & 4294967295L));
            if (AbstractC8576l.yandex((C12983l) c12983l.yandex.loadAd.get(), c12983l)) {
                c12983l.loadAd.admob(c8896lIsPro);
            }
        }
    }

    public static int crashlytics(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        return 336000;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static void loadAd(String str, boolean z) throws C17655l {
        if (!z) {
            throw C17655l.yandex(null, str);
        }
    }

    public abstract void billing();

    public abstract void mopub();

    public boolean yandex() {
        return false;
    }

    public void purchase() {
    }
}
