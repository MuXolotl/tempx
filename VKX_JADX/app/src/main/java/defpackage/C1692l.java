package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lؚؓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1692l extends AbstractC9640l {
    public final /* synthetic */ int purchase;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1692l(Constructor constructor, int i) {
        this.purchase = i;
        Class<?> cls = null;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                Class declaringClass2 = constructor.getDeclaringClass();
                Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
                if (declaringClass3 != null && !Modifier.isStatic(declaringClass2.getModifiers())) {
                    cls = declaringClass3;
                }
                super(constructor, declaringClass, cls, constructor.getGenericParameterTypes());
                break;
            default:
                Class declaringClass4 = constructor.getDeclaringClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                super(constructor, declaringClass4, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC8669l.m2419throws(0, genericParameterTypes.length - 1, genericParameterTypes)));
                break;
        }
    }

    @Override // defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        int i = this.purchase;
        Member member = this.yandex;
        switch (i) {
            case 0:
                purchase(objArr);
                C4384l c4384l = new C4384l(2);
                c4384l.crashlytics(objArr);
                c4384l.loadAd(null);
                ArrayList arrayList = c4384l.yandex;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                purchase(objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
