package defpackage;

/* JADX INFO: renamed from: lؙؚؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7114l {
    public static final C9676l yandex = new C9676l("COMPLETING_ALREADY", 2);
    public static final C9676l loadAd = new C9676l("COMPLETING_WAITING_CHILDREN", 2);
    public static final C9676l crashlytics = new C9676l("COMPLETING_RETRY", 2);
    public static final C9676l amazon = new C9676l("TOO_LATE_TO_CANCEL", 2);
    public static final C9676l purchase = new C9676l("SEALED", 2);
    public static final C18124l billing = new C18124l(false);
    public static final C18124l mopub = new C18124l(true);

    public static final Object yandex(Object obj) {
        InterfaceC2541l interfaceC2541l;
        C13133l c13133l = obj instanceof C13133l ? (C13133l) obj : null;
        return (c13133l == null || (interfaceC2541l = c13133l.yandex) == null) ? obj : interfaceC2541l;
    }
}
