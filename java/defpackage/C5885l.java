package defpackage;

import java.io.Serializable;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lؘۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5885l implements InterfaceC7359l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Serializable f12403l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f12404l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12405l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public volatile Object f12406l;

    public C5885l(int i) {
        this.f12405l = i;
        switch (i) {
            case 2:
                this.f12404l = new C11128l();
                this.f12403l = AbstractC1207l.class.getName();
                break;
            default:
                C15655l c15655l = C15655l.f30608l;
                this.f12403l = new C11128l();
                this.f12406l = c15655l;
                break;
        }
    }

    public Logger loadAd() {
        Logger logger = (Logger) this.f12406l;
        if (logger != null) {
            return logger;
        }
        synchronized (((C11128l) this.f12404l)) {
            try {
                Logger logger2 = (Logger) this.f12406l;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f12403l);
                this.f12406l = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f12405l) {
            case 1:
                Object objAd = (InterfaceC7359l) this.f12406l;
                if (objAd == C12899l.f25362l) {
                    String strValueOf = String.valueOf(this.f12404l);
                    objAd = AbstractC9361l.ad(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
                }
                String strValueOf2 = String.valueOf(objAd);
                return AbstractC9361l.ad(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
            default:
                return super.toString();
        }
    }

    public Logger yandex() {
        Logger logger = (Logger) this.f12406l;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f12404l) {
            try {
                Logger logger2 = (Logger) this.f12406l;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f12403l);
                this.f12406l = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7359l
    public Object zza() {
        InterfaceC7359l interfaceC7359l = (InterfaceC7359l) this.f12406l;
        C12899l c12899l = C12899l.f25362l;
        if (interfaceC7359l != c12899l) {
            synchronized (((C11128l) this.f12403l)) {
                try {
                    if (((InterfaceC7359l) this.f12406l) != c12899l) {
                        Object objZza = ((InterfaceC7359l) this.f12406l).zza();
                        this.f12404l = objZza;
                        this.f12406l = c12899l;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f12404l;
    }

    public C5885l(Class cls) {
        this.f12405l = 0;
        this.f12404l = new Object();
        this.f12403l = cls.getName();
    }
}
