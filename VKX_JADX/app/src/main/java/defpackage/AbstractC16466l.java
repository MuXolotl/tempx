package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AlgorithmParameters;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: renamed from: lؙٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16466l implements InterfaceC7501l {
    public final C1424l yandex;

    public AbstractC16466l(C1424l c1424l) {
        this.yandex = c1424l;
    }

    public abstract InterfaceC7024l loadAd(PublicKey publicKey);

    public final AlgorithmParameters yandex(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.yandex.f3604l;
        Object obj = concurrentHashMap.get("EC");
        if (obj == null) {
            C16279l c16279l = new C16279l(new C15152l(19));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent("EC", c16279l);
            obj = objPutIfAbsent == null ? c16279l : objPutIfAbsent;
        }
        AbstractC14910l abstractC14910l = (AbstractC14910l) obj;
        Object objYandex = abstractC14910l.yandex();
        try {
            AlgorithmParameters algorithmParameters = (AlgorithmParameters) objYandex;
            abstractC14910l.loadAd(objYandex);
            algorithmParameters.init(algorithmParameterSpec);
            return algorithmParameters;
        } catch (Throwable th) {
            abstractC14910l.loadAd(objYandex);
            throw th;
        }
    }
}
