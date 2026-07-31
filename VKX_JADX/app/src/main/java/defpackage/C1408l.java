package defpackage;

/* JADX INFO: renamed from: lؒۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1408l extends RuntimeException {
    public C1408l() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final C9893l yandex() {
        return new C9893l(getMessage());
    }
}
