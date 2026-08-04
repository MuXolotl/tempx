package defpackage;

/* JADX INFO: renamed from: lًٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15947l extends AbstractC7986l implements InterfaceC16189l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f31314l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15947l(int i, AbstractC15603l abstractC15603l) {
        super(abstractC15603l);
        this.f31314l = i;
    }

    @Override // defpackage.AbstractC7986l
    public AbstractC1251l amazon() {
        switch (this.f31314l) {
            case 0:
                boolean zFirebase = ((AbstractC13398l) this.f16649l).firebase();
                AbstractC15603l abstractC15603l = this.f16649l;
                if (!zFirebase) {
                    return (AbstractC13398l) abstractC15603l;
                }
                ((AbstractC13398l) abstractC15603l).zzb.amazon();
                return (AbstractC13398l) super.crashlytics();
            default:
                return super.amazon();
        }
    }

    @Override // defpackage.AbstractC7986l
    public void billing() {
        switch (this.f31314l) {
            case 0:
                super.billing();
                AbstractC15603l abstractC15603l = this.f16649l;
                if (((AbstractC13398l) abstractC15603l).zzb != C5519l.crashlytics) {
                    AbstractC13398l abstractC13398l = (AbstractC13398l) abstractC15603l;
                    abstractC13398l.zzb = abstractC13398l.zzb.clone();
                }
                break;
            default:
                super.billing();
                break;
        }
    }

    @Override // defpackage.AbstractC7986l
    public AbstractC15603l crashlytics() {
        switch (this.f31314l) {
            case 0:
                boolean zFirebase = ((AbstractC13398l) this.f16649l).firebase();
                AbstractC15603l abstractC15603l = this.f16649l;
                if (!zFirebase) {
                    return (AbstractC13398l) abstractC15603l;
                }
                ((AbstractC13398l) abstractC15603l).zzb.amazon();
                return (AbstractC13398l) super.crashlytics();
            default:
                return super.crashlytics();
        }
    }
}
