package defpackage;

import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8633l implements InterfaceC11947l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f17789l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17790l;

    public /* synthetic */ C8633l(int i, Object obj) {
        this.f17790l = i;
        this.f17789l = obj;
    }

    @Override // defpackage.InterfaceC11947l
    public final void amazon() {
        switch (this.f17790l) {
            case 4:
                ((Function1) this.f17789l).invoke(EnumC2771l.f6020l);
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void billing() {
        switch (this.f17790l) {
            case 4:
                ((Function1) this.f17789l).invoke(EnumC2771l.f6021l);
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void loadAd() {
        switch (this.f17790l) {
            case 4:
                ((Function1) this.f17789l).invoke(EnumC2771l.f6017l);
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void onCreate() {
        switch (this.f17790l) {
            case 4:
                ((Function1) this.f17789l).invoke(EnumC2771l.f6017l);
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void onDestroy() {
        int i = this.f17790l;
        Object obj = this.f17789l;
        switch (i) {
            case 0:
                ((C15263l) obj).amazon();
                break;
            case 1:
                Iterator it = new C3862l(((C13366l) ((C0554l) obj).f1956l).yandex).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((C8772l) it).f18067l;
                    if (!listIterator.hasPrevious()) {
                        break;
                    } else {
                        InterfaceC7901l interfaceC7901l = (InterfaceC7901l) listIterator.previous();
                        if (!(interfaceC7901l instanceof C3217l)) {
                            if (!(interfaceC7901l instanceof C8126l)) {
                                C18725l.billing();
                                break;
                            }
                        } else {
                            C3217l c3217l = (C3217l) interfaceC7901l;
                            c3217l.mopub.purchase();
                            AbstractC18263l.mopub(c3217l.amazon);
                        }
                    }
                }
                break;
            case 2:
                AbstractC11990l.billing((C18662l) obj, null);
                break;
            case 3:
                ((C6921l) obj).admob();
                break;
            case 4:
                ((Function1) obj).invoke(EnumC2771l.f6019l);
                break;
            default:
                C11644l c11644l = ((C3095l) obj).crashlytics;
                C7504l c7504l = (C7504l) c11644l.f23361l;
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                c11644l.f23361l = null;
                break;
        }
    }

    @Override // defpackage.InterfaceC11947l
    public final void purchase() {
        switch (this.f17790l) {
            case 4:
                ((Function1) this.f17789l).invoke(EnumC2771l.f6021l);
                break;
        }
    }

    private final void Signature() {
    }

    private final void ad() {
    }

    private final void adcel() {
    }

    private final void admob() {
    }

    private final void ads() {
    }

    private final void advert() {
    }

    private final void applovin() {
    }

    private final void crashlytics() {
    }

    private final void firebase() {
    }

    private final void isPro() {
    }

    private final void isVip() {
    }

    private final void license() {
    }

    private final void metrica() {
    }

    private final void mopub() {
    }

    private final void premium() {
    }

    private final void pro() {
    }

    private final void remoteconfig() {
    }

    private final void signatures() {
    }

    private final void smaato() {
    }

    private final void startapp() {
    }

    private final void subs() {
    }

    private final void subscription() {
    }

    private final void tapsense() {
    }

    private final void vip() {
    }

    private final void yandex() {
    }
}
