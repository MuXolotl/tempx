package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؘۧۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6133l implements InterfaceC14371l {
    public final /* synthetic */ boolean loadAd;
    public final /* synthetic */ AbstractC13264l yandex;

    public C6133l(AbstractC13264l abstractC13264l, boolean z) {
        this.yandex = abstractC13264l;
        this.loadAd = z;
    }

    @Override // defpackage.InterfaceC14371l
    public final int amazon() {
        AbstractC13264l abstractC13264l = this.yandex;
        return (-abstractC13264l.firebase().billing) + abstractC13264l.firebase().amazon;
    }

    @Override // defpackage.InterfaceC14371l
    public final C11907l billing() {
        boolean z = this.loadAd;
        AbstractC13264l abstractC13264l = this.yandex;
        return z ? new C11907l(abstractC13264l.smaato(), 1) : new C11907l(1, abstractC13264l.smaato());
    }

    @Override // defpackage.InterfaceC14371l
    public final Object crashlytics(int i, C13017l c13017l) {
        AbstractC13264l abstractC13264l = this.yandex;
        abstractC13264l.getClass();
        Object objLoadAd = abstractC13264l.loadAd(EnumC11011l.f22182l, new C18630l(abstractC13264l, i, null, 0), c13017l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objLoadAd != enumC9342l) {
            objLoadAd = Unit.INSTANCE;
        }
        return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14371l
    public final float loadAd() {
        return AbstractC5518l.loadAd(this.yandex);
    }

    @Override // defpackage.InterfaceC14371l
    public final float purchase() {
        AbstractC13264l abstractC13264l = this.yandex;
        return AbstractC10521l.yandex(abstractC13264l.firebase(), abstractC13264l.smaato());
    }

    @Override // defpackage.InterfaceC14371l
    public final int yandex() {
        AbstractC13264l abstractC13264l = this.yandex;
        return (int) (abstractC13264l.firebase().purchase == EnumC7283l.f15126l ? abstractC13264l.firebase().subs() & 4294967295L : abstractC13264l.firebase().subs() >> 32);
    }
}
