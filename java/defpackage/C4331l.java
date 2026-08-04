package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؖۗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4331l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14216l f8860l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8861l;

    public /* synthetic */ C4331l(C14216l c14216l, int i) {
        this.f8861l = i;
        this.f8860l = c14216l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8861l;
        C14216l c14216l = this.f8860l;
        switch (i) {
            case 0:
                AbstractC5573l.firebase(c14216l);
                return Unit.INSTANCE;
            case 1:
                c14216l.f27809l.admob(true);
                return Boolean.TRUE;
            case 2:
                c14216l.f27809l.amazon(true);
                return Boolean.TRUE;
            case 3:
                c14216l.f27809l.billing();
                return Boolean.TRUE;
            case 4:
                AbstractC5573l.firebase(c14216l);
                return Unit.INSTANCE;
            case 5:
                c14216l.f27809l.startapp();
                return Boolean.TRUE;
            case 6:
                C10403l c10403l = c14216l.f27813l.pro;
                c10403l.f21224l.ads.loadAd(c14216l.f27816l.purchase);
                Unit unit = Unit.INSTANCE;
                return Boolean.TRUE;
            default:
                C17812l c17812l = c14216l.f27813l;
                C6523l c6523l = c14216l.f27812l;
                if (c17812l.loadAd()) {
                    InterfaceC8533l interfaceC8533l = c17812l.crashlytics;
                    if (interfaceC8533l != null) {
                        ((C4666l) interfaceC8533l).loadAd();
                    }
                } else {
                    C6523l.loadAd(c6523l);
                }
                return Boolean.TRUE;
        }
    }
}
