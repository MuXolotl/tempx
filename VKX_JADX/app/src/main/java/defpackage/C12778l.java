package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12778l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25155l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25156l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25157l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f25158l;

    public /* synthetic */ C12778l(int i, boolean z, boolean z2, int i2) {
        this.f25158l = i;
        this.f25156l = z;
        this.f25155l = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25157l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC13693l.yandex(this.f25158l, AbstractC0545l.purchase(433), c6956l, this.f25156l, this.f25155l);
                break;
            default:
                C2287l.crashlytics(this.f25158l, AbstractC0545l.purchase(1), c6956l, this.f25156l, this.f25155l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12778l(boolean z, boolean z2, int i, int i2) {
        this.f25156l = z;
        this.f25155l = z2;
        this.f25158l = i;
    }
}
