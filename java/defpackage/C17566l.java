package defpackage;

/* JADX INFO: renamed from: lٗۧۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17566l extends AbstractC0155l {
    public AbstractC1299l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17566l(AbstractC1299l abstractC1299l, int i) {
        this.yandex = i;
        this.loadAd = abstractC1299l;
    }

    @Override // defpackage.AbstractC0155l, defpackage.InterfaceC4788l
    public void crashlytics(AbstractC1299l abstractC1299l) {
        switch (this.yandex) {
            case 1:
                C0132l c0132l = (C0132l) this.loadAd;
                if (!c0132l.f1039l) {
                    c0132l.m865native();
                    c0132l.f1039l = true;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0155l, defpackage.InterfaceC4788l
    public void mopub(AbstractC1299l abstractC1299l) {
        switch (this.yandex) {
            case 0:
                C0132l c0132l = (C0132l) this.loadAd;
                c0132l.f1038l.remove(abstractC1299l);
                if (!c0132l.tapsense()) {
                    c0132l.ad(c0132l, C1759l.f4171l, false);
                    c0132l.f3376l = true;
                    c0132l.ad(c0132l, C1759l.f4168l, false);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0155l, defpackage.InterfaceC4788l
    public void yandex(AbstractC1299l abstractC1299l) {
        switch (this.yandex) {
            case 1:
                C0132l c0132l = (C0132l) this.loadAd;
                int i = c0132l.f1037l - 1;
                c0132l.f1037l = i;
                if (i == 0) {
                    c0132l.f1039l = false;
                    c0132l.vip();
                }
                abstractC1299l.signatures(this);
                break;
            case 2:
                this.loadAd.applovin();
                abstractC1299l.signatures(this);
                break;
        }
    }

    public /* synthetic */ C17566l() {
        this.yandex = 1;
    }
}
