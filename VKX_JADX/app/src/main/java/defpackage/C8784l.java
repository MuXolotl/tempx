package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: lٌٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8784l extends AbstractC3432l {
    public final /* synthetic */ int mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8784l(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.mopub = i;
    }

    @Override // defpackage.AbstractC3432l, defpackage.AbstractC9640l
    public void purchase(Object[] objArr) {
        switch (this.mopub) {
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
