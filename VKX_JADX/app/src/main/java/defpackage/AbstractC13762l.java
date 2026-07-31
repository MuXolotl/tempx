package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْۣۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13762l extends C14750l implements InterfaceC14029l, InterfaceC2262l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC12932l f26857l;

    public AbstractC13762l(InterfaceC12932l interfaceC12932l, boolean z) {
        super(z);
        m3882interface((InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l));
        this.f26857l = interfaceC12932l.mo246l(this);
    }

    @Override // defpackage.C14750l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void mo3750class(C6451l c6451l) {
        AbstractC11738l.loadAd(this.f26857l, c6451l);
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final void m3751l(int i, AbstractC13762l abstractC13762l, Function2 function2) {
        Object objInvoke;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            try {
                AbstractC9853l.yandex(AbstractC17082l.billing(AbstractC17082l.yandex(abstractC13762l, this, function2)), Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                AbstractC17764l.crashlytics(this, th);
                throw null;
            }
        }
        if (iInmobi != 1) {
            if (iInmobi == 2) {
                AbstractC17082l.billing(AbstractC17082l.yandex(abstractC13762l, this, function2)).subs(Unit.INSTANCE);
                return;
            }
            if (iInmobi != 3) {
                C18725l.billing();
                return;
            }
            try {
                InterfaceC12932l interfaceC12932l = this.f26857l;
                Object objLoadAd = AbstractC7999l.loadAd(interfaceC12932l, null);
                try {
                    if (function2 instanceof AbstractC12050l) {
                        AbstractC9464l.purchase(2, function2);
                        objInvoke = function2.invoke(abstractC13762l, this);
                    } else {
                        objInvoke = AbstractC17082l.subs(function2, abstractC13762l, this);
                    }
                    AbstractC7999l.yandex(interfaceC12932l, objLoadAd);
                    if (objInvoke != EnumC9342l.f19165l) {
                        subs(objInvoke);
                    }
                } catch (Throwable th2) {
                    AbstractC7999l.yandex(interfaceC12932l, objLoadAd);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof C1049l) {
                    th = ((C1049l) th).f2913l;
                }
                subs(new C18435l(th));
            }
        }
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return this.f26857l;
    }

    @Override // defpackage.C14750l
    public final String premium() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        Throwable thYandex = C1171l.yandex(obj);
        if (thYandex != null) {
            obj = new C2175l(thYandex, false);
        }
        Object objM3881goto = m3881goto(obj);
        if (objM3881goto == AbstractC7114l.loadAd) {
            return;
        }
        isPro(objM3881goto);
    }

    @Override // defpackage.C14750l
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void mo3752this(Object obj) {
        if (!(obj instanceof C2175l)) {
            mo2319l(obj);
        } else {
            C2175l c2175l = (C2175l) obj;
            mo2320l(c2175l.yandex, C2175l.loadAd.get(c2175l) == 1);
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f26857l;
    }

    /* JADX INFO: renamed from: lؙٗٙ */
    public void mo2319l(Object obj) {
    }

    /* JADX INFO: renamed from: l٘ٚۥ */
    public void mo2320l(Throwable th, boolean z) {
    }
}
