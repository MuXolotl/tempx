package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: renamed from: lٖۥٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16765l extends AbstractC1132l implements InterfaceC7760l, InterfaceC0845l {
    public final TypeVariable yandex;

    public C16765l(TypeVariable typeVariable) {
        this.yandex = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16765l) {
            return AbstractC8576l.yandex(this.yandex, ((C16765l) obj).yandex);
        }
        return false;
    }

    @Override // defpackage.InterfaceC7760l
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.yandex;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C2580l.f5619l : AbstractC14312l.admob(declaredAnnotations);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC7760l
    public final C8673l loadAd(C2312l c2312l) {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.yandex;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC14312l.mopub(declaredAnnotations, c2312l);
    }

    public final String toString() {
        return C16765l.class.getName() + ": " + this.yandex;
    }
}
