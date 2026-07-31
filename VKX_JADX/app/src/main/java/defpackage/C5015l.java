package defpackage;

/* JADX INFO: renamed from: lٜٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5015l implements InterfaceC16975l, InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f10247l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10248l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10249l;

    public /* synthetic */ C5015l(Object obj, int i, int i2) {
        this.f10247l = obj;
        this.f10249l = i;
        this.f10248l = i2;
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        interfaceC4725l.mo470transient(((SurfaceHolderCallbackC0719l) this.f10247l).yandex.crashlytics, i, this.f10249l, this.f10248l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        ((InterfaceC5252l) obj).startapp((C5597l) this.f10247l, this.f10249l, this.f10248l);
    }
}
