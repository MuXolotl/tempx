package defpackage;

/* JADX INFO: renamed from: l٘ؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17691l {
    public abstract Object amazon(InterfaceC7697l interfaceC7697l);

    public final Object crashlytics(String str) {
        String str2;
        try {
            try {
                return amazon(AbstractC7822l.subs(yandex().crashlytics, str, loadAd()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((Object) str) + "')";
                }
                throw new C14612l(str2, e);
            }
        } catch (C13031l e2) {
            throw new C14612l("Failed to parse value from '" + ((Object) str) + '\'', e2);
        }
    }

    public abstract InterfaceC7697l loadAd();

    public abstract C15977l yandex();
}
