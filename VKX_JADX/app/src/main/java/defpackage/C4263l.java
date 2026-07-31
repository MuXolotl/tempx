package defpackage;

/* JADX INFO: renamed from: lؘؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4263l extends AbstractC16370l {
    public final AbstractC9914l billing;

    public C4263l(AbstractC8237l abstractC8237l, AbstractC9914l abstractC9914l, String str) {
        super(abstractC8237l, str);
        this.billing = abstractC9914l;
        this.yandex.add("primitive");
    }

    @Override // defpackage.InterfaceC14988l
    public final int admob(InterfaceC18035l interfaceC18035l) {
        return 0;
    }

    @Override // defpackage.AbstractC16370l
    /* JADX INFO: renamed from: class */
    public final AbstractC9914l mo264class() {
        return this.billing;
    }

    @Override // defpackage.AbstractC16370l
    /* JADX INFO: renamed from: package */
    public final AbstractC9914l mo267package(String str) {
        if (str == "primitive") {
            return this.billing;
        }
        C8339l.metrica("This input can only handle primitives with 'primitive' tag");
        return null;
    }
}
