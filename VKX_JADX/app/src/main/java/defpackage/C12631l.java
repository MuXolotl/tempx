package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lّٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12631l {
    public static final BigInteger amazon = BigInteger.valueOf(2);
    public SecureRandom crashlytics;
    public int loadAd;
    public int yandex;

    public final C2396l yandex() {
        BigInteger[] bigIntegerArrYandex = AbstractC0586l.yandex(this.yandex, this.loadAd, this.crashlytics);
        BigInteger bigInteger = bigIntegerArrYandex[0];
        return new C2396l(bigInteger, AbstractC0586l.loadAd(bigInteger, this.crashlytics), bigIntegerArrYandex[1], 160, 0, amazon, null);
    }
}
