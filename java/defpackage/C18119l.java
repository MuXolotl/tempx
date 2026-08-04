package defpackage;

import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: lٕ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18119l implements PrivilegedAction {
    public final /* synthetic */ AlgorithmParameterSpec loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C18119l(AlgorithmParameterSpec algorithmParameterSpec, int i) {
        this.yandex = i;
        this.loadAd = algorithmParameterSpec;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.yandex;
        Object[] objArr = AbstractC18037l.loadAd;
        Class<?>[] clsArr = AbstractC18037l.yandex;
        AlgorithmParameterSpec algorithmParameterSpec = this.loadAd;
        switch (i) {
            case 0:
                try {
                    return algorithmParameterSpec.getClass().getMethod("getName", clsArr).invoke(algorithmParameterSpec, objArr);
                } catch (Exception unused) {
                    return null;
                }
            default:
                try {
                    return algorithmParameterSpec.getClass().getMethod("getContext", clsArr).invoke(algorithmParameterSpec, objArr);
                } catch (Exception unused2) {
                    return null;
                }
        }
    }
}
