package defpackage;

/* JADX INFO: renamed from: lَۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2997l extends AbstractViewOnTouchListenerC7596l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C11122l f6496l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C4313l f6497l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2997l(C4313l c4313l, C4313l c4313l2, C11122l c11122l) {
        super(c4313l2);
        this.f6497l = c4313l;
        this.f6496l = c11122l;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC7596l
    public final boolean crashlytics() {
        C4313l c4313l = this.f6497l;
        if (c4313l.getInternalPopup().loadAd()) {
            return true;
        }
        c4313l.f8853l.metrica(c4313l.getTextDirection(), c4313l.getTextAlignment());
        return true;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC7596l
    public final InterfaceC17816l loadAd() {
        return this.f6496l;
    }
}
