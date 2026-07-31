package defpackage;

/* JADX INFO: renamed from: lؘۤؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6069l extends AbstractC16778l {
    public final /* synthetic */ int admob;

    public /* synthetic */ C6069l(int i) {
        this.admob = i;
    }

    @Override // defpackage.AbstractC16778l
    public final Object subscription(AbstractC0283l abstractC0283l) {
        switch (this.admob) {
            case 0:
                return AbstractC10999l.firebase(AbstractC11463l.yandex, new C14336l(this, null), abstractC0283l);
            case 1:
                return AbstractC10999l.firebase(AbstractC11463l.yandex, new C7015l(this, null), abstractC0283l);
            default:
                return AbstractC10999l.firebase(AbstractC11463l.yandex, new C3277l(this, null), abstractC0283l);
        }
    }
}
