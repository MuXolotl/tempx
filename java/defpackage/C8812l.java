package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌَٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8812l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f18093l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11090l f18094l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18095l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f18096l;

    public /* synthetic */ C8812l(C11090l c11090l, Function2 function2, int i, int i2) {
        this.f18095l = i2;
        this.f18094l = c11090l;
        this.f18093l = function2;
        this.f18096l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        Integer num = (Integer) obj2;
        switch (this.f18095l) {
            case 0:
                num.getClass();
                AbstractC11282l.yandex(this.f18094l, this.f18093l, c6956l, AbstractC0545l.purchase(this.f18096l | 1));
                break;
            default:
                num.intValue();
                AbstractC13010l.yandex(this.f18094l, this.f18093l, c6956l, AbstractC0545l.purchase(this.f18096l | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
