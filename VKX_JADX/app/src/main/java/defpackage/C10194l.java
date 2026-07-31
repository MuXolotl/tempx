package defpackage;

/* JADX INFO: renamed from: lٍَٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10194l implements InterfaceC16975l, InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f20783l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f20784l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20785l;

    public /* synthetic */ C10194l(Object obj, boolean z, int i) {
        this.f20783l = obj;
        this.f20785l = z;
        this.f20784l = i;
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        C13208l c13208l = (C13208l) this.f20783l;
        interfaceC4725l.mo434l(c13208l.crashlytics, i, this.f20785l, this.f20784l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        ((InterfaceC5252l) obj).mo1737case((C5597l) this.f20783l, this.f20784l, this.f20785l);
    }
}
