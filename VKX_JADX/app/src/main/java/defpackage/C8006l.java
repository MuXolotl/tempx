package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8006l extends AbstractC16175l {
    public float adcel;
    public C9902l admob;
    public float ads;
    public List billing;
    public String firebase;
    public final C3006l isPro;
    public float[] loadAd;
    public float metrica;
    public boolean mopub;
    public float remoteconfig;
    public float smaato;
    public float startapp;
    public Function1 subs;
    public boolean subscription;
    public float vip;
    public final ArrayList crashlytics = new ArrayList();
    public boolean amazon = true;
    public long purchase = C9735l.firebase;

    public C8006l() {
        int i = AbstractC8192l.yandex;
        this.billing = C2580l.f5619l;
        this.mopub = true;
        this.isPro = new C3006l(20, this);
        this.firebase = "";
        this.metrica = 1.0f;
        this.startapp = 1.0f;
        this.subscription = true;
    }

    @Override // defpackage.AbstractC16175l
    public final void amazon(C3006l c3006l) {
        this.subs = c3006l;
    }

    public final void billing(long j) {
        if (this.amazon && j != 16) {
            long j2 = this.purchase;
            if (j2 == 16) {
                this.purchase = j;
                return;
            }
            int i = AbstractC8192l.yandex;
            if (C9735l.admob(j2) == C9735l.admob(j) && C9735l.mopub(j2) == C9735l.mopub(j) && C9735l.purchase(j2) == C9735l.purchase(j)) {
                return;
            }
            this.amazon = false;
            this.purchase = C9735l.firebase;
        }
    }

    @Override // defpackage.AbstractC16175l
    public final Function1 loadAd() {
        return this.subs;
    }

    public final void mopub(AbstractC16175l abstractC16175l) {
        if (!(abstractC16175l instanceof C1508l)) {
            if (abstractC16175l instanceof C8006l) {
                C8006l c8006l = (C8006l) abstractC16175l;
                if (c8006l.amazon && this.amazon) {
                    billing(c8006l.purchase);
                    return;
                } else {
                    this.amazon = false;
                    this.purchase = C9735l.firebase;
                    return;
                }
            }
            return;
        }
        C1508l c1508l = (C1508l) abstractC16175l;
        AbstractC9544l abstractC9544l = c1508l.loadAd;
        if (this.amazon && abstractC9544l != null) {
            if (abstractC9544l instanceof C8990l) {
                billing(((C8990l) abstractC9544l).yandex);
            } else {
                this.amazon = false;
                this.purchase = C9735l.firebase;
            }
        }
        AbstractC9544l abstractC9544l2 = c1508l.mopub;
        if (this.amazon && abstractC9544l2 != null) {
            if (abstractC9544l2 instanceof C8990l) {
                billing(((C8990l) abstractC9544l2).yandex);
            } else {
                this.amazon = false;
                this.purchase = C9735l.firebase;
            }
        }
    }

    public final void purchase(int i, AbstractC16175l abstractC16175l) {
        ArrayList arrayList = this.crashlytics;
        if (i < arrayList.size()) {
            arrayList.set(i, abstractC16175l);
        } else {
            arrayList.add(abstractC16175l);
        }
        mopub(abstractC16175l);
        abstractC16175l.amazon(this.isPro);
        crashlytics();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.firebase);
        ArrayList arrayList = this.crashlytics;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC16175l abstractC16175l = (AbstractC16175l) arrayList.get(i);
            sb.append("\t");
            sb.append(abstractC16175l.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // defpackage.AbstractC16175l
    public final void yandex(InterfaceC13349l interfaceC13349l) {
        if (this.subscription) {
            float[] fArrYandex = this.loadAd;
            if (fArrYandex == null) {
                fArrYandex = C10924l.yandex();
                this.loadAd = fArrYandex;
            } else {
                C10924l.amazon(fArrYandex);
            }
            C10924l.isPro(fArrYandex, this.adcel + this.remoteconfig, this.ads + this.vip);
            C10924l.billing(fArrYandex, this.smaato);
            C10924l.mopub(fArrYandex, this.metrica, this.startapp);
            C10924l.isPro(fArrYandex, -this.remoteconfig, -this.vip);
            this.subscription = false;
        }
        if (this.mopub) {
            if (!this.billing.isEmpty()) {
                C9902l c9902lYandex = this.admob;
                if (c9902lYandex == null) {
                    c9902lYandex = AbstractC3478l.yandex();
                    this.admob = c9902lYandex;
                }
                AbstractC11852l.vip(this.billing, c9902lYandex);
            }
            this.mopub = false;
        }
        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
        long jM4551private = c18449lMo2065break.m4551private();
        c18449lMo2065break.m4555synchronized().mopub();
        try {
            C18449l c18449l = (C18449l) ((C16543l) c18449lMo2065break.f36010l).f32482l;
            float[] fArr = this.loadAd;
            if (fArr != null) {
                c18449l.m4555synchronized().smaato(fArr);
            }
            C9902l c9902l = this.admob;
            if (!this.billing.isEmpty() && c9902l != null) {
                c18449l.m4555synchronized().remoteconfig(c9902l);
            }
            ArrayList arrayList = this.crashlytics;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC16175l) arrayList.get(i)).yandex(interfaceC13349l);
            }
        } finally {
            AbstractC0653l.license(c18449lMo2065break, jM4551private);
        }
    }
}
