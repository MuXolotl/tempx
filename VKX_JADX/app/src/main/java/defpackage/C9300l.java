package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9300l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9987l f19111l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9987l f19112l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19113l;

    public /* synthetic */ C9300l(C9987l c9987l, C9987l c9987l2, int i) {
        this.f19113l = i;
        this.f19112l = c9987l;
        this.f19111l = c9987l2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19113l;
        C9987l c9987l = this.f19111l;
        C9987l c9987l2 = this.f19112l;
        C0711l c0711l = (C0711l) obj;
        switch (i) {
            case 0:
                if (c9987l2.f20387l == -1) {
                    c9987l2.f20387l = c0711l.loadAd().f15488l;
                }
                c9987l.f20387l = c0711l.loadAd().f15487l + 1;
                break;
            default:
                if (c9987l2.f20387l == -1) {
                    c9987l2.f20387l = c0711l.loadAd().f15488l;
                }
                c9987l.f20387l = c0711l.loadAd().f15487l + 1;
                break;
        }
        return "";
    }
}
