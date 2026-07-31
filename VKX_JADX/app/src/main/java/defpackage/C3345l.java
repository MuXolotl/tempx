package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lِؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3345l implements TypeVariable, Type {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC11726l f7126l;

    public C3345l(AbstractC11726l abstractC11726l) {
        this.f7126l = abstractC11726l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !AbstractC8576l.yandex(this.f7126l.crashlytics(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.f7126l.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8020l.crashlytics((InterfaceC13012l) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new UnsupportedOperationException("getGenericDeclaration() is not supported for type variables created from KType: " + this.f7126l + ".\nUpdate kotlin-reflect dependency to 2.3.20+.");
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f7126l.crashlytics();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f7126l.crashlytics();
    }

    public final int hashCode() {
        this.f7126l.crashlytics().getClass();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f7126l.crashlytics();
    }
}
