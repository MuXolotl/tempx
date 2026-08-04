package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: lْؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1549l extends AbstractC3096l {
    public C1549l(Method method) {
        super(method, Collections.singletonList(method.getDeclaringClass()));
    }

    @Override // defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        purchase(objArr);
        Object obj = objArr[0];
        Object[] objArrM2419throws = objArr.length <= 1 ? new Object[0] : AbstractC8669l.m2419throws(1, objArr.length, objArr);
        return this.yandex.invoke(obj, Arrays.copyOf(objArrM2419throws, objArrM2419throws.length));
    }
}
