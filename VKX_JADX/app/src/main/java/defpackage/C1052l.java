package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؒٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1052l implements InterfaceC18679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2040l f2914l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13071l f2915l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C13698l f2916l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2917l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ IOException f2918l;

    public /* synthetic */ C1052l(C13698l c13698l, C13071l c13071l, C2040l c2040l, IOException iOException, boolean z) {
        this.f2916l = c13698l;
        this.f2915l = c13071l;
        this.f2914l = c2040l;
        this.f2918l = iOException;
        this.f2917l = z;
    }

    @Override // defpackage.InterfaceC18679l
    public final void accept(Object obj) {
        InterfaceC4784l interfaceC4784l = (InterfaceC4784l) obj;
        C13698l c13698l = this.f2916l;
        interfaceC4784l.ad(c13698l.f26744l, (C5019l) c13698l.f26743l, this.f2915l, this.f2914l, this.f2918l, this.f2917l);
    }
}
