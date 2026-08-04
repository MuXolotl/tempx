package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘؗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5092l implements InterfaceC1555l {
    public final /* synthetic */ InterfaceC17955l crashlytics;
    public final /* synthetic */ InterfaceC1555l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C5092l(InterfaceC1555l interfaceC1555l, InterfaceC17955l interfaceC17955l, int i) {
        this.yandex = i;
        this.crashlytics = interfaceC17955l;
        this.loadAd = interfaceC1555l;
    }

    public final int amazon() {
        int i = this.yandex;
        InterfaceC17955l interfaceC17955l = this.crashlytics;
        switch (i) {
            case 0:
                return ((C5866l) interfaceC17955l).purchase.crashlytics.admob();
            default:
                return ((AbstractC13264l) interfaceC17955l).billing;
        }
    }

    public final void billing(int i) {
        int i2 = this.yandex;
        InterfaceC17955l interfaceC17955l = this.crashlytics;
        switch (i2) {
            case 0:
                ((C5866l) interfaceC17955l).firebase(i, 0, true);
                break;
            default:
                AbstractC13264l abstractC13264l = (AbstractC13264l) interfaceC17955l;
                float fVip = abstractC13264l.vip();
                abstractC13264l.subscription(fVip != 0.0f ? 0.0f / fVip : 0.0f, i, true);
                break;
        }
    }

    public final int crashlytics() {
        int i = this.yandex;
        InterfaceC17955l interfaceC17955l = this.crashlytics;
        switch (i) {
            case 0:
                return ((C5866l) interfaceC17955l).purchase.loadAd.admob();
            default:
                return ((AbstractC13264l) interfaceC17955l).purchase;
        }
    }

    public final int loadAd(int i) {
        Object obj;
        int i2 = this.yandex;
        InterfaceC17955l interfaceC17955l = this.crashlytics;
        switch (i2) {
            case 0:
                C1644l c1644lAdmob = ((C5866l) interfaceC17955l).admob();
                if (c1644lAdmob.firebase.isEmpty()) {
                    return 0;
                }
                int iCrashlytics = crashlytics();
                if (i > purchase() || iCrashlytics > i) {
                    return ((i - crashlytics()) * AbstractC14879l.smaato(c1644lAdmob)) - amazon();
                }
                List list = c1644lAdmob.firebase;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((C15237l) obj).yandex != i) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                C15237l c15237l = (C15237l) obj;
                if (c15237l != null) {
                    return c15237l.metrica;
                }
                return 0;
            default:
                AbstractC13264l abstractC13264l = (AbstractC13264l) interfaceC17955l;
                return (int) (AbstractC8576l.mopub(AbstractC5518l.loadAd(abstractC13264l) + ((long) AbstractC5573l.ads(((abstractC13264l.vip() * (i - ((C15308l) abstractC13264l.amazon.f32506l).admob())) - (((C13765l) abstractC13264l.amazon.f32505l).admob() * abstractC13264l.vip())) + 0.0f)), abstractC13264l.admob, abstractC13264l.mopub) - AbstractC5518l.loadAd(abstractC13264l));
        }
    }

    public final int purchase() {
        int i = this.yandex;
        InterfaceC17955l interfaceC17955l = this.crashlytics;
        switch (i) {
            case 0:
                C15237l c15237l = (C15237l) AbstractC16901l.m4212class(((C5866l) interfaceC17955l).admob().firebase);
                if (c15237l != null) {
                    return c15237l.yandex;
                }
                return 0;
            default:
                return ((C10824l) AbstractC16901l.m4214continue(((AbstractC13264l) interfaceC17955l).firebase().yandex)).yandex;
        }
    }

    @Override // defpackage.InterfaceC1555l
    public final float yandex(float f) {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd.yandex(f);
    }
}
