package defpackage;

/* JADX INFO: renamed from: lَؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0232l extends AbstractC10794l {
    public final boolean amazon;
    public final AbstractC4946l[] crashlytics;
    public final InterfaceC16902l[] loadAd;

    public C0232l(InterfaceC16902l[] interfaceC16902lArr, AbstractC4946l[] abstractC4946lArr, boolean z) {
        this.loadAd = interfaceC16902lArr;
        this.crashlytics = abstractC4946lArr;
        this.amazon = z;
    }

    @Override // defpackage.AbstractC10794l
    public final AbstractC4946l amazon(AbstractC18041l abstractC18041l) {
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        InterfaceC16902l interfaceC16902l = interfaceC15234lPro instanceof InterfaceC16902l ? (InterfaceC16902l) interfaceC15234lPro : null;
        if (interfaceC16902l != null) {
            int index = interfaceC16902l.getIndex();
            InterfaceC16902l[] interfaceC16902lArr = this.loadAd;
            if (index < interfaceC16902lArr.length && AbstractC8576l.yandex(interfaceC16902lArr[index].metrica(), interfaceC16902l.metrica())) {
                return this.crashlytics[index];
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC10794l
    public final boolean loadAd() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC10794l
    public final boolean purchase() {
        return this.crashlytics.length == 0;
    }
}
