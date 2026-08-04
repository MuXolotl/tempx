package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚٛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7369l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2391l f15283l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13849l f15284l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15285l = 0;

    public /* synthetic */ C7369l(C2391l c2391l, C13849l c13849l) {
        this.f15283l = c2391l;
        this.f15284l = c13849l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15285l;
        C4346l c4346l = C4346l.f8873l;
        C2391l c2391l = this.f15283l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 17) != 16)) {
                    String str = c2391l.loadAd;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    long j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                    C13849l c13849l = this.f15284l;
                    boolean zAdmob = c6956l.admob(c13849l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C10456l(c13849l, 0);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd(str2, AbstractC9151l.loadAd(interfaceC17242lVip, false, null, (Function0) objM2132native, 15), j, 0L, null, null, null, 0L, null, 0L, 2, false, 4, 0, null, c6956l, 0, 24960, 241656);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    this.f15284l.m3786abstract(AbstractC11999l.purchase(c6956l2, R.string.book_chapters), c2391l.amazon.size(), AbstractC3605l.metrica(c4346l, 16.0f, 16.0f, 16.0f, 8.0f), c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7369l(C13849l c13849l, C2391l c2391l) {
        this.f15284l = c13849l;
        this.f15283l = c2391l;
    }
}
