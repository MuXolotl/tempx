package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lُؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10792l implements InterfaceC0945l, InterfaceC0119l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f21823l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f21824l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f21825l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f21826l;

    public /* synthetic */ C10792l(C13350l c13350l, C2427l c2427l, boolean z, boolean z2) {
        this.f21823l = c13350l;
        this.f21826l = c2427l;
        this.f21825l = z;
        this.f21824l = z2;
    }

    @Override // defpackage.InterfaceC0119l
    public void crashlytics(C6499l c6499l) {
        C13350l c13350l = (C13350l) this.f21823l;
        ListenableFuture listenableFutureAppmetrica = c13350l.admob.appmetrica(c6499l, AbstractC1186l.isVip((C2427l) this.f21826l), -1, -9223372036854775807L);
        C1298l c1298l = new C1298l();
        c1298l.f3349l = c13350l;
        c1298l.f3346l = c6499l;
        c1298l.f3348l = this.f21825l;
        c1298l.f3347l = this.f21824l;
        listenableFutureAppmetrica.yandex(new RunnableC9929l(listenableFutureAppmetrica, c1298l, 9), EnumC1535l.f3808l);
    }

    @Override // defpackage.InterfaceC0945l
    public void mopub(InterfaceC3270l interfaceC3270l, int i) {
        interfaceC3270l.adcel(i, (C9009l) this.f21823l, this.f21825l, this.f21824l, ((C6499l) this.f21826l).crashlytics);
    }

    public /* synthetic */ C10792l(C9009l c9009l, boolean z, boolean z2, C6499l c6499l) {
        this.f21823l = c9009l;
        this.f21825l = z;
        this.f21824l = z2;
        this.f21826l = c6499l;
    }
}
