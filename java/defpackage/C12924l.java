package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lّۡٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12924l implements InterfaceC11947l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C3095l f25373l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12356l f25374l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25375l;

    public /* synthetic */ C12924l(InterfaceC12356l interfaceC12356l, C3095l c3095l, int i) {
        this.f25375l = i;
        this.f25374l = interfaceC12356l;
        this.f25373l = c3095l;
    }

    @Override // defpackage.InterfaceC11947l
    public final void amazon() {
        switch (this.f25375l) {
            case 0:
                break;
            default:
                this.f25374l.crashlytics(this);
                C11644l c11644l = this.f25373l.crashlytics;
                c11644l.f23361l = AbstractC10999l.mopub((C18662l) c11644l.f23358l, null, 0, new C11266l(c11644l, null, 1), 3);
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void billing() {
        int i = this.f25375l;
    }

    @Override // defpackage.InterfaceC11947l
    public final void loadAd() {
        int i = this.f25375l;
    }

    @Override // defpackage.InterfaceC11947l
    public final void onCreate() {
        List list;
        List list2;
        switch (this.f25375l) {
            case 0:
                C3095l c3095l = this.f25373l;
                C17928l c17928l = c3095l.amazon;
                this.f25374l.crashlytics(this);
                C6232l c6232lAdcel = AbstractC7470l.adcel((C7026l) AbstractC16584l.loadAd().f15742l);
                if (((c6232lAdcel == null || (list2 = c6232lAdcel.loadAd) == null) ? 0 : list2.size()) <= 1) {
                    C6232l c6232lAdcel2 = AbstractC7470l.adcel((C7026l) AbstractC16584l.loadAd().f15742l);
                    if (((c6232lAdcel2 == null || (list = c6232lAdcel2.loadAd) == null) ? 0 : list.size()) != 0) {
                        C4645l c4645l = (C4645l) AbstractC16584l.loadAd().f15735l;
                        C4645l.Companion.getClass();
                        if (!AbstractC8576l.yandex(c4645l, C4645l.smaato)) {
                            long j = ((C4645l) AbstractC16584l.loadAd().f15735l).yandex;
                            AbstractC6873l.crashlytics(c17928l, new C8578l(24));
                            AbstractC10999l.mopub(c3095l.loadAd, null, 0, new C17400l(j, c3095l, (InterfaceC14029l) null, 7), 3);
                        }
                    }
                } else {
                    AbstractC6873l.crashlytics(c17928l, C2911l.f6335l);
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void onDestroy() {
        int i = this.f25375l;
    }

    @Override // defpackage.InterfaceC11947l
    public final void purchase() {
        int i = this.f25375l;
    }

    private final void admob() {
    }

    private final void crashlytics() {
    }

    private final void firebase() {
    }

    private final void isPro() {
    }

    private final void mopub() {
    }

    private final void remoteconfig() {
    }

    private final void smaato() {
    }

    private final void subs() {
    }

    private final void vip() {
    }

    private final void yandex() {
    }
}
