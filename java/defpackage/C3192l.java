package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؕؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3192l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f6856l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18014l f6857l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6858l;

    public /* synthetic */ C3192l(C18014l c18014l, String str, int i) {
        this.f6858l = i;
        this.f6857l = c18014l;
        this.f6856l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f6858l;
        String str = this.f6856l;
        C18014l c18014l = this.f6857l;
        switch (i) {
            case 0:
                c18014l.m4459public().mopub(str);
                c18014l.f35205l.setValue(null);
                break;
            case 1:
                c18014l.m4459public().billing(str, c18014l.f35204l);
                c18014l.f35205l.setValue(null);
                break;
            default:
                c18014l.m4459public().mopub(str);
                c18014l.f35205l.setValue(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
