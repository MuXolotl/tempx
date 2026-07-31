package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؓۦۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2258l {
    public final C13660l admob;
    public final C18606l crashlytics;
    public final C4910l isPro;
    public final C4816l loadAd;
    public final C13660l mopub;
    public final C12463l subs;
    public final C16076l yandex;
    public InterfaceC17817l amazon = C6371l.yandex;
    public final C12463l purchase = new C12463l();
    public final C12463l billing = new C12463l();

    public C2258l(C16076l c16076l, C4816l c4816l, C18606l c18606l) {
        this.yandex = c16076l;
        this.loadAd = c4816l;
        this.crashlytics = c18606l;
        long[] jArr = AbstractC12154l.yandex;
        this.mopub = new C13660l();
        this.admob = new C13660l();
        this.subs = new C12463l();
        this.isPro = AbstractC8618l.yandex();
    }

    public final C10507l admob(Integer num) {
        if (num == null) {
            return null;
        }
        C12463l c12463l = this.subs;
        if (new C8934l(0, c12463l.loadAd - 1, 1).amazon(num.intValue())) {
            return isPro((String) c12463l.admob(num.intValue()));
        }
        return null;
    }

    public final List amazon() {
        InterfaceC11075l interfaceC11075lYandex;
        C12463l c12463l = this.purchase;
        InterfaceC11075l interfaceC11075lSmaato = AbstractC17587l.smaato(new C17798l(1, c12463l.purchase()), new C2176l(1, this.admob, C13660l.class, "containsKey", "containsKey(Ljava/lang/Object;)Z", 0, 0, 15));
        int iBilling = AbstractC8576l.billing(40, AbstractC8576l.adcel(0, c12463l.loadAd));
        if (iBilling < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested element count ", iBilling, " is less than zero."));
            return null;
        }
        if (iBilling == 0) {
            interfaceC11075lYandex = C8360l.yandex;
        } else {
            interfaceC11075lYandex = interfaceC11075lSmaato instanceof InterfaceC15834l ? ((InterfaceC15834l) interfaceC11075lSmaato).yandex(iBilling) : new C13276l(interfaceC11075lSmaato, iBilling, 1);
        }
        return AbstractC17587l.adcel(interfaceC11075lYandex);
    }

    public final List billing() {
        C4588l c4588lPurchase = this.subs.purchase();
        ArrayList arrayList = new ArrayList();
        Iterator it = c4588lPurchase.iterator();
        while (true) {
            C7531l c7531l = (C7531l) it;
            if (!c7531l.hasNext()) {
                return AbstractC16901l.m4245throws(arrayList);
            }
            C10507l c10507l = (C10507l) this.mopub.mopub((String) c7531l.next());
            if (c10507l != null) {
                arrayList.add(c10507l);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(AbstractC0283l abstractC0283l) {
        C2003l c2003l;
        C4910l c4910l;
        if (abstractC0283l instanceof C2003l) {
            c2003l = (C2003l) abstractC0283l;
            int i = c2003l.f4521l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2003l.f4521l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2003l = new C2003l(this, abstractC0283l);
            }
        } else {
            c2003l = new C2003l(this, abstractC0283l);
        }
        Object obj = c2003l.f4522l;
        int i2 = c2003l.f4521l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C4910l c4910l2 = this.isPro;
            c2003l.f4523l = c4910l2;
            c2003l.f4521l = 1;
            Object objYandex = c4910l2.yandex(c2003l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            c4910l = c4910l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4910l = c2003l.f4523l;
            AbstractC2829l.crashlytics(obj);
        }
        try {
            this.purchase.billing();
            this.mopub.yandex();
            this.admob.yandex();
            this.subs.billing();
            this.billing.billing();
            Unit unit = Unit.INSTANCE;
            c4910l.billing(null);
            this.amazon = C6371l.yandex;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            c4910l.billing(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable firebase(String str, AbstractC0283l abstractC0283l) {
        C13097l c13097l;
        C4910l c4910l;
        C13660l c13660l = this.mopub;
        C12463l c12463l = this.purchase;
        if (abstractC0283l instanceof C13097l) {
            c13097l = (C13097l) abstractC0283l;
            int i = c13097l.f25620l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13097l.f25620l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13097l = new C13097l(this, abstractC0283l);
            }
        } else {
            c13097l = new C13097l(this, abstractC0283l);
        }
        Object obj = c13097l.f25623l;
        int i2 = c13097l.f25620l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c13097l.f25622l = str;
            c4910l = this.isPro;
            c13097l.f25621l = c4910l;
            c13097l.f25620l = 1;
            Object objYandex = c4910l.yandex(c13097l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4910l c4910l2 = c13097l.f25621l;
            String str2 = c13097l.f25622l;
            AbstractC2829l.crashlytics(obj);
            c4910l = c4910l2;
            str = str2;
        }
        try {
            C10507l c10507l = (C10507l) c13660l.mopub(str);
            C12463l c12463l2 = this.billing;
            if (c10507l == null) {
                c10507l = (C10507l) c13660l.mopub(c12463l2.mopub());
            }
            int iSubs = c12463l2.subs(c10507l.loadAd.getYandex());
            c12463l.billing();
            c12463l.loadAd(c12463l2);
            c12463l2.billing();
            int iBilling = AbstractC8576l.billing(iSubs + 1, new C8934l(0, c12463l.loadAd, 1));
            if (!c12463l.isPro() && iSubs != -1) {
                List listSubList = c12463l.purchase().subList(0, iSubs);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((C17635l) listSubList).iterator();
                while (it.hasNext()) {
                    C10507l c10507lSubs = subs((String) it.next());
                    if (c10507lSubs != null) {
                        arrayList.add(c10507lSubs);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(AbstractC2133l.yandex((C10507l) it2.next()));
                }
                List listSubList2 = c12463l.purchase().subList(iBilling, c12463l.loadAd);
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = ((C17635l) listSubList2).iterator();
                while (it3.hasNext()) {
                    C10507l c10507lSubs2 = subs((String) it3.next());
                    if (c10507lSubs2 != null) {
                        arrayList3.add(c10507lSubs2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(AbstractC2133l.yandex((C10507l) it4.next()));
                }
                return new C8195l(arrayList2, arrayList4);
            }
            return null;
        } finally {
            c4910l.billing(null);
        }
    }

    public final C10507l isPro(String str) {
        if (str == null) {
            return null;
        }
        return (C10507l) this.mopub.mopub(str);
    }

    public final void loadAd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10507l c10507l = (C10507l) it.next();
            this.mopub.vip(c10507l.yandex, c10507l);
            this.admob.vip(c10507l.loadAd.getYandex(), c10507l.yandex);
        }
    }

    public final void mopub() {
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(this.yandex, ExecutorC6708l.f14063l, 0, new C11039l(this, null, 2), 2);
    }

    public final ArrayList purchase() {
        C4588l c4588lPurchase = this.purchase.purchase();
        ArrayList arrayList = new ArrayList();
        Iterator it = c4588lPurchase.iterator();
        while (true) {
            C7531l c7531l = (C7531l) it;
            if (!c7531l.hasNext()) {
                return arrayList;
            }
            C10507l c10507lSubs = subs((String) c7531l.next());
            if (c10507lSubs != null) {
                arrayList.add(c10507lSubs);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object remoteconfig(Map map, List list, AbstractC0283l abstractC0283l) {
        C14815l c14815l;
        if (abstractC0283l instanceof C14815l) {
            c14815l = (C14815l) abstractC0283l;
            int i = c14815l.f28983l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14815l.f28983l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14815l = new C14815l(this, abstractC0283l);
            }
        } else {
            c14815l = new C14815l(this, abstractC0283l);
        }
        Object obj = c14815l.f28986l;
        int i2 = c14815l.f28983l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c14815l.f28985l = map;
            c14815l.f28984l = list;
            c14815l.f28983l = 1;
            Object objCrashlytics = crashlytics(c14815l);
            Object obj2 = EnumC9342l.f19165l;
            if (objCrashlytics == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = c14815l.f28984l;
            map = c14815l.f28985l;
            AbstractC2829l.crashlytics(obj);
        }
        C13660l c13660l = this.mopub;
        c13660l.yandex();
        C10507l c10507l = C10507l.crashlytics;
        for (C10507l c10507l2 : AbstractC1383l.mopub(map.values())) {
            c13660l.vip(c10507l2.yandex, c10507l2);
            this.admob.vip(c10507l2.loadAd.getYandex(), c10507l2.yandex);
        }
        C12463l c12463l = this.purchase;
        c12463l.billing();
        this.billing.billing();
        c12463l.crashlytics(list);
        mopub();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bf A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:26:0x0078, B:32:0x008f, B:33:0x00b9, B:35:0x00bf, B:37:0x00d5, B:38:0x00d9, B:31:0x0084), top: B:82:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
    
        if (r1 == r14) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0181, code lost:
    
        if (r8.yandex(r2) == r14) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable smaato(java.lang.String r18, defpackage.AbstractC0283l r19) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2258l.smaato(java.lang.String, lّؑۧ):java.io.Serializable");
    }

    public final C10507l subs(String str) {
        String str2;
        if (str == null || (str2 = (String) this.admob.mopub(str)) == null) {
            return null;
        }
        return (C10507l) this.mopub.mopub(str2);
    }

    public final void yandex(String str, List list, boolean z) {
        AbstractC18643l abstractC18643l;
        String yandex;
        loadAd(list);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C10507l) it.next()).loadAd.getYandex());
        }
        C12463l c12463l = this.purchase;
        if (z) {
            c12463l.crashlytics(arrayList);
        } else {
            C10507l c10507lIsPro = isPro(str);
            Integer numValueOf = (c10507lIsPro == null || (abstractC18643l = c10507lIsPro.loadAd) == null || (yandex = abstractC18643l.getYandex()) == null) ? null : Integer.valueOf(c12463l.subs(yandex));
            int iIntValue = (numValueOf != null ? numValueOf.intValue() : 0) + 1;
            int i = c12463l.loadAd;
            if (iIntValue > i) {
                iIntValue = i;
            }
            c12463l.amazon(iIntValue, arrayList);
        }
        mopub();
    }
}
