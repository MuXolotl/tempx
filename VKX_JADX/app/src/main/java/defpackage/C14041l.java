package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: lٍّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14041l extends AbstractC3432l {
    public final /* synthetic */ int mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14041l(int i, Method method) {
        super(method, false, 6);
        this.mopub = i;
    }

    @Override // defpackage.AbstractC3432l, defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        switch (this.mopub) {
            case 0:
                purchase(objArr);
                return mopub(objArr[0], objArr.length <= 1 ? new Object[0] : AbstractC8669l.m2419throws(1, objArr.length, objArr));
            case 1:
                purchase(objArr);
                billing(AbstractC8669l.m2412private(objArr));
                return mopub(null, objArr.length <= 1 ? new Object[0] : AbstractC8669l.m2419throws(1, objArr.length, objArr));
            default:
                purchase(objArr);
                return mopub(null, objArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14041l(Method method) {
        super(method, true, 4);
        this.mopub = 1;
    }
}
