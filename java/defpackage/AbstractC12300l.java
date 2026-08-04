package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lّؐۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12300l {
    public static final C15578l yandex = new C15578l(232015063, false, new C11902l(22));
    public static final C15578l loadAd = new C15578l(-635909478, false, new C11902l(23));
    public static final C15578l crashlytics = new C15578l(1648785692, false, new C11902l(24));
    public static final C15578l amazon = new C15578l(1967235705, false, new C10673l(12));
    public static final C15578l purchase = new C15578l(407048792, false, new C10673l(13));

    public static final boolean admob(InterfaceC16902l interfaceC16902l, InterfaceC1925l interfaceC1925l, Set set) {
        List<AbstractC18041l> upperBounds = interfaceC16902l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC18041l abstractC18041l : upperBounds) {
            if (crashlytics(abstractC18041l, interfaceC16902l.ad().mo1339native(), set) && (interfaceC1925l == null || AbstractC8576l.yandex(abstractC18041l.mo1339native(), interfaceC1925l))) {
                return true;
            }
        }
        return false;
    }

    public static final C10636l amazon(AbstractC18041l abstractC18041l, int i, InterfaceC16902l interfaceC16902l) {
        if ((interfaceC16902l != null ? interfaceC16902l.mo2182l() : 0) == i) {
            i = 1;
        }
        return new C10636l(i, abstractC18041l);
    }

    public static final AbstractC16860l billing(AbstractC18041l abstractC18041l) {
        return abstractC18041l.mo1339native().subs();
    }

    public static final boolean crashlytics(AbstractC18041l abstractC18041l, InterfaceC1925l interfaceC1925l, Set set) {
        AbstractC4946l abstractC4946l;
        InterfaceC16902l interfaceC16902l;
        if (AbstractC8576l.yandex(abstractC18041l.mo1339native(), interfaceC1925l)) {
            return true;
        }
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        InterfaceC10607l interfaceC10607l = interfaceC15234lPro instanceof InterfaceC10607l ? (InterfaceC10607l) interfaceC15234lPro : null;
        List listIsVip = interfaceC10607l != null ? interfaceC10607l.isVip() : null;
        Iterable iterableM4228l = AbstractC16901l.m4228l(abstractC18041l.inmobi());
        if (!(iterableM4228l instanceof Collection) || !((Collection) iterableM4228l).isEmpty()) {
            Iterator it = iterableM4228l.iterator();
            do {
                C14596l c14596l = (C14596l) it;
                if (c14596l.f28578l.hasNext()) {
                    C1143l c1143l = (C1143l) c14596l.next();
                    int i = c1143l.yandex;
                    abstractC4946l = (AbstractC4946l) c1143l.loadAd;
                    interfaceC16902l = listIsVip != null ? (InterfaceC16902l) AbstractC16901l.m4220for(i, listIsVip) : null;
                }
            } while (!(((interfaceC16902l == null || set == null || !set.contains(interfaceC16902l)) && !abstractC4946l.crashlytics()) ? crashlytics(abstractC4946l.loadAd(), interfaceC1925l, set) : false));
            return true;
        }
        return false;
    }

    public static final AbstractC14318l firebase(AbstractC18041l abstractC18041l) {
        AbstractC15211l abstractC15211l;
        AbstractC14318l abstractC14318lSmaato;
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC4317l) {
            AbstractC4317l abstractC4317l = (AbstractC4317l) abstractC14318lMo3847class;
            AbstractC15211l abstractC15211lSmaato = abstractC4317l.f8857l;
            if (!abstractC15211lSmaato.mo1339native().getParameters().isEmpty() && abstractC15211lSmaato.mo1339native().pro() != null) {
                List parameters = abstractC15211lSmaato.mo1339native().getParameters();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C12768l((InterfaceC16902l) it.next()));
                }
                abstractC15211lSmaato = AbstractC6419l.smaato(abstractC15211lSmaato, arrayList, null, 2);
            }
            AbstractC15211l abstractC15211lSmaato2 = abstractC4317l.f8856l;
            if (!abstractC15211lSmaato2.mo1339native().getParameters().isEmpty() && abstractC15211lSmaato2.mo1339native().pro() != null) {
                List parameters2 = abstractC15211lSmaato2.mo1339native().getParameters();
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C12768l((InterfaceC16902l) it2.next()));
                }
                abstractC15211lSmaato2 = AbstractC6419l.smaato(abstractC15211lSmaato2, arrayList2, null, 2);
            }
            abstractC14318lSmaato = AbstractC3605l.subs(abstractC15211lSmaato, abstractC15211lSmaato2);
        } else {
            if (!(abstractC14318lMo3847class instanceof AbstractC15211l)) {
                C18725l.billing();
                return null;
            }
            abstractC15211l = (AbstractC15211l) abstractC14318lMo3847class;
            if (!abstractC15211l.mo1339native().getParameters().isEmpty() && abstractC15211l.mo1339native().pro() != null) {
                abstractC14318lSmaato = abstractC15211l;
                abstractC14318lSmaato = abstractC15211l;
                List parameters3 = abstractC15211l.mo1339native().getParameters();
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(parameters3, 10));
                Iterator it3 = parameters3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new C12768l((InterfaceC16902l) it3.next()));
                }
                abstractC14318lSmaato = AbstractC6419l.smaato(abstractC15211l, arrayList3, null, 2);
            }
        }
        abstractC14318lSmaato = abstractC15211l;
        abstractC14318lSmaato = abstractC15211l;
        abstractC14318lSmaato = abstractC15211l;
        return AbstractC5170l.purchase(abstractC14318lSmaato, AbstractC5170l.amazon(abstractC14318lMo3847class));
    }

    public static final AbstractC18041l isPro(AbstractC18041l abstractC18041l, InterfaceC3841l interfaceC3841l) {
        return (abstractC18041l.getAnnotations().isEmpty() && interfaceC3841l.isEmpty()) ? abstractC18041l : abstractC18041l.mo3847class().mo686abstract(AbstractC3058l.subscription(abstractC18041l.mo1340package(), interfaceC3841l));
    }

    public static final long loadAd(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final AbstractC18041l mopub(InterfaceC16902l interfaceC16902l) {
        Object obj;
        interfaceC16902l.getUpperBounds().isEmpty();
        Iterator it = interfaceC16902l.getUpperBounds().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC15234l interfaceC15234lPro = ((AbstractC18041l) next).mo1339native().pro();
            InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
            if (interfaceC17477l != null && interfaceC17477l.mo752l() != 2 && interfaceC17477l.mo752l() != 5) {
                obj = next;
                break;
            }
        }
        AbstractC18041l abstractC18041l = (AbstractC18041l) obj;
        return abstractC18041l == null ? (AbstractC18041l) AbstractC16901l.m4231native(interfaceC16902l.getUpperBounds()) : abstractC18041l;
    }

    public static final void purchase(AbstractC18041l abstractC18041l, AbstractC15211l abstractC15211l, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        if (interfaceC15234lPro instanceof InterfaceC16902l) {
            if (!AbstractC8576l.yandex(abstractC18041l.mo1339native(), abstractC15211l.mo1339native())) {
                linkedHashSet.add(interfaceC15234lPro);
                return;
            }
            Iterator it = ((InterfaceC16902l) interfaceC15234lPro).getUpperBounds().iterator();
            while (it.hasNext()) {
                purchase((AbstractC18041l) it.next(), abstractC15211l, linkedHashSet, set);
            }
            return;
        }
        InterfaceC15234l interfaceC15234lPro2 = abstractC18041l.mo1339native().pro();
        InterfaceC10607l interfaceC10607l = interfaceC15234lPro2 instanceof InterfaceC10607l ? (InterfaceC10607l) interfaceC15234lPro2 : null;
        List listIsVip = interfaceC10607l != null ? interfaceC10607l.isVip() : null;
        int i = 0;
        for (AbstractC4946l abstractC4946l : abstractC18041l.inmobi()) {
            int i2 = i + 1;
            InterfaceC16902l interfaceC16902l = listIsVip != null ? (InterfaceC16902l) AbstractC16901l.m4220for(i, listIsVip) : null;
            if ((interfaceC16902l == null || set == null || !set.contains(interfaceC16902l)) && !abstractC4946l.crashlytics() && !AbstractC16901l.inmobi(linkedHashSet, abstractC4946l.loadAd().mo1339native().pro()) && !AbstractC8576l.yandex(abstractC4946l.loadAd().mo1339native(), abstractC15211l.mo1339native())) {
                purchase(abstractC4946l.loadAd(), abstractC15211l, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static boolean subs() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static C6301l yandex(byte[] bArr) {
        int length = bArr.length;
        C18476l c18476l = new C18476l();
        c18476l.write(bArr, 0, length);
        return new C6301l(c18476l);
    }
}
