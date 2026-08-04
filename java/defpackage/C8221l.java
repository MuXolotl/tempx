package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lًۘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8221l implements InterfaceC14745l {
    public final AbstractC13264l loadAd;
    public final C16290l yandex;

    public C8221l(C16290l c16290l, AbstractC13264l abstractC13264l) {
        this.yandex = c16290l;
        this.loadAd = abstractC13264l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC14745l
    public final Object yandex(InterfaceC1555l interfaceC1555l, float f, InterfaceC14029l interfaceC14029l) throws Throwable {
        C12077l c12077l;
        if (interfaceC14029l instanceof C12077l) {
            c12077l = (C12077l) interfaceC14029l;
            int i = c12077l.f24003l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12077l.f24003l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12077l = new C12077l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c12077l = new C12077l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objAmazon = c12077l.f24002l;
        int i2 = c12077l.f24003l;
        InterfaceC14029l interfaceC14029l2 = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAmazon);
            C8250l c8250l = new C8250l(this, interfaceC1555l, 16);
            c12077l.f24003l = 1;
            objAmazon = this.yandex.amazon(interfaceC1555l, f, c8250l, c12077l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAmazon);
        }
        float fFloatValue = ((Number) objAmazon).floatValue();
        AbstractC13264l abstractC13264l = this.loadAd;
        C16557l c16557l = abstractC13264l.amazon;
        C16557l c16557l2 = abstractC13264l.amazon;
        if (((C13765l) c16557l.f32505l).admob() != 0.0f && Math.abs(((C13765l) c16557l2.f32505l).admob()) < 0.001d) {
            int iAdmob = ((C15308l) c16557l2.f32506l).admob();
            if (abstractC13264l.firebase.yandex()) {
                AbstractC10999l.mopub(((C4685l) abstractC13264l.remoteconfig.getValue()).subscription, null, 0, new C16501l(2, interfaceC14029l2, abstractC13264l), 3);
            }
            abstractC13264l.subscription(0.0f, iAdmob, false);
        } else {
            new Float(((C13765l) c16557l2.f32505l).admob());
        }
        return new Float(fFloatValue);
    }
}
