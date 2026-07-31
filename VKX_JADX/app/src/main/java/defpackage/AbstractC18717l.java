package defpackage;

/* JADX INFO: renamed from: lؚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18717l {
    public abstract InterfaceC7501l loadAd(AbstractC8320l abstractC8320l);

    public final InterfaceC7501l yandex(AbstractC8320l abstractC8320l) {
        InterfaceC7501l interfaceC7501lLoadAd = loadAd(abstractC8320l);
        if (interfaceC7501lLoadAd != null) {
            return interfaceC7501lLoadAd;
        }
        C11983l.ad(abstractC8320l, "Algorithm not found: ");
        return null;
    }
}
