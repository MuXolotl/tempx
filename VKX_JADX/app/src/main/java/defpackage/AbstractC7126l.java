package defpackage;

/* JADX INFO: renamed from: lًُؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7126l {
    public static final C13372l amazon;
    public static final int billing;
    public static final C7912l crashlytics;
    public static final C0882l purchase;
    public static final C13911l yandex = new C13911l(C12785l.class, C8375l.class, new C18262l(17));
    public static final C13911l loadAd = new C13911l(C12785l.class, InterfaceC1218l.class, new C18262l(18));

    static {
        C5469l.m1792synchronized();
        crashlytics = new C7912l("type.googleapis.com/google.crypto.tink.HmacKey", InterfaceC1218l.class, EnumC17341l.SYMMETRIC);
        amazon = new C13372l();
        purchase = new C0882l(8);
        billing = 2;
    }
}
