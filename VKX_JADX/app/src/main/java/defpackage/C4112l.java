package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: renamed from: lؖٓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4112l implements InterfaceC14833l {
    public final Object loadAd;
    public final /* synthetic */ int yandex = 1;

    public C4112l(int i) {
        if ((i & 1) != 0) {
            this.loadAd = new C14854l(65496, 2, "image/jpeg");
        } else {
            this.loadAd = new C0754l();
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        switch (this.yandex) {
            case 0:
                break;
            default:
                ((InterfaceC14833l) this.loadAd).amazon(j, j2);
                break;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(0, 3);
                interfaceC2053l.tapsense(new C9828l(-9223372036854775807L));
                interfaceC2053l.firebase();
                C5978l c5978l = (C5978l) obj;
                C12984l c12984lYandex = c5978l.yandex();
                c12984lYandex.vip = AbstractC3825l.vip("text/x-unknown");
                c12984lYandex.isPro = c5978l.metrica;
                AbstractC9029l.license(c12984lYandex, interfaceC8979lStartapp);
                break;
            default:
                ((InterfaceC14833l) obj).billing(interfaceC2053l);
                break;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        switch (this.yandex) {
            case 0:
                return true;
            default:
                return ((InterfaceC14833l) this.loadAd).crashlytics(interfaceC10430l);
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        switch (this.yandex) {
            case 0:
                return interfaceC10430l.subs(Alert.DURATION_SHOW_INDEFINITELY) == -1 ? -1 : 0;
            default:
                return ((InterfaceC14833l) this.loadAd).loadAd(interfaceC10430l, c1014l);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        switch (this.yandex) {
        }
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
        switch (this.yandex) {
            case 0:
                break;
            default:
                ((InterfaceC14833l) this.loadAd).release();
                break;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        int i = this.yandex;
        return this;
    }

    private final void mopub() {
    }

    public C4112l(C5978l c5978l) {
        this.loadAd = c5978l;
    }

    private final void admob(long j, long j2) {
    }
}
