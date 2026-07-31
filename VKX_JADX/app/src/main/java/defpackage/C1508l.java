package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: renamed from: lؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1508l extends AbstractC16175l {
    public final InterfaceC1220l Signature;
    public C0404l adcel;
    public int admob;
    public final C9902l ads;
    public List amazon;
    public float billing;
    public float crashlytics = 1.0f;
    public float firebase;
    public float isPro;
    public AbstractC9544l loadAd;
    public boolean metrica;
    public AbstractC9544l mopub;
    public float purchase;
    public float remoteconfig;
    public float smaato;
    public boolean startapp;
    public int subs;
    public C9902l subscription;
    public C9902l tapsense;
    public boolean vip;

    public C1508l() {
        int i = AbstractC8192l.yandex;
        this.amazon = C2580l.f5619l;
        this.purchase = 1.0f;
        this.admob = 0;
        this.subs = 0;
        this.isPro = 4.0f;
        this.smaato = 1.0f;
        this.vip = true;
        this.metrica = true;
        C9902l c9902lYandex = AbstractC3478l.yandex();
        this.ads = c9902lYandex;
        this.subscription = c9902lYandex;
        this.Signature = AbstractC9968l.crashlytics(3, C16395l.f32065l);
    }

    public final void purchase() {
        float f = this.firebase;
        C9902l c9902l = this.ads;
        if (f == 0.0f && this.smaato == 1.0f) {
            this.subscription = c9902l;
            return;
        }
        if (AbstractC8576l.yandex(this.subscription, c9902l)) {
            this.subscription = AbstractC3478l.yandex();
        } else {
            int i = this.subscription.yandex.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.subscription.subs();
            this.subscription.isPro(i);
        }
        InterfaceC1220l interfaceC1220l = this.Signature;
        ((C16876l) interfaceC1220l.getValue()).loadAd(c9902l);
        float length = ((C16876l) interfaceC1220l.getValue()).yandex.getLength();
        float f2 = this.firebase;
        float f3 = this.remoteconfig;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.smaato + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((C16876l) interfaceC1220l.getValue()).yandex(f4, f5, this.subscription);
            return;
        }
        C9902l c9902lYandex = this.tapsense;
        if (c9902lYandex == null) {
            c9902lYandex = AbstractC3478l.yandex();
            this.tapsense = c9902lYandex;
        }
        c9902lYandex.admob();
        ((C16876l) interfaceC1220l.getValue()).yandex(f4, length, c9902lYandex);
        this.subscription.yandex(c9902lYandex, 0L);
        c9902lYandex.admob();
        ((C16876l) interfaceC1220l.getValue()).yandex(0.0f, f5, c9902lYandex);
        this.subscription.yandex(c9902lYandex, 0L);
    }

    public final String toString() {
        return this.ads.toString();
    }

    @Override // defpackage.AbstractC16175l
    public final void yandex(InterfaceC13349l interfaceC13349l) {
        C0404l c0404l;
        if (this.vip) {
            AbstractC11852l.vip(this.amazon, this.ads);
            purchase();
        } else if (this.startapp) {
            purchase();
        }
        this.vip = false;
        this.startapp = false;
        AbstractC9544l abstractC9544l = this.loadAd;
        if (abstractC9544l != null) {
            AbstractC9361l.smaato(interfaceC13349l, this.subscription, abstractC9544l, this.crashlytics, null, null, 56);
        }
        AbstractC9544l abstractC9544l2 = this.mopub;
        if (abstractC9544l2 != null) {
            C0404l c0404l2 = this.adcel;
            if (this.metrica || c0404l2 == null) {
                C0404l c0404l3 = new C0404l(this.billing, this.isPro, this.admob, this.subs, null, 16);
                this.adcel = c0404l3;
                this.metrica = false;
                c0404l = c0404l3;
            } else {
                c0404l = c0404l2;
            }
            AbstractC9361l.smaato(interfaceC13349l, this.subscription, abstractC9544l2, this.purchase, c0404l, null, 48);
        }
    }
}
