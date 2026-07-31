package defpackage;

/* JADX INFO: renamed from: lُؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0234l {
    public static final C7912l amazon;
    public static final C3322l crashlytics;
    public static final C0882l purchase;
    public static final C13911l yandex = new C13911l(C11153l.class, InterfaceC11416l.class, new C18262l(23));
    public static final C13911l loadAd = new C13911l(C4822l.class, InterfaceC10634l.class, new C18262l(24));

    static {
        C18208l.m4500synchronized();
        crashlytics = new C3322l("type.googleapis.com/google.crypto.tink.HpkePrivateKey", InterfaceC11416l.class, EnumC17341l.ASYMMETRIC_PRIVATE);
        C6833l.m2076strictfp();
        amazon = new C7912l("type.googleapis.com/google.crypto.tink.HpkePublicKey", InterfaceC10634l.class, EnumC17341l.ASYMMETRIC_PUBLIC);
        purchase = new C0882l(9);
    }
}
