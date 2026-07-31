package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗۨؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5311l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f11429l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0483l f11430l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11431l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11432l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f11433l;

    public /* synthetic */ C5311l(C0483l c0483l, C15578l c15578l, InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f11431l = i2;
        this.f11430l = c0483l;
        this.f11429l = c15578l;
        this.f11433l = interfaceC17242l;
        this.f11432l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11431l;
        int i2 = this.f11432l;
        InterfaceC17242l interfaceC17242l = this.f11433l;
        C15578l c15578l = this.f11429l;
        C0483l c0483l = this.f11430l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c0483l.admob(AbstractC0545l.purchase(i2 | 1), c15578l, c6956l, interfaceC17242l);
                break;
            default:
                c0483l.mopub(AbstractC0545l.purchase(i2 | 1), c15578l, c6956l, interfaceC17242l);
                break;
        }
        return Unit.INSTANCE;
    }
}
