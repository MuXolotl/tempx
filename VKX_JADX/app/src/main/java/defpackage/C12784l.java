package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12784l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f25159l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25160l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25161l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f25162l;

    public /* synthetic */ C12784l(boolean z, Function0 function0, int i, int i2) {
        this.f25161l = i2;
        this.f25160l = z;
        this.f25159l = function0;
        this.f25162l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        Integer num = (Integer) obj2;
        switch (this.f25161l) {
            case 0:
                num.getClass();
                AbstractC10851l.loadAd(this.f25160l, this.f25159l, c6956l, AbstractC0545l.purchase(this.f25162l | 1));
                break;
            case 1:
                num.getClass();
                AbstractC2130l.yandex(this.f25160l, this.f25159l, c6956l, AbstractC0545l.purchase(this.f25162l | 1));
                break;
            default:
                num.intValue();
                AbstractC12953l.mopub(this.f25160l, this.f25159l, c6956l, AbstractC0545l.purchase(this.f25162l | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
