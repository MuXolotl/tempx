package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lًٕۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16017l implements Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC18650l f31396l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C13645l f31395l = new C13645l(20);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C16017l f31394l = new C16017l(C2580l.f5619l);

    public C16017l(List list) {
        this.f31396l = C6103l.f12889l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7687l c7687l = (C7687l) it.next();
            c7687l.getClass();
            int iSignature = f31395l.Signature(AbstractC18202l.yandex.loadAd(C7687l.class).billing());
            int iAmazon = this.f31396l.amazon();
            if (iAmazon != 0) {
                if (iAmazon == 1) {
                    AbstractC18650l abstractC18650l = this.f31396l;
                    try {
                        C1675l c1675l = (C1675l) abstractC18650l;
                        int i = c1675l.f4039l;
                        if (i == iSignature) {
                            this.f31396l = new C1675l(iSignature, c7687l);
                        } else {
                            C13552l c13552l = new C13552l();
                            c13552l.f26570l = new Object[20];
                            c13552l.f26569l = 0;
                            c13552l.billing(i, c1675l.f4040l);
                            this.f31396l = c13552l;
                        }
                    } catch (ClassCastException e) {
                        C4875l.remoteconfig(amazon(abstractC18650l, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.f31396l.billing(iSignature, c7687l);
            } else {
                AbstractC18650l abstractC18650l2 = this.f31396l;
                if (!(abstractC18650l2 instanceof C6103l)) {
                    C8339l.smaato(amazon(abstractC18650l2, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.f31396l = new C1675l(iSignature, c7687l);
            }
        }
    }

    public static String amazon(AbstractC18650l abstractC18650l, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(abstractC18650l.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f31395l.f26671l;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(abstractC18650l, 10));
        int i2 = 0;
        for (Object obj : abstractC18650l) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i2) {
                    obj2 = obj3;
                    break;
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i2 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.f31396l.amazon() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f31396l.iterator();
    }
}
