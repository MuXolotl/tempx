package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: lِۗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12056l extends AbstractC3432l implements InterfaceC13468l {
    public final Object mopub;

    public C12056l(Method method, Object obj) {
        super(method, false, 4);
        this.mopub = obj;
    }

    @Override // defpackage.AbstractC3432l, defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        purchase(objArr);
        return mopub(this.mopub, objArr);
    }
}
