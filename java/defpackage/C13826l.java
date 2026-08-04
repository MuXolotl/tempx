package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.PublicKey;

/* JADX INFO: renamed from: lْۨؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13826l extends AbstractC16466l {
    @Override // defpackage.AbstractC16466l
    public final InterfaceC7024l loadAd(PublicKey publicKey) {
        C15440l c15440l = new C15440l();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.yandex.f3606l;
        Object obj = concurrentHashMap.get("ECDH");
        if (obj == null) {
            C16783l c16783l = new C16783l(new C15152l(20));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent("ECDH", c16783l);
            obj = objPutIfAbsent == null ? c16783l : objPutIfAbsent;
        }
        return c15440l;
    }
}
