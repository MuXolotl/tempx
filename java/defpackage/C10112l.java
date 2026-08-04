package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: lَؘِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10112l extends AbstractC8343l implements InterfaceC13468l {
    public final Object purchase;

    public C10112l(Field field, Object obj) {
        super(field, false);
        this.purchase = obj;
    }

    @Override // defpackage.AbstractC8343l, defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        purchase(objArr);
        return ((Field) this.yandex).get(this.purchase);
    }
}
