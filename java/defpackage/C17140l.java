package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٗٔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17140l extends AbstractC6441l implements InterfaceC11977l, InterfaceC18335l {
    public final Constructor yandex;

    public C17140l(Constructor constructor) {
        this.yandex = constructor;
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

    @Override // defpackage.AbstractC6441l
    public final Member yandex() {
        return this.yandex;
    }
}
