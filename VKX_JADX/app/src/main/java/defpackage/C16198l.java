package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16198l implements InterfaceC17211l, InterfaceC2933l, InterfaceC2794l {
    public final C4384l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C16198l(C4384l c4384l, int i) {
        this.yandex = i;
        this.loadAd = c4384l;
    }

    @Override // defpackage.InterfaceC11730l
    public final /* synthetic */ void amazon(String str) {
        int i = this.yandex;
        AbstractC5020l.amazon(this, str);
    }

    @Override // defpackage.InterfaceC11872l
    public final void billing() {
        C9695l c9695l;
        switch (this.yandex) {
            case 0:
                c9695l = new C9695l(new C0388l());
                break;
            default:
                c9695l = new C9695l(new C0388l());
                break;
        }
        remoteconfig(c9695l);
    }

    @Override // defpackage.InterfaceC17211l
    public final /* synthetic */ void crashlytics(String str, Function1 function1) {
        int i = this.yandex;
        AbstractC5020l.loadAd(this, str, function1);
    }

    @Override // defpackage.InterfaceC2794l
    public void loadAd() {
        vip(new C9695l(new C16658l()));
    }

    @Override // defpackage.InterfaceC11872l
    public final /* synthetic */ void purchase() {
        int i = this.yandex;
        AbstractC5020l.billing(this);
    }

    @Override // defpackage.InterfaceC2933l
    public final void remoteconfig(C9695l c9695l) {
        switch (this.yandex) {
            case 0:
                vip(c9695l);
                break;
            default:
                this.loadAd.yandex(c9695l);
                break;
        }
    }

    @Override // defpackage.InterfaceC17211l
    public final InterfaceC17211l smaato() {
        switch (this.yandex) {
            case 0:
                return new C16198l(new C4384l(), 0);
            default:
                return new C16198l(new C4384l(), 1);
        }
    }

    @Override // defpackage.InterfaceC17211l
    public final /* synthetic */ void subs(Function1[] function1Arr, Function1 function1) {
        int i = this.yandex;
        AbstractC5020l.yandex(this, function1Arr, function1);
    }

    public void vip(InterfaceC16243l interfaceC16243l) {
        this.loadAd.yandex(interfaceC16243l);
    }

    @Override // defpackage.InterfaceC17211l
    public final C4384l yandex() {
        int i = this.yandex;
        return this.loadAd;
    }
}
