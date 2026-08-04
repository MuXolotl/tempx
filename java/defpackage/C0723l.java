package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0723l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2603l f2217l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2218l;

    public /* synthetic */ C0723l(C2603l c2603l, int i, int i2) {
        this.f2218l = i2;
        this.f2217l = c2603l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2218l;
        C2603l c2603l = this.f2217l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c2603l.pro(c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                c2603l.advert(c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
