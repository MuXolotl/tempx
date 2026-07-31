package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lَٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10632l implements InterfaceC12499l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f21575l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4154l f21576l;

    public C10632l(C4154l c4154l, boolean z) {
        this.f21576l = c4154l;
        this.f21575l = z;
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: lَٖؕ */
    public final Object mo1110l(long j, InterfaceC14029l interfaceC14029l) {
        return new C12121l(0L);
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: return */
    public final long mo1111return(int i, long j, long j2) {
        if (!this.f21575l) {
            return 0L;
        }
        C4154l c4154l = this.f21576l;
        if (c4154l.yandex.yandex()) {
            return 0L;
        }
        return c4154l.subs(c4154l.purchase(c4154l.yandex.purchase(c4154l.purchase(c4154l.admob(j2)))));
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ long mo1112switch(int i, long j) {
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: throws */
    public final Object mo1113throws(long j, long j2, InterfaceC14029l interfaceC14029l) throws Throwable {
        C7993l c7993l;
        long jAmazon;
        if (interfaceC14029l instanceof C7993l) {
            c7993l = (C7993l) interfaceC14029l;
            int i = c7993l.f16658l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7993l.f16658l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7993l = new C7993l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c7993l = new C7993l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objYandex = c7993l.f16659l;
        int i2 = c7993l.f16658l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            jAmazon = 0;
            if (this.f21575l) {
                C4154l c4154l = this.f21576l;
                if (!c4154l.subs) {
                    c7993l.f16660l = j2;
                    c7993l.f16658l = 1;
                    objYandex = c4154l.yandex(j2, c7993l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                }
                jAmazon = C12121l.amazon(j2, jAmazon);
            }
            return new C12121l(jAmazon);
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = c7993l.f16660l;
        AbstractC2829l.crashlytics(objYandex);
        jAmazon = ((C12121l) objYandex).yandex;
        jAmazon = C12121l.amazon(j2, jAmazon);
        return new C12121l(jAmazon);
    }
}
