package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13998l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f27304l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f27305l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27306l;

    public /* synthetic */ C13998l(Object obj, int i, int i2) {
        this.f27306l = i2;
        this.f27304l = obj;
        this.f27305l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f27306l;
        int i2 = this.f27305l;
        Object obj = this.f27304l;
        switch (i) {
            case 0:
                AbstractC6786l abstractC6786l = (AbstractC6786l) ((Function0) obj).invoke();
                InterfaceC1220l interfaceC1220lCrashlytics = AbstractC9968l.crashlytics(2, new C7646l(7, abstractC6786l));
                C2343l c2343l = abstractC6786l.f14215l;
                Type type = c2343l != null ? (Type) c2343l.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    return cls.isArray() ? cls.getComponentType() : Object.class;
                }
                if (type instanceof GenericArrayType) {
                    if (i2 == 0) {
                        return ((GenericArrayType) type).getGenericComponentType();
                    }
                    C11467l.Signature(abstractC6786l, "Array type has been queried for a non-0th argument: ");
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    C11467l.Signature(abstractC6786l, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type2 = (Type) ((List) interfaceC1220lCrashlytics.getValue()).get(i2);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type type3 = (Type) AbstractC8669l.m2412private(wildcardType.getLowerBounds());
                return type3 == null ? (Type) AbstractC8669l.m2409native(wildcardType.getUpperBounds()) : type3;
            case 1:
                return (InterfaceC12657l) ((List) obj).get(i2);
            case 2:
                return (InterfaceC12657l) ((InterfaceC0207l) obj).mo1007finally().get(i2);
            case 3:
                ((Function1) obj).invoke(Integer.valueOf(i2));
                return Unit.INSTANCE;
            default:
                C11362l c11362l = ((C18534l) obj).f36168l;
                if (c11362l.contains(Integer.valueOf(i2))) {
                    c11362l.remove(Integer.valueOf(i2));
                } else {
                    c11362l.add(Integer.valueOf(i2));
                }
                return Unit.INSTANCE;
        }
    }
}
