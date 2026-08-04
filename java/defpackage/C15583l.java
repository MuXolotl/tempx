package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍٕٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15583l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30425l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30426l;

    public /* synthetic */ C15583l(int i, Object obj) {
        this.f30426l = i;
        this.f30425l = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30426l;
        Object obj3 = this.f30425l;
        switch (i) {
            case 0:
                InterfaceC15725l interfaceC15725l = (InterfaceC15725l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C10053l.yandex(new C7552l(R.drawable.logo_vkx_32), null, AbstractC2812l.crashlytics(new C8079l(new C9402l(18.0f)), new C4538l(new C9402l(18.0f))), 0, new C2607l(new C12922l(interfaceC15725l)), c6956l, 32816, 8);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C9135l) obj3).license((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC12953l.billing((C12097l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 3:
                return new C5177l(((long) ((C0086l) obj3).yandex(0, (int) (((C4999l) obj).yandex & 4294967295L))) & 4294967295L);
            default:
                return new C5177l(((C14855l) obj3).yandex(0L, ((C4999l) obj).yandex, (EnumC9931l) obj2));
        }
    }

    public /* synthetic */ C15583l(Object obj, int i, int i2) {
        this.f30426l = i2;
        this.f30425l = obj;
    }
}
