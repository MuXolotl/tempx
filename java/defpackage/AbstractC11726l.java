package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11726l implements InterfaceC1122l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1220l f23463l = AbstractC9968l.crashlytics(2, new C7730l(15, this));

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f23464l;

    public AbstractC11726l(Object obj) {
        this.f23464l = obj;
    }

    public abstract int amazon();

    public abstract String crashlytics();

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC11726l)) {
            return false;
        }
        AbstractC11726l abstractC11726l = (AbstractC11726l) obj;
        return AbstractC8576l.yandex(crashlytics(), abstractC11726l.crashlytics()) && AbstractC8576l.yandex(this.f23464l, abstractC11726l.f23464l);
    }

    public abstract List getUpperBounds();

    public final int hashCode() {
        return crashlytics().hashCode() + (this.f23464l.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iInmobi = AbstractC5020l.inmobi(amazon());
        if (iInmobi == 0) {
            Unit unit = Unit.INSTANCE;
        } else if (iInmobi == 1) {
            sb.append("in ");
        } else {
            if (iInmobi != 2) {
                C18725l.billing();
                return null;
            }
            sb.append("out ");
        }
        sb.append(crashlytics());
        return sb.toString();
    }
}
