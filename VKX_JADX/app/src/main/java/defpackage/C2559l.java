package defpackage;

/* JADX INFO: renamed from: lِؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2559l extends C4479l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ ServiceC16415l f5566l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2559l(ServiceC16415l serviceC16415l) {
        super(serviceC16415l);
        this.f5566l = serviceC16415l;
    }

    @Override // defpackage.C12014l
    public final C16701l pro() {
        ServiceC16415l serviceC16415l = this.f5566l;
        C7996l c7996l = serviceC16415l.f32114l;
        if (c7996l == null) {
            C8339l.smaato("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
        if (c7996l != serviceC16415l.f32104l) {
            return c7996l.amazon;
        }
        C14932l c14932l = (C14932l) this.f23940l;
        c14932l.getClass();
        return new C16701l(c14932l.getCurrentBrowserInfo());
    }
}
