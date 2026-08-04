package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;

/* JADX INFO: renamed from: lْۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14507l {
    public final Object amazon(realm_value_t realm_value_tVar) {
        return purchase(loadAd(realm_value_tVar));
    }

    public abstract realm_value_t billing(C3585l c3585l, Object obj);

    public final realm_value_t crashlytics(C3585l c3585l, Object obj) {
        return billing(c3585l, yandex(obj));
    }

    public abstract Object loadAd(realm_value_t realm_value_tVar);

    public abstract Object purchase(Object obj);

    public abstract Object yandex(Object obj);
}
