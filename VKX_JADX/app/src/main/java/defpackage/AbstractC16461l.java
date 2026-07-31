package defpackage;

/* JADX INFO: renamed from: lٖٜٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16461l {
    public static final C7912l amazon;
    public static final C3322l crashlytics;
    public static final C0882l purchase;
    public static final C13911l yandex = new C13911l(C5523l.class, InterfaceC11416l.class, new C17132l(17));
    public static final C13911l loadAd = new C13911l(C5454l.class, InterfaceC10634l.class, new C17132l(18));

    static {
        C11559l.m3132synchronized();
        crashlytics = new C3322l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", InterfaceC11416l.class, EnumC17341l.ASYMMETRIC_PRIVATE);
        C0413l.m514native();
        amazon = new C7912l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", InterfaceC10634l.class, EnumC17341l.ASYMMETRIC_PUBLIC);
        purchase = new C0882l(7);
    }
}
