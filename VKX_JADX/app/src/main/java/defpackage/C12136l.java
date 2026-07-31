package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَِۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12136l extends AbstractC16175l {
    public C0534l admob;
    public boolean amazon;
    public Function0 billing;
    public String crashlytics;
    public float firebase;
    public long isPro;
    public final C8006l loadAd;
    public final C10086l mopub;
    public final C12720l purchase;
    public final C11940l remoteconfig;
    public float smaato;
    public final C10086l subs;

    public C12136l(C8006l c8006l) {
        this.loadAd = c8006l;
        c8006l.subs = new C11940l(this, 0);
        this.crashlytics = "";
        this.amazon = true;
        C12720l c12720l = new C12720l();
        c12720l.f25083l = 0L;
        c12720l.f25082l = 0;
        c12720l.f25084l = new C13601l();
        this.purchase = c12720l;
        this.billing = C16395l.f32064l;
        this.mopub = AbstractC8020l.smaato(null);
        this.subs = AbstractC8020l.smaato(new C14174l(0L));
        this.isPro = 9205357640488583168L;
        this.firebase = 1.0f;
        this.smaato = 1.0f;
        this.remoteconfig = new C11940l(this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    public final void purchase(InterfaceC13349l interfaceC13349l, float f, AbstractC8939l abstractC8939l) {
        int i;
        C0534l c0534l;
        C14115l c14115lYandex;
        char c;
        long j;
        long jLoadAd;
        AbstractC8939l abstractC8939l2;
        int i2;
        int i3;
        C8006l c8006l = this.loadAd;
        boolean z = c8006l.amazon;
        C10086l c10086l = this.mopub;
        if (!z || c8006l.purchase == 16) {
            i = 0;
        } else {
            AbstractC8939l abstractC8939l3 = (AbstractC8939l) c10086l.getValue();
            int i4 = AbstractC8192l.yandex;
            if (!(abstractC8939l3 instanceof C0534l) ? abstractC8939l3 == null : (i3 = ((C0534l) abstractC8939l3).crashlytics) == 5 || i3 == 3) {
                i = 0;
            } else if (!(abstractC8939l instanceof C0534l) ? abstractC8939l == null : (i2 = ((C0534l) abstractC8939l).crashlytics) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.amazon;
        C12720l c12720l = this.purchase;
        if (z2 || !C14174l.loadAd(this.isPro, interfaceC13349l.admob())) {
            if (i == 1) {
                jLoadAd = c8006l.purchase;
                int i5 = AbstractC8192l.yandex;
                if (C9735l.amazon(jLoadAd) != 1.0f) {
                    jLoadAd = C9735l.loadAd(1.0f, jLoadAd);
                }
                c0534l = new C0534l(jLoadAd, 5);
            } else {
                c0534l = null;
            }
            this.admob = c0534l;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
            C10086l c10086l2 = this.subs;
            this.firebase = fIntBitsToFloat / Float.intBitsToFloat((int) (((C14174l) c10086l2.getValue()).yandex >> 32));
            this.smaato = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) / Float.intBitsToFloat((int) (((C14174l) c10086l2.getValue()).yandex & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L))))) & 4294967295L);
            EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
            c14115lYandex = (C14115l) c12720l.f25081l;
            C2151l c2151lYandex = (C2151l) c12720l.f25085l;
            if (c14115lYandex != null || c2151lYandex == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = c14115lYandex.yandex;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || c12720l.f25082l != i) {
                }
                c12720l.f25083l = jCeil;
                C13601l c13601l = (C13601l) c12720l.f25084l;
                long jMopub = AbstractC14707l.mopub(jCeil);
                C4417l c4417l = c13601l.f26630l;
                InterfaceC13490l interfaceC13490l = c4417l.yandex;
                EnumC9931l enumC9931l = c4417l.loadAd;
                InterfaceC14859l interfaceC14859l = c4417l.crashlytics;
                C2151l c2151l = c2151lYandex;
                long j2 = c4417l.amazon;
                c4417l.yandex = interfaceC13349l;
                c4417l.loadAd = layoutDirection;
                c4417l.crashlytics = c2151l;
                c4417l.amazon = jMopub;
                c2151l.mopub();
                AbstractC9361l.metrica(c13601l, C9735l.loadAd, 0L, 0L, 0.0f, null, null, 0, 62);
                this.remoteconfig.invoke(c13601l);
                c2151l.ads();
                C4417l c4417l2 = c13601l.f26630l;
                c4417l2.yandex = interfaceC13490l;
                c4417l2.loadAd = enumC9931l;
                c4417l2.crashlytics = interfaceC14859l;
                c4417l2.amazon = j2;
                c14115lYandex.yandex.prepareToDraw();
                this.amazon = false;
                this.isPro = interfaceC13349l.admob();
            }
            c14115lYandex = AbstractC3925l.yandex((int) (jCeil >> c), (int) (jCeil & j), i, 24);
            c2151lYandex = AbstractC4918l.yandex(c14115lYandex);
            c12720l.f25081l = c14115lYandex;
            c12720l.f25085l = c2151lYandex;
            c12720l.f25082l = i;
            c12720l.f25083l = jCeil;
            C13601l c13601l2 = (C13601l) c12720l.f25084l;
            long jMopub2 = AbstractC14707l.mopub(jCeil);
            C4417l c4417l3 = c13601l2.f26630l;
            InterfaceC13490l interfaceC13490l2 = c4417l3.yandex;
            EnumC9931l enumC9931l2 = c4417l3.loadAd;
            InterfaceC14859l interfaceC14859l2 = c4417l3.crashlytics;
            C2151l c2151l2 = c2151lYandex;
            long j3 = c4417l3.amazon;
            c4417l3.yandex = interfaceC13349l;
            c4417l3.loadAd = layoutDirection;
            c4417l3.crashlytics = c2151l2;
            c4417l3.amazon = jMopub2;
            c2151l2.mopub();
            AbstractC9361l.metrica(c13601l2, C9735l.loadAd, 0L, 0L, 0.0f, null, null, 0, 62);
            this.remoteconfig.invoke(c13601l2);
            c2151l2.ads();
            C4417l c4417l4 = c13601l2.f26630l;
            c4417l4.yandex = interfaceC13490l2;
            c4417l4.loadAd = enumC9931l2;
            c4417l4.crashlytics = interfaceC14859l2;
            c4417l4.amazon = j3;
            c14115lYandex.yandex.prepareToDraw();
            this.amazon = false;
            this.isPro = interfaceC13349l.admob();
        } else {
            C14115l c14115l = (C14115l) c12720l.f25081l;
            if (i != (c14115l != null ? AbstractC5941l.m1903return(c14115l.yandex.getConfig()) : 0)) {
                if (i == 1) {
                    jLoadAd = c8006l.purchase;
                    int i7 = AbstractC8192l.yandex;
                    if (C9735l.amazon(jLoadAd) != 1.0f) {
                        jLoadAd = C9735l.loadAd(1.0f, jLoadAd);
                    }
                    c0534l = new C0534l(jLoadAd, 5);
                } else {
                    c0534l = null;
                }
                this.admob = c0534l;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                C10086l c10086l3 = this.subs;
                this.firebase = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((C14174l) c10086l3.getValue()).yandex >> 32));
                this.smaato = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) / Float.intBitsToFloat((int) (((C14174l) c10086l3.getValue()).yandex & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L))))) & 4294967295L);
                EnumC9931l layoutDirection2 = interfaceC13349l.getLayoutDirection();
                c14115lYandex = (C14115l) c12720l.f25081l;
                C2151l c2151lYandex2 = (C2151l) c12720l.f25085l;
                if (c14115lYandex != null) {
                    c = ' ';
                    j = 4294967295L;
                    c14115lYandex = AbstractC3925l.yandex((int) (jCeil2 >> c), (int) (jCeil2 & j), i, 24);
                    c2151lYandex2 = AbstractC4918l.yandex(c14115lYandex);
                    c12720l.f25081l = c14115lYandex;
                    c12720l.f25085l = c2151lYandex2;
                    c12720l.f25082l = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    c14115lYandex = AbstractC3925l.yandex((int) (jCeil2 >> c), (int) (jCeil2 & j), i, 24);
                    c2151lYandex2 = AbstractC4918l.yandex(c14115lYandex);
                    c12720l.f25081l = c14115lYandex;
                    c12720l.f25085l = c2151lYandex2;
                    c12720l.f25082l = i;
                }
                c12720l.f25083l = jCeil2;
                C13601l c13601l3 = (C13601l) c12720l.f25084l;
                long jMopub3 = AbstractC14707l.mopub(jCeil2);
                C4417l c4417l5 = c13601l3.f26630l;
                InterfaceC13490l interfaceC13490l3 = c4417l5.yandex;
                EnumC9931l enumC9931l3 = c4417l5.loadAd;
                InterfaceC14859l interfaceC14859l3 = c4417l5.crashlytics;
                C2151l c2151l3 = c2151lYandex2;
                long j4 = c4417l5.amazon;
                c4417l5.yandex = interfaceC13349l;
                c4417l5.loadAd = layoutDirection2;
                c4417l5.crashlytics = c2151l3;
                c4417l5.amazon = jMopub3;
                c2151l3.mopub();
                AbstractC9361l.metrica(c13601l3, C9735l.loadAd, 0L, 0L, 0.0f, null, null, 0, 62);
                this.remoteconfig.invoke(c13601l3);
                c2151l3.ads();
                C4417l c4417l6 = c13601l3.f26630l;
                c4417l6.yandex = interfaceC13490l3;
                c4417l6.loadAd = enumC9931l3;
                c4417l6.crashlytics = interfaceC14859l3;
                c4417l6.amazon = j4;
                c14115lYandex.yandex.prepareToDraw();
                this.amazon = false;
                this.isPro = interfaceC13349l.admob();
            }
        }
        if (abstractC8939l != null) {
            abstractC8939l2 = abstractC8939l;
        } else {
            abstractC8939l2 = ((AbstractC8939l) c10086l.getValue()) != null ? (AbstractC8939l) c10086l.getValue() : this.admob;
        }
        C14115l c14115l2 = (C14115l) c12720l.f25081l;
        if (c14115l2 == null) {
            AbstractC0081l.crashlytics("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        AbstractC9361l.subs(interfaceC13349l, c14115l2, c12720l.f25083l, 0L, f, abstractC8939l2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.crashlytics);
        sb.append("\n\tviewportWidth: ");
        C10086l c10086l = this.subs;
        sb.append(Float.intBitsToFloat((int) (((C14174l) c10086l.getValue()).yandex >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C14174l) c10086l.getValue()).yandex & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }

    @Override // defpackage.AbstractC16175l
    public final void yandex(InterfaceC13349l interfaceC13349l) {
        purchase(interfaceC13349l, 1.0f, null);
    }
}
