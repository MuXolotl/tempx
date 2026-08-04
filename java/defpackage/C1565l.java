package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lُؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1565l {
    public static final C3897l subs;
    public final CopyOnWriteArrayList admob;
    public final C11146l amazon;
    public final C11561l billing;
    public final long crashlytics;
    public final long loadAd;
    public final C11879l mopub;
    public final C10227l purchase;
    public final long yandex;

    static {
        C3897l c3897l = new C3897l();
        c3897l.yandex = 0L;
        subs = c3897l;
    }

    public C1565l(InterfaceC10687l interfaceC10687l, long j, long j2, Set set) {
        Object next;
        this.yandex = j;
        this.loadAd = j2;
        C3897l c3897l = subs;
        c3897l.getClass();
        this.crashlytics = C3897l.loadAd.incrementAndGet(c3897l);
        this.amazon = new C11146l(this);
        C10227l c10227lAdmob = AbstractC14055l.admob();
        Iterator it = interfaceC10687l.mo2962package().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i = ((C16755l) it.next()).yandex;
            Iterator it2 = set.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((C9494l) next).yandex != i);
            C9494l c9494l = (C9494l) next;
            if (c9494l != null) {
                ArrayList arrayList = c9494l.loadAd;
                C11879l c11879lLoadAd = AbstractC1805l.loadAd(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c10227lAdmob.add(new C0078l(this, i, ((C16853l) arrayList.get(i2)).yandex, c11879lLoadAd));
                }
            }
        }
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
        this.purchase = c10227lPurchase;
        this.billing = AbstractC1805l.crashlytics(EnumC18034l.f35320l);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(c10227lPurchase, 10));
        ListIterator listIterator = c10227lPurchase.listIterator(0);
        while (true) {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                this.mopub = AbstractC1805l.loadAd(AbstractC16901l.m4245throws(arrayList2).size());
                this.admob = new CopyOnWriteArrayList();
                return;
            }
            arrayList2.add(new C16755l(((C0078l) c13376l.next()).f987l));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame-");
        sb.append((Object) ("FrameId(value=" + this.crashlytics + ')'));
        sb.append('(');
        sb.append(this.yandex);
        sb.append('@');
        return AbstractC12900l.smaato(sb, this.loadAd, ')');
    }
}
