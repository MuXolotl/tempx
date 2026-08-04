package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11103l extends AbstractC18026l {

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public static final C4480l f22306l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public final C13924l f22307l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public C16857l f22308l;

    static {
        C4480l c4480lYandex = AbstractC4311l.yandex();
        c4480lYandex.billing(C9735l.billing);
        c4480lYandex.remoteconfig(1.0f);
        c4480lYandex.vip(1);
        f22306l = c4480lYandex;
    }

    public C11103l(C3654l c3654l) {
        super(c3654l);
        C13924l c13924l = new C13924l();
        c13924l.f29457l = 0;
        this.f22307l = c13924l;
        c13924l.f29452l = this;
        this.f22308l = c3654l.f7693l != null ? new C16857l(this) : null;
    }

    @Override // defpackage.InterfaceC6357l
    public final AbstractC10113l adcel(long j) {
        if (this.f35273l) {
            j = this.f22308l.f20594l;
        }
        m2888new(j);
        C3654l c3654l = this.f35281l;
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            ((C3654l) objArr[i2]).f7667l.startapp.f29317l = 3;
        }
        m4479l(c3654l.f7692l.loadAd(this, c3654l.vip(), j));
        m4489l();
        return this;
    }

    @Override // defpackage.AbstractC18026l, defpackage.AbstractC10113l
    /* JADX INFO: renamed from: class */
    public final void mo1459class(long j, float f, C11925l c11925l) {
        C11103l c11103l;
        if (this.f35274l) {
            c11103l = this;
            c11103l.m4478l(mo2645l().f4024l, f, null, c11925l);
        } else {
            c11103l = this;
            c11103l.m4478l(j, f, null, c11925l);
        }
        if (c11103l.f23554l) {
            return;
        }
        c11103l.f35281l.f7667l.startapp.m3905protected();
    }

    @Override // defpackage.InterfaceC6357l
    public final int crashlytics(int i) {
        C0458l c0458lSignature = this.f35281l.Signature();
        InterfaceC10835l interfaceC10835lM556throws = c0458lSignature.m556throws();
        C3654l c3654l = (C3654l) c0458lSignature.f1691l;
        return interfaceC10835lM556throws.amazon((AbstractC18026l) c3654l.f7703l.purchase, c3654l.vip(), i);
    }

    @Override // defpackage.InterfaceC6357l
    /* JADX INFO: renamed from: for */
    public final int mo1460for(int i) {
        C0458l c0458lSignature = this.f35281l.Signature();
        InterfaceC10835l interfaceC10835lM556throws = c0458lSignature.m556throws();
        C3654l c3654l = (C3654l) c0458lSignature.f1691l;
        return interfaceC10835lM556throws.purchase((AbstractC18026l) c3654l.f7703l.purchase, c3654l.vip(), i);
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: interface */
    public final void mo883interface(long j, float f, Function1 function1) {
        if (this.f35274l) {
            m4478l(mo2645l().f4024l, f, function1, null);
        } else {
            m4478l(j, f, function1, null);
        }
        if (this.f23554l) {
            return;
        }
        this.f35281l.f7667l.startapp.m3905protected();
    }

    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final AbstractC14971l mo2643l() {
        return this.f22307l;
    }

    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo2644l() {
        if (this.f22308l == null) {
            this.f22308l = new C16857l(this);
        }
    }

    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lًٚٔ */
    public final AbstractC1668l mo2645l() {
        return this.f22308l;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final void mo3040l(InterfaceC4789l interfaceC4789l, long j, C18333l c18333l, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        C3654l c3654l;
        long jAmazon;
        C3654l c3654l2 = this.f35281l;
        boolean z3 = false;
        if (interfaceC4789l.remoteconfig(c3654l2)) {
            if (!m4483l(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(m4477l(j, m4471l())) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = c18333l.f35842l;
                    C17893l c17893lIsVip = c3654l2.isVip();
                    objArr = c17893lIsVip.f34848l;
                    i3 = c17893lIsVip.f34846l - 1;
                    while (i3 >= 0) {
                        c3654l = (C3654l) objArr[i3];
                        if (c3654l.m1389private()) {
                            interfaceC4789l.subs(c3654l, j, c18333l, i2, z2);
                            jAmazon = c18333l.amazon();
                            if (AbstractC10733l.crashlytics(jAmazon) >= 0.0f && AbstractC10733l.billing(jAmazon) && !AbstractC10733l.purchase(jAmazon) && !interfaceC4789l.isPro(c18333l, c3654l)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    c18333l.f35842l = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = c18333l.f35842l;
                C17893l c17893lIsVip2 = c3654l2.isVip();
                objArr = c17893lIsVip2.f34848l;
                i3 = c17893lIsVip2.f34846l - 1;
                while (i3 >= 0) {
                    c3654l = (C3654l) objArr[i3];
                    if (c3654l.m1389private()) {
                        interfaceC4789l.subs(c3654l, j, c18333l, i2, z2);
                        jAmazon = c18333l.amazon();
                        if (AbstractC10733l.crashlytics(jAmazon) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                c18333l.f35842l = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = c18333l.f35842l;
            C17893l c17893lIsVip3 = c3654l2.isVip();
            objArr = c17893lIsVip3.f34848l;
            i3 = c17893lIsVip3.f34846l - 1;
            while (i3 >= 0) {
                c3654l = (C3654l) objArr[i3];
                if (c3654l.m1389private()) {
                    interfaceC4789l.subs(c3654l, j, c18333l, i2, z2);
                    jAmazon = c18333l.amazon();
                    if (AbstractC10733l.crashlytics(jAmazon) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            c18333l.f35842l = i6;
        }
    }

    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lٕۗٞ */
    public final void mo2647l(InterfaceC14859l interfaceC14859l, C11925l c11925l) {
        C3654l c3654l = this.f35281l;
        InterfaceC11218l interfaceC11218lYandex = AbstractC5672l.yandex(c3654l);
        C17893l c17893lIsVip = c3654l.isVip();
        Object[] objArr = c17893lIsVip.f34848l;
        int i = c17893lIsVip.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C3654l c3654l2 = (C3654l) objArr[i2];
            if (c3654l2.m1389private()) {
                c3654l2.isPro(interfaceC14859l, c11925l);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218lYandex).getShowLayoutBounds()) {
            long j = this.f20590l;
            interfaceC14859l.firebase(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f22306l);
        }
    }

    @Override // defpackage.InterfaceC6357l
    public final int metrica(int i) {
        C0458l c0458lSignature = this.f35281l.Signature();
        InterfaceC10835l interfaceC10835lM556throws = c0458lSignature.m556throws();
        C3654l c3654l = (C3654l) c0458lSignature.f1691l;
        return interfaceC10835lM556throws.yandex((AbstractC18026l) c3654l.f7703l.purchase, c3654l.vip(), i);
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: public */
    public final int mo2648public(AbstractC12914l abstractC12914l) {
        C16857l c16857l = this.f22308l;
        if (c16857l != null) {
            return c16857l.mo2648public(abstractC12914l);
        }
        C14903l c14903l = this.f35281l.f7667l.startapp;
        C7074l c7074l = c14903l.f29327l;
        if (!c14903l.f29339l) {
            if (c14903l.f29342l.amazon == 1) {
                c7074l.billing = true;
                if (c7074l.loadAd) {
                    c14903l.f29318l = true;
                    c14903l.f29348l = true;
                }
            } else {
                c7074l.mopub = true;
            }
        }
        C11103l c11103lPurchase = c14903l.purchase();
        boolean z = c11103lPurchase.f23549l;
        c11103lPurchase.f23549l = true;
        c14903l.appmetrica();
        c11103lPurchase.f23549l = z;
        Integer num = (Integer) c7074l.subs.get(abstractC12914l);
        return num != null ? num.intValue() : RecyclerView.UNDEFINED_DURATION;
    }

    @Override // defpackage.InterfaceC6357l
    public final int remoteconfig(int i) {
        C0458l c0458lSignature = this.f35281l.Signature();
        InterfaceC10835l interfaceC10835lM556throws = c0458lSignature.m556throws();
        C3654l c3654l = (C3654l) c0458lSignature.f1691l;
        return interfaceC10835lM556throws.crashlytics((AbstractC18026l) c3654l.f7703l.purchase, c3654l.vip(), i);
    }
}
