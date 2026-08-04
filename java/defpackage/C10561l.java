package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَۚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10561l implements InterfaceC18104l, InterfaceC13934l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f21467l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21468l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ BinderC4841l f21469l;

    public /* synthetic */ C10561l(BinderC4841l binderC4841l, int i, int i2) {
        this.f21469l = binderC4841l;
        this.f21468l = i;
        this.f21467l = i2;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        BinderC4841l binderC4841l = this.f21469l;
        ((C3726l) binderC4841l.purchase.get()).getClass();
        SurfaceHolderC12693l surfaceHolderC12693l = binderC4841l.firebase;
        if (surfaceHolderC12693l != null) {
            surfaceHolderC12693l.setFixedSize(this.f21468l, this.f21467l);
        }
    }

    @Override // defpackage.InterfaceC18104l
    public void crashlytics(C18602l c18602l, C6499l c6499l) {
        BinderC4841l binderC4841l = this.f21469l;
        c18602l.mo2810throw(binderC4841l.m1626l(c6499l, c18602l, this.f21468l), binderC4841l.m1626l(c6499l, c18602l, this.f21467l));
    }

    @Override // defpackage.InterfaceC13934l
    public void yandex(C18602l c18602l, C6499l c6499l, List list) {
        BinderC4841l binderC4841l = this.f21469l;
        c18602l.mo2797native(binderC4841l.m1626l(c6499l, c18602l, this.f21468l), binderC4841l.m1626l(c6499l, c18602l, this.f21467l), list);
    }
}
