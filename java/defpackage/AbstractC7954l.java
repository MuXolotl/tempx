package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lًؙّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7954l extends C13716l {
    public final C8348l smaato = new C8348l();

    @Override // defpackage.AbstractC8769l
    public final void billing() {
        Iterator it = this.smaato.iterator();
        while (true) {
            C18541l c18541l = (C18541l) it;
            if (!c18541l.hasNext()) {
                return;
            }
            C16749l c16749l = (C16749l) ((Map.Entry) c18541l.next()).getValue();
            c16749l.yandex.purchase(c16749l);
        }
    }

    public final void firebase(AbstractC8769l abstractC8769l, InterfaceC2810l interfaceC2810l) {
        if (abstractC8769l == null) {
            C6541l.subs("source cannot be null");
            return;
        }
        C16749l c16749l = new C16749l(abstractC8769l, interfaceC2810l);
        C16749l c16749l2 = (C16749l) this.smaato.amazon(abstractC8769l, c16749l);
        if (c16749l2 != null && c16749l2.loadAd != interfaceC2810l) {
            C8339l.metrica("This source was already added with the different observer");
        } else if (c16749l2 == null && this.crashlytics > 0) {
            abstractC8769l.purchase(c16749l);
        }
    }

    @Override // defpackage.AbstractC8769l
    public final void mopub() {
        Iterator it = this.smaato.iterator();
        while (true) {
            C18541l c18541l = (C18541l) it;
            if (!c18541l.hasNext()) {
                return;
            }
            C16749l c16749l = (C16749l) ((Map.Entry) c18541l.next()).getValue();
            c16749l.yandex.admob(c16749l);
        }
    }
}
