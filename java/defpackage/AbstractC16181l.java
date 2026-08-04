package defpackage;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٖؕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16181l {
    public static final C4733l yandex = new C4733l(C3281l.class, new C14377l(6));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.AesEaxKey", new C14377l(7));
    public static final C5773l crashlytics = new C5773l(C14917l.class, new C14377l(8));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.AesEaxKey", new C14377l(9));
    public static final String[] purchase = {"ru", "ua", "en", "pt", "kz"};
    public static String billing = "";
    public static String mopub = "en";

    public static C9358l admob(C17927l c17927l) {
        if (c17927l.equals(C17927l.crashlytics)) {
            return C9358l.crashlytics;
        }
        if (c17927l == C17927l.amazon) {
            return C9358l.billing;
        }
        if (c17927l == C17927l.purchase) {
            return C9358l.purchase;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c17927l)));
    }

    public static final long amazon(long j) {
        if (j < 0) {
            C6760l c6760l = C9658l.f19699l;
            return C9658l.f19701l;
        }
        C6760l c6760l2 = C9658l.f19699l;
        return C9658l.f19698l;
    }

    public static String billing(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (j2 - timeUnit.toMillis(j3)) / 60000;
        long millis2 = j2 - timeUnit.toMillis(j3);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long millis3 = (millis2 - timeUnit2.toMillis(millis)) / 1000;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j3), Long.valueOf(millis), Long.valueOf(millis3), Long.valueOf(((j2 - timeUnit.toMillis(j3)) - timeUnit2.toMillis(millis)) - TimeUnit.SECONDS.toMillis(millis3)));
    }

    public static C12173l crashlytics(C3281l c3281l) {
        if (c3281l.crashlytics != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c3281l.crashlytics)));
        }
        C18378l c18378lApplovin = C12173l.applovin();
        int i = c3281l.loadAd;
        c18378lApplovin.purchase();
        C12173l.isVip((C12173l) c18378lApplovin.f19242l, i);
        return (C12173l) c18378lApplovin.yandex();
    }

    public static void isPro(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static int loadAd() {
        ClassLoader classLoader = AbstractC16181l.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream == null) {
            C8339l.smaato("Car API level file car-app-api.level not found");
            return 0;
        }
        try {
            String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int i = Integer.parseInt(line);
            if (i >= 1 && i <= 8) {
                return i;
            }
            throw new IllegalStateException("Unrecognized Car API level: " + line);
        } catch (IOException unused) {
            C8339l.smaato("Unable to read Car API level file");
            return 0;
        }
    }

    public static final long mopub(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        EnumC16636l enumC16636l = EnumC16636l.NANOSECONDS;
        if (j4 >= 0) {
            return AbstractC15918l.Signature(j3, enumC16636l);
        }
        EnumC16636l enumC16636l2 = EnumC16636l.MILLISECONDS;
        if (enumC16636l.compareTo(enumC16636l2) >= 0) {
            return C9658l.isPro(amazon(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        C6760l c6760l = C9658l.f19699l;
        return C9658l.mopub(AbstractC15918l.Signature(j5, enumC16636l2), AbstractC15918l.Signature(j6, enumC16636l));
    }

    public static final AbstractC18072l purchase(AbstractC18072l abstractC18072l, AbstractC18072l abstractC18072l2, float f) {
        abstractC18072l.getClass();
        abstractC18072l2.getClass();
        float fFirebase = AbstractC7572l.firebase(C17821l.yandex(0L), C17821l.yandex(0L), f);
        float fFirebase2 = AbstractC7572l.firebase(C17821l.loadAd(0L), C17821l.loadAd(0L), f);
        Float.floatToRawIntBits(fFirebase);
        Float.floatToRawIntBits(fFirebase2);
        AbstractC12953l.remoteconfig(0L, 0L, f);
        throw null;
    }

    public static C17927l subs(C9358l c9358l) throws GeneralSecurityException {
        C17927l c17927l = C17927l.amazon;
        if (c9358l == C9358l.crashlytics) {
            return C17927l.crashlytics;
        }
        if (c9358l == C9358l.billing || c9358l == C9358l.amazon) {
            return c17927l;
        }
        if (c9358l == C9358l.purchase) {
            return C17927l.purchase;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }

    public static String yandex(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int iPosition = byteBuffer.position();
        try {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < iRemaining; i++) {
                sb.append(String.format("%02X ", Byte.valueOf(bArr[i])));
            }
            return sb.toString().trim();
        } finally {
            byteBuffer.position(iPosition);
        }
    }
}
