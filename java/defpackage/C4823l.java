package defpackage;

/* JADX INFO: renamed from: lُۣؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4823l extends AbstractC0757l {
    public final /* synthetic */ int loadAd = 1;

    public C4823l(double d) {
        super(Double.valueOf(d));
    }

    @Override // defpackage.AbstractC0757l
    public String toString() {
        int i = this.loadAd;
        Object obj = this.yandex;
        switch (i) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.AbstractC0757l
    public final AbstractC18041l yandex(InterfaceC11865l interfaceC11865l) {
        switch (this.loadAd) {
            case 0:
                AbstractC16860l abstractC16860lSubs = interfaceC11865l.subs();
                abstractC16860lSubs.getClass();
                return abstractC16860lSubs.subscription(EnumC15893l.BOOLEAN);
            case 1:
                AbstractC16860l abstractC16860lSubs2 = interfaceC11865l.subs();
                abstractC16860lSubs2.getClass();
                return abstractC16860lSubs2.subscription(EnumC15893l.DOUBLE);
            default:
                AbstractC16860l abstractC16860lSubs3 = interfaceC11865l.subs();
                abstractC16860lSubs3.getClass();
                return abstractC16860lSubs3.subscription(EnumC15893l.FLOAT);
        }
    }

    public /* synthetic */ C4823l(Object obj) {
        super(obj);
    }

    public C4823l(float f) {
        super(Float.valueOf(f));
    }
}
