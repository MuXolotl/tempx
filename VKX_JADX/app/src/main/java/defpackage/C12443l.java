package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؚّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12443l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6001l f24556l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11749l f24557l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24558l;

    public /* synthetic */ C12443l(C11749l c11749l, C6001l c6001l, int i, int i2) {
        this.f24558l = i2;
        this.f24557l = c11749l;
        this.f24556l = c6001l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24558l;
        C6001l c6001l = this.f24556l;
        C11749l c11749l = this.f24557l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c11749l.pro(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 1:
                c11749l.m3241throws(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 2:
                c11749l.m3240synchronized(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 3:
                c11749l.m3239package(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 4:
                c11749l.premium(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 5:
                c11749l.inmobi(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 6:
                c11749l.isVip(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 7:
                c11749l.isVip(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                c11749l.signatures(c6001l, c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
