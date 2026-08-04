package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙۘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6691l extends AbstractRunnableC18269l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f14041l;

    public AbstractC6691l(int i) {
        super(0L, false);
        this.f14041l = i;
    }

    public abstract InterfaceC14029l amazon();

    public abstract Object isPro();

    public final void mopub(Throwable th) {
        AbstractC11738l.loadAd(amazon().metrica(), new C3150l("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public Throwable purchase(Object obj) {
        C2175l c2175l = obj instanceof C2175l ? (C2175l) obj : null;
        if (c2175l != null) {
            return c2175l.yandex;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C16477l c16477l = (C16477l) amazon();
            AbstractC0283l abstractC0283l = c16477l.f32209l;
            Object obj = c16477l.f32208l;
            InterfaceC12932l interfaceC12932lMetrica = abstractC0283l.metrica();
            Object objLoadAd = AbstractC7999l.loadAd(interfaceC12932lMetrica, obj);
            InterfaceC7042l interfaceC7042l = null;
            C13887l c13887lRemoteconfig = objLoadAd != AbstractC7999l.yandex ? AbstractC14425l.remoteconfig(abstractC0283l, interfaceC12932lMetrica, objLoadAd) : null;
            try {
                InterfaceC12932l interfaceC12932lMetrica2 = abstractC0283l.metrica();
                Object objIsPro = isPro();
                Throwable thPurchase = purchase(objIsPro);
                if (thPurchase == null) {
                    int i = this.f14041l;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC7042l = (InterfaceC7042l) interfaceC12932lMetrica2.mo245l(C1083l.f2996l);
                    }
                }
                if (interfaceC7042l != null && !interfaceC7042l.mopub()) {
                    CancellationException cancellationExceptionMo2153default = interfaceC7042l.mo2153default();
                    crashlytics(cancellationExceptionMo2153default);
                    abstractC0283l.subs(new C18435l(cancellationExceptionMo2153default));
                } else if (thPurchase != null) {
                    abstractC0283l.subs(new C18435l(thPurchase));
                } else {
                    abstractC0283l.subs(billing(objIsPro));
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                if (c13887lRemoteconfig == null || c13887lRemoteconfig.m3796l()) {
                    AbstractC7999l.yandex(interfaceC12932lMetrica, objLoadAd);
                }
            }
        } catch (C1049l e) {
            AbstractC11738l.loadAd(amazon().metrica(), e.f2913l);
        } catch (Throwable th) {
            mopub(th);
        }
    }

    public Object billing(Object obj) {
        return obj;
    }

    public void crashlytics(CancellationException cancellationException) {
    }
}
