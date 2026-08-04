package defpackage;

import io.realm.kotlin.internal.interop.CompactOnLaunchCallback;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lْؒۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13082l implements CompactOnLaunchCallback {
    public static final C9673l yandex = new C9673l(6);
    public static final C8323l loadAd = new C8323l(2);

    public static final void amazon(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void crashlytics(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final boolean loadAd(C3654l c3654l) {
        if (c3654l.f7693l == null) {
            return false;
        }
        C3654l c3654lLicense = c3654l.license();
        return (c3654lLicense != null ? c3654lLicense.f7693l : null) == null || c3654l.f7667l.loadAd;
    }

    public static final void purchase(String str) {
        throw new NoSuchElementException(str);
    }

    public static final C3835l yandex(C17296l c17296l) {
        if (c17296l.equals(AbstractC12605l.loadAd)) {
            return AbstractC10192l.yandex;
        }
        return c17296l.equals(AbstractC12605l.yandex) ? AbstractC10192l.loadAd : new C3835l(c17296l);
    }
}
