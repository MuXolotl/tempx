package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٍٝٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9707l implements InterfaceC6017l {
    public AbstractC9707l() {
        AbstractC9968l.crashlytics(2, new C8467l(9, this));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC9707l)) {
            return false;
        }
        AbstractC9707l abstractC9707l = (AbstractC9707l) obj;
        return AbstractC8576l.yandex(subs(), abstractC9707l.subs()) && pro() == abstractC9707l.pro();
    }

    /* JADX INFO: renamed from: extends */
    public abstract boolean mo1106extends();

    public abstract String getName();

    public final int hashCode() {
        return pro() + (subs().hashCode() * 31);
    }

    public abstract int premium();

    /* JADX INFO: renamed from: private */
    public abstract boolean mo1108private();

    public abstract int pro();

    public abstract boolean remoteconfig();

    public abstract InterfaceC18672l subs();

    /* JADX INFO: renamed from: synchronized */
    public abstract InterfaceC13012l mo1109synchronized();

    public final String toString() throws IOException {
        String string;
        StringBuilder sb = new StringBuilder();
        int iInmobi = AbstractC5020l.inmobi(premium());
        if (iInmobi == 0) {
            sb.append("instance parameter");
        } else if (iInmobi == 1) {
            sb.append("context parameter " + getName());
        } else if (iInmobi == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iInmobi != 3) {
                C18725l.billing();
                return null;
            }
            sb.append("parameter #" + pro() + ' ' + getName());
        }
        sb.append(" of ");
        InterfaceC18672l interfaceC18672lSubs = subs();
        if (interfaceC18672lSubs instanceof InterfaceC13922l) {
            InterfaceC13922l interfaceC13922l = (InterfaceC13922l) interfaceC18672lSubs;
            StringBuilder sb2 = new StringBuilder();
            C8565l.purchase(sb2, interfaceC13922l);
            sb2.append(interfaceC13922l instanceof InterfaceC4469l ? "var " : "val ");
            C8565l.subs(sb2, interfaceC13922l);
            C8565l.billing(interfaceC13922l.getName(), sb2);
            sb2.append(": ");
            sb2.append(C8565l.tapsense(interfaceC13922l.smaato(), false));
            string = sb2.toString();
        } else {
            if (!(interfaceC18672lSubs instanceof InterfaceC5059l)) {
                C17132l.metrica(interfaceC18672lSubs, "Illegal callable: ");
                return null;
            }
            InterfaceC5059l interfaceC5059l = (InterfaceC5059l) interfaceC18672lSubs;
            StringBuilder sb3 = new StringBuilder();
            C8565l.purchase(sb3, interfaceC5059l);
            sb3.append("fun ");
            C8565l.subs(sb3, interfaceC5059l);
            C8565l.billing(interfaceC5059l.getName(), sb3);
            AbstractC16901l.m4216else(AbstractC0825l.mopub(interfaceC5059l), sb3, ", ", "(", ")", C1490l.f3732l, 48);
            sb3.append(": ");
            sb3.append(C8565l.tapsense(interfaceC5059l.smaato(), false));
            string = sb3.toString();
        }
        sb.append(string);
        return sb.toString();
    }
}
