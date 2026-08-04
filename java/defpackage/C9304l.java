package defpackage;

/* JADX INFO: renamed from: lٍٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9304l extends AbstractC6517l {
    public final /* synthetic */ int loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9304l(InterfaceC18035l interfaceC18035l, int i) {
        super(interfaceC18035l);
        this.loadAd = i;
    }

    @Override // defpackage.InterfaceC18035l
    public final String yandex() {
        switch (this.loadAd) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
