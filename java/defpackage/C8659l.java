package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: lٌٌؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8659l extends AbstractC8343l {
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8659l(Field field, boolean z, int i) {
        super(field, z);
        this.purchase = i;
    }

    @Override // defpackage.AbstractC9640l
    public void purchase(Object[] objArr) {
        switch (this.purchase) {
            case 1:
                super.purchase(objArr);
                billing(AbstractC8669l.m2412private(objArr));
                break;
            default:
                super.purchase(objArr);
                break;
        }
    }
}
