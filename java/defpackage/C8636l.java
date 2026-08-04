package defpackage;

/* JADX INFO: renamed from: lٌؚٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8636l extends AbstractC17719l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f17796l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8636l(AbstractC15211l abstractC15211l, int i) {
        super(abstractC15211l);
        this.f17796l = i;
    }

    @Override // defpackage.AbstractC3376l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final AbstractC3376l mo7l(AbstractC15211l abstractC15211l) {
        switch (this.f17796l) {
            case 0:
                return new C8636l(abstractC15211l, 0);
            default:
                return new C8636l(abstractC15211l, 1);
        }
    }

    @Override // defpackage.AbstractC3376l, defpackage.AbstractC18041l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1342throw() {
        switch (this.f17796l) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
