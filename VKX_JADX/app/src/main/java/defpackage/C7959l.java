package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7959l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5080l f16581l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16582l;

    public /* synthetic */ C7959l(C5080l c5080l, int i) {
        this.f16582l = i;
        this.f16581l = c5080l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16582l;
        C5080l c5080l = this.f16581l;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex(null, AbstractC14566l.amazon(-642250670, new C7959l(c5080l, i2), c6956l), c6956l, 48, 1);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5080l.f11092l.invoke(c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
