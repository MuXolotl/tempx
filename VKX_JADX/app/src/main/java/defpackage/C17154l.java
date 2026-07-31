package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٕٗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17154l {
    public final C10086l amazon;
    public final Function0 crashlytics;
    public final C18656l loadAd;
    public final C14632l yandex;
    public final C10086l purchase = AbstractC8020l.smaato(AbstractC17122l.yandex);
    public InterfaceC17807l billing = AbstractC12535l.yandex;
    public final C10086l mopub = AbstractC8020l.smaato(null);

    public C17154l(C14632l c14632l, C18656l c18656l, C15738l c15738l, Function0 function0) {
        this.yandex = c14632l;
        this.loadAd = c18656l;
        this.crashlytics = function0;
        this.amazon = AbstractC8020l.smaato(c15738l);
    }

    public final C8896l crashlytics() {
        InterfaceC12244l interfaceC12244l;
        C8896l c8896l;
        if (!this.yandex.loadAd() || (interfaceC12244l = (InterfaceC12244l) this.mopub.getValue()) == null || (c8896l = (C8896l) interfaceC12244l.getValue()) == null) {
            return null;
        }
        long j = ((C1187l) this.crashlytics.invoke()).yandex;
        return !C1187l.loadAd(j, 0L) ? c8896l.vip(j) : c8896l;
    }

    public final boolean loadAd() {
        return ((Boolean) this.loadAd.amazon.getValue()).booleanValue();
    }

    public final void yandex(C8896l c8896l, C8896l c8896l2, C13657l c13657l) {
        C13315l c13315lAdmob;
        if (this.yandex.loadAd()) {
            C10086l c10086l = this.mopub;
            if (((InterfaceC12244l) c10086l.getValue()) == null) {
                if (c13657l == null) {
                    c13657l = (C13657l) this.purchase.getValue();
                }
                switch (c13657l.yandex) {
                    case 0:
                        c13315lAdmob = AbstractC0532l.admob(0.0f, 0.0f, AbstractC11922l.yandex, 3);
                        break;
                    default:
                        c13315lAdmob = AbstractC17863l.yandex;
                        break;
                }
                this.billing = c13315lAdmob;
            }
            c10086l.setValue(((C15738l) this.amazon.getValue()).yandex(new C3006l(8, this), null, null, new C12683l(this, c8896l2, c8896l, 2)));
        }
    }
}
