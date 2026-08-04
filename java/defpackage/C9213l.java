package defpackage;

/* JADX INFO: renamed from: lٌۧۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9213l implements InterfaceC5793l {
    public final C5866l yandex;

    public C9213l(C5866l c5866l) {
        this.yandex = c5866l;
    }

    @Override // defpackage.InterfaceC5793l
    public final boolean amazon() {
        return !this.yandex.admob().firebase.isEmpty();
    }

    @Override // defpackage.InterfaceC5793l
    public final int crashlytics() {
        int i;
        C5866l c5866l = this.yandex;
        if (c5866l.admob().firebase.isEmpty()) {
            return 0;
        }
        C1644l c1644lAdmob = c5866l.admob();
        int iSubs = (int) (c1644lAdmob.metrica == EnumC7283l.f15126l ? c1644lAdmob.subs() & 4294967295L : c1644lAdmob.subs() >> 32);
        int iSmaato = AbstractC14879l.smaato(c5866l.admob());
        if (iSmaato != 0 && (i = iSubs / iSmaato) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.InterfaceC5793l
    public final int loadAd() {
        return Math.min(yandex() - 1, ((C15237l) AbstractC16901l.m4214continue(this.yandex.admob().firebase)).yandex);
    }

    @Override // defpackage.InterfaceC5793l
    public final int purchase() {
        return Math.max(0, this.yandex.purchase.loadAd.admob());
    }

    @Override // defpackage.InterfaceC5793l
    public final int yandex() {
        return this.yandex.admob().vip;
    }
}
