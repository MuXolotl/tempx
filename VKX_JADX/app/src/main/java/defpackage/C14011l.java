package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؚٓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14011l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ long f27316l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f27317l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Throwable f27318l;

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f27317l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            Throwable th = this.f27318l;
            long j = this.f27316l;
            C14513l.tapsense().ads(AbstractC15047l.yandex, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, AbstractC15047l.loadAd);
            this.f27317l = 1;
            Object objPurchase = AbstractC8532l.purchase(jMin, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPurchase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Boolean.TRUE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        C14011l c14011l = new C14011l(4, (InterfaceC14029l) obj4);
        c14011l.f27318l = (Throwable) obj2;
        c14011l.f27316l = jLongValue;
        return c14011l.Signature(Unit.INSTANCE);
    }
}
