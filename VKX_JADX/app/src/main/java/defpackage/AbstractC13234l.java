package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٌٍْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13234l {
    public static final Map purchase;
    public static final C4733l yandex = new C4733l(C18563l.class, new C14377l(22));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.AesSivKey", new C14377l(23));
    public static final C5773l crashlytics = new C5773l(C5925l.class, new C14377l(24));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.AesSivKey", new C14377l(25));

    static {
        HashMap map = new HashMap();
        map.put(C17162l.purchase, C9358l.purchase);
        map.put(C17162l.crashlytics, C9358l.crashlytics);
        map.put(C17162l.amazon, C9358l.billing);
        purchase = DesugarCollections.unmodifiableMap(map);
    }

    public static C17162l yandex(C9358l c9358l) throws GeneralSecurityException {
        if (c9358l == C9358l.purchase) {
            return C17162l.purchase;
        }
        if (c9358l == C9358l.crashlytics) {
            return C17162l.crashlytics;
        }
        C9358l c9358l2 = C9358l.billing;
        C17162l c17162l = C17162l.amazon;
        if (c9358l == c9358l2 || c9358l == C9358l.amazon) {
            return c17162l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }
}
