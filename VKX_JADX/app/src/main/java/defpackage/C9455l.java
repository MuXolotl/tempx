package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍَٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9455l extends AbstractC11801l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f19313l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f19314l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f19315l;

    public C9455l() {
        super(0);
        this.f19314l = AbstractC8020l.smaato(Boolean.TRUE);
        this.f19315l = AbstractC8020l.smaato(Boolean.FALSE);
        this.f19313l = AbstractC8020l.smaato(C2580l.f5619l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final Object m2662import(C9455l c9455l, AbstractC0283l abstractC0283l) {
        C11380l c11380l;
        C10086l c10086l = c9455l.f19314l;
        if (abstractC0283l instanceof C11380l) {
            c11380l = (C11380l) abstractC0283l;
            int i = c11380l.f22950l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11380l.f22950l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11380l = new C11380l(c9455l, abstractC0283l);
            }
        } else {
            c11380l = new C11380l(c9455l, abstractC0283l);
        }
        Object objRemoteconfig = c11380l.f22951l;
        int i2 = c11380l.f22950l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objRemoteconfig);
            c10086l.setValue(Boolean.TRUE);
            C15617l c15617l = C15617l.f30512l;
            Context context = c9455l.f34617l;
            c11380l.f22952l = c9455l;
            c11380l.f22950l = 1;
            objRemoteconfig = c15617l.remoteconfig(context, c11380l);
            Object obj = EnumC9342l.f19165l;
            if (objRemoteconfig == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9455l = c11380l.f22952l;
            AbstractC2829l.crashlytics(objRemoteconfig);
        }
        c9455l.f19313l.setValue((List) objRemoteconfig);
        c10086l.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m2663abstract(boolean z) {
        this.f19315l.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C13072l c13072l;
        ?? r0;
        C6956l c6956l2;
        C9455l c9455l = this;
        C6956l c6956l3 = c6956l;
        c6956l3.m2133new(1424308252);
        int i2 = i | (c6956l3.billing(c9455l) ? 4 : 2);
        byte b = 0;
        int i3 = 1;
        if (c6956l3.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l3);
            Unit unit = Unit.INSTANCE;
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM2132native = c6956l3.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z || objM2132native == c13863l) {
                objM2132native = new C17972l(c9455l, (InterfaceC14029l) null, 8);
                c6956l3.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l3, unit, (Function2) objM2132native);
            if (((Boolean) c9455l.f19315l.getValue()).booleanValue()) {
                c6956l3.m2123default(1585559770);
                boolean z2 = i4 == 4;
                Object objM2132native2 = c6956l3.m2132native();
                if (z2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C7368l(c9455l, 1);
                    c6956l3.m2147try(objM2132native2);
                }
                Function0 function0 = (Function0) objM2132native2;
                C15578l c15578lAmazon = AbstractC14566l.amazon(394313385, new C4293l(c9455l, b, b), c6956l3);
                C15578l c15578lAmazon2 = AbstractC14566l.amazon(841794734, new C4293l(c9455l, i3, b), c6956l3);
                c13072l = c13072lYandex;
                r0 = 0;
                AbstractC16291l.yandex(function0, c15578lAmazon, null, null, null, AbstractC4447l.loadAd, c15578lAmazon2, null, 0L, 0L, 0L, 0L, null, c6956l, 1769520, 0, 16284);
                c6956l2 = c6956l;
            } else {
                c13072l = c13072lYandex;
                r0 = 0;
                c6956l3.m2123default(1581663814);
                c6956l2 = c6956l3;
            }
            c6956l2.startapp(r0);
            C13072l c13072l2 = c13072l;
            C15578l c15578lAmazon3 = AbstractC14566l.amazon(-1254329128, new C10848l(c13072l2, this, 4), c6956l2);
            C5587l c5587lAmazon = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2);
            C15578l c15578lAmazon4 = AbstractC14566l.amazon(1637378093, new C3091l(this, c13072l2, (int) r0), c6956l2);
            c9455l = this;
            AbstractC15497l.loadAd(null, c15578lAmazon3, null, null, null, 0, 0L, 0L, c5587lAmazon, c15578lAmazon4, c6956l2, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4293l(c9455l, i);
        }
    }
}
