package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8005l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13264l f16685l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16686l;

    public /* synthetic */ C8005l(AbstractC13264l abstractC13264l, int i) {
        this.f16686l = i;
        this.f16685l = abstractC13264l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16686l) {
            case 0:
                C0923l c0923l = (C0923l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(c0923l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    float fLoadAd = c0923l.loadAd() / 2.0f;
                    C17253l c17253lAmazon = AbstractC3605l.amazon(fLoadAd, 0.0f, fLoadAd - 8.0f, 0.0f, 10);
                    InterfaceC17242l interfaceC17242lAdcel = AbstractC15042l.adcel(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), AbstractC15042l.Signature());
                    C0457l c0457l = new C0457l(8.0f);
                    C5947l c5947l = new C5947l(Alert.DURATION_SHOW_INDEFINITELY);
                    AbstractC13264l abstractC13264l = this.f16685l;
                    AbstractC7252l.yandex(abstractC13264l, interfaceC17242lAdcel, c17253lAmazon, c0457l, 24.0f, null, AbstractC0133l.admob(abstractC13264l, c5947l, c6956l, 0, 28), false, null, null, null, AbstractC14566l.amazon(-1004122042, new C4508l(10, abstractC13264l), c6956l), c6956l, 196608, 24576, 16208);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C11636l c11636l = (C11636l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? c6956l2.billing(c11636l) : c6956l2.admob(c11636l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    AbstractC7470l.yandex(c11636l, ((C15308l) this.f16685l.amazon.f32506l).admob(), C9735l.loadAd(0.25f, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.yandex), c6956l2, iIntValue2 & 14);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
