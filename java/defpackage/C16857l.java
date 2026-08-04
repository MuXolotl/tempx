package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lُٗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16857l extends AbstractC1668l {
    @Override // defpackage.InterfaceC6357l
    public final AbstractC10113l adcel(long j) {
        m2888new(j);
        AbstractC18026l abstractC18026l = this.f4026l;
        C17893l c17893lSignatures = abstractC18026l.f35281l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            ((C3654l) objArr[i2]).f7667l.adcel.f8276l = 3;
        }
        C3654l c3654l = abstractC18026l.f35281l;
        AbstractC1668l.m990l(this, c3654l.f7692l.loadAd(this, c3654l.remoteconfig(), j));
        return this;
    }

    @Override // defpackage.InterfaceC6357l
    public final int crashlytics(int i) {
        C0458l c0458lSignature = this.f4026l.f35281l.Signature();
        InterfaceC10835l interfaceC10835lM556throws = c0458lSignature.m556throws();
        C3654l c3654l = (C3654l) c0458lSignature.f1691l;
        return interfaceC10835lM556throws.amazon((AbstractC18026l) c3654l.f7703l.purchase, c3654l.remoteconfig(), i);
    }

    @Override // defpackage.InterfaceC6357l
    /* JADX INFO: renamed from: for */
    public final int mo1460for(int i) {
        C0458l c0458lSignature = this.f4026l.f35281l.Signature();
        InterfaceC10835l interfaceC10835lM556throws = c0458lSignature.m556throws();
        C3654l c3654l = (C3654l) c0458lSignature.f1691l;
        return interfaceC10835lM556throws.purchase((AbstractC18026l) c3654l.f7703l.purchase, c3654l.remoteconfig(), i);
    }

    @Override // defpackage.AbstractC1668l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final void mo994l() {
        this.f4026l.f35281l.f7667l.adcel.m1469while();
    }

    @Override // defpackage.InterfaceC6357l
    public final int metrica(int i) {
        C0458l c0458lSignature = this.f4026l.f35281l.Signature();
        InterfaceC10835l interfaceC10835lM556throws = c0458lSignature.m556throws();
        C3654l c3654l = (C3654l) c0458lSignature.f1691l;
        return interfaceC10835lM556throws.yandex((AbstractC18026l) c3654l.f7703l.purchase, c3654l.remoteconfig(), i);
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: public */
    public final int mo2648public(AbstractC12914l abstractC12914l) {
        C4020l c4020l = this.f4026l.f35281l.f7667l.adcel;
        C7074l c7074l = c4020l.f8272l;
        if (!c4020l.f8283l) {
            C14070l c14070l = c4020l.f8282l;
            if (c14070l.amazon == 2) {
                c7074l.billing = true;
                if (c7074l.loadAd) {
                    c14070l.billing = true;
                    c14070l.mopub = true;
                }
            } else {
                c7074l.mopub = true;
            }
        }
        C16857l c16857l = c4020l.purchase().f22308l;
        Boolean boolValueOf = c16857l != null ? Boolean.valueOf(c16857l.f23549l) : null;
        C16857l c16857l2 = c4020l.purchase().f22308l;
        if (c16857l2 != null) {
            c16857l2.f23549l = true;
        }
        c4020l.appmetrica();
        C16857l c16857l3 = c4020l.purchase().f22308l;
        if (c16857l3 != null) {
            c16857l3.f23549l = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) c7074l.subs.get(abstractC12914l);
        int iIntValue = num != null ? num.intValue() : RecyclerView.UNDEFINED_DURATION;
        this.f4025l.mopub(iIntValue, abstractC12914l);
        return iIntValue;
    }

    @Override // defpackage.InterfaceC6357l
    public final int remoteconfig(int i) {
        C0458l c0458lSignature = this.f4026l.f35281l.Signature();
        InterfaceC10835l interfaceC10835lM556throws = c0458lSignature.m556throws();
        C3654l c3654l = (C3654l) c0458lSignature.f1691l;
        return interfaceC10835lM556throws.crashlytics((AbstractC18026l) c3654l.f7703l.purchase, c3654l.remoteconfig(), i);
    }
}
