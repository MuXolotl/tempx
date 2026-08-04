package defpackage;

import java.util.logging.Logger;

/* JADX INFO: renamed from: lٌَؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7169l {
    public static final Logger yandex = Logger.getLogger("okio.Okio");

    public static final boolean yandex(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC12024l.appmetrica(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
