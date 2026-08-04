package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍؔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2514l extends AbstractC18717l {
    public final List yandex;

    public C2514l(List list) {
        this.yandex = list;
    }

    @Override // defpackage.AbstractC18717l
    public final InterfaceC7501l loadAd(AbstractC8320l abstractC8320l) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            InterfaceC7501l interfaceC7501lLoadAd = ((AbstractC18717l) it.next()).loadAd(abstractC8320l);
            if (interfaceC7501lLoadAd != null) {
                return interfaceC7501lLoadAd;
            }
        }
        return null;
    }
}
