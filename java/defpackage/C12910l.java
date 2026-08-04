package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12910l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25370l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25371l;

    public C12910l(int i, int i2) {
        this.f25371l = i;
        this.f25370l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(this.f25371l, 0, c6956l), AbstractC11999l.purchase(c6956l, this.f25370l), null, 0L, c6956l, 8, 12);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
