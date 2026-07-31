package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12861l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13264l f25293l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25294l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1489l f25295l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f25296l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ float f25297l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f25298l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12861l(AbstractC13264l abstractC13264l, int i, float f, InterfaceC1489l interfaceC1489l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25293l = abstractC13264l;
        this.f25294l = i;
        this.f25297l = f;
        this.f25295l = interfaceC1489l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i;
        int i2 = this.f25296l;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            InterfaceC1555l interfaceC1555l = (InterfaceC1555l) this.f25298l;
            AbstractC13264l abstractC13264l = this.f25293l;
            C5092l c5092l = new C5092l(interfaceC1555l, abstractC13264l, i3);
            this.f25296l = 1;
            C6157l c6157l = AbstractC10521l.yandex;
            int i4 = this.f25294l;
            abstractC13264l.adcel.subs(abstractC13264l.isPro(new Integer(i4).intValue()));
            Unit unit = Unit.INSTANCE;
            boolean z = i4 > abstractC13264l.purchase;
            int iPurchase = (c5092l.purchase() - abstractC13264l.purchase) + 1;
            if (((z && i4 > c5092l.purchase()) || (!z && i4 < abstractC13264l.purchase)) && Math.abs(i4 - abstractC13264l.purchase) >= 3) {
                if (z) {
                    i = i4 - iPurchase;
                    int i5 = abstractC13264l.purchase;
                    if (i < i5) {
                        i = i5;
                    }
                } else {
                    int i6 = iPurchase + i4;
                    i = abstractC13264l.purchase;
                    if (i6 <= i) {
                        i = i6;
                    }
                }
                c5092l.billing(i);
            }
            Object objAmazon = AbstractC18719l.amazon(0.0f, c5092l.loadAd(i4) + this.f25297l, this.f25295l, new C3158l(new C13250l(), c5092l, 26), this, 4);
            Object obj2 = EnumC9342l.f19165l;
            if (objAmazon != obj2) {
                objAmazon = Unit.INSTANCE;
            }
            if (objAmazon == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C12861l c12861l = new C12861l(this.f25293l, this.f25294l, this.f25297l, this.f25295l, interfaceC14029l);
        c12861l.f25298l = obj;
        return c12861l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12861l) ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj)).Signature(Unit.INSTANCE);
    }
}
