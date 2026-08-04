package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚٓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7248l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f15080l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15081l;

    public /* synthetic */ C7248l(long j, int i) {
        this.f15081l = i;
        this.f15080l = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15081l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_add_square_outline_28, 0, c6956l), null, null, this.f15080l, c6956l, 56, 4);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C6839l c6839l = AbstractC7497l.yandex;
                    AbstractC9383l.yandex(AbstractC0080l.isPro(AbstractC4927l.amazon(AbstractC17551l.loadAd(AbstractC0019l.crashlytics(C4346l.f8873l, c6839l), 1.0f, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.signatures, c6839l), this.f15080l, AbstractC16837l.yandex), 36.0f), c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
