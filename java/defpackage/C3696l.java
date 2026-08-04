package defpackage;

/* JADX INFO: renamed from: lؕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3696l extends AbstractC16370l {
    public int admob;
    public final C18427l billing;
    public final int mopub;

    public C3696l(AbstractC8237l abstractC8237l, C18427l c18427l) {
        super(abstractC8237l, null);
        this.billing = c18427l;
        this.mopub = c18427l.f35995l.size();
        this.admob = -1;
    }

    @Override // defpackage.InterfaceC14988l
    public final int admob(InterfaceC18035l interfaceC18035l) {
        int i = this.admob;
        if (i >= this.mopub - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.admob = i2;
        return i2;
    }

    @Override // defpackage.AbstractC16370l
    /* JADX INFO: renamed from: class */
    public final AbstractC9914l mo264class() {
        return this.billing;
    }

    @Override // defpackage.AbstractC16370l
    /* JADX INFO: renamed from: package */
    public final AbstractC9914l mo267package(String str) {
        return (AbstractC9914l) this.billing.f35995l.get(Integer.parseInt(str));
    }

    @Override // defpackage.AbstractC16370l
    /* JADX INFO: renamed from: switch */
    public final String mo268switch(InterfaceC18035l interfaceC18035l, int i) {
        return String.valueOf(i);
    }
}
