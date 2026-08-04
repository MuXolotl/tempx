package defpackage;

/* JADX INFO: renamed from: lَؚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1685l implements InterfaceC1555l {
    public final /* synthetic */ C7239l yandex;

    public C1685l(C7239l c7239l) {
        this.yandex = c7239l;
    }

    @Override // defpackage.InterfaceC1555l
    public final float yandex(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        C7239l c7239l = this.yandex;
        float fFloatValue = ((Number) c7239l.yandex.invoke(Float.valueOf(f))).floatValue();
        c7239l.purchase.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c7239l.billing.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
