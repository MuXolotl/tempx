package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: lْۜؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13670l extends AbstractC9640l implements InterfaceC13468l {
    public final Object billing;
    public final /* synthetic */ int purchase;

    /* JADX WARN: Illegal instructions before constructor call */
    public C13670l(Constructor constructor, Object obj, int i) {
        this.purchase = i;
        switch (i) {
            case 1:
                super(constructor, constructor.getDeclaringClass(), null, constructor.getGenericParameterTypes());
                this.billing = obj;
                break;
            default:
                Class declaringClass = constructor.getDeclaringClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : AbstractC8669l.m2419throws(1, genericParameterTypes.length - 1, genericParameterTypes)));
                this.billing = obj;
                break;
        }
    }

    @Override // defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        int i = this.purchase;
        Object obj = this.billing;
        Member member = this.yandex;
        switch (i) {
            case 0:
                purchase(objArr);
                C4384l c4384l = new C4384l(3);
                c4384l.loadAd(obj);
                c4384l.crashlytics(objArr);
                c4384l.loadAd(null);
                ArrayList arrayList = c4384l.yandex;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                purchase(objArr);
                C4384l c4384l2 = new C4384l(2);
                c4384l2.loadAd(obj);
                c4384l2.crashlytics(objArr);
                ArrayList arrayList2 = c4384l2.yandex;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
