package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؘٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13970l extends AbstractC9549l {
    public final /* synthetic */ int admob;
    public final /* synthetic */ Method billing;
    public final /* synthetic */ Class mopub;

    public C13970l(Method method, Class cls, int i) {
        this.billing = method;
        this.mopub = cls;
        this.admob = i;
    }

    @Override // defpackage.AbstractC9549l
    public final Object amazon() {
        return this.billing.invoke(null, this.mopub, Integer.valueOf(this.admob));
    }

    public final String toString() {
        return this.mopub.getName();
    }
}
