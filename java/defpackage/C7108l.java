package defpackage;

/* JADX INFO: renamed from: lؙؚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C7108l extends AbstractC13065l implements InterfaceC8393l, InterfaceC3136l {
    public static final C11851l Companion = new C11851l();
    public static final InterfaceC1220l[] mopub = {null, AbstractC9968l.crashlytics(2, new C8810l(18)), null, null};
    public final String billing;
    public final String purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7108l(int i, String str, EnumC9331l enumC9331l, String str2, String str3) {
        super(str, enumC9331l, 0);
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C18195l.yandex.purchase());
            throw null;
        }
        this.purchase = str2;
        this.billing = str3;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.billing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7108l)) {
            return false;
        }
        C7108l c7108l = (C7108l) obj;
        return AbstractC8576l.yandex(this.purchase, c7108l.purchase) && AbstractC8576l.yandex(this.billing, c7108l.billing);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.purchase;
    }

    public final int hashCode() {
        return this.billing.hashCode() + (this.purchase.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog(id=");
        sb.append(this.purchase);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.billing, ')');
    }

    public C7108l(String str, String str2) {
        super(str, EnumC9331l.Catalog);
        this.purchase = str;
        this.billing = str2;
    }
}
