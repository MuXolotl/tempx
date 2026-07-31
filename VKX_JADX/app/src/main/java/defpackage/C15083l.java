package defpackage;

import android.hardware.camera2.CaptureResult;
import kotlin.Unit;

/* JADX INFO: renamed from: lٔۖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15083l implements InterfaceC9492l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29613l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29614l;

    public /* synthetic */ C15083l(int i, Object obj) {
        this.f29614l = i;
        this.f29613l = obj;
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void adcel(InterfaceC10687l interfaceC10687l, long j) {
        int i = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void ads(InterfaceC10687l interfaceC10687l) {
        int i = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void billing(InterfaceC10687l interfaceC10687l, long j, int i, int i2) {
        int i3 = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    public final void inmobi(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        Integer num;
        switch (this.f29614l) {
            case 0:
                return;
            default:
                if (((C2748l) this.f29613l).adcel.yandex == 0 || (num = (Integer) interfaceC10687l.loadAd(AbstractC14471l.loadAd)) == null) {
                    return;
                }
                C2748l c2748l = (C2748l) this.f29613l;
                int iIntValue = num.intValue();
                synchronized (c2748l.crashlytics) {
                    C11315l c11315l = c2748l.billing;
                    while (!c11315l.isEmpty() && ((C18405l) c11315l.first()).yandex <= iIntValue) {
                        ((C18405l) c11315l.first()).loadAd.m3885new(Unit.INSTANCE);
                        AbstractC3984l.advert(c11315l);
                        ((C2748l) this.f29613l).adcel.yandex();
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void isVip(InterfaceC10687l interfaceC10687l, long j, long j2) {
        int i = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void mopub(InterfaceC10687l interfaceC10687l, long j, long j2) {
        int i = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo1758package(InterfaceC10687l interfaceC10687l) {
        int i = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: private */
    public final void mo1759private(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) {
        Integer num;
        switch (this.f29614l) {
            case 0:
                return;
            default:
                if (((C2748l) this.f29613l).adcel.yandex == 0 || (num = (Integer) interfaceC10687l.loadAd(AbstractC14471l.loadAd)) == null) {
                    return;
                }
                C2748l c2748l = (C2748l) this.f29613l;
                int iIntValue = num.intValue();
                synchronized (c2748l.crashlytics) {
                    C11315l c11315l = c2748l.billing;
                    Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + interfaceC9595l.inmobi()));
                    while (!c11315l.isEmpty() && ((C18405l) c11315l.first()).yandex <= iIntValue) {
                        ((C18405l) c11315l.first()).loadAd.m2649l(th);
                        AbstractC3984l.advert(c11315l);
                        ((C2748l) this.f29613l).adcel.yandex();
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void signatures(InterfaceC10687l interfaceC10687l, int i) {
        int i2 = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ void mo1760switch(C15390l c15390l) {
        int i = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: synchronized */
    public final /* synthetic */ void mo1761synchronized(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
        int i = this.f29614l;
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: throw */
    public final void mo1762throw(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        switch (this.f29614l) {
            case 0:
                C9426l c9426l = (C9426l) this.f29613l;
                C15331l c15331l = (C15331l) c9992l.f20389l;
                Integer num = (Integer) c15331l.f29963l.get(CaptureResult.CONTROL_AE_STATE);
                Integer num2 = (Integer) c15331l.f29963l.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                if (num != null && num2 != null) {
                    int iIntValue = num.intValue();
                    if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == 0) {
                        c9426l.m3885new(0);
                    }
                    break;
                } else if (num2 != null && num2.intValue() == 0) {
                    c9426l.m3885new(0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void vip(InterfaceC10687l interfaceC10687l) {
        int i = this.f29614l;
    }

    private final /* synthetic */ void ad(InterfaceC10687l interfaceC10687l) {
    }

    private final /* synthetic */ void advert(InterfaceC10687l interfaceC10687l) {
    }

    private final /* synthetic */ void license(InterfaceC10687l interfaceC10687l) {
    }

    private final /* synthetic */ void loadAd(C15390l c15390l) {
    }

    private final /* synthetic */ void pro(InterfaceC10687l interfaceC10687l) {
    }

    private final /* synthetic */ void startapp(InterfaceC10687l interfaceC10687l) {
    }

    private final /* synthetic */ void subscription(InterfaceC10687l interfaceC10687l) {
    }

    private final /* synthetic */ void yandex(C15390l c15390l) {
    }

    private final /* synthetic */ void Signature(InterfaceC10687l interfaceC10687l, long j) {
    }

    private final /* synthetic */ void admob(InterfaceC10687l interfaceC10687l, int i) {
    }

    private final /* synthetic */ void purchase(InterfaceC10687l interfaceC10687l, int i) {
    }

    private final /* synthetic */ void tapsense(InterfaceC10687l interfaceC10687l, long j) {
    }

    private final /* synthetic */ void applovin(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    private final /* synthetic */ void appmetrica(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
    }

    private final /* synthetic */ void firebase(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
    }

    private final /* synthetic */ void isPro(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) {
    }

    private final /* synthetic */ void metrica(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    private final /* synthetic */ void premium(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    private final /* synthetic */ void remoteconfig(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    private final /* synthetic */ void smaato(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
    }

    private final /* synthetic */ void subs(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
    }

    private final /* synthetic */ void amazon(InterfaceC10687l interfaceC10687l, long j, int i, int i2) {
    }

    private final /* synthetic */ void crashlytics(InterfaceC10687l interfaceC10687l, long j, int i, int i2) {
    }
}
