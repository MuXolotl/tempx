package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10065l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f20540l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f20541l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10065l(C6742l c6742l, C8896l c8896l, C8030l c8030l) {
        super(1);
        this.f20541l = 2;
        this.f20540l = c6742l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20541l;
        Object obj2 = this.f20540l;
        switch (i) {
            case 0:
                ((List) obj).add((Float) ((C7767l) obj2).invoke());
                return true;
            case 1:
                C6148l c6148l = (C6148l) obj;
                C4245l c4245l = (C4245l) obj2;
                c6148l.metrica(c6148l.f12941l.loadAd() * c4245l.f8715l);
                c6148l.startapp(c4245l.f8714l);
                c6148l.purchase(c4245l.f8713l);
                c6148l.amazon(c4245l.f8717l);
                c6148l.adcel(c4245l.f8716l);
                return Unit.INSTANCE;
            case 2:
                ((C6742l) obj2).yandex();
                return Unit.INSTANCE;
            case 3:
                C6148l c6148l2 = (C6148l) obj;
                C18148l c18148l = (C18148l) obj2;
                c6148l2.remoteconfig(c18148l.f35526l);
                c6148l2.vip(c18148l.f35520l);
                c6148l2.crashlytics(c18148l.f35523l);
                c6148l2.Signature(0.0f);
                c6148l2.pro(0.0f);
                c6148l2.metrica(c18148l.f35529l);
                c6148l2.subs(0.0f);
                c6148l2.isPro(0.0f);
                c6148l2.smaato(c18148l.f35522l);
                float f = c18148l.f35519l;
                if (c6148l2.f12937l != f) {
                    c6148l2.f12946l |= 2048;
                    c6148l2.f12937l = f;
                }
                c6148l2.tapsense(c18148l.f35518l);
                c6148l2.startapp(c18148l.f35517l);
                c6148l2.purchase(c18148l.f35530l);
                c6148l2.amazon(c18148l.f35521l);
                c6148l2.adcel(c18148l.f35525l);
                c6148l2.mopub(c18148l.f35528l);
                int i2 = c18148l.f35516l;
                if (c6148l2.f12959l != i2) {
                    c6148l2.f12946l |= 524288;
                    c6148l2.f12959l = i2;
                }
                c6148l2.billing(null);
                C2068l c2068l = c18148l.f35524l;
                if (!AbstractC8576l.yandex(c6148l2.f12947l, c2068l)) {
                    c6148l2.f12946l |= 1048576;
                    c6148l2.f12947l = c2068l;
                }
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                C17249l c17249l = (C17249l) obj2;
                C2397l c2397l = c17249l.f33473l;
                if (c2397l != null) {
                    c2397l.yandex(th);
                }
                c17249l.f33473l = null;
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10065l(int i, Object obj) {
        super(1);
        this.f20541l = i;
        this.f20540l = obj;
    }
}
