package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5654l extends AbstractC3432l implements InterfaceC13468l {
    public final Object admob;
    public final boolean mopub;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5654l(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC8669l.m2419throws(1, genericParameterTypes.length, genericParameterTypes)));
        this.mopub = z;
        this.admob = obj;
    }

    @Override // defpackage.AbstractC3432l, defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        purchase(objArr);
        C4384l c4384l = new C4384l(2);
        c4384l.loadAd(this.admob);
        c4384l.crashlytics(objArr);
        ArrayList arrayList = c4384l.yandex;
        return mopub(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
