package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؙٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3959l implements InterfaceC18104l, InterfaceC13934l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f8140l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ BinderC4841l f8141l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8142l;

    public /* synthetic */ C3959l(BinderC4841l binderC4841l, int i, int i2) {
        this.f8142l = i2;
        this.f8141l = binderC4841l;
        this.f8140l = i;
    }

    @Override // defpackage.InterfaceC18104l
    public void crashlytics(C18602l c18602l, C6499l c6499l) {
        int i = this.f8142l;
        int i2 = this.f8140l;
        BinderC4841l binderC4841l = this.f8141l;
        switch (i) {
            case 0:
                c18602l.mo2751class(binderC4841l.m1626l(c6499l, c18602l, i2));
                break;
            default:
                c18602l.mo2756extends(binderC4841l.m1626l(c6499l, c18602l, i2));
                break;
        }
    }

    @Override // defpackage.InterfaceC13934l
    public void yandex(C18602l c18602l, C6499l c6499l, List list) {
        int i = this.f8142l;
        int i2 = this.f8140l;
        BinderC4841l binderC4841l = this.f8141l;
        switch (i) {
            case 1:
                c18602l.mo2754default(binderC4841l.m1626l(c6499l, c18602l, i2), list);
                break;
            case 2:
                if (list.size() != 1) {
                    c18602l.mo2797native(binderC4841l.m1626l(c6499l, c18602l, i2), binderC4841l.m1626l(c6499l, c18602l, i2 + 1), list);
                } else {
                    c18602l.mo2784l(binderC4841l.m1626l(c6499l, c18602l, i2), (C2427l) list.get(0));
                }
                break;
            default:
                c18602l.mo2754default(binderC4841l.m1626l(c6499l, c18602l, i2), list);
                break;
        }
    }
}
