package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0382l extends C2998l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1477l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0382l(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f1477l = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f1477l;
        boolean z = false;
        Object obj2 = this.f6501l;
        switch (i) {
            case 0:
                C15830l c15830l = (C15830l) obj;
                C3464l c3464l = (C3464l) obj2;
                C8108l c8108lBilling = AbstractC0555l.billing(c3464l.yandex);
                if (c8108lBilling != null) {
                    c3464l.loadAd = new C10023l(c15830l, c8108lBilling, z);
                    Function1 function1 = c8108lBilling.amazon;
                    if (function1 != null) {
                        function1.invoke(c15830l);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C16854l c16854l = (C16854l) obj2;
                c16854l.getClass();
                AbstractC10999l.mopub(AbstractC11990l.firebase(c16854l), null, 0, new C13624l(c16854l, (C4530l) obj, null, 19), 3);
                return Unit.INSTANCE;
            case 2:
                ((C17893l) obj2).crashlytics((C0198l) obj);
                return Unit.INSTANCE;
            case 3:
                Object objAmazon = ((AbstractC12074l) obj2).amazon((InterfaceC14029l) obj);
                return objAmazon == EnumC9342l.f19165l ? objAmazon : Unit.INSTANCE;
            default:
                ((C4240l) obj2).m1512l(((C14694l) obj).yandex);
                return Unit.INSTANCE;
        }
    }
}
