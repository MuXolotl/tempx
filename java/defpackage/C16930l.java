package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lؘَٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16930l implements InterfaceC13022l {
    public final C4225l crashlytics;
    public final C4330l loadAd;
    public final Set yandex;

    public C16930l(Set set, C4330l c4330l, C4225l c4225l) {
        this.yandex = set;
        this.loadAd = c4330l;
        this.crashlytics = c4225l;
    }

    public final C11117l yandex(String str, C7017l c7017l, InterfaceC8086l interfaceC8086l) {
        Set set = this.yandex;
        if (set.contains(c7017l)) {
            return new C11117l(this.loadAd, str, c7017l, interfaceC8086l, this.crashlytics);
        }
        C18073l.adcel("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{c7017l, set});
        return null;
    }
}
