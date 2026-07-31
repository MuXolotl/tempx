package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1819l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4215l;

    public /* synthetic */ C1819l(int i) {
        this.f4215l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4215l) {
            case 0:
                ((C9902l) obj).loadAd();
                break;
            default:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.player_play, 0, c6956l);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, null, ((C14370l) c6956l.isPro(c10707l)).yandex.license, c6956l, 56, 4);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.vip(C4346l.f8873l, 8.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.mab_play), null, ((C14370l) c6956l.isPro(c10707l)).yandex.license, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l, 0, 0, 261114);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
