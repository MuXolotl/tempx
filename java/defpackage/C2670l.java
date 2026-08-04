package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؔٗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2670l extends AbstractC14761l {
    public static final C2670l crashlytics = new C2670l("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2670l(String str, int i) {
        super(str);
        this.loadAd = i;
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        switch (this.loadAd) {
            case 0:
                int size = list.size();
                C14054l c14054l = C14054l.f27396l;
                if (size == 0) {
                    return interfaceC7448l.isVip(C15519l.isPro(j), C15519l.subs(j), c14054l, C16274l.f31873l);
                }
                if (size == 1) {
                    AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) list.get(0)).adcel(j);
                    return interfaceC7448l.isVip(AbstractC7563l.mopub(abstractC10113lAdcel.f20592l, j), AbstractC7563l.billing(abstractC10113lAdcel.f20591l, j), c14054l, new C16441l(abstractC10113lAdcel, 7));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    AbstractC10113l abstractC10113lAdcel2 = ((InterfaceC6357l) list.get(i)).adcel(j);
                    iMax = Math.max(abstractC10113lAdcel2.f20592l, iMax);
                    iMax2 = Math.max(abstractC10113lAdcel2.f20591l, iMax2);
                    arrayList.add(abstractC10113lAdcel2);
                }
                return interfaceC7448l.isVip(AbstractC7563l.mopub(iMax, j), AbstractC7563l.billing(iMax2, j), c14054l, new C4819l(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
