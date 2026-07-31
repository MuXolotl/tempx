package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lُّۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12875l extends AbstractC1132l implements InterfaceC7760l, InterfaceC0845l, InterfaceC5014l, InterfaceC18335l {
    public final Class yandex;

    public C12875l(Class cls) {
        this.yandex = cls;
    }

    public final boolean admob() {
        C12014l c12014l = AbstractC7477l.loadAd;
        Boolean bool = null;
        if (c12014l == null) {
            try {
                c12014l = new C12014l(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 16);
            } catch (NoSuchMethodException unused) {
                c12014l = new C12014l(bool, bool, bool, bool, 16);
            }
            AbstractC7477l.loadAd = c12014l;
        }
        Method method = (Method) c12014l.f23941l;
        bool = method != null ? (Boolean) method.invoke(this.yandex, null) : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final List amazon() {
        return AbstractC17587l.adcel(new C11100l(AbstractC17587l.firebase(AbstractC8669l.ads(this.yandex.getDeclaredMethods()), new C17330l(4, this)), C14038l.f27379l));
    }

    public final ArrayList billing() {
        C12014l c12014l = AbstractC7477l.loadAd;
        Object[] objArr = null;
        if (c12014l == null) {
            try {
                c12014l = new C12014l(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 16);
            } catch (NoSuchMethodException unused) {
                c12014l = new C12014l(objArr, objArr, objArr, objArr, 16);
            }
            AbstractC7477l.loadAd = c12014l;
        }
        Method method = (Method) c12014l.f23943l;
        objArr = method != null ? (Object[]) method.invoke(this.yandex, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C8571l(obj));
        }
        return arrayList;
    }

    public final C2312l crashlytics() {
        return AbstractC1845l.yandex(this.yandex).yandex();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12875l) {
            return AbstractC8576l.yandex(this.yandex, ((C12875l) obj).yandex);
        }
        return false;
    }

    @Override // defpackage.InterfaceC7760l
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.yandex;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? C2580l.f5619l : AbstractC14312l.admob(declaredAnnotations);
    }

    @Override // defpackage.InterfaceC18335l
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.yandex.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C16765l(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC7760l
    public final C8673l loadAd(C2312l c2312l) {
        Annotation[] declaredAnnotations;
        Class cls = this.yandex;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC14312l.mopub(declaredAnnotations, c2312l);
    }

    public final boolean mopub() {
        C12014l c12014l = AbstractC7477l.loadAd;
        Boolean bool = null;
        if (c12014l == null) {
            try {
                c12014l = new C12014l(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 16);
            } catch (NoSuchMethodException unused) {
                c12014l = new C12014l(bool, bool, bool, bool, 16);
            }
            AbstractC7477l.loadAd = c12014l;
        }
        Method method = (Method) c12014l.f23944l;
        bool = method != null ? (Boolean) method.invoke(this.yandex, null) : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final C3498l purchase() {
        Class cls = this.yandex;
        return cls.isAnonymousClass() ? C3498l.purchase(AbstractC12024l.m3337protected(cls.getName())) : C3498l.purchase(cls.getSimpleName());
    }

    public final String toString() {
        return C12875l.class.getName() + ": " + this.yandex;
    }

    public final List yandex() {
        return AbstractC17587l.adcel(new C11100l(AbstractC17587l.smaato(AbstractC8669l.ads(this.yandex.getDeclaredFields()), C12753l.f25127l), C15429l.f30186l));
    }
}
