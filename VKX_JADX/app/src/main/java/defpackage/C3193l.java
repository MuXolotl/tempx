package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؕؖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3193l extends AbstractC9549l {
    public final /* synthetic */ Class admob;
    public final /* synthetic */ Method billing;
    public final /* synthetic */ Object mopub;

    public C3193l(Method method, Object obj, Class cls) {
        this.billing = method;
        this.mopub = obj;
        this.admob = cls;
    }

    @Override // defpackage.AbstractC9549l
    public final Object amazon() {
        return this.billing.invoke(this.mopub, this.admob);
    }

    public final String toString() {
        return this.admob.getName();
    }
}
