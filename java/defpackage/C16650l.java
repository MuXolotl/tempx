package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lٖۜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16650l extends ThreadLocal {
    public final /* synthetic */ C17219l yandex;

    public C16650l(C17219l c17219l) {
        this.yandex = c17219l;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C17219l c17219l = this.yandex;
        try {
            C12437l c12437l = C12437l.crashlytics;
            Mac mac = (Mac) c12437l.yandex.appmetrica((String) c17219l.f33427l);
            mac.init((SecretKeySpec) c17219l.f33426l);
            return mac;
        } catch (GeneralSecurityException e) {
            C11983l.ads(e);
            return null;
        }
    }
}
