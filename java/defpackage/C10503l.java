package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lَۗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10503l implements InterfaceC16975l, InterfaceC12052l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21372l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21373l;

    public /* synthetic */ C10503l(int i, C12417l c12417l, Bundle bundle, Bundle bundle2) {
        this.f21373l = 3;
        this.f21372l = i;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        int i = this.f21373l;
        int i2 = this.f21372l;
        C18602l c18602l = (C18602l) obj;
        switch (i) {
            case 4:
                c18602l.mo2806super(i2);
                break;
            case 5:
                c18602l.mo2808synchronized(i2);
                break;
            case 6:
                c18602l.mo2752const(i2);
                break;
            default:
                c18602l.mo2772l(i2);
                break;
        }
    }

    @Override // defpackage.InterfaceC12052l
    public void amazon(C13208l c13208l) {
        if (c13208l.mo319l() && c13208l.smaato.get(this.f21372l) != null) {
            C18725l.loadAd();
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f21373l;
        int i2 = this.f21372l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 0:
                interfaceC13521l.subs(i2);
                break;
            case 1:
                interfaceC13521l.tapsense(i2);
                break;
            default:
                interfaceC13521l.subs(i2);
                break;
        }
    }

    public /* synthetic */ C10503l(int i, int i2) {
        this.f21373l = i2;
        this.f21372l = i;
    }
}
