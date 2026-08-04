package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: lَۦٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10709l extends AbstractC3096l implements InterfaceC13468l {
    public final Object amazon;

    public C10709l(Method method, Object obj) {
        super(method, C2580l.f5619l);
        this.amazon = obj;
    }

    @Override // defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        purchase(objArr);
        return this.yandex.invoke(this.amazon, Arrays.copyOf(objArr, objArr.length));
    }
}
