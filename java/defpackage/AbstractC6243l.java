package defpackage;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lؙْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6243l {
    public static final CopyOnWriteArrayList yandex = new CopyOnWriteArrayList();

    public static C1969l yandex(String str) throws GeneralSecurityException {
        for (C1969l c1969l : yandex) {
            c1969l.getClass();
            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return c1969l;
            }
        }
        throw new GeneralSecurityException(AbstractC14814l.startapp("No KMS client does support: ", str));
    }
}
