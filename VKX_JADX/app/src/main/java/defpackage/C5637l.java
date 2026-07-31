package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lؘّٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5637l extends AbstractC11072l implements InterfaceC8657l {
    public final InterfaceC0845l loadAd;
    public final Type yandex;

    public C5637l(Type type) {
        InterfaceC0845l c12875l;
        this.yandex = type;
        if (type instanceof Class) {
            c12875l = new C12875l((Class) type);
        } else if (type instanceof TypeVariable) {
            c12875l = new C16765l((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                C11983l.metrica("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            c12875l = new C12875l((Class) ((ParameterizedType) type).getRawType());
        }
        this.loadAd = c12875l;
    }

    public final boolean amazon() {
        Type type = this.yandex;
        if (type instanceof Class) {
            if (!(((Class) type).getTypeParameters().length == 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    public final ArrayList crashlytics() {
        InterfaceC7760l c12681l;
        InterfaceC7760l c13064l;
        List<Type> listCrashlytics = AbstractC1845l.crashlytics(this.yandex);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listCrashlytics, 10));
        for (Type type : listCrashlytics) {
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c13064l = new C13064l(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        c12681l = new C12681l(type);
                    } else {
                        c12681l = type instanceof WildcardType ? new C6962l((WildcardType) type) : new C5637l(type);
                    }
                    c13064l = c12681l;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    c12681l = new C12681l(type);
                } else {
                    c12681l = new C12681l(type);
                }
                c13064l = c12681l;
            }
            arrayList.add(c13064l);
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC7760l
    public final Collection getAnnotations() {
        return C2580l.f5619l;
    }

    @Override // defpackage.AbstractC11072l, defpackage.InterfaceC7760l
    public final C8673l loadAd(C2312l c2312l) {
        return null;
    }

    @Override // defpackage.AbstractC11072l
    public final Type yandex() {
        return this.yandex;
    }
}
