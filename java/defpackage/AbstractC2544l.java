package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: lُؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2544l {
    public static final C0882l amazon;
    public static final C13372l crashlytics;
    public static final C7912l loadAd;
    public static final C13911l yandex = new C13911l(C5925l.class, InterfaceC10135l.class, new C14377l(21));

    static {
        C14647l.inmobi();
        loadAd = new C7912l("type.googleapis.com/google.crypto.tink.AesSivKey", InterfaceC10135l.class, EnumC17341l.SYMMETRIC);
        crashlytics = new C13372l();
        amazon = new C0882l(5);
    }

    public static void yandex(C18563l c18563l) {
        if (c18563l.yandex != 64) {
            throw new InvalidAlgorithmParameterException(AbstractC15560l.tapsense("invalid key size: ", c18563l.yandex, ". Valid keys must have 64 bytes."));
        }
    }
}
