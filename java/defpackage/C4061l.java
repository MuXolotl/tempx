package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4061l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8354l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8355l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8356l;

    public /* synthetic */ C4061l(int i, boolean z, boolean z2) {
        this.f8356l = i;
        this.f8355l = z;
        this.f8354l = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8356l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1497l.loadAd(this.f8355l, this.f8354l, null, 60.0f, c6956l, 3072, 4);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c6956l2.m2124else();
                } else if (this.f8355l) {
                    c6956l2.m2123default(-2054547350);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_lock_outline_16, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                    c6956l2.startapp(false);
                } else {
                    if (this.f8354l) {
                        c6956l2.m2123default(-2054417708);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l2), null, null, 0L, c6956l2, 56, 12);
                    } else {
                        c6956l2.m2123default(-2064578919);
                    }
                    c6956l2.startapp(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
