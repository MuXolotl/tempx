package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: renamed from: lٍؕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3300l {
    public final HashMap loadAd;
    public final HashMap yandex;

    public C3300l(C18396l c18396l) {
        this.yandex = new HashMap((HashMap) c18396l.f35934l);
        this.loadAd = new HashMap((HashMap) c18396l.f35933l);
    }

    public final Object loadAd(AbstractC6968l abstractC6968l, Class cls) throws GeneralSecurityException {
        C17174l c17174l = new C17174l(abstractC6968l.getClass(), cls);
        HashMap map = this.yandex;
        if (map.containsKey(c17174l)) {
            return ((C13911l) map.get(c17174l)).crashlytics.admob(abstractC6968l);
        }
        throw new GeneralSecurityException(AbstractC15560l.Signature("No PrimitiveConstructor for ", String.valueOf(c17174l), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object yandex(AbstractC6968l abstractC6968l, Class cls) {
        return loadAd(abstractC6968l, cls);
    }
}
