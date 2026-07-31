package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3432l extends AbstractC9640l {
    public final boolean billing;
    public final /* synthetic */ int purchase = 0;

    public AbstractC3432l(Field field, boolean z, boolean z2) {
        super(field, Void.TYPE, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.billing = z;
    }

    @Override // defpackage.InterfaceC16148l
    public Object amazon(Object[] objArr) throws IllegalAccessException {
        purchase(objArr);
        ((Field) this.yandex).set(this.crashlytics != null ? AbstractC8669l.m2409native(objArr) : null, AbstractC8669l.m2400continue(objArr));
        return Unit.INSTANCE;
    }

    public Object mopub(Object obj, Object[] objArr) {
        return this.billing ? Unit.INSTANCE : ((Method) this.yandex).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.AbstractC9640l
    public void purchase(Object[] objArr) {
        switch (this.purchase) {
            case 0:
                super.purchase(objArr);
                if (this.billing && AbstractC8669l.m2400continue(objArr) == null) {
                    C8339l.metrica("null is not allowed as a value for this property.");
                    break;
                }
                break;
            default:
                super.purchase(objArr);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC3432l(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.billing = genericReturnType.equals(Void.TYPE);
    }

    public /* synthetic */ AbstractC3432l(Method method, boolean z, int i) {
        this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
    }
}
