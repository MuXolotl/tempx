package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: lؚٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14416l {
    public final String yandex;
    public List loadAd = C2580l.f5619l;
    public final ArrayList crashlytics = new ArrayList();
    public final HashSet amazon = new HashSet();
    public final ArrayList purchase = new ArrayList();
    public final ArrayList billing = new ArrayList();
    public final ArrayList mopub = new ArrayList();

    public C14416l(String str) {
        this.yandex = str;
    }

    public final void yandex(InterfaceC18035l interfaceC18035l, String str) {
        if (!this.amazon.add(str)) {
            StringBuilder sbIsVip = AbstractC5020l.isVip("Element with name '", str, "' is already registered in ");
            sbIsVip.append(this.yandex);
            throw new IllegalArgumentException(sbIsVip.toString().toString());
        }
        this.crashlytics.add(str);
        this.purchase.add(interfaceC18035l);
        this.billing.add(C2580l.f5619l);
        this.mopub.add(Boolean.FALSE);
    }
}
