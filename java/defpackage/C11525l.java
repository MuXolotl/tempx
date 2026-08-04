package defpackage;

/* JADX INFO: renamed from: lُۨٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11525l implements InterfaceC16975l, InterfaceC0119l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23181l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ float f23182l;

    public /* synthetic */ C11525l(Object obj, float f) {
        this.f23181l = obj;
        this.f23182l = f;
    }

    @Override // defpackage.InterfaceC0119l
    public void crashlytics(C6499l c6499l) {
        ((C13350l) this.f23181l).admob.tapsense.crashlytics(this.f23182l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        ((InterfaceC5252l) obj).mo1750synchronized((C5597l) this.f23181l, this.f23182l);
    }
}
