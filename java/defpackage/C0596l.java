package defpackage;

/* JADX INFO: renamed from: lؑۜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0596l implements InterfaceC10091l, InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0306l f2024l;

    public C0596l(AbstractC0306l abstractC0306l) {
        this.f2024l = abstractC0306l;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC10091l) && (obj instanceof InterfaceC9234l)) {
            return loadAd().equals(((InterfaceC9234l) obj).loadAd());
        }
        return false;
    }

    public final int hashCode() {
        return loadAd().hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return new C1538l(1, this.f2024l, AbstractC0306l.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }
}
