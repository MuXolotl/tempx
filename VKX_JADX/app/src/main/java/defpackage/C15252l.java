package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lٔۢؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15252l {
    public final C0783l Signature;
    public final Set ad;
    public final InterfaceC15897l admob;
    public final C16005l ads;
    public final InterfaceC2889l amazon;
    public final C7647l billing;
    public final C18595l crashlytics;
    public final C8462l isPro;
    public volatile C5670l license;
    public final C7518l loadAd;
    public final InterfaceC15897l mopub;
    public final ArrayList pro;
    public final C12094l purchase;
    public final C1276l subs;
    public final C1557l subscription;
    public final C8634l tapsense;
    public boolean vip;
    public final C4723l yandex;
    public final Object firebase = new Object();
    public final LinkedHashSet smaato = new LinkedHashSet();
    public final LinkedHashSet remoteconfig = new LinkedHashSet();
    public boolean metrica = true;
    public boolean startapp = true;
    public final LinkedHashSet adcel = new LinkedHashSet();

    public C15252l(C4723l c4723l, C7518l c7518l, C18595l c18595l, InterfaceC2889l interfaceC2889l, C12094l c12094l, Set set, C9410l c9410l, C7647l c7647l, C13161l c13161l, InterfaceC15897l interfaceC15897l, InterfaceC2360l interfaceC2360l, C15736l c15736l, C1276l c1276l, C8462l c8462l, Context context, C13283l c13283l) {
        this.yandex = c4723l;
        this.loadAd = c7518l;
        this.crashlytics = c18595l;
        this.amazon = interfaceC2889l;
        this.purchase = c12094l;
        this.billing = c7647l;
        this.mopub = c13161l;
        this.admob = interfaceC15897l;
        this.subs = c1276l;
        this.isPro = c8462l;
        this.ads = new C16005l(c15736l, new C12402l(), c13283l);
        InterfaceC5389l interfaceC5389l = c15736l.loadAd;
        this.subscription = new C1557l(context, interfaceC5389l, interfaceC2360l, InterfaceC7744l.ad);
        this.tapsense = new C8634l(interfaceC5389l);
        this.Signature = new C0783l(18, this);
        this.pro = new ArrayList();
        Set setM4227l = AbstractC16901l.m4227l(set);
        setM4227l.add(c9410l);
        this.ad = setM4227l;
    }

    public final C1130l admob() {
        C5670l c5670l = this.license;
        if (c5670l != null) {
            return (C1130l) c5670l.remoteconfig.get();
        }
        return null;
    }

    public final void amazon(List list) {
        synchronized (this.firebase) {
            if (list.isEmpty()) {
                if (AbstractC5088l.metrica()) {
                    Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.smaato.contains((AbstractC6896l) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC6896l) it.next()).pro();
            }
            if (this.smaato.addAll(list) && !loadAd(AbstractC16901l.m4244throw(this.smaato, this.remoteconfig))) {
                metrica();
                this.purchase.yandex(AbstractC16901l.m4213const(this.smaato));
                smaato(this.smaato);
            }
            if (this.metrica) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC6896l) it2.next()).tapsense();
                }
            } else {
                this.adcel.addAll(arrayList);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void billing() {
        InterfaceC7042l interfaceC7042lYandex;
        C1130l c1130lAdmob = admob();
        this.license = null;
        C7518l c7518l = this.loadAd;
        InterfaceC15879l interfaceC15879l = (InterfaceC15879l) this.admob.get();
        synchronized (c7518l.loadAd) {
            try {
                if (c7518l.billing) {
                    ArrayList arrayList = c7518l.amazon;
                    InterfaceC5389l interfaceC5389l = (InterfaceC5389l) C5883l.billing(interfaceC15879l, AbstractC18202l.yandex.loadAd(InterfaceC5389l.class));
                    String str = interfaceC5389l != null ? ((C10861l) interfaceC5389l).f21960l : null;
                    C10160l c10160l = str != null ? new C10160l(str) : null;
                    if (c10160l == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.remove(c10160l.yandex);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1130lAdmob != null) {
            if (c1130lAdmob.admob.yandex()) {
                c1130lAdmob.crashlytics.close();
                interfaceC7042lYandex = AbstractC10999l.mopub(c1130lAdmob.loadAd.purchase, null, 0, new C11671l(null, c1130lAdmob), 3);
            } else {
                interfaceC7042lYandex = AbstractC15929l.yandex(Unit.INSTANCE);
            }
            this.pro.add(interfaceC7042lYandex);
            interfaceC7042lYandex.mo2154l(new C15575l(this, interfaceC7042lYandex, 10));
        }
        isPro();
    }

    public final void crashlytics() {
        InterfaceC18690l interfaceC18690l = (InterfaceC18690l) this.mopub.get();
        C16005l c16005l = this.ads;
        c16005l.loadAd(interfaceC18690l, null, null, null);
        c16005l.m2080package(C5464l.yandex(AbstractC15794l.yandex).yandex(), null);
        amazon(Collections.singletonList(c16005l));
        yandex(c16005l);
    }

    public final boolean firebase(LinkedHashSet linkedHashSet) {
        boolean z;
        C1557l c1557l;
        int i;
        boolean z2;
        boolean zYandex;
        InterfaceC0048l interfaceC0048l;
        List listSingletonList;
        if (((Boolean) this.subs.f3327l.smaato(C1276l.f3323l, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
                C16005l c16005l = this.ads;
                if (!AbstractC8576l.yandex(abstractC6896l, c16005l) && !abstractC6896l.adcel.loadAd().isEmpty()) {
                    ArrayList<AbstractC6896l> arrayList = new ArrayList();
                    for (Object obj : this.smaato) {
                        if (!AbstractC8576l.yandex((AbstractC6896l) obj, c16005l)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                        C11419l c11419l = new C11419l();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c11419l.yandex(((AbstractC6896l) it2.next()).adcel);
                        }
                        C10814l c10814lLoadAd = c11419l.loadAd();
                        List listUnmodifiableList = DesugarCollections.unmodifiableList(c10814lLoadAd.mopub.yandex);
                        List listLoadAd = c10814lLoadAd.loadAd();
                        if (listLoadAd.isEmpty()) {
                            break;
                        }
                        if (listLoadAd.isEmpty()) {
                            z = true;
                            break;
                        }
                        Iterator it3 = listLoadAd.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z = true;
                                break;
                            }
                            if (!AbstractC8576l.yandex(((AbstractC0958l) it3.next()).isPro, MediaCodec.class)) {
                                z = false;
                                break;
                            }
                        }
                        boolean zIsEmpty = listUnmodifiableList.isEmpty();
                        if (!z && !zIsEmpty) {
                            break;
                        }
                        if (c16005l.crashlytics() == null) {
                            c16005l.m2080package(C5464l.yandex(AbstractC15794l.yandex).yandex(), null);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            c1557l = this.subscription;
                            if (!zHasNext) {
                                break;
                            }
                            AbstractC6896l abstractC6896l2 = (AbstractC6896l) it4.next();
                            Size sizeCrashlytics = abstractC6896l2.crashlytics();
                            C5464l c5464l = abstractC6896l2.subs;
                            if (sizeCrashlytics == null || c5464l == null) {
                                if (AbstractC5088l.metrica()) {
                                    Log.w("CXCP", "Invalid surface resolution or stream spec is found.");
                                }
                                arrayList2.clear();
                                break;
                            }
                            int iSubs = subs();
                            int iFirebase = abstractC6896l2.admob.firebase();
                            EnumC18632l enumC18632lMo257package = abstractC6896l2.admob.mo257package();
                            c1557l.getClass();
                            EnumC18632l enumC18632l = C2483l.purchase;
                            C2483l c2483lSignature = C2582l.Signature(iFirebase, sizeCrashlytics, c1557l.remoteconfig(iFirebase), iSubs, 2, enumC18632lMo257package);
                            int iFirebase2 = abstractC6896l2.admob.firebase();
                            C15421l c15421l = c5464l.crashlytics;
                            if (abstractC6896l2 instanceof C10245l) {
                                C5307l c5307l = (C5307l) ((C10245l) abstractC6896l2).admob;
                                c5307l.getClass();
                                listSingletonList = (List) AbstractC4338l.firebase(c5307l, C5307l.f11424l);
                            } else {
                                listSingletonList = Collections.singletonList(abstractC6896l2.admob.mo256native());
                            }
                            List list = listSingletonList;
                            InterfaceC17944l interfaceC17944lCrashlytics = c5464l.billing;
                            if (interfaceC17944lCrashlytics == null) {
                                interfaceC17944lCrashlytics = C5104l.crashlytics();
                            }
                            arrayList2.add(new C7314l(c2483lSignature, iFirebase2, sizeCrashlytics, c15421l, list, interfaceC17944lCrashlytics, c5464l.amazon, c5464l.purchase, abstractC6896l2.admob.mo253final(), abstractC6896l2.admob.mo252extends(sizeCrashlytics)));
                        }
                        if (arrayList2.isEmpty()) {
                            zYandex = false;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (AbstractC6896l abstractC6896l3 : arrayList) {
                                for (AbstractC0958l abstractC0958l : abstractC6896l3.adcel.loadAd()) {
                                    int iSubs2 = subs();
                                    int iFirebase3 = abstractC6896l3.admob.firebase();
                                    Size size = abstractC0958l.admob;
                                    EnumC18632l enumC18632lMo257package2 = abstractC6896l3.admob.mo257package();
                                    c1557l.getClass();
                                    EnumC18632l enumC18632l2 = C2483l.purchase;
                                    arrayList3.add(C2582l.Signature(iFirebase3, size, c1557l.remoteconfig(iFirebase3), iSubs2, 2, enumC18632lMo257package2));
                                }
                            }
                            int iSubs3 = subs();
                            if (Build.VERSION.SDK_INT < 24) {
                                i = 8;
                                break;
                            }
                            Iterator it5 = this.tapsense.ad(arrayList2, Collections.singletonList(c16005l.admob), Collections.singletonList(0)).entrySet().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    i = 8;
                                    break;
                                }
                                if (((C15421l) ((Map.Entry) it5.next()).getValue()).loadAd == 10) {
                                    i = 10;
                                    break;
                                }
                            }
                            Iterator it6 = arrayList.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                AbstractC6896l abstractC6896l4 = (AbstractC6896l) it6.next();
                                if (abstractC6896l4 != null && AbstractC5641l.admob(abstractC6896l4)) {
                                    z2 = true;
                                    break;
                                }
                            }
                            int iMopub = AbstractC5641l.mopub(arrayList, new C12176l(8));
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (obj2 instanceof C9731l) {
                                    arrayList4.add(obj2);
                                }
                            }
                            C9731l c9731l = (C9731l) AbstractC16901l.m4217extends(arrayList4);
                            C14591l c14591l = new C14591l(iSubs3, i, z2, iMopub, (c9731l == null || (interfaceC0048l = c9731l.admob) == null || interfaceC0048l.firebase() != 4101) ? false : true, false, false, false, C5464l.admob, false);
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList3);
                            int iSubs4 = subs();
                            int iFirebase4 = c16005l.admob.firebase();
                            Size sizeCrashlytics2 = c16005l.crashlytics();
                            EnumC18632l enumC18632lMo257package3 = c16005l.admob.mo257package();
                            c1557l.getClass();
                            EnumC18632l enumC18632l3 = C2483l.purchase;
                            arrayList5.add(C2582l.Signature(iFirebase4, sizeCrashlytics2, c1557l.remoteconfig(iFirebase4), iSubs4, 2, enumC18632lMo257package3));
                            Unit unit = Unit.INSTANCE;
                            C2580l c2580l = C2580l.f5619l;
                            zYandex = c1557l.yandex(c14591l, arrayList5, C14054l.f27396l, c2580l, c2580l);
                            if (AbstractC5088l.firebase("CXCP")) {
                                Log.d("CXCP", "Combination of " + arrayList3 + " + " + c16005l + " is supported: " + zYandex);
                            }
                        }
                        if (zYandex) {
                            return true;
                        }
                    } else {
                        break;
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final void isPro() {
        synchronized (this.firebase) {
        }
    }

    public final boolean loadAd(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.subs.f3327l.smaato(C1276l.f3323l, Boolean.TRUE)).booleanValue() && !this.smaato.contains(this.ads) && firebase(linkedHashSet)) {
            crashlytics();
            return true;
        }
        if (!linkedHashSet.contains(this.ads) || firebase(linkedHashSet)) {
            return false;
        }
        C16005l c16005l = this.ads;
        synchronized (this.firebase) {
            try {
                if (this.remoteconfig.remove(c16005l)) {
                    remoteconfig();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        mopub(Collections.singletonList(c16005l));
        c16005l.inmobi((InterfaceC18690l) this.mopub.get());
        return true;
    }

    public final void metrica() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.smaato;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((AbstractC6896l) it.next()).admob.mo255instanceof()) {
                    z = true;
                    break;
                }
            }
        }
        this.amazon.amazon(z);
    }

    public final void mopub(List list) {
        synchronized (this.firebase) {
            if (list.isEmpty()) {
                if (AbstractC5088l.metrica()) {
                    Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.remoteconfig.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
                if (this.smaato.contains(abstractC6896l)) {
                    abstractC6896l.ad();
                }
            }
            if (this.smaato.removeAll(list)) {
                if (loadAd(AbstractC16901l.m4244throw(this.smaato, this.remoteconfig))) {
                    return;
                }
                if (this.smaato.isEmpty()) {
                    this.amazon.amazon(false);
                    this.purchase.yandex(C2580l.f5619l);
                } else {
                    metrica();
                    this.purchase.yandex(AbstractC16901l.m4213const(this.smaato));
                }
                smaato(this.smaato);
            }
            this.adcel.removeAll(list);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Object purchase(AbstractC5563l abstractC5563l) {
        List listM4213const;
        synchronized (this.firebase) {
            billing();
            this.ads.signatures();
            listM4213const = AbstractC16901l.m4213const(this.pro);
        }
        Object objAmazon = AbstractC15342l.amazon(listM4213const, abstractC5563l);
        return objAmazon == EnumC9342l.f19165l ? objAmazon : Unit.INSTANCE;
    }

    public final void remoteconfig() {
        if (this.smaato.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSetM4244throw = AbstractC16901l.m4244throw(this.smaato, this.remoteconfig);
        if (((Boolean) this.subs.f3327l.smaato(C1276l.f3323l, Boolean.TRUE)).booleanValue() && !this.smaato.contains(this.ads) && firebase(linkedHashSetM4244throw)) {
            crashlytics();
            return;
        }
        if (!linkedHashSetM4244throw.contains(this.ads) || firebase(linkedHashSetM4244throw)) {
            vip(linkedHashSetM4244throw);
            return;
        }
        C16005l c16005l = this.ads;
        synchronized (this.firebase) {
            try {
                if (this.remoteconfig.remove(c16005l)) {
                    remoteconfig();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        mopub(Collections.singletonList(c16005l));
        c16005l.inmobi((InterfaceC18690l) this.mopub.get());
    }

    public final void smaato(LinkedHashSet linkedHashSet) {
        billing();
        List listM4213const = AbstractC16901l.m4213const(linkedHashSet);
        if (listM4213const.isEmpty()) {
            for (InterfaceC0930l interfaceC0930l : this.ad) {
                interfaceC0930l.loadAd(null);
                interfaceC0930l.reset();
            }
            return;
        }
        if (!this.metrica) {
            Iterator it = this.ad.iterator();
            while (it.hasNext()) {
                ((InterfaceC0930l) it.next()).loadAd(null);
            }
        }
        C7686l c7686l = new C7686l(this.billing);
        isPro();
        C9395l c9395l = new C9395l(listM4213const, this.startapp);
        C8462l c8462l = this.isPro;
        C0783l c0783l = this.Signature;
        isPro();
        C16685l c16685l = new C16685l(c0783l, c7686l, c9395l, new C8688l(new C5996l(c9395l, c8462l, c7686l, 1)));
        if (!this.metrica) {
            C7518l c7518l = this.loadAd;
            InterfaceC15879l interfaceC15879l = (InterfaceC15879l) this.admob.get();
            synchronized (c7518l.loadAd) {
                try {
                    if (c7518l.billing) {
                        ArrayList arrayList = c7518l.amazon;
                        InterfaceC5389l interfaceC5389l = (InterfaceC5389l) C5883l.billing(interfaceC15879l, AbstractC18202l.yandex.loadAd(InterfaceC5389l.class));
                        String str = interfaceC5389l != null ? ((C10861l) interfaceC5389l).f21960l : null;
                        C10160l c10160l = str != null ? new C10160l(str) : null;
                        if (c10160l == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(c10160l.yandex);
                        c7518l.amazon();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        C18595l c18595l = this.crashlytics;
        this.license = new C5670l((C9377l) c18595l.f36317l, (C13416l) c18595l.f36316l, c16685l);
        C1130l c1130lAdmob = admob();
        if (c1130lAdmob == null) {
            C8339l.smaato("Required value was null.");
            return;
        }
        AbstractC10999l.mopub(c1130lAdmob.loadAd.purchase, null, 0, new C14019l(null, c1130lAdmob), 3);
        Iterator it2 = this.ad.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0930l) it2.next()).loadAd(c1130lAdmob.crashlytics);
        }
        AbstractC10999l.mopub(c1130lAdmob.loadAd.purchase, null, 0, new C14047l((InterfaceC14029l) null, c1130lAdmob, this.vip), 3);
        vip(AbstractC16901l.m4244throw(this.smaato, this.remoteconfig));
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Notifying " + this.adcel + " camera control ready");
        }
        Iterator it3 = this.adcel.iterator();
        while (it3.hasNext()) {
            ((AbstractC6896l) it3.next()).tapsense();
        }
        this.adcel.clear();
    }

    public final int subs() {
        synchronized (this.firebase) {
            if (this.loadAd.loadAd() == 2) {
                return 1;
            }
            Unit unit = Unit.INSTANCE;
            return 0;
        }
    }

    public final String toString() {
        return "UseCaseManager<" + this.isPro + '>';
    }

    public final void vip(LinkedHashSet linkedHashSet) {
        C1130l c1130lAdmob = admob();
        if (c1130lAdmob != null) {
            c1130lAdmob.crashlytics.admob(linkedHashSet, this.startapp);
            for (InterfaceC0930l interfaceC0930l : this.ad) {
                if (interfaceC0930l instanceof InterfaceC17883l) {
                    ((InterfaceC17883l) interfaceC0930l).yandex(linkedHashSet);
                }
            }
        }
    }

    public final void yandex(AbstractC6896l abstractC6896l) {
        synchronized (this.firebase) {
            try {
                if (this.remoteconfig.add(abstractC6896l)) {
                    remoteconfig();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
