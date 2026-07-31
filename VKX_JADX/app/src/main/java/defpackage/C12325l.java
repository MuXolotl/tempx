package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lّؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12325l extends AbstractC14423l implements InterfaceC0808l {
    public final Object[] loadAd;

    public C12325l(C3498l c3498l, Object[] objArr) {
        super(c3498l);
        this.loadAd = objArr;
    }

    public final ArrayList yandex() {
        InterfaceC0808l c5652l;
        Object[] objArr = this.loadAd;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Class<?> cls = obj.getClass();
            List list = AbstractC1845l.yandex;
            if (Enum.class.isAssignableFrom(cls)) {
                c5652l = new C15917l(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                c5652l = new C15808l(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                c5652l = new C12325l(null, (Object[]) obj);
            } else {
                c5652l = obj instanceof Class ? new C5652l(null, (Class) obj) : new C13013l(null, obj);
            }
            arrayList.add(c5652l);
        }
        return arrayList;
    }
}
